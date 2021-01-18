package com.lastminute.salestaxes.model;

import com.lastminute.salestaxes.utils.TaxCalculator;

/**
 * Book product representation
 * @author giuseppetassone
 *
 */
public class BookProduct extends Product{
	
	public BookProduct(String productName, double price, boolean isImported, int quantity) {
		super(productName, price, isImported, quantity);
	}

	@Override
	public Double getTax() {
		return TaxCalculator.calcultateTax(price, baseTax, isImported);
	}

}
