package com.lastminute.salestaxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.lastminute.salestaxes.component.CategoryExtractor;
import com.lastminute.salestaxes.factory.ProductFactory;
import com.lastminute.salestaxes.model.Product;
import com.lastminute.salestaxes.model.ProductEnum;
import com.lastminute.salestaxes.model.Receipt;

/**
 * Main class
 * @author giuseppetassone
 *
 */
public class SalesTaxesMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
		boolean anotherItem = true;

		List<Product> shoppingBasket = new ArrayList<>();

		while(anotherItem){
			ProductEnum productType = null;
			int quantity = 0;
			double price = 0.00;

			System.out.println("Enter name of product:");

			String name = scanner.nextLine();

			CategoryExtractor categoryExtractor = new CategoryExtractor();
			productType = categoryExtractor.extractCategoryFromName(name);

			System.out.println("Enter quantity of product:");

			if(scanner.hasNextInt()){
				quantity = scanner.nextInt();
			}
			else {
				System.err.println("You must type an integer value! Retry.");
				System.exit(0);
			}
			scanner.nextLine();

			System.out.println("Enter price of your product:");	

			if(scanner.hasNextDouble()){
				price = scanner.nextDouble();
			}
			else {
				System.err.println("You must type a decimal value! Retry.");
				System.exit(0);
			}
			scanner.nextLine();
			
			System.out.println("Is the product imported? (Write Y or N)");

			boolean isImported = scanner.nextLine().equalsIgnoreCase("Y") ? true : false;

			if(isImported)
				name = "imported " + name;

			shoppingBasket.add(ProductFactory.getProduct(productType, name, Math.abs(price), isImported, Math.abs(quantity)));

			System.out.println("Do you want to add another article to your shopping basket? (Write Y or N)");

			anotherItem = scanner.nextLine().equalsIgnoreCase("Y") ? true : false;
		}

		if(!shoppingBasket.isEmpty()) {
			System.out.println("\nINPUT");
			for(Product p : shoppingBasket) {
				System.out.println(p.getQuantity() + " " + p.getName() + " at " + p.getPrice());
			}
			System.out.println("\nOUTPUT");
			Receipt receipt = new Receipt(shoppingBasket);
			System.out.println(receipt.getReceipt());
		}
	}
}
