package com.cart.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cart.demo.Model.CartCreationDto;
import com.cart.demo.Model.Item;
import com.cart.demo.service.ItemService;

@Controller
public class ShoppingCartController {

	Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);

	@Value("${spring.application.name}")
	String appName;

	@Autowired
	ItemService itemservice;

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("items", itemservice.ItemList());

		List<Item> itemlist = new ArrayList<>();
		itemservice.ItemList().iterator().forEachRemaining(itemlist::add);

		model.addAttribute("form", new CartCreationDto(itemlist));

		return "home";
	}

	@PostMapping("/addtocart")
	public String addToCartForm(@ModelAttribute CartCreationDto form, Model model) {

		logger.info("Form  Submitted : " + form.getItems());

		List<Item> calItem = new ArrayList<>();
		double grosscartValue = 0;
		for (Item item : form.getItems()) {

			Double price = itemservice.ItemList().get(item.getId() - 1).getPrice();
			Double grossAmt = (double) Math.round((item.getNoofItem() != null
					? item.getNoofItem() * price
					: 0.00) * 100) / 100;
			Item fitem = itemservice.ItemList().get(item.getId() - 1);
			fitem.setNoofItem(item.getNoofItem());
			fitem.setGrossTotal(grossAmt);
			calItem.add(fitem);

			grosscartValue = grosscartValue + grossAmt;

		}

		model.addAttribute("items", calItem);
		model.addAttribute("grossvalue", grosscartValue);

		return "cart";
	}
}
