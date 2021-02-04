package lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(1);
		list.add(125);
		list.add(19);
		list.add(981);
		list.add(0);
		System.out.println("Before sorting: "+list);
		//Collections.sort(list, new MyCOmparator());
		Collections.sort(list, (I1,I2)-> I1>I2?-1:I1<I2?1:0);
		System.out.println("After sorting: "+list);
		
		
		
		
	}

}
