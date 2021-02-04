package lambdaAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeByName {
	public static void main(String[] args) {
		
		
		ArrayList<Employee> list= new ArrayList<Employee>();
		list.add(new Employee("Amit", 101));
		list.add(new Employee("Deepak", 102));
		list.add(new Employee("Abhi", 103));
		list.add(new Employee("Aashish", 104));
		
		//Collections.sort(list, new NameComparator());
		Collections.sort(list,(e1,e2)-> e1.empName.compareTo(e2.empName));
		System.out.println(list);
	}

}
