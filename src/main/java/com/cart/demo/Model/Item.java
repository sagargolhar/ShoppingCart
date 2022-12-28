package com.cart.demo.Model;

public class Item {

	private Integer id;
	private String itemName;
	private Double price;
	private Double saleTax;
	private Integer noofItem;
	private Double grossTotal;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String itemName, Double price, Double saleTax, Integer noofItem, Double grossTotal) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.saleTax = saleTax;
		this.noofItem = noofItem;
		this.grossTotal = grossTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getSaleTax() {
		return saleTax;
	}

	public void setSaleTax(Double saleTax) {
		this.saleTax = saleTax;
	}

	public Integer getNoofItem() {
		return noofItem;
	}

	public void setNoofItem(Integer noofItem) {
		this.noofItem = noofItem;
	}

	public Double getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(Double grossTotal) {
		this.grossTotal = grossTotal;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + ", saleTax=" + saleTax + ", noofItem="
				+ noofItem + ", grossTotal=" + grossTotal + "]";
	}

}
