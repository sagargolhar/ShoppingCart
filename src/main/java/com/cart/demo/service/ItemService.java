package com.cart.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cart.demo.Model.Item;

@Service
public class ItemService {

	public List<Item> ItemList() {

		Item item1 = new Item();
		item1.setId(1);
		item1.setItemName("Dove Soap");
		item1.setPrice(39.99);
		item1.setSaleTax(12.50);
		Item item2 = new Item();
		item2.setId(2);
		item2.setItemName("Axe Deo");
		item2.setPrice(99.99);
		item2.setSaleTax(12.50);

		List<Item> itemArrayList = new ArrayList<>();
		itemArrayList.add(item1);
		itemArrayList.add(item2);

		return itemArrayList;

	}

}
