package com.lastminute.salestaxes.model;

import com.lastminute.salestaxes.utils.TaxCalculator;

/**
 * Other product representation
 * @author giuseppetassone
 *
 */
public class OtherProduct extends Product{
	
	public OtherProduct(String name, double price, boolean isImported, int quantity) {
		super(name, price, isImported, quantity);
	}

	@Override
	public Double getTax() {
		//TODO - put in some configuration file or DB
		Double otherProductTax = new Double(0.10);
		return TaxCalculator.calcultateTax(price, otherProductTax, isImported);
	}
}
