package lambdaAssignments;

public class Employee {

	String empName;
	int empID;
	
	public Employee(String empName,int empID)
	{
		this.empName=empName;
		this.empID=empID;
	}
	
	public String toString()
	{
		return empName+" : "+empID;
	}
	
	
}
