public class Manager extends Employee{
    private String managerLoginID;
    private String managerPassword;
    
    public Manager(){}
    
    public Manager(String managerID, String managerName,String position, double salary, String managerLoginID, String managerPassword){
    	super(managerID,managerName,position,salary);
    	this.managerLoginID = managerLoginID;
    	this.managerPassword = managerPassword;
    }
    
   
    public void setmanagerLoginID(String managerLoginID)
    {
    	this.managerLoginID = managerLoginID;
    }
    public void setPassword(String managerPassword)
    {
    	this.managerPassword = managerPassword;
    }
    
    public String getLoginID(){
    	return this.managerLoginID;
    }
    public String getPassword(){
    	return this.managerPassword;
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
