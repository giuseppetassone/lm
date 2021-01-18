package com.lastminute.salestaxes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represent a receipt for a shopping basket
 * @author giuseppetassone
 *
 */
public class Receipt {

	private final List<Product> shoppingBasket;
	
	public Receipt() {
		this(new ArrayList<>());
	}
	
	public Receipt(List<Product> shoppingBasket) {
		if(shoppingBasket == null)
			shoppingBasket = new ArrayList<>();
		this.shoppingBasket = shoppingBasket;
	}
	
	public String getReceipt() {
		String receipt = "";

		for(Product product : shoppingBasket) {
			receipt += product.printProductDetail() + "\n";
		}
		
		receipt += "Sales Taxes: " + Math.ceil(getSalesTaxes() * 20.0) / 20.0 + "\n";
		receipt += "Total: " + Math.ceil((getTotalAmout() + getSalesTaxes()) * 20.0) / 20.0  + "\n";
		
		return receipt;
	}

	private Double getTotalAmout() {
		return shoppingBasket.stream().mapToDouble(i -> i.getPrice()).sum();
	}
	
	private Double getSalesTaxes() {
		return shoppingBasket.stream().mapToDouble(i -> i.getTax()).sum();
	}
}
