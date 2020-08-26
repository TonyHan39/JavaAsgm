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
    	int numOfChar = 0;
    	int	numOfDigit = 0;
    	
    	//example of login id : ST0001, MA0001
    	//all login id must consist of 2 upper cased characters and 4 digit integer
    	if(loginID.length() > 0 && loginID.length() < 7){
    		if(Character.isUpperCase(loginID.charAt(0)) == true){
    			for(int i = 0 ; i < loginID.length(); i++){
    				if(Character.isLetter(loginID.charAt(i)) == true) {
    					numOfChar++;
    				}
    				if(Character.isDigit(loginID.charAt(i)) == true) {
    					numOfDigit++;
    				}
    			}
    		}
    		if(numOfChar == 2 && numOfDigit == 4){
    			return true;
    		}
    	}
    	return false;
    }
}
