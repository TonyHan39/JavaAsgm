import java.lang.Character;

public class UserLogin {
	private String loginID;
	private String password;
	
    public UserLogin() {}
    public UserLogin(String loginID, String password){
    	this.loginID = loginID;
    	this.password = password;
    }
    
    public void setLoginID(String loginID){
    	this.loginID = loginID;
    }
    
    public void setPassword(String password){
    	this.password = password;
    }
    
    public String getLoginID(){
    	return this.loginID;
    }
    
    public String getPassword(){
    	return this.password;
    }
    
    public boolean validateLoginID(String loginID){
    	int chNo = 0;
    	int	digitNo = 0;
    	
    	if(loginID.length() > 0 && loginID.length()<6){
    		if(Character.isUpperCase(loginID.charAt(0))== true){
    			for(int i = 0 ; i < loginID.length(); i++){
    				if(Character.isLetter(loginID.charAt(i))== true)
    					chNo++;
    				if(Character.isDigit(loginID.charAt(i))==true)
    					digitNo++;
    			}
    		}
    		if(chNo == 1 && digitNo == 4){
    			return true;
    		}	
    	}
    	return false;
    }
}
