package com.cart.demo.Model;

import java.util.List;

public class CartCreationDto {

	private List<Item> items;

	public CartCreationDto() {

		// TODO Auto-generated constructor stub
	}

	public CartCreationDto(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addCart(Item item) {
		items.add(item);
	}

}
