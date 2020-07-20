import java.util.Scanner;
import java.lang.String;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Main {
	
	//array list for every classes
	public static ArrayList<Staff> staffArray = new ArrayList<Staff>();
	public static ArrayList<Manager> managerArray = new ArrayList<Manager>();
	
	public static void main (String[] args) {
		
		//data stored in array----
		//array for manager information
		managerArray.add(new Manager("EM0001", "Albert Einstein", "Manager", 8000.00, "MA0001", "qwerty"));
		managerArray.add(new Manager("EM0002", "Barry Allen", "Manager", 8000.00, "MA0002", "qwerty"));
		managerArray.add(new Manager("EM0003", "Christine Palmer", "Manager", 8000.00, "MA0003", "qwerty"));
		managerArray.add(new Manager("EM0004", "David Beckham", "Manager", 8000.00, "MA0004", "qwerty"));
		managerArray.add(new Manager("EM0005", "Enoch Fullbuster", "Manager", 8000.00, "MA0005", "qwerty"));
		
		//array for Staff information
		staffArray.add(new Staff("EMP0006", "Gwen Stacy", "Staff", 6000.00, "ST0001", "qwerty"));
		staffArray.add(new Staff("EMP0007", "Harry Potter", "Staff", 6000.00, "ST0002", "qwerty"));
		staffArray.add(new Staff("EMP0008", "Ivan Stark", "Staff", 6000.00, "ST0003", "qwerty"));
		staffArray.add(new Staff("EMP0009", "James Brooke", "Staff", 6000.00, "ST0004", "qwerty"));
		staffArray.add(new Staff("EMP0010", "Kaecilius", "Staff", 6000.00, "ST0005", "qwerty"));
		staffArray.add(new Staff("EMP0011", "Lincoln Campbell", "Staff", 6000.00, "ST0006", "qwerty"));
		staffArray.add(new Staff("EMP0012", "Marcus Aurelius", "Staff", 6000.00, "ST0007", "qwerty"));
		staffArray.add(new Staff("EMP0013", "Natasha Romanoff", "Staff", 6000.00, "ST0008", "qwerty"));
		staffArray.add(new Staff("EMP0014", "Oscar Robertson", "Staff", 6000.00, "ST0009", "qwerty"));
		staffArray.add(new Staff("EMP0015", "Peter Parker", "Staff", 6000.00, "ST0010", "qwerty"));
		staffArray.add(new Staff("EMP0016", "Quentin Tarantino", "Staff", 6000.00, "ST0011", "qwerty"));
		staffArray.add(new Staff("EMP0017", "Richardo Milo", "Staff", 6000.00, "ST0012", "qwerty"));
		staffArray.add(new Staff("EMP0018", "Shinichi Kudo", "Staff", 6000.00, "ST0013", "qwerty"));
		staffArray.add(new Staff("EMP0019", "Tony Han", "Staff", 6000.00, "ST0014", "qwerty"));
		staffArray.add(new Staff("EMP0020", "Ulberto Tozzi", "Staff", 6000.00, "ST0015", "qwerty"));
		staffArray.add(new Staff("EMP0021", "Vin Diesel", "Staff", 6000.00, "ST0016", "qwerty"));
		staffArray.add(new Staff("EMP0022", "Wendy Marvell", "Staff", 6000.00, "ST0017", "qwerty"));
		staffArray.add(new Staff("EMP0023", "X Æ2 A-12", "Staff", 6000.00, "ST0018", "qwerty"));
		staffArray.add(new Staff("EMP0024", "Yvonne McGuinness", "Staff", 6000.00, "ST0019", "qwerty"));
		staffArray.add(new Staff("EMP0025", "Zoey Deutch", "Staff", 6000.00, "ST0020", "qwerty"));
		
		
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("dddd-MMMM-yyyy hh:mm:ss");
		Date date = new Date();
		
		int choice = 0;
		int next = 0;
		boolean loginCondition;
		logo();
		choice = loginMenu();
		loginCondition = loginMethod(choice);
		
		if(choice == 1){
			if(loginCondition == true){
				do{
					int staffChoice;
					switch(staffChoice = staffMenu()){
						//case 1: next = searchMethod(); break;
						//case 2: next = addMethod(); break;
						//case 3: next = viewFoodDetails(); break;
					    //case 4: next = viewTransactionHistory(); break;
						//default: System.exit(0);
					}
				}while(next == 1);
			}
		}
		else if(choice == 2){
			if(loginCondition == true){
				do{
					int managerChoice;
					switch(managerChoice = managerMenu()){
						case 1: next = addStaffDetails(); break;
						case 2: next = modifyStaffDetails(); break;
						case 3: next = deleteStaffDetails(); break;
						case 4: next = viewStaffDetails(); break;
						case 5: next = addNewFoodDetails(); break;
						case 6: next = modifyFoodDetails(); break;
						case 7: next = deleteFoodDetails(); break;
						case 8: next = viewFoodDetails(); break;
						default: System.exit(0);
					}
				}while(next == 1);
			}
		}
		System.out.println("Thank you! Goodbye!");
	}
	
	private static int viewFoodDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int deleteFoodDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int modifyFoodDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int addNewFoodDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int deleteStaffDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int modifyStaffDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int addStaffDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void logo() {
		System.out.println("=================================================================================");
		System.out.println("|                                                                               |");
		System.out.println("|                  Welcome to Restaurant                                        |");
		System.out.println("|                                                                               |");
		System.out.println("|    RRRRR  EEEEE   SSS  TTTTTTT   A    U    U RRRRR     A    N     N TTTTTTT   |");
		System.out.println("|    R    R E      S   S    T     A A   U    U R    R   A A   NN    N    T      |");
		System.out.println("|    R    R E      S        T    A   A  U    U R    R  A   A  N N   N    T      |");
		System.out.println("|    RRRRR  EEEE    SSS     T   AAAAAAA U    U RRRRR  AAAAAAA N  N  N    T      |");
		System.out.println("|    R  R   E          S    T   A     A U    U R  R   A     A N   N N    T      |");
		System.out.println("|    R   R  E      S   S    T   A     A U    U R   R  A     A N    NN    T      |");
		System.out.println("|    R    R EEEEE   SSS     T   A     A  UUUU  R    R A     A N     N    T      |");
		System.out.println("|                                                                               |");
		System.out.println("=================================================================================");
	}
	
	public static int loginMenu(){
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(choice <= 0 || choice > 2){
			try{
				System.out.println("");
				System.out.println("========================");
				System.out.println("| Choose Your Position |");
				System.out.println("========================");
				System.out.println("|     1. Staff         |");
				System.out.println("|     2. Manager       |");
				System.out.println("========================\n\n");
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
						System.out.print("Staff Login ID : ");
						loginID = scanner.next();
						System.out.print("Password : ");
						loginPassword = scanner.next();
						
						UserLogin staff = new UserLogin(loginID, loginPassword);
						boolean checkStaffID = staff.validateLoginID(loginID);
						
						if(checkStaffID == true){
							for(int i = 0; i < staffArray.size(); i++){
								if((loginID.equals(staffArray.get(i).getStaffLoginID())) && (loginPassword.equals(staffArray.get(i).getStaffPassword())) == true){
									Date date = new Date();
									System.out.printf("Welcome Staff %s\t\t\t Logged In Time: %s\n\n", staffArray.get(i).getEmployeeName(), date);
									return isStaff = true;
								}
							}
							if(isStaff == false){
								System.out.println("Access Denied");
							}
						}
						else {
							System.out.println("Invalid ID or Password.");
						}
					}while(isStaff == false);
			break;
			
			case 2: do {
						System.out.print("Manager Login ID: ");
						loginID = scanner.next();
						System.out.print("Password: ");
						loginPassword = scanner.next();
						
						UserLogin manager = new UserLogin(loginID, loginPassword);
						boolean checkManagerID = manager.validateLoginID(loginID);
						
						if(checkManagerID == true) {
							for(int i = 0; i < managerArray.size(); i++) {
								if((loginID.equals(managerArray.get(i).getLoginID())) && (loginPassword.equals(managerArray.get(i).getPassword())) == true) {
									Date date = new Date();
									System.out.printf("Welcome Manager %s\t\t\t Logged In Time: %s\n\n", managerArray.get(i).getEmployeeName(), date);
									return isManager = true;
								}
							}
							if(isManager == false) {
								System.out.printf("Invalid ID or Password.\n");
							}
						}
					}while(isManager == false);
				
			break;
			
			default: System.out.println("Enter again.");
			loginMenu();
		}
		return false;
	}
	
	public static int staffMenu(){
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("|          STAFF MENU         |");
		System.out.println("===============================");
		System.out.println("| 1. Search                   |");
		System.out.println("| 2. Add                      |");
		System.out.println("| 3. View Food Details        |");
		System.out.println("| 4. View Transaction History |");
		System.out.println("| 5. Exit                     |");
		System.out.println("===============================");
		boolean selected = false;
		do {
			do {
				try {
					System.out.print("Enter your choice: ");
					choice = scanner.nextInt();
					selected = true;
				}
				catch(Exception ex) {
					System.out.printf("Only numbers are allowed.\n");
					scanner.nextLine();
					System.out.println();
				}
				if(choice < 1 || choice > 5) {
					System.out.print("Enter 1 to 5 only.\n");
				}
			}while(choice < 1 || choice > 5);
		}while(!selected);
		return choice;
	}
	
	public static int managerMenu(){
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("======================================");
    	System.out.println("|	         MANAGER MENU			 |");
    	System.out.println("======================================");
    	System.out.println("| 1. Add New Staff Details           |");
    	System.out.println("| 2. Modify Existing Staff Details   |");
    	System.out.println("| 3. Remove Staff Details            |");
    	System.out.println("| 4. View All Staff Details          |");
    	System.out.println("======================================");
    	System.out.println("| 5. Add New Product Details         |");
    	System.out.println("| 6. Modify Existing Product Details |");
    	System.out.println("| 7. Remove Product Details          |");
    	System.out.println("| 8. View Product Details            |");
    	System.out.println("| 9. Exit                            |");
    	System.out.println("======================================");
    	boolean selected = false;
    	
    	do {
    		do {
    			try {
    				System.out.print("Enter your choice: ");
    				choice = scanner.nextInt();
    				selected = true;
    			}
    			catch(Exception ex) {
    				System.out.println("Only numbers are allowed.\n");
    				scanner.nextLine();
    				System.out.println();
    			}
    			if(choice < 1 || choice > 9) {
    				System.out.println("Enter 1 to 9 only\n");
    			}
    		}while(choice < 1 || choice > 9);
    	}while(!selected);
    	return choice;
	}
	
	
	public static int viewStaffDetails() {
		int next = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nAll Employees Details");
		System.out.println("=====================\n");
		System.out.printf("%-10s %-20s %-15s %s\n", "ID", "Name", "Position", "Salary");
		System.out.println("=======================================================");
		
		for(int i = 0; i < managerArray.size(); i++) {
			System.out.println(managerArray.get(i).toString());
		}
		for(int i = 0; i < staffArray.size(); i++) {
			System.out.println(staffArray.get(i).toString());
		}
		System.out.println("=======================================================\n");
		boolean selected = false;
		do {
			do {
				try {
					System.out.println("Continue? (1 for Yes / 2 for No): ");
					next = scanner.nextInt();
					selected = true;
				}
				catch(Exception ex) {
					System.out.println("Only numbers are allowed\n");
					scanner.nextLine();
					System.out.println();
				}
				if(next < 1 || next > 2) {
					System.out.println("Enter 1 or 2 only\n");
				}
			}while(next < 1 || next > 2);
		}while(!selected);
		
		return next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
