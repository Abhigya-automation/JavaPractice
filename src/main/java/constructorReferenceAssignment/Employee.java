package constructorReferenceAssignment;

public class Employee {
	private String name;
	private int account;
	private double salary;
	public Employee(String name, int account, double salary) 
	{
		
		this.name = name;
		this.account = account;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
