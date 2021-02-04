package consumersupplierassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import predicateassignment.Product;

public class ProductConsumer {
	
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
		
		Consumer<Product>c= product-> {
			
			System.out.println("Product Name: "+product.getName());
			System.out.println("Product Price: "+product.getPrice());
			System.out.println("Product Category: "+product.getCategory());
			System.out.println("Product Grade: "+product.getGrade());
			System.out.println("************************************");
		};
		
		/*for(Product p:listOfProduct)
		{
			c.accept(p);
		}*/
		
		/*Predicate<Product> p= product-> product.getPrice()>1000;
		
		for(Product p1:listOfProduct)
		{
			if(p.test(p1))
			{
				p1.setGrade("Premium");
				c.accept(p1);
			}
		}*/
		
		Predicate<Product> p= product-> product.getPrice()>3000;
		for(Product product:listOfProduct)
		{
			if(p.test(product))
			{
				product.setName(product.getName()+"*");
				c.accept(product);
			}
		}
		
		
	}

}
