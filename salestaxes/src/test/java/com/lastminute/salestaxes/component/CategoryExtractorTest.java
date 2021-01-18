package com.lastminute.salestaxes.component;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lastminute.salestaxes.model.ProductEnum;

public class CategoryExtractorTest {

	private CategoryExtractor extractor;
	
	@Before
	public void setUp() throws Exception {
		extractor = new CategoryExtractor();
	}

	@Test
	public void should_recognize_book_product() {
		assertEquals(extractor.extractCategoryFromName("book"), ProductEnum.BOOK);
	}
	
	@Test
	public void should_recognize_medical_product() {
		assertEquals(extractor.extractCategoryFromName("headache pills"), ProductEnum.MEDICAL);
	}
	
	@Test
	public void should_recognize_food_product() {
		assertEquals(extractor.extractCategoryFromName("chocolate bar"), ProductEnum.FOOD);
	}

	@Test
	public void should_recognize_other_product() {
		assertEquals(extractor.extractCategoryFromName("bottle of perfume"), ProductEnum.OTHER);
	}
}
