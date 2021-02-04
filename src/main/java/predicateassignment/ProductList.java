package predicateassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductList {

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

		// Predicate<Product> p1= product-> product.price>1000;
		// ProductList.display(p1, listOfProduct);

		// Predicate<Product> p2= product->
		// product.category.equals("electronics");
		// ProductList.display(p2, listOfProduct);

		// Predicate<Product> p3= product->
		// product.category.equals("electronics")&& product.price>100;
		// ProductList.display(p3, listOfProduct);

		/*
		 * Predicate<Product> p4= product->
		 * product.category.equals("electronics") || product.price>100;
		 * ProductList.display(p4, listOfProduct);
		 */

		// Predicate<Product> p5= product->
		// product.category.equals("electronics") && product.price<100;
		// ProductList.display(p5, listOfProduct);

		

	}

	public static void display(Predicate<Product> p, List<Product> list) {
		for (Product product : list) {
			if (p.test(product)) {
				System.out.println(product);
			}
		}
	}

}
