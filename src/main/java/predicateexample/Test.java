package predicateexample;

import java.util.function.*;
public class Test {
	
	public static void main(String[] args) {
		Predicate<Integer> p= I-> I>10;
		System.out.println(p.test(50));
	}

}
