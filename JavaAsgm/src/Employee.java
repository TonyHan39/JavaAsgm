public abstract class Employee {
	private String employeeID;
	private String employeeName;
	private String employeePosition;
	private double salary;
	
	//default constructor
	protected Employee(){}
	
	//constructor with parameters
	protected Employee(String employeeID, String employeeName, String employeePosition, double salary){
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.salary = salary;
	}
	
	//accessor for Employee
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	
	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}
	
	public void setEmployeePosition(String employeePosition){
		this.employeePosition = employeePosition;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	//mutator
	public String getEmployeeID(){
		return employeeID;
	}
	
	public String getEmployeeName(){
		return employeeName;
	}
	
	public String getEmployeePosition(){
		return employeePosition;
	}
	
	public double getSalary(){
		return salary;
	}
	
	//return all details of employee
	public String toString(){
		return String.format("%-10s| %-20s| %-10s| %8.2f |", employeeID, employeeName, employeePosition, salary);
	}
	
	public abstract boolean verifyLoginID(String loginID);
}
