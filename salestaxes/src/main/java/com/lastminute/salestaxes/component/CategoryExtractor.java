package com.lastminute.salestaxes.component;

import com.lastminute.salestaxes.model.ProductEnum;

/**
 * A trivial component that extracts categories from sentences
 * @author giuseppetassone
 *
 */
public class CategoryExtractor {
	
	public ProductEnum extractCategoryFromName(String name) {
		
		if(name.contains("book")) {
			return ProductEnum.BOOK;
		}
		else if(name.contains("headache pills")) {
			return ProductEnum.MEDICAL;
		}
		else if(name.contains("chocolate")) {
			return ProductEnum.FOOD;
		}
		
		return ProductEnum.OTHER;
	}

}
