package premitiveInterfacesAssignment;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Test {
	
	
	public static void main(String[] args) {
		
		//System.out.println(Test.isPrime(13));
		
		/*IntConsumer consumer= I-> System.out.println("Square of "+I+ " is: "+I*I);
		consumer.printSquare(11);*/
		
		IntSupplier supplier= ()->new Random().nextInt(5000);
		System.out.println(supplier.getAsInt());
		
	}
	
	public static boolean isPrime(int number) {
	    IntPredicate isDivisible = index -> number % index == 0;
	    return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
	  }

}