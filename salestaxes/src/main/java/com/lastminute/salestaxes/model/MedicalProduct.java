package com.lastminute.salestaxes.model;

import com.lastminute.salestaxes.utils.TaxCalculator;

/**
 * Medical product 
 * @author giuseppetassone
 *
 */
public class MedicalProduct extends Product{
	
	public MedicalProduct(String name, double price, boolean isImported, int quantity) {
		super(name, price, isImported, quantity);
	}

	@Override
	public Double getTax() {
		return TaxCalculator.calcultateTax(price, baseTax, isImported);
	}
}
