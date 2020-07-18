public class Staff extends Employee {
	private String staffLoginID;
	private String staffPassword;
	
	public Staff(){}
	
	public Staff(String staffID, String staffName,String position, double salary, String staffLoginID, String staffPassword){
		super(staffID, staffName, position, salary);
		this.staffLoginID = staffLoginID;
		this.staffPassword = staffPassword;
	}
	
	public void setStaffLoginID(String staffLoginID){
		this.staffLoginID = staffLoginID;
	}
	
	public void setStaffPassword(String staffPassword){
		this.staffPassword = staffPassword;
	}
	
	public String getStaffLoginID(){
		return this.staffLoginID;
	}
	
	public String getStaffPassword(){
		return this.staffPassword;
	}
}
