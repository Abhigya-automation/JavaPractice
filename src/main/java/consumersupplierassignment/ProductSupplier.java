package consumersupplierassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import predicateassignment.Product;

public class ProductSupplier {
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

		Supplier<Product> supplier = () -> {
			int index = (int) (Math.random() * listOfProduct.size());

			return listOfProduct.get(index);
		};
		
		System.out.println(supplier.get());

	}

}
