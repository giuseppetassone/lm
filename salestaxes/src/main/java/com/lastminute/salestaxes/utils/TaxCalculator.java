package com.lastminute.salestaxes.utils;

/**
 * Utility class to calculate sales tax 
 * @author giuseppetassone
 *
 */
public class TaxCalculator {

	public static Double calcultateTax(double price, double tax, boolean isImported) {
		if(isImported) {
			tax += 0.05;
		}
		
		double calculatedTax = price * tax;

		double ret = Math.round(calculatedTax * 20.0) / 20.0;
		return ret;
	}
}
