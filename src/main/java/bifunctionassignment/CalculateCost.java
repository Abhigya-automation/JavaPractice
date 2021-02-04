package bifunctionassignment;

import java.util.function.BiFunction;

public class CalculateCost {
	public static void main(String[] args) {
		
		
		
		BiFunction<Product, Integer, Integer> calculateCost= (product,quantity)-> product.getPrice()*quantity;
		
	}

}
