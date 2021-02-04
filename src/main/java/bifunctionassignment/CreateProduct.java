package bifunctionassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class CreateProduct {
	
	public static void main(String[] args) {
		
		
		BiFunction<String, Integer, Product> createProduct= (name,price)-> new Product(name, price);
		
		List<Product> listOfProducts= new ArrayList<Product>();
		listOfProducts.add(createProduct.apply("Mobile", 10000));
		listOfProducts.add(createProduct.apply("Fan", 100));
		listOfProducts.add(createProduct.apply("Watch", 5000));
		listOfProducts.add(createProduct.apply("LCD", 20000));
		listOfProducts.add(createProduct.apply("IPhone", 100000));
		
		
	}

}
