package com.lastminute.salestaxes.model;

import java.util.Locale;

/**
 * 
 * Represents a generic product
 * @author giuseppetassone
 *
 */
public abstract class Product {
		
	protected String name;
	protected Double price;
	protected int quantity;
	protected double baseTax = 0D;
	protected boolean isImported;
	
	
	public Product(String name, Double price, boolean isImported, int quantity) {
		this(name, 0D, price, isImported, quantity);
	}
	
	public Product(String name, Double tax, Double price, boolean isImported, int quantity) {
		this.name = name;
		this.price = quantity * price;
		this.quantity = quantity;
		this.isImported = isImported;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Double getTax();


	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String printProductDetail() {
		return quantity + " " + name + ": " + String.format(Locale.US, "%.2f", price + getTax());
	}
}
