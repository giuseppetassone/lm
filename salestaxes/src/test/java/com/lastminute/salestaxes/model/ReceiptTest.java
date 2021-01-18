package com.lastminute.salestaxes.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ReceiptTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void should_produce_empty_receipt_given_empty_basket() {
		Receipt receipt = new Receipt(Collections.emptyList());
		String receiptText = receipt.getReceipt();
		assertThat(receiptText).contains("Total: 0.0");
	} 
	
	@Test
	public void should_produce_non_empty_receipt_given_non_empty_basket() {
		List<Product> products = new ArrayList<Product>();
		Product book = new BookProduct("a book", 10.00, false, 1);
		Product other = new OtherProduct("music CD", 14.99, false, 1);
		products.add(book);
		products.add(other);
		Receipt receipt = new Receipt(products);
		String receiptText = receipt.getReceipt();
		System.out.println(receiptText);
		assertThat(receiptText).contains("Total: 26.5");
	} 

}
