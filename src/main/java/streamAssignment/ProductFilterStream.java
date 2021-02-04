package streamAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import predicateassignment.Product;

public class ProductFilterStream {
	
	public static void main(String[] args) {
		List<Product> listOfProduct = new ArrayList<Product>();

		listOfProduct.add(new Product("product1", 50, "electronics", "grade1"));
		listOfProduct.add(new Product("product2", 1000, "medical", "grade2"));
		listOfProduct.add(new Product("product3", 50, "food", "grade3"));
		listOfProduct.add(new Product("product4", 10000, "electronics", "grade1"));
		listOfProduct.add(new Product("product5", 800, "electronics", "grade1"));
		listOfProduct.add(new Product("product6", 2000, "food", "grade3"));
		listOfProduct.add(new Product("product7", 12000, "medical", "grade2"));
		listOfProduct.add(new Product("product8", 2000, "electronics", "grade1"));
		/*
		 * List<Product> newList=
		 * listOfProduct.stream().filter(product->product.getPrice()>1000).collect(
		 * Collectors.toList()); System.out.println(newList);
		 */

		/*
		 * List<Product> newList=
		 * listOfProduct.stream().filter(product->product.getCategory().equals(
		 * "electronics")).collect(Collectors.toList());
		 * System.out.println(newList);
		 */

		/*
		 * List<Product> newList = listOfProduct.stream()
		 * .filter(product->product.getCategory().equals("electronics") &&
		 * product.getPrice()>1000) .collect(Collectors.toList());
		 */

		/*
		 * long electronicsProductCount = listOfProduct.stream()
		 * .filter(product->product.getCategory().equals("electronics")) .count();
		 * System.out.println(electronicsProductCount);
		 */

		List<Product> list = listOfProduct.stream().map(product -> {
			product.setName(product.getName().toUpperCase());
			return product;
		}).filter(product->product.getCategory().equals("electronics")).collect(Collectors.toList());
		System.out.println(list);
	}

}
