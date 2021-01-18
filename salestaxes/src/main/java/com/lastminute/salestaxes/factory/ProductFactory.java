package com.lastminute.salestaxes.factory;

import com.lastminute.salestaxes.model.BookProduct;
import com.lastminute.salestaxes.model.FoodProduct;
import com.lastminute.salestaxes.model.MedicalProduct;
import com.lastminute.salestaxes.model.OtherProduct;
import com.lastminute.salestaxes.model.Product;
import com.lastminute.salestaxes.model.ProductEnum;

/**
 * Factory class ProductFactory
 * @author giuseppetassone
 *
 */
public class ProductFactory {

	/**
	 * Factory method - creates a new Product object
	 * @param name
	 * @param price
	 * @param imported
	 * @param quantity
	 * @return
	 */
	public static Product getProduct(ProductEnum productType, String name, 
			double price, boolean isImported, int quantity) {
		Product ret = null;
		switch(productType) {
			case BOOK:
				ret = new BookProduct(name, price, isImported, quantity);
				break;
			case FOOD:
				ret = new FoodProduct(name, price, isImported, quantity);
				break;
			case MEDICAL:
				ret = new MedicalProduct(name, price, isImported, quantity);
				break;
			case OTHER:
				ret = new OtherProduct(name, price, isImported, quantity);
				break;
		}
		return ret;
	}

}
