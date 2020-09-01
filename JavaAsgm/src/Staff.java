public class Staff extends Employee {
	private String staffLoginID;
	private String staffPassword;
	
	public Staff(){}
	
	public Staff(String staffID, String staffName, String position, double salary, String staffLoginID, String staffPassword){
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
	
	@Override
	public boolean verifyLoginID(String loginID){
    	String IdFormat = "[S,T]{2}[\\d]{4}";
    	//example staff login id : ST0001
    	//staff login id must consist of 2 upper cased "ST" characters and 4 digit integer
    	if(loginID.length() > 0 && loginID.length() < 7){
    		if (loginID.matches(IdFormat) == true) {
				return true;
			}
    	}
    	return false;
    }
}
