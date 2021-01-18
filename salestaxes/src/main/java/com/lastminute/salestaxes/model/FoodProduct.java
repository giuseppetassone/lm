package com.lastminute.salestaxes.model;

import com.lastminute.salestaxes.utils.TaxCalculator;

/**
 * Food product representation
 * @author giuseppetassone
 *
 */
public class FoodProduct extends Product{
	
	public FoodProduct(String name, double price, boolean isImported, int quantity) {
		super(name, price, isImported, quantity);
	}

	@Override
	public Double getTax() {
		return TaxCalculator.calcultateTax(price, baseTax, isImported);
	}
}
