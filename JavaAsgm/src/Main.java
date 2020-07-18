import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class Main {
	
	//array list for every class
	public static ArrayList<Staff> staffArray = new ArrayList<Staff>();
		
	public static void main (String[] args) {//here got main liao
		
		//data stored in array
		staffArray.add(new Staff("EMP001", "Tony", "Staff", 3999.00, "ST0001", "qwerty"));
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = 0;
		int next = 0;
		boolean loginCondition;
		loginMenu();
		choice = loginMenu();
		loginCondition = loginMethod(choice);
		
		if(choice == 1){
			if(loginCondition == true){
				do{
					int staffChoice;
					switch(staffChoice = staffMenu()){
						//staff choicesss
					}
				}while(next == 1);
			}
		}
		else if(choice == 2){
			if(loginCondition == true){
				do{
					int managerChoice;
					switch(managerChoice=managerMenu()){
						
					}
				}while(next == 1);
			}
		}
	}
	
	public static int loginMenu(){
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(choice <= 0 || choice > 2){
			try{
				System.out.println("");
				System.out.println("______________________");
				System.out.println("|Choose Your Position|");
				System.out.println("|--------------------|");
				System.out.println("|     1. Staff       |");
				System.out.println("|     2. Manager     |");
				System.out.println("|____________________|\n\n");
				System.out.print("Enter your position: ");
				choice = scanner.nextInt();
			}
			catch (Exception ex){
				System.out.println("Please enter an integer type value only");
				scanner.nextLine();
				System.out.println();
			}
			if(choice < 1 || choice > 2){
				System.out.println("Please select 1 or 2");
			}
		}
		return choice;
	}
	
	//login method
	
	public static boolean loginMethod(int choice){
		String loginID;
		String loginPassword;
		boolean isStaff = false;
		boolean isManager = false;
		
		Scanner scanner = new Scanner(System.in);
		
		switch(choice){
			case 1: do{
						System.out.print("Login ID : ");
						loginID = scanner.next();
						System.out.print("Password : ");
						loginPassword = scanner.next();
						
						UserLogin staff = new UserLogin(loginID, loginPassword);
						boolean checkStaffID = staff.validateLoginID(loginID);
						
						if(checkStaffID == true){
							for(int i=0; i < staffArray.size(); i++){
								if((loginID.equals(staffArray.get(i).getStaffLoginID())) && (loginPassword.equals(staffArray.get(i).getStaffPassword())) == true){
									System.out.println("Welcome");
								}
							}
							if(isStaff == false){
								System.out.println("Access Denied");
							}
						}
					}while(isStaff == false);
			break;
			
			//case 2: 
				
			//break;
			
			default: System.out.println("Enter again.");
			loginMenu();
		}
		return false;
	}
	
	public static int staffMenu(){
		System.out.print("Hello Staff");
		
		return 1;
	}
	
	public static int managerMenu(){
		System.out.print("Hello Manager");
		
		return 1;
	}
	
}
