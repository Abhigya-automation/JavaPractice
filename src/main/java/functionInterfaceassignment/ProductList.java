package functionInterfaceassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import predicateassignment.Product;

public class ProductList {

	
	public static void main(String[] args) {
		
		
		List<Product> listOfProduct = new ArrayList<Product>();

		listOfProduct.add(new Product("product1", 1000, "electronics", "grade1"));
		listOfProduct.add(new Product("product2", 1000, "medical", "grade2"));
		listOfProduct.add(new Product("product3", 50, "food", "grade3"));
		listOfProduct.add(new Product("product4", 10000, "electronics", "grade1"));
		listOfProduct.add(new Product("product5", 8000, "electronics", "grade1"));
		listOfProduct.add(new Product("product6", 2000, "food", "grade3"));
		listOfProduct.add(new Product("product7", 12000, "medical", "grade2"));
		listOfProduct.add(new Product("product8", 200, "electronics", "grade1"));
		
		/*Function<List<Product>, Integer> costOfProducts=l->
		{
			int totalPrice=0;
			for(Product p:l)
			{
				totalPrice+=p.getPrice();
			}
			return totalPrice;
		};*/
		
		/*Predicate<Product> prod= product-> product.getPrice()>1000;
		Function<List<Product>, Integer> costOfProducts=l->
		{
			int totalPrice=0;
			for(Product p:l)
			{
				if(prod.test(p))
				{
				totalPrice+=p.getPrice();
				}
			}
			return totalPrice;
		};*/
		
		/*Predicate<Product> prod= product-> product.getCategory().equals("electronics");
		Function<List<Product>, Integer> costOfProducts=l->
		{
			int totalPrice=0;
			for(Product p:l)
			{
				if(prod.test(p))
				{
				totalPrice+=p.getPrice();
				}
			}
			return totalPrice;
		};*/
		
		Predicate<Product> prod= product-> product.getCategory().equals("electronics") && product.getPrice()>1000;
		Function<List<Product>, Integer> costOfProducts=l->
		{
			int totalPrice=0;
			for(Product p:l)
			{
				if(prod.test(p))
				{
				totalPrice+=p.getPrice();
				}
			}
			return totalPrice;
		};
		System.out.println(costOfProducts.apply(listOfProduct));
		
	}
	
}
