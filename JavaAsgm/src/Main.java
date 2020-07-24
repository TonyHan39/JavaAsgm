import java.util.Scanner;
import java.lang.String;
import java.util.*;
import java.awt.TexturePaint;
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
		managerArray.add(new Manager("EMP0001", "Albert Einstein", "Manager", 8000.00, "MA0001", "qwerty"));
		managerArray.add(new Manager("EMP0002", "Barry Allen", "Manager", 8000.00, "MA0002", "qwerty"));
		managerArray.add(new Manager("EMP0003", "Christine Palmer", "Manager", 8000.00, "MA0003", "qwerty"));
		managerArray.add(new Manager("EMP0004", "David Beckham", "Manager", 8000.00, "MA0004", "qwerty"));
		managerArray.add(new Manager("EMP0005", "Ethan Hunt", "Manager", 8000.00, "MA0005", "qwerty"));
		
		//array for Staff information
		staffArray.add(new Staff("EMP0006", "Gwen Stacy", "Staff", 6000.00, "ST0001", "qwerty"));
		staffArray.add(new Staff("EMP0007", "Harry Potter", "Staff", 6000.00, "ST0002", "qwerty"));
		staffArray.add(new Staff("EMP0008", "Ivan Stark", "Staff", 6000.00, "ST0003", "qwerty"));
		staffArray.add(new Staff("EMP0009", "James Brooke", "Staff", 6000.00, "ST0004", "qwerty"));
		staffArray.add(new Staff("EMP0010", "Kaecilius", "Staff", 6000.00, "ST0005", "abcdef"));
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
		choice = loginMenu();
		loginCondition = loginMethod(choice);
		
		if(choice == 1){
			if(loginCondition == true){
				do{
					int staffChoice;
					switch(staffChoice = staffMenu()){
						//case 1: next = searchFoodDetails(); break;
						//case 2: next = addMethod(); break;
						//case 3: next = viewFoodDetails(); break;
					    //case 4: next = viewTransactionHistory(); break;
						default: next = loginMenu();
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
						default: next = loginMenu();
					}
				} while (next == 1);
			}
		}
		System.out.println("\nSystem shutting down...\nThank you! Goodbye!");
	}
	
	//alvin punya--------------------------------
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
	//-----------------------------------------

	private static int deleteStaffDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	public static int addStaffDetails() {
		String newEmployeeID;
		String newEmployeeName;
		String newPosition;
		double newSalary = 0;
		String newLoginID;
		String newPassword;
		
		int next = 0;
		boolean valid;
		Scanner getNewString = new Scanner(System.in);
		Scanner getNewDouble = new Scanner(System.in);
		
		System.out.println("\nAdd New Staff");
		System.out.println("=============");
		
		do {
			valid = false;
			System.out.print("Enter new Employee ID: ");
			newEmployeeID = getNewString.nextLine();
			valid = validateEmployeeIDFormat(newEmployeeID);
			boolean exist = validateExistingEmployeeID(newEmployeeID);
			if (valid == false) {
				System.out.println("Employee ID must consists of 3 uppercase alphabet 'EMP' and 4 digit number.\n");
			}
			else if (exist == true) {
				valid = false;
				System.out.println("This ID has been used.\n");
			}
			else {
				System.out.println("Input Accepted\n");
			}
		} while (valid == false);
		
		do {
			valid = false;
			System.out.print("Enter new Staff name: ");
			newEmployeeName = getNewString.nextLine();
			valid = validateEmployeeName(newEmployeeName);
			if (valid == false) {
				System.out.println("Name entered is too long. Maximum length for name is 20 characters.\n");
			}
			else {
				System.out.println("Input Accepted\n");
			}
		} while (valid == false);
		
		newPosition = "Staff";
		
		boolean done = false;
		do {
			try {
				System.out.print("Enter new staff's salary amount: ");
				newSalary = getNewDouble.nextDouble();
				if (newSalary >= 1000) {
					done = true;
					System.out.println("Input Accepted\n");
				}
				else {
					System.out.println("Salary amount must more than 1000\n");
				}
			} catch (Exception ex) {
				System.out.printf("Only numbers are allowed\n");
				getNewDouble.nextLine();
				System.out.println();
			}
		} while (!done);
		
		do {
			valid = false;
			System.out.print("Enter new staff log in ID: ");
			newLoginID = getNewString.nextLine();
			valid = validateStaffLoginID(newLoginID);
			boolean exist = validateExistingStaffLoginID(newLoginID);
			if (valid == false) {
				System.out.println("Staff log in ID must consists of 2 uppercase alphabet 'ST' and 4 digit numbers\n");
			}
			else if (exist == true) {
				valid = false;
				System.out.println("This ID has been used.\n");
			}
			else {
				System.out.println("Input Accepted\n");
			}
		} while (valid == false);
		
		do {
			System.out.print("Enter new staff password: ");
			newPassword = getNewString.nextLine();
			valid = validatePasswordFormat(newPassword);
			if (valid == true) {
				staffArray.add(new Staff(newEmployeeID, newEmployeeName, newPosition, newSalary, newLoginID, newPassword));
				System.out.println("Input Accepted\n");
				System.out.println("New Staff details successfully added.\n");
			}
			else {
				System.out.println("Password must consists of any 6 alphabets.");
			}
		} while (valid == false);
		
		do {
			do {
				try {
					System.out.print("Continue? (1 for yes / 2 for no): ");
					next = getNewString.nextInt();
					done = true;
				} catch (Exception ex) {
					System.out.printf("Only number are allowed.\n");
					getNewString.nextLine();
					System.out.println();
				}
				if (next < 1 || next > 2) {
					System.out.println("Enter 1 or 2 only.");
				}
			} while (next < 1 || next > 2);
		} while (!done);
		
		return next;
	}
	
	public static int modifyStaffDetails() {
		String newEmployeeID, newEmployeeName, newEmployeePosition;;
		double newSalary = 0;
		String newLoginID, newLoginPassword;
		boolean valid, found = false;
		int next = 0;
		int choice;
		Scanner getString = new Scanner(System.in);
		Scanner getDouble = new Scanner(System.in);
		
		System.out.println("Modify Staff Details");
		System.out.println("====================");
		System.out.print("Enter Employee ID for staff: ");
		String ID = getString.nextLine();
		
		for (int i = 0; i < staffArray.size(); i++) {
			if (ID.equals(staffArray.get(i).getEmployeeID())) {
				found = true;
				System.out.println("============================================================================");
				System.out.printf("| %-8s| %-20s| %-9s| %-6s  | %-8s | %-8s |\n", "ID", "Name", "Position", "Salary", "Login ID", "Password");
				System.out.println("============================================================================");
				System.out.printf("| %-8s| %-20s| %-9s| %-7.2f | %-8s | %-8s |\n", staffArray.get(i).getEmployeeID(), staffArray.get(i).getEmployeeName(), staffArray.get(i).getEmployeePosition(), staffArray.get(i).getSalary(), staffArray.get(i).getStaffLoginID(), staffArray.get(i).getStaffPassword());
				System.out.println("============================================================================");
			
				switch (choice = modifyStaffDetailsMenu()) {
				case 1: 
					do {
						System.out.println("Enter new Employee ID for Staff: ");
						newEmployeeID = getString.nextLine();
						valid = validateEmployeeIDFormat(newEmployeeID);
						boolean exist = validateExistingEmployeeID(newEmployeeID);
						if (valid == true) {
							staffArray.get(i).setEmployeeID(newEmployeeID);
						}
						else {
							System.out.println("Employee ID must consists of 3 uppercase alphabet 'EMP' and 4 digit number.\n");
						}
					} while (valid == false);
					break;
					
				case 2:
					do {
						System.out.print("Enter new Staff name: ");
						newEmployeeName = getString.nextLine();
						valid = validateEmployeeName(newEmployeeName);
						if (valid == true) {
							staffArray.get(i).setEmployeeName(newEmployeeName);;
						}
						else {
							System.out.println("Name entered is too long. Maximum length for name is 20 characters.\n");
						}
					} while (valid == false);
					break;
					
				case 3:
					System.out.print("Enter new staff position: ");
					newEmployeePosition = getString.nextLine();
					staffArray.get(i).setEmployeePosition(newEmployeePosition);
					break;
					
				case 4:
					boolean done = false;
					do {
						try {
							System.out.print("Enter new staff salary: ");
							newSalary = getDouble.nextDouble();
							done = true;
						} catch (Exception ex) {
							System.out.println("Only number are allowed\n");
							getDouble.nextLine();
							System.out.println();
						}
					} while (!done);
					staffArray.get(i).setSalary(newSalary);
					break;
					
				case 5:
					do {
						System.out.print("Enter new staff Login ID: ");
						newLoginID = getString.nextLine();
						valid = validateStaffLoginID(newLoginID);
						boolean exist = validateExistingStaffLoginID(newLoginID);
						if (valid == true) {
							if (exist) {
								valid = false;
								System.out.println("This ID has been used.\n");
							}
							else {
								staffArray.get(i).setStaffLoginID(newLoginID);
							}
						}
						else {
							System.out.println("Staff log in ID must consists of 2 uppercase alphabet 'ST' and 4 digit numbers\n");
						}
					} while (valid == false);
					break;
					
				case 6:
					do {
						System.out.print("Enter new staff password: ");
						newLoginPassword = getString.nextLine();
						valid = validatePasswordFormat(newLoginPassword);
						if (valid == true) {
							staffArray.get(i).setStaffPassword(newLoginPassword);
						}
						else {
							System.out.println("Password must consists of any 6 alphabets.");
						}
					} while (valid == false);
				}
				System.out.println("Staff Details Modification Success\n");
			}
		}
		if (found == false) {
			System.out.println("No record");
			modifyStaffDetails();
		}
		
		boolean done = false;
		do {
			do {
				try {
					System.out.println("Continue? (1 for yes / 2 for no): ");
					next = getString.nextInt();
					done = true;
				} catch (Exception ex) {
					System.out.println("Only number are allowed\n");
					getString.nextLine();
					System.out.println();
				}
			} while (next < 1 || next > 2);
		} while (!done);
		return next;
	}
	
	public static int modifyStaffDetailsMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Choose which info you want to modify: ");
		System.out.println(" 1. Staff ID");
		System.out.println(" 2. Staff Name");
		System.out.println(" 3. Staff Position");
		System.out.println(" 4. Staff Salary");
		System.out.println(" 5. Staff Login ID");
		System.out.println(" 6. Staff Login Password");
		boolean done = false;
		
		do {
			do {
				try {
					System.out.println("Enter your choice: ");
					choice = scanner.nextInt();
					done = true;
				} catch (Exception ex) {
					System.out.println("Only numbers are allowed\n");
					scanner.nextLine();
					System.out.println();
				}
				if (choice < 1 || choice > 6) {
					System.out.println("Please enter 1 to 6 only\n");
				}
			} while (choice < 1 || choice > 6);
		} while (!done);
		return choice;
	}
	
	public static boolean validateEmployeeIDFormat(String id) {
		String idFormat = "^[E,M,P]{3}[\\d]{4}";
		if(id.length() > 0 && id.length() < 8) {
			if (Character.isUpperCase(id.charAt(0)) == true && id.matches(idFormat) == true) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean validateExistingEmployeeID(String id) {
		boolean exist = false;
		for (int i = 0; i < staffArray.size(); i++) {
			if (id.equals(staffArray.get(i).getEmployeeID())) {
				exist = true;
			}
		}
		for (int i = 0; i < managerArray.size(); i++) {
			if (id.equals(managerArray.get(i).getEmployeeID())) {
				exist = true;
			}
		}
		return exist;
	}
	
	public static boolean validateEmployeeName(String name) {
		if (name.length() > 0 && name.length() <= 20) {
			return true;
		}
		return false;
	}
	
	public static boolean validateStaffLoginID(String id) {
		String IdFormat = "[S,T]{2}[\\d]{4}";
		if (id.length() > 0 && id.length() < 7) {
			if (Character.isUpperCase(id.charAt(0)) == true && id.matches(IdFormat) == true) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean validateExistingStaffLoginID(String id) {
		boolean exist = false;
		for (int i = 0; i < staffArray.size(); i++) {
			if (id.equals(staffArray.get(i).getStaffLoginID())) {
				exist = true;
			}
		}
		return exist;
	}
	
	public static boolean validatePasswordFormat(String password) {
		boolean valid = false;
		String passwordFormat = "[a-zA-Z]{6}";
		if (password.matches(passwordFormat)) {
			return valid = true;
		}
		return valid;
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
		logo();
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(choice <= 0 || choice > 3){
			try{
				System.out.println("");
				System.out.println("========================");
				System.out.println("| Choose Your Position |");
				System.out.println("========================");
				System.out.println("|     1. Staff         |");
				System.out.println("|     2. Manager       |");
				System.out.println("|     3. Exit          |");
				System.out.println("========================\n\n");
				System.out.print("Enter your position: ");
				choice = scanner.nextInt();
			}
			catch (Exception ex){
				System.out.println("Only numbers are allowed.");
				scanner.nextLine();
				System.out.println();
			}
			if(choice < 1 || choice > 3){
				System.out.println("Enter 1 to 3 only.");
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
								System.out.println("Access Denied\n");
							}
						}
						else {
							System.out.println("Invalid ID\n");
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
								System.out.println("Access Denied\n");
							}
						}
						else {
							System.out.println("Invalid ID\n");
						}
					}while(isManager == false);
				
			break;
			
			default: 
				System.out.println("\nSystem shutting down...\nThank you! Goodbye!");
				System.exit(0);
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
		System.out.println("| 5. Log Out                  |");
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
    	System.out.println("|            MANAGER MENU            |");
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
    	System.out.println("| 9. Log Out                         |");
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
		System.out.println("=================================================================");
		System.out.printf("| No. | %-10s| %-20s| %-12s| %s  |\n", "ID", "Name", "Position", "Salary");
		System.out.println("=================================================================");
		
		for (int count = 1; count < (managerArray.size() + staffArray.size()); count++) {
			for(int i = 0; i < managerArray.size(); i++) {
				System.out.printf("| %2d. | ", count++);
				System.out.println(managerArray.get(i).toString());
			}
			for(int i = 0; i < staffArray.size(); i++) {
				System.out.printf("| %2d. | ", count++);
				System.out.println(staffArray.get(i).toString());
			}
		}
		
		System.out.println("=================================================================\n");
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
