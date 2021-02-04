package lambdaAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondBiggestNumberInList {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(1);
		list.add(89);
		list.add(1900);
		list.add(50);
		
		Collections.sort(list, (I1,I2)-> I1>I2?-1:I1<I2?1:0);
		System.out.println("Second Largest Value in the list is:"+list.get(1));
	}

}
