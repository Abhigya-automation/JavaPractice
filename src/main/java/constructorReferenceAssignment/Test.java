package constructorReferenceAssignment;

public class Test {

	public static void main(String[] args) {
		
		EmployeeFactory empFactory=Employee::new;
		Employee emp=empFactory.getEmployee("Abhigya", 101, 10000);
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee Account: "+emp.getAccount());
		System.out.println("Employee salary: "+emp.getSalary());
		
	}
}
