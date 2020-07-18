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
}
