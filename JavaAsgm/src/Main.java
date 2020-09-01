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
	public static ArrayList<Menu> menuList = new ArrayList<Menu>();
	public static ArrayList<Transaction> transaction = new ArrayList<Transaction>();
	public static ArrayList<TransRecord> transRecord = new ArrayList<TransRecord>();
	public static ArrayList<Reciept> reciept = new ArrayList<Reciept>();
	public static ArrayList<DailySales> dailySales = new ArrayList<DailySales>();
	public static ArrayList<TopReport> topReport = new ArrayList<TopReport>();
	
	//object
	public static Menu menu = new Menu();
	
	public static void main (String[] args) {
		/*data stored in arraylist---------------------------------------------------------------------------*/
		//arraylist for manager information
		managerArray.add(new Manager("EMP0001", "Albert Einstein" , "Manager", 8000.00, "MA0001", "qwerty"));
		managerArray.add(new Manager("EMP0002", "Barry Allen"     , "Manager", 8000.00, "MA0002", "qwerty"));
		managerArray.add(new Manager("EMP0003", "Christine Palmer", "Manager", 8000.00, "MA0003", "qwerty"));
		managerArray.add(new Manager("EMP0004", "David Beckham"   , "Manager", 8000.00, "MA0004", "qwerty"));
		managerArray.add(new Manager("EMP0005", "Ethan Hunt"      , "Manager", 8000.00, "MA0005", "qwerty"));
		//array for Staff information
		staffArray.add(new Staff("EMP0006", "Gwen Stacy"       , "Staff", 6000.00, "ST0001", "qwerty"));
		staffArray.add(new Staff("EMP0007", "Harry Potter"     , "Staff", 6000.00, "ST0002", "qwerty"));
		staffArray.add(new Staff("EMP0008", "Ivan Stark"       , "Staff", 6000.00, "ST0003", "qwerty"));
		staffArray.add(new Staff("EMP0009", "James Brooke"     , "Staff", 6000.00, "ST0004", "qwerty"));
		staffArray.add(new Staff("EMP0010", "Kaecilius"        , "Staff", 6000.00, "ST0005", "abcdef"));
		staffArray.add(new Staff("EMP0011", "Lincoln Campbell" , "Staff", 6000.00, "ST0006", "qwerty"));
		staffArray.add(new Staff("EMP0012", "Marcus Aurelius"  , "Staff", 6000.00, "ST0007", "qwerty"));
		staffArray.add(new Staff("EMP0013", "Natasha Romanoff" , "Staff", 6000.00, "ST0008", "qwerty"));
		staffArray.add(new Staff("EMP0014", "Oscar Robertson"  , "Staff", 6000.00, "ST0009", "qwerty"));
		staffArray.add(new Staff("EMP0015", "Peter Parker"     , "Staff", 6000.00, "ST0010", "qwerty"));
		staffArray.add(new Staff("EMP0016", "Quentin Tarantino", "Staff", 6000.00, "ST0011", "qwerty"));
		staffArray.add(new Staff("EMP0017", "Richardo Milo"    , "Staff", 6000.00, "ST0012", "qwerty"));
		staffArray.add(new Staff("EMP0018", "Shinichi Kudo"    , "Staff", 6000.00, "ST0013", "qwerty"));
		staffArray.add(new Staff("EMP0019", "Tobias Menzies"   , "Staff", 6000.00, "ST0014", "qwerty"));
		staffArray.add(new Staff("EMP0020", "Ulberto Tozzi"    , "Staff", 6000.00, "ST0015", "qwerty"));
		staffArray.add(new Staff("EMP0021", "Vin Diesel"       , "Staff", 6000.00, "ST0016", "qwerty"));
		staffArray.add(new Staff("EMP0022", "Wendy Marvell"    , "Staff", 6000.00, "ST0017", "qwerty"));
		staffArray.add(new Staff("EMP0023", "X Æ2 A-12"        , "Staff", 6000.00, "ST0018", "qwerty"));
		staffArray.add(new Staff("EMP0024", "Yvonne McGuinness", "Staff", 6000.00, "ST0019", "qwerty"));
		staffArray.add(new Staff("EMP0025", "Zoey Deutch"      , "Staff", 6000.00, "ST0020", "qwerty"));
		
		//array list for food menu
		//Main dish
		menuList.add( new Menu("1001"	, "Chicken Chop"		, 10.00, "Main dish") );
		menuList.add( new Menu("1002"	, "Fish & Chip"			, 15.00, "Main dish") );
		menuList.add( new Menu("1003"	, "Prawn Platter"		, 23.00, "Main dish") );
		menuList.add( new Menu("1004"	, "Beef Steak"			, 17.00, "Main dish") );
		//Soup
		menuList.add( new Menu("1005"	, "Vegan Soup"			, 6.00, "Soup") );
		menuList.add( new Menu("1006"	, "Mushroom Soup"		, 8.00, "Soup") );
		//Snack
		menuList.add( new Menu("1007"	, "French Fries"		, 5.00, "Snack") );
		menuList.add( new Menu("1008"	, "Cheese Wedges"		, 5.00, "Snack") );
		menuList.add( new Menu("1009"	, "Chicken PopCorn"		, 5.00, "Snack") );
		menuList.add( new Menu("1010"	, "Chicken Nugget"		, 5.00, "Snack") );
		//Beverage
		menuList.add( new Menu("1011"	, "Lemon Iced Tea"		, 7.00, "Beverage") );
		menuList.add( new Menu("1012"	, "Green Tea"			, 7.00, "Beverage") );
		menuList.add( new Menu("1013"	, "Latte"				, 8.00, "Beverage") );
		menuList.add( new Menu("1014"	, "Cappocino"			, 8.00, "Beverage") );
		
		//add transaction data
		transaction.add(new Transaction ("tId1001",20.00,15.00,5.00,"2/8/2020"));
		transaction.add(new Transaction ("tId1002",30.00,25.00,5.00,"3/8/2020"));
		transaction.add(new Transaction ("tId1003",100.00,56.50,43.50,"4/8/2020"));
		

		//add TransactionRecord Data
		transRecord.add(new TransRecord ("tId1001","Chicken Chop",15.00 , 1, 15.00,"2/08/2020"));
		transRecord.add(new TransRecord ("tId1002","Chicken Chop",15.00 , 1, 15.00,"3/08/2020"));
		transRecord.add(new TransRecord ("tId1002","Choclate Milk",5.00 , 1, 5.00,"3/08/2020"));
		transRecord.add(new TransRecord ("tId1003","Beef Steak",25.00 , 3, 75.00,"4/08/2020"));
		transRecord.add(new TransRecord ("tId1003","Chicken Chop",15.00 , 1, 15.00,"4/08/2020"));
		transRecord.add(new TransRecord ("tId1003","Choclate Milk",5.00 , 2, 10.00,"4/08/2020"));
	        
		
		/*data stored in arraylist---------------------------------------------------------------------------*/
		
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("dddd-MMMM-yyyy hh:mm:ss");
		Date date = new Date();
		
		mainSelection();
	}
	
	public static void mainSelection() {
		int choice = 0;
		int next = 0;
		boolean loginCondition = false;
		choice = loginMenu();
		loginCondition = loginMethod(choice);
		
		if(choice == 1){
			if(loginCondition == true){
				do{
					int staffChoice;
					switch(staffChoice = staffMenu()){
						case 1: next = createNewOrder(); break; //create new order
						case 2: next = transHistory(); break; 
						default: mainSelection();
					}
				}while(next == 1 || next == 2);
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
						case 5: next = addNewFoodDetails(); break; //alvin
						case 6: next = modifyFoodDetails(); break;
						case 7: next = deleteFoodDetails(); break;
						case 8: next = viewFoodDetails(); break;
						case 9: next = TopSales(); break;
						case 10: next = DailySales(); break;
						case 11: next = transHistory();break;
						default: mainSelection();
					}
				} while (next == 1 || next == 2);
			}
		}
		else if (choice == 3) {
			System.exit(0);
		}
		System.out.println("\nSystem shutting down...\nThank you! Goodbye!");
	}
	
	//call other packages.................................
	private static int DailySales() {
		Date timenow = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateNow = dateFormat.format(timenow);
		System.out.printf("Today Sales (%s)\n",dateNow);
		System.out.print("=======================================================\n");
		System.out.print("|No | Food Name                    |Amount Sold| Total|\n");
		System.out.print("=======================================================\n");
		//move transRecord data to dails sale where same date
		for(int i=0;i<transRecord.size();i++) {
			if(transRecord.get(i).getDate().equals(dateNow)==true) {
				dailySales.add(new DailySales (transRecord.get(i).getFoodName(),transRecord.get(i).getAmount(),transRecord.get(i).getPerPrice(),transRecord.get(i).getTotalPerItem()));
			}
		}
		//eleminate repeated data
		for(int i=0;i<dailySales.size();i++) {
			for(int k=i+1;k<dailySales.size();k++) {
				if(dailySales.get(i).getFoodItem().equals(dailySales.get(k).getFoodItem()) == true) {
					dailySales.get(i).setAmount(dailySales.get(i).getAmount()+dailySales.get(k).getAmount());
					dailySales.get(i).setPrice(dailySales.get(i).getPrice()+dailySales.get(k).getPrice());
					dailySales.remove(k);
				}
			}
		}
		//print
		double rptGT=0;
		for(int i=0;i<dailySales.size();i++) {
			rptGT += dailySales.get(i).getPrice();
			System.out.printf("|%-3d|%-30s|%-12d|%-4.2f|\n",i+1,dailySales.get(i).getFoodItem(),dailySales.get(i).getAmount(),dailySales.get(i).getPrice());
			//System.out.printf("%s %d %.2f\n",dailySales.get(i).getFoodItem(),dailySales.get(i).getAmount(),dailySales.get(i).getPrice());
		}
		System.out.print("--------------------------------------------------------\n");
		System.out.printf("Grand Total :                                  |%.2f |\n",rptGT);
		System.out.print("========================================================\n\n\n");
		
		/*for(int i=0;i<transRecord.size();i++) {
			if(transRecord.get(i).getDate().equals(dateNow)==true) {
				for(int p=i+1;p<transRecord.size();p++) {
				  if(transRecord.get(p).getDate().equals(dateNow)==true) {
					if(transRecord.get(i).getFoodName().equals(transRecord.get(p).getFoodName()) == true) {
						dailySales.add(new DailySales (transRecord.get(i).getFoodName(),transRecord.get(i).getAmount()+transRecord.get(p).getAmount(),transRecord.get(i).getPerPrice(),transRecord.get(i).getTotalPerItem()+transRecord.get(p).getTotalPerItem()));
					}
					else {
						dailySales.add(new DailySales (transRecord.get(i).getFoodName(),transRecord.get(i).getAmount(),transRecord.get(i).getPerPrice(),transRecord.get(i).getTotalPerItem()));
					}
				  }
				}
				
			}
		}System.out.print(dailySales.get(0).getFoodItem());*/
		/*double rptGT=0;
		for(int i = 0; i < dailySales.size();i++) {
			rptGT += dailySales.get(i).getPrice();
			System.out.printf("|%-3d|%-10s|%-5d|%-4f|",i,dailySales.get(i).getFoodItem(),dailySales.get(i).getAmount(),dailySales.get(i).getPrice());
		}
		System.out.print("--------------------------------------------------------\n");
		System.out.printf("Grand Total :                                   |%.2f |\n",rptGT);
		System.out.print("========================================================\n");*/


		int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
	}
	
	private static int TopSales() {
		for(int i=0;i<transRecord.size();i++) {
			topReport.add(new TopReport (transRecord.get(i).getTransId(),transRecord.get(i).getFoodName(),transRecord.get(i).getPerPrice(),transRecord.get(i).getAmount(),transRecord.get(i).getTotalPerItem(),transRecord.get(i).getDate()));
		}
		
		for(int i=0;i<topReport.size();i++) {
			for(int k=i+1;k<topReport.size();k++) {
				if(topReport.get(i).getFoodName().equals(topReport.get(k).getFoodName()) == true) {
					topReport.get(i).setAmount(topReport.get(i).getAmount()+topReport.get(k).getAmount());
					topReport.get(i).setTotalPerItem(topReport.get(i).getTotalPerItem()+topReport.get(k).getTotalPerItem());
					topReport.remove(k);
				}
			}
		}
		/*for(int i=0;i<topReport.size();i++) {
			System.out.printf("%s   %s    %.2f     %d   %.2f   %s\n",topReport.get(i).getTransId(),topReport.get(i).getFoodName(),topReport.get(i).getPerPrice(),topReport.get(i).getAmount(),topReport.get(i).getTotalPerItem(),topReport.get(i).getDate() );
		}*/
		
		String foodTop1="";
		String foodTop2="";
		String foodTop3="";
		int top1=0;
		int top2=0;
		int top3=0;
		double pp1=0;
		double pp2=0;
		double pp3=0;
		
		
		for(int i=0;i<topReport.size();i++) {
			if(i == 0) {
				foodTop1 = topReport.get(i).getFoodName();
				top1 = topReport.get(i).getAmount();
			}
			else if(i == 1 && topReport.get(i).getAmount() > top1) {
				top1 = top2;
				foodTop1 = foodTop2;
				top1 = topReport.get(i).getAmount();
				foodTop1 = topReport.get(i).getFoodName();
			}
			else if(i == 1 && topReport.get(i).getAmount() == top1) {
				top2 = topReport.get(i).getAmount();
				foodTop2 = topReport.get(i).getFoodName();
			}
			else if(i == 2 && topReport.get(i).getAmount() >= top1) {
				top3 = top2;
				top2 = top1;
				foodTop3 = foodTop2;	
				foodTop2 = foodTop1;
				
				top1 = topReport.get(i).getAmount();
				foodTop1 = topReport.get(i).getFoodName();
	
			}

			else if(i==2 && topReport.get(i).getAmount() > top2 && topReport.get(i).getAmount() < top1||i==2 && topReport.get(i).getAmount() == top2) {
				top3 = top2;
				foodTop3 = foodTop2;
				top2=topReport.get(i).getAmount();
				foodTop2 = topReport.get(i).getFoodName();
			}
			else if(i==2 && topReport.get(i).getAmount() < top2 && topReport.get(i).getAmount() > top3 || topReport.get(i).getAmount() == top3) {
				top3 = topReport.get(i).getAmount();
				foodTop3 = topReport.get(i).getFoodName();
			
			}
			//no i
			else if(topReport.get(i).getAmount() > top1 ||  topReport.get(i).getAmount() == top1) {
				top3 = top2;
				top2 = top1;
				foodTop3 = foodTop2;
				foodTop2 = foodTop1;
				
				top1 =  topReport.get(i).getAmount();
				foodTop1 =  topReport.get(i).getFoodName();
				
			}
			else if(topReport.get(i).getAmount() > 2 &&  topReport.get(i).getAmount() < top1 ||  topReport.get(i).getAmount() == top2) {
				top3 = top2;
				foodTop3 = foodTop2;
				top2 =  topReport.get(i).getAmount();
				foodTop2 =  topReport.get(i).getFoodName();
				
			}
			
			else if (topReport.get(i).getAmount() < top2 &&  topReport.get(i).getAmount() > top3 ||  topReport.get(i).getAmount() == top3) {
				top3 =  topReport.get(i).getAmount();
				foodTop3 =  topReport.get(i).getFoodName();
			}
			
			
		}
		
		for(int i=0;i<topReport.size();i++) {
			if(topReport.get(i).getFoodName().equals(foodTop1)== true) {
				pp1 = topReport.get(i).getPerPrice();
			}
			else if (topReport.get(i).getFoodName().equals(foodTop2)== true) {
				pp2 = topReport.get(i).getPerPrice();
			}
			else if  (topReport.get(i).getFoodName().equals(foodTop3)== true) {
				pp3 = topReport.get(i).getPerPrice();
			}
		}
		
		System.out.println("=========================================================");
		System.out.println("| TOP SALE / POPULAR ITEM                               |");
		System.out.println("=========================================================");
		System.out.println("|NO | Food Name                 |PerPrice|Amount| Total |");
		System.out.println("---------------------------------------------------------");
		System.out.printf("| 1 | %-26s|%7.2f|%7d|%7.2f|\n",foodTop1,pp1,top1,pp1*top1);
		System.out.printf("| 2 | %-26s|%7.2f|%7d|%7.2f|\n",foodTop2,pp2,top2,pp2*top2);
		System.out.printf("| 3 | %-26s|%7.2f|%7d|%7.2f|\n",foodTop3,pp3,top3,pp3*top3);
		System.out.println("=========================================================\n\n\n");
		
		
		int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
	}

	
	public static int transHistory() {
		Scanner sth = new Scanner(System.in);
		System.out.print("Enter date to view transcation history : ");
		String inDate = sth.next();
		int q = 1;
		
		System.out.printf("====================================================================\n");
		System.out.printf("|No | Transaction ID | Name                     | Amount  | Total  |\n");
		System.out.printf("====================================================================\n");
		for(int i=0; i<transRecord.size();i++) {
			if(transRecord.get(i).getDate().equals(inDate)) {
				
				
				System.out.printf("| %d | %-15s|%-26s|%-9d|%-8.2f|\n",q,transRecord.get(i).getTransId(),transRecord.get(i).getFoodName(),transRecord.get(i).getAmount(),transRecord.get(i).getTotalPerItem());
				q=q+1;
			}
		}
		System.out.printf("======================================================================\n\n\n");


		int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
        
	}

	private static int viewFoodDetails() {
		
		System.out.println("Display Menu");
		System.out.println("==============>");
		System.out.printf( "   %-10s     %-30s     %-10s     %-10s\n", "MenuID", "Food Name", "Price", "Category");
		System.out.println("=================================================================================");
		
		for(int i = 0; i < menuList.size(); i++){
            System.out.printf( "|  %-10s  |  %-30s  |  %-10.2f  |  %-10s  |\n", menuList.get(i).getFoodID(), menuList.get(i).getFoodName(), menuList.get(i).getPrice(), menuList.get(i).getCategory() );
            System.out.println("=================================================================================");
    	}
		
		//loopback to main menu
		int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
        
	}

	public static int deleteFoodDetails() {
		
		//scanner
        Scanner scanForChoiceOfId = new Scanner(System.in);
        Scanner scanForConfirmationToDelete = new Scanner(System.in);
        
        //variable for deleteFoodDetails method
        String choiceOfID;
        boolean validationForFoodId = false;
        boolean deleteProcessDone = false;
        char confirmationToDelete;
        
        do{
            //viewFoodDetails();
            System.out.print("Enter Food ID to delete Menu Item : ");
            choiceOfID = scanForChoiceOfId.nextLine();
            System.out.println("\nThe Food ID you choose : " + choiceOfID);
            
            //loop through the arrayList
            for(int i = 0; i < menuList.size(); i++){
                //input = value in arrayList
                if( choiceOfID.equals(menuList.get(i).getFoodID()) ){
                    validationForFoodId = true;
                    //display the food item
                    System.out.printf("Food ID of %s founded !!! \n\n", choiceOfID);
                    System.out.printf( "   %-10s     %-30s     %-10s     %-10s\n", "MenuID", "Food Name", "Price", "Category");
                    System.out.println("=================================================================================");
                    System.out.printf( "|  %-10s  |  %-30s  |  %-10.2f  |  %-10s  |\n", menuList.get(i).getFoodID(), menuList.get(i).getFoodName(), menuList.get(i).getPrice(), menuList.get(i).getCategory() );
                    System.out.println("=================================================================================\n");
                    
                    //confirmation to delete food item
                    do{
                        System.out.print("Enter Y to delete or Enter N to cancel : ");
                        confirmationToDelete = scanForConfirmationToDelete.next().toUpperCase().charAt(0);
                        
                        //confirm delete
                        if(confirmationToDelete == 'Y'){
                            System.out.println("\nFood ID : " + menuList.get(i).getFoodID() );
                            System.out.println("Food Name : " +  menuList.get(i).getFoodName() );
                            System.out.println("The Food Item has been removed.");
                            menuList.remove(i);
                            deleteProcessDone = true;
                        //cancel delete process 
                        }else if(confirmationToDelete == 'N'){
                            System.out.println("\nThe delete process has been canceled.");
                            deleteProcessDone = true;
                        //invalid input of Y and N
                        }else{
                            System.out.println("Enter Y or N only !!! ");
                            deleteProcessDone = false;
                        }
                        
                    }while(deleteProcessDone == false);
                }
            }
            //input != value in arrayList
            if(validationForFoodId == false){
                System.out.println("No record found. Please try again!!! \n" );
            }
        }while(!validationForFoodId);
        
        //loopback to main menu
        int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
        
	}

	public static int modifyFoodDetailsMenu() {
		
		//scanner
		Scanner scannerForModifyFoodDetailsMenu = new Scanner(System.in);
		
		//variables for modifyFoodDetails
		int choiceOfFoodDetailsToModify = 0;
		boolean validationForCorrectInput = false;
		
		System.out.println("Choose a food detail to modify : ");
		System.out.println("1. Food ID");
		System.out.println("2. Food Name");
		System.out.println("3. Food Price");
		System.out.println("4. Food Category");
		
		do {
            do {
            	try {
                    System.out.print("Enter your choice : ");
                    choiceOfFoodDetailsToModify = scannerForModifyFoodDetailsMenu.nextInt();
                    validationForCorrectInput = true;
                }catch (Exception ex){
                    System.out.println("\n\t=>Only numbers are allowed\n");
                    scannerForModifyFoodDetailsMenu.nextLine();
                }
            	if (choiceOfFoodDetailsToModify < 1 || choiceOfFoodDetailsToModify > 4) {
                    System.out.println("\n\t=>Please enter 1 to 4 only\n");
            	}
            } while (choiceOfFoodDetailsToModify < 1 || choiceOfFoodDetailsToModify > 4);
			
		} while (!validationForCorrectInput);
        
		return choiceOfFoodDetailsToModify;
		
	}
	
	public static int modifyFoodDetails() {
		
		//scanner
		Scanner scannerForModifyFoodDetails = new Scanner(System.in);
		Scanner scannerForConfirmation = new Scanner(System.in);
        
		//variables for modifyFoodDetails
        boolean validationForRecordFounded = false;
        String modifyFoodId;
        String modifyFoodName;
        double modifyPrice;
        String modifyCategory;
        boolean validation = false;
        String choiceOfID = "";
        char confirmationToModify;
        boolean modifyProcessDone = false;
        
        System.out.println("Modify Food Details");
    	System.out.println("===================");
    	
    	//if no record founded, display error message and loop back
    	do {
			try {
				System.out.print("Enter Food ID to modify details : ");
				choiceOfID = scannerForModifyFoodDetails.nextLine();
				for (int i = 0; i < menuList.size(); i++) {
					if (choiceOfID.equals(menuList.get(i).getFoodID())) {
						validationForRecordFounded = true;
					}
				}
				if (validationForRecordFounded == false) {
					System.out.println("No record founded ! \n");
				}
			} catch (Exception ex) {
				scannerForModifyFoodDetails.nextLine();
				System.out.println();
			}
		} while (validationForRecordFounded == false);
    	
    	
    	for(int i = 0; i < menuList.size(); i++){
    		
            //if recorded founded, continue to modify
            if( choiceOfID.equals(menuList.get(i).getFoodID()) ){
                validationForRecordFounded = true;
                
                //display details of the record founded
                System.out.printf("\n\n Food ID of %s founded !!! \n\n", choiceOfID);
                System.out.printf( "   %-10s     %-30s     %-10s     %-10s\n", "MenuID", "Food Name", "Price", "Category");
                System.out.println("=================================================================================");
                System.out.printf( "|  %-10s  |  %-30s  |  %-10.2f  |  %-10s  |\n", menuList.get(i).getFoodID(), menuList.get(i).getFoodName(), menuList.get(i).getPrice(), menuList.get(i).getCategory() );
                System.out.println("=================================================================================\n");
	    	
                //let us choice which details to modify
                switch( modifyFoodDetailsMenu() ){
                    case 1:
                        
                        do{
                            validation = false;
                            System.out.print("\n1. Enter new Food ID   : ");
                            modifyFoodId = scannerForModifyFoodDetails.nextLine();
                            validation = validateNewFoodId(modifyFoodId);
            
                            if(validation == false){
                                System.out.println("Please enter valid Food ID ! \n");
                            }else{
                            	
                            	//confirmation to modify food id
		                        do {
		                        	System.out.print("\nEnter Y to modify or Enter N to cancel : ");
		                        	confirmationToModify = scannerForConfirmation.next().toUpperCase().charAt(0);
			                        
		                        	//confirm to modify
		                        	if(confirmationToModify == 'Y') {
		                        		menuList.get(i).setFoodID(modifyFoodId);
		                        		System.out.println("\n\t=>The Food Id has been modified.");
		                        		modifyProcessDone = true;
		                        	}else if (confirmationToModify == 'N') {
										System.out.println("\n\t=>The modify process has been canceled.");
										modifyProcessDone = true;
									}else {
										System.out.println("\n\t=>Enter Y or N only !!! ");
										modifyProcessDone = false;
									}
		                        	
								} while (modifyProcessDone == false);
                            	
                            }
                            
                        }while(validation == false);
                        
                        break;
                        
                    case 2:
                        
                        do{
                            validation = false;
                            System.out.print("\n2. Enter new Food Name   : ");
                            modifyFoodName = scannerForModifyFoodDetails.nextLine();
                            validation = validateNewFoodName(modifyFoodName);
            
                            if(validation == false){
                                System.out.println("Please enter valid Food Name ! \n");
                            }else{
                                //System.out.println("Food Name Modified !!!\n");
                            	
                            	//confirmation to modify food id
		                        do {
		                        	System.out.print("\nEnter Y to modify or Enter N to cancel : ");
		                        	confirmationToModify = scannerForConfirmation.next().toUpperCase().charAt(0);
			                        
		                        	//confirm to modify
		                        	if(confirmationToModify == 'Y') {
		                        		menuList.get(i).setFoodName(modifyFoodName);
		                        		System.out.println("\n\t=>The Food Name has been modified.");
		                        		modifyProcessDone = true;
		                        	}else if (confirmationToModify == 'N') {
										System.out.println("\n\t=>The modify process has been canceled.");
										modifyProcessDone = true;
									}else {
										System.out.println("\n\t=>Enter Y or N only !!! ");
										modifyProcessDone = false;
									}
		                        	
								} while (modifyProcessDone == false);
                            	
                            }
                        }while(validation == false);
                        
                        break;
                        
                    case 3:
                        
                        do{
                            System.out.print("\n3. Enter Price     : ");
            
                            while(!scannerForModifyFoodDetails.hasNextDouble() ) {
                                System.out.println("Please enter number only! ");
                                System.out.print("\n3. Enter Price     : ");
                                scannerForModifyFoodDetails.next(); // this is important!
                            }
            
                            modifyPrice = scannerForModifyFoodDetails.nextDouble();
            
                            if(modifyPrice > 0) {
                                //System.out.println("Food Price Modified. \n");
                            	
                            	//confirmation to modify food id
		                        do {
		                        	System.out.print("\nEnter Y to modify or Enter N to cancel : ");
		                        	confirmationToModify = scannerForConfirmation.next().toUpperCase().charAt(0);
			                        
		                        	//confirm to modify
		                        	if(confirmationToModify == 'Y') {
		                        		menuList.get(i).setPrice(modifyPrice);
		                        		System.out.println("\n\t=>The Food Price has been modified.");
		                        		modifyProcessDone = true;
		                        	}else if (confirmationToModify == 'N') {
										System.out.println("\n\t=>The modify process has been canceled.");
										modifyProcessDone = true;
									}else {
										System.out.println("\n\t=>Enter Y or N only !!! ");
										modifyProcessDone = false;
									}
		                        	
								} while (modifyProcessDone == false);
                            	
                            }else {
                                System.out.println("Please enter positive value! \n");
                            }
            
                        }while(modifyPrice <= 0);
                        
                        break;
                        
                    case 4:
                        
                        modifyCategory = chooseForCategory();
                        
                        //confirmation to modify food id
                        do {
                        	System.out.print("\nEnter Y to modify or Enter N to cancel : ");
                        	confirmationToModify = scannerForConfirmation.next().toUpperCase().charAt(0);
	                        
                        	//confirm to modify
                        	if(confirmationToModify == 'Y') {
                        		menuList.get(i).setCategory(modifyCategory);
                        		System.out.println("\n\t=>The Category has been modified.");
                        		modifyProcessDone = true;
                        	}else if (confirmationToModify == 'N') {
								System.out.println("\n\t=>The modify process has been canceled.");
								modifyProcessDone = true;
							}else {
								System.out.println("\n\t=>Enter Y or N only !!! ");
								modifyProcessDone = false;
							}
                        	
						} while (modifyProcessDone == false);
                        
                }
                
            }
            
        }
    	
        
        //loopback to main menu
        int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
        
              
	}

	//do validation for new food id
	public static boolean validateNewFoodId(String newFoodID) {
		
		try {
			Integer.parseInt(newFoodID);
			return true;
		}catch(Exception ex) {
			return false;
		}
		
	}
	
	//do validation for new food name
	public static boolean validateNewFoodName(String newFoodName) {
		
		if(newFoodName.length() > 0 && newFoodName.length() < 30) {
            return true;
		}else {
            return false;
		}
		
	}
	
	
	public static int chooseForCategoryMenu() {
		
		//scanner
        Scanner scannerForChoiceOfFoodCategory = new Scanner(System.in);
        
        //variables for chooseForCategoryMenu
        int choiceOfFoodCategory =0;
        boolean validationForChoiceOfFoodCategory = false;
        
        System.out.println("\nChoose a food category : ");
    	System.out.println("1. Main Dish");
    	System.out.println("2. Soup");
    	System.out.println("3. Snack");
    	System.out.println("4. Beverage");
    	System.out.println("5. Dessert");
    	
    	do{
            do{
                try{
                    System.out.print("Choose a food category : ");
                    choiceOfFoodCategory = scannerForChoiceOfFoodCategory.nextInt();
                    validationForChoiceOfFoodCategory = true;
                }catch(Exception ex){
                	System.out.println("\n\t=>Only numbers are allowed !\n");
                    scannerForChoiceOfFoodCategory.nextLine();
                }
                if( choiceOfFoodCategory < 1 || choiceOfFoodCategory > 5 ){
                	System.out.println("\n\t=>Only numbers between 1 to 5 are allowed !\n");
                }
            }while( choiceOfFoodCategory < 1 || choiceOfFoodCategory > 5 );
            
        }while(!validationForChoiceOfFoodCategory);
        
        return choiceOfFoodCategory;
        
	}
	
	//category choosing method
	public static String chooseForCategory() {
		
		//variable for chooseForCategory method
        String newCategory;
        
        switch(chooseForCategoryMenu()){
	        case 1:
	            newCategory = "Main Dish";
	            return newCategory;
	            
	        case 2:
	            newCategory = "Soup";
	            return newCategory;
	            
	        case 3:
	            newCategory = "Snack";
	            return newCategory;
	            
	        case 4:
	            newCategory = "Beverage";
	            return newCategory;
	            
	        case 5:
	            newCategory = "Dessert";
	            return newCategory;
	            
	        default :
	            return null;
        }
	}
	
	private static int addNewFoodDetails() {
		
		//scanner
        //Scanner scannerForAddMenuMethod = new Scanner(System.in);
        Scanner getNewFoodID = new Scanner(System.in);
        Scanner getNewFoodName = new Scanner(System.in);
        Scanner getNewFoodPrice = new Scanner(System.in);
        
        //variable for addNewFoodDetails method
        String newFoodID;
        String newFoodName;
        double newPrice = 0;
        String newCategory;
        boolean validation;
        boolean existence;
        
        //ask user to input food detail to form new menu item
        System.out.println("Please enter the following detail to add new food item ==> ");
        
        //food id
        do{
            validation = false;
            existence = false;
            System.out.print("1. Enter Food ID   : ");
            newFoodID = getNewFoodID.nextLine();
            validation = validateNewFoodId(newFoodID);
            existence = validationForExistingFoodId(newFoodID);
            
            if(validation == true && existence == false){
                System.out.println("\n\t=>Food ID Accepted !!!\n");
            }
            else{
                System.out.println("\n\t=>Please enter valid Food ID ! \n");
            }
        }while(validation == false || existence == true);
        
        //food name
        do{
            validation = false;
            System.out.print("2. Enter Food Name   : ");
            newFoodName = getNewFoodName.nextLine();
            validation = validateNewFoodName(newFoodName);
            
            if(validation == false){
                System.out.println("\n\t=>Please enter valid Food Name ! \n");
            }else{
                System.out.println("\n\t=>Food Name Accepted !!!\n");
            }
        }while(validation == false);
        
        //food price
        do{
            System.out.print("3. Enter Price     : ");
            
            while(!getNewFoodPrice.hasNextDouble() ) {
				System.out.println("\n\t=>Please enter number only. ");
				System.out.print("\n3. Enter Price     : ");
				getNewFoodPrice.next(); // this is important!
            }
            
            newPrice = getNewFoodPrice.nextDouble();
            
            if(newPrice > 0) {
                System.out.println("\n\t=>Input Accepted. \n");
            }else {
            	System.out.println("\n\t=>Please enter positive value. \n");
            }
            
        }while(newPrice <= 0);
        
        //food category
        newCategory = chooseForCategory();
        
        menuList.add(new Menu(newFoodID, newFoodName, newPrice, newCategory));
        
        System.out.println("\nNew food item added into the menu ==>");
        System.out.println("=====================================");
        System.out.println("Menu ID   : " + newFoodID);
        System.out.println("Menu Name : " + newFoodName);
        System.out.println("Price     : RM " + newPrice);
        System.out.println("Category  : " + newCategory);
        System.out.printf("\n\n");
		
        //viewFoodDetails();
        Scanner getNext = new Scanner(System.in);
        boolean doneModify = false;
		int next = 0;
		do {
			do {
				try {
					System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
					next = getNext.nextInt();
					doneModify = true;
					if (next == 2) {
						mainSelection();
					}
				} catch (Exception ex) {
					System.out.println("");
					getNext.nextLine();
					System.out.println();
				}
			} while (next < 1 || next > 2);
		} while (doneModify == false);
		return next;
        
	}

	//check for existing food id
	public static boolean validationForExistingFoodId(String newFoodID){
        
        boolean exist = false;
        
        for(int i = 0; i < menuList.size(); i++){
            if( newFoodID.equals( menuList.get(i).getFoodID() )){
                exist = true;
                System.out.println("\n\t=>This Food ID has been used !\n");
            }
        }
        
        return exist;
        
    }
	
	public static int createNewOrder() {
		Transaction trans = new Transaction();
		String transIdLast = transaction.get(transaction.size() - 1).getTransId();
		int transIdNew = (transaction.size() - 1) + 2;
		String subtransIdNow = transIdLast.substring(0,transIdLast.length()-1);
		String realTransIdNow = subtransIdNow + transIdNew;
		
		double finalTotal = 0;
		
		//System.out.print(realTransIdNow);
		
		Scanner tsc = new Scanner(System.in);
		String foodIdIn;
		System.out.print("Order ID :" + realTransIdNow + "\n");
		//System.out.print(food.get(1).getFoodName()+"\n");
		
		do {
		System.out.print("Enter foodID ordered (type x to finish order):");
		foodIdIn = tsc.next();
		
		for(int i=0; i < menuList.size() ;i++)
		{
			if(foodIdIn.equals(menuList.get(i).getFoodID()) == true) {
				//get input
				System.out.print("got this food id\n");
				
				int foodAmount;
				//validation for integer only
				
				do {
					System.out.print("Enter amount : ");
					while(!tsc.hasNextInt()) {
	                    System.out.println("Enter positive integer only!");
	                    System.out.print("Enter amount:");
	                    tsc.next();
	                }
					foodAmount = tsc.nextInt();
					if(foodAmount <= -1) {
						System.out.println("Enter positive integer!");
					}
				}while(foodAmount <= -1);
				
				String foodname = menuList.get(i).getFoodName();
				double perPrice = menuList.get(i).getPrice();
				Date timenow = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String dateNow = dateFormat.format(timenow);
				
				//Calculation
				double totalPerItem = perPrice*foodAmount;
				finalTotal += totalPerItem;
				
				//System.out.println("hello\n");
				
				//Add to database
				reciept.add(new Reciept (realTransIdNow,foodIdIn,foodname,perPrice,foodAmount,totalPerItem,dateNow));
				
				//to remove duplicate record
				/*for(int p=0; p < 1000; p++)
				{
					System.out.print("hello\n");
					if(foodIdIn.equals(reciept.get(p).getFoodId())) {
						int upFoodAmount = foodAmount+reciept.get(p).getAmount();
						reciept.get(p).setAmount(upFoodAmount);
						double upTotalPerItem = totalPerItem + reciept.get(p).getTotalPerItem();
						reciept.get(p).setTotalPerItem(upTotalPerItem);
						reciept.add(new Reciept (realTransIdNow,foodIdIn,foodname,perPrice,upFoodAmount,upTotalPerItem,dateNow));
						int upFoodAmount = foodAmount+reciept.get(p).getAmount();
						double upTotalPerItem = totalPerItem + reciept.get(p).getTotalPerItem();
						reciept.remove(p);
						reciept.add(new Reciept (realTransIdNow,foodIdIn,foodname,perPrice,upFoodAmount,upTotalPerItem,dateNow));
					}
					else {
						reciept.add(new Reciept (realTransIdNow,foodIdIn,foodname,perPrice,foodAmount,totalPerItem,dateNow));
					}
						
				}*/
				
				
				break;
			}
			
			else if(foodIdIn.equals("x")) {
				System.out.print("Are you sure noting else to add ? (y/n) : ");
				char choice = tsc.next().charAt(0);
				if(choice == 'n' || choice == 'N')
				{
					foodIdIn = "n";
				}
				else if (choice == 'y' || choice == 'Y') {
					break;
				}
			}
			
			else if(i ==  (menuList.size()-1) ) {
				System.out.print("Unknow food ID\n");
			}
			
		}
			}while(foodIdIn.equals("x") == false);
		
		//System.out.print(reciept.get(0).getFoodName()+"\n");
		
		//System.out.print("Any things else to modify? (y/n) : ");
		//char modi = tsc.next().charAt(0);
		char modi;
		do {
			System.out.print("Any things else to modify? (y/n) : ");
			modi = tsc.next().charAt(0);
			int endI =0;
			if (modi == 'y' || modi == 'Y') {
				//display current order
				System.out.print("Current order:\n");
				System.out.print("==========================================================\n");
				System.out.print("No | Food Name \t    | Order Amount  |PerPrice \t| Total |\n");
				System.out.print("==========================================================\n");
				for(int i=0; i<reciept.size();i++) {
					System.out.printf("%-2d | %-15s|%-15d|%-10.2f |%-7.2f|\n",i+1,reciept.get(i).getFoodName(),reciept.get(i).getAmount(), reciept.get(i).getPerPrice(), reciept.get(i).getTotalPerItem());
					endI = i+1;
				}
				System.out.print("----------------------------------------------------------\n");
				System.out.print("Grand Total : \t\t\t\t\t | "+ finalTotal +" | \n");
				System.out.print("===========================================================\n\n");
			
				//modify
				Scanner scMod = new Scanner(System.in);
				
				int modSelect = 0;
				
				//validate
				do {
					System.out.print("Enter NO to modify : ");
					while(!scMod.hasNextInt()) {
	                    System.out.println("Enter positive integer only withing the No range!");
	                    System.out.print("Enter NO to modify : ");
	                    scMod.next();
	                }
					modSelect = scMod.nextInt();
					if(modSelect < 1 || modSelect > endI) {
						System.out.println("Enter NO within range");
					}
				}while(modSelect < 1 || modSelect > endI);
				
				System.out.print("Do you want to remove or edit? (r/e) : ");
				char remEdit = scMod.next().charAt(0);
			
				if(remEdit == 'r' || remEdit == 'R') {
					reciept.remove(modSelect-1);
					double newGrandTotal=0;
				
					System.out.print("\nCurrent order:\n");
					System.out.print("Current order:\n");
					System.out.print("==========================================================\n");
					System.out.print("No | Food Name \t    | Order Amount  |PerPrice \t| Total |\n");
					System.out.print("==========================================================\n");
					for(int i=0; i<reciept.size();i++) {
						newGrandTotal += reciept.get(i).getTotalPerItem();
						System.out.printf("%-2d | %-15s|%-15d|%-10.2f |%-7.2f|\n",i+1,reciept.get(i).getFoodName(),reciept.get(i).getAmount(), reciept.get(i).getPerPrice(), reciept.get(i).getTotalPerItem());
					}
					System.out.print("----------------------------------------------------------\n");
					System.out.printf("Grand Total : \t\t\t\t\t | %.2f | \n",newGrandTotal);
					System.out.print("===========================================================\n\n\n");
				}
				else if (remEdit == 'e' || remEdit == 'E') {
					Scanner modSC = new Scanner(System.in);
					int valid = 0 ;
					do {
						System.out.print("Enter new food ID : ");
						String newFID = modSC.next();
						for(int i=0; i < menuList.size() ;i++)
						{
							if(newFID.equals(menuList.get(i).getFoodID()) == true) { 
								valid = 1;
								//get input
								System.out.print("got this food id\n");
								System.out.print("Enter amount : ");
								int foodAmount = tsc.nextInt();
								String foodname = menuList.get(i).getFoodName();
								double perPrice = menuList.get(i).getPrice();
								Date timenow = new Date();
								SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
								String dateNow = dateFormat.format(timenow);
						
								//Calculation
								double totalPerItem = perPrice*foodAmount;
						
								//System.out.println("hello\n");
						
								//Add to database
								reciept.add(new Reciept (realTransIdNow,foodIdIn,foodname,perPrice,foodAmount,totalPerItem,dateNow));
								//remove
								reciept.remove(modSelect-1);
								break;
							}
							/*boolean inFID = false;
				
					do {
						System.out.print("Currently editing " + reciept.get(modSelect-1).getFoodName()+ "\n Enter new food ID :");
						String editNewFID = scMod.next();
						inFID = food.contains(editNewFID);
						if(inFID == true) {
							System.out.print("Enter Amount :");
							int newAmount = scMod.nextInt();
							String newFoodName = "";
							double newFoodPerPrice = 0;
						
							for(int i=0;i<food.size();i++) {
								if(food.get(i).getFoodId() == editNewFID) {
									newFoodPerPrice = food.get(i).getPrice();
									newFoodName = food.get(i).getFoodName();
								}	
							}
							//calculation
							double totalPerItem = newFoodPerPrice * newAmount;
							Date timenow = new Date();
							SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
							String dateNow = dateFormat.format(timenow);
						
							//add to database
						

						}
					
					}while(inFID == false);*/
						
							else if (i==menuList.size()-1){
								valid = 0 ;
								System.out.printf("Unknow food ID, please enter again !\n");
							}
						}
				}while(valid == 0);
				
					double GrandTotal=0;
					System.out.print("==========================================================\n");
					System.out.print("No | Food Name \t    | Order Amount  |PerPrice \t| Total |\n");
					System.out.print("==========================================================\n");
					for(int i=0; i<reciept.size();i++) {
					
						GrandTotal += reciept.get(i).getTotalPerItem();
						System.out.printf("%-2d | %-15s|%-15d|%-10.2f |%-7.2f|\n",i+1,reciept.get(i).getFoodName(),reciept.get(i).getAmount(), reciept.get(i).getPerPrice(), reciept.get(i).getTotalPerItem());
					}
					System.out.print("----------------------------------------------------------\n");
					System.out.printf("Grand Total : \t\t\t\t\t | %.2f | \n",GrandTotal);
					System.out.print("===========================================================\n\n\n");
			}
		
		
			}
			
			else if(modi == 'n'|| modi == 'N') {
				System.out.println("Nothing else to modify exiting...");
			}
			
			else {
				System.out.println("Enter y/n only");
				modi = 'a';
			}
				
				
		}while(modi == 'a');
		
		//Add all to database
		//eleminate duplicate data

		for(int i=0;i<reciept.size();i++) {
			for(int k=i+1;k<reciept.size();k++) {
				if(reciept.get(i).getFoodId().equals(reciept.get(k).getFoodId()) == true) {
					reciept.get(i).setAmount(reciept.get(i).getAmount()+reciept.get(k).getAmount());
					reciept.get(i).setTotalPerItem(reciept.get(i).getTotalPerItem()+reciept.get(k).getTotalPerItem());
					reciept.remove(k);
				}
			}
		}
		//display
		double GrandTotal=0;
		System.out.print("==========================================================\n");
		System.out.print("No | Food Name \t    | Order Amount  |PerPrice \t| Total |\n");
		System.out.print("==========================================================\n");
		for(int i=0; i<reciept.size();i++) {
		
			GrandTotal += reciept.get(i).getTotalPerItem();
			System.out.printf("%-2d | %-15s|%-15d|%-10.2f |%-7.2f|\n",i+1,reciept.get(i).getFoodName(),reciept.get(i).getAmount(), reciept.get(i).getPerPrice(), reciept.get(i).getTotalPerItem());
		}
		System.out.print("----------------------------------------------------------\n");
		System.out.printf("Grand Total : \t\t\t\t\t | %.2f | \n",GrandTotal);
		System.out.print("===========================================================\n\n\n");
		
		Scanner paySC = new Scanner(System.in);
		double recieve;
		
		do {
			System.out.print("Enter recieve amount : ");
			while(!paySC.hasNextDouble()) {
                System.out.println("Enter positive number only!");
                System.out.print("Enter recieve amount : ");
                tsc.next();
            }
			recieve = paySC.nextDouble();
			if(recieve <= -1) {
				System.out.println("Enter positive integer!");
			}
		}while(recieve <= -1);
		
		double changes = recieve - GrandTotal;
		
		//print reciept
		double RGrandTotal=0;
		System.out.print("==========================================================\n");
		System.out.print("Reciept for  "+ reciept.get(0).getTransId()+"\t" +reciept.get(0).getDate()+"\n");
		System.out.print("==========================================================\n");
		System.out.print("No | Food Name \t    | Order Amount  |PerPrice \t| Total |\n");
		System.out.print("==========================================================\n");
		for(int i=0; i<reciept.size();i++) {
		
			RGrandTotal += reciept.get(i).getTotalPerItem();
			System.out.printf("%-2d | %-15s|%-15d|%-10.2f |%-7.2f|\n",i+1,reciept.get(i).getFoodName(),reciept.get(i).getAmount(), reciept.get(i).getPerPrice(), reciept.get(i).getTotalPerItem());
		}
		System.out.print("----------------------------------------------------------\n");
		System.out.printf("Grand Total : \t\t\t\t\t| %.2f | \n",RGrandTotal);
		System.out.printf("Recieve     : \t\t\t\t\t| %.2f | \n",recieve);
		System.out.printf("Changes     : \t\t\t\t\t| %.2f | \n", changes);
		System.out.print("===========================================================\n\n\n");

		//Add all to database
		Date timenow = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateNow = dateFormat.format(timenow);
		transaction.add(new Transaction (reciept.get(0).getTransId(),recieve,RGrandTotal,changes,reciept.get(0).getDate()));
		for(int i=0; i<reciept.size();i++) {
			transRecord.add(new TransRecord (reciept.get(i).getTransId(),reciept.get(i).getFoodName(),reciept.get(i).getPerPrice() , reciept.get(i).getAmount(), reciept.get(i).getTotalPerItem(),dateNow));
		}
		//clear reciept
		reciept.clear();
		
		int next = 0;
        Scanner getNext = new Scanner(System.in);
        boolean doneAdd = false;
        do {
            do {
                try {
                    System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
                    next = getNext.nextInt();
                    doneAdd = true;
                    if (next == 2) {
                        mainSelection();
                    }
                } catch (Exception ex) {
                    System.out.println("Please enter 1 or 2 only.\n");
                    getNext.nextLine();
                    System.out.println();
                }
            } while (next < 1 || next > 2);
        } while (!doneAdd);
        return next;
        
	}

	//CRUD for manager==========================================================
	//a method for manager to add a new staff into the system
	public static int addStaffDetails() {
		String newEmployeeID;
		String newEmployeeName;
		String newPosition;
		double newSalary = 0;
		String newLoginID;
		String newPassword;
		
		int next = 0;
		int confirm = 0;
		boolean valid;
		boolean exist;
		Scanner getNewString = new Scanner(System.in);
		Scanner getNewDouble = new Scanner(System.in);
		Scanner getConfirm = new Scanner(System.in);
		Scanner getNext = new Scanner(System.in);
		
		System.out.println("\nAdd New Staff");
		System.out.println("=============");
		
		do {
			valid = false;
			exist = false;
			System.out.print("Enter new Employee ID: ");
			newEmployeeID = getNewString.nextLine();
			valid = validateEmployeeIDFormat(newEmployeeID);
			exist = validateExistingEmployeeID(newEmployeeID);
			if (valid == true && exist == false) {
				System.out.println("Input Accepted\n");
			} 				
		} while (valid == false || exist == true);
		
		do {
			valid = false;
			System.out.print("Enter new Staff name: ");
			newEmployeeName = getNewString.nextLine();
			valid = validateEmployeeName(newEmployeeName);
			if (valid == true) {
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
					System.out.println("Salary amount must at least 1000\n");
				}
			} catch (Exception ex) {
				System.out.printf("Only numbers are allowed\n");
				getNewDouble.nextLine();
				System.out.println();
			}
		} while (!done);
		
		do {
			valid = false;
			exist = false;
			System.out.print("Enter new staff log in ID: ");
			newLoginID = getNewString.nextLine();
			valid = validateStaffLoginID(newLoginID);
			exist = validateExistingStaffLoginID(newLoginID);
			if (valid == true && exist == false) {
				System.out.println("Input Accepted\n");
			}
		} while (valid == false || exist == true);
		
		do {
			System.out.print("Enter new staff password: ");
			newPassword = getNewString.nextLine();
			valid = validatePasswordFormat(newPassword);
			if (valid == true) {
				System.out.println("Input Accepted\n");
			}
		} while (valid == false);
		
		System.out.println("Preview Addition of Staff Details...");
		System.out.println("=============================================================================");
		System.out.printf("| %-8s| %-20s| %-9s|  %-7s | %-8s | %-8s |\n", "ID", "Name", "Position", "Salary", "Login ID", "Password");
		System.out.println("=============================================================================");
		System.out.printf("| %-8s| %-20s| %-9s| %8.2f | %-8s | %-8s |\n", newEmployeeID, newEmployeeName, newPosition, newSalary, newLoginID, newPassword);
		System.out.println("=============================================================================");
		do {
			try {
				System.out.print("Press 1 to confirm, press 2 to cancel: ");
				confirm = getConfirm.nextInt();
				if (confirm == 1) {
					staffArray.add(new Staff(newEmployeeID, newEmployeeName, newPosition, newSalary, newLoginID, newPassword));
					System.out.printf("New Staff %s successfully added.\n", newEmployeeName);
				}
				else if (confirm == 2) {
					System.out.println("Addition Cancelled\n");
				}
				else {
					System.out.println("Please enter 1 or 2 only\n");
				}
			} catch (Exception e) {
				System.out.println("Please enter 1 or 2 only");
				getConfirm.nextLine();
				System.out.println();
			}
		} while (confirm < 1 || confirm > 2);
		
		boolean doneAdd = false;
		do {
			do {
				try {
					System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
					next = getNext.nextInt();
					doneAdd = true;
					if (next == 2) {
						mainSelection();
					}
				} catch (Exception ex) {
					System.out.println("Please enter 1 or 2 only.\n");
					getNext.nextLine();
					System.out.println();
				}
			} while (next < 1 || next > 2);
		} while (!doneAdd);
		return next;
		
	}
	
	//allow manager to display all the employees' details in table form
	public static int viewStaffDetails() {
			int next = 0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("\nAll Employees Details");
			System.out.println("=======================================================================================");
			System.out.printf("| No. | %-10s| %-20s| %-10s|  %s  | %s | %s  |\n", "ID", "Name", "Position", "Salary", "Login ID", "Password");
			System.out.println("=======================================================================================");
			
			for (int count = 1; count < (managerArray.size() + staffArray.size()); count++) {
				for(int i = 0; i < managerArray.size(); i++) {
					System.out.printf("| %2d. | ", count++);
					System.out.println(managerArray.get(i).toString() + "  " + managerArray.get(i).getLoginID() + "  | " + "Encrypted |");
				}
				for(int i = 0; i < staffArray.size(); i++) {
					System.out.printf("| %2d. | ", count++);
					System.out.println(staffArray.get(i).toString() + "  " + staffArray.get(i).getStaffLoginID() + "  | " + "Encrypted |");
				}
			}
			
			System.out.println("=======================================================================================\n");
			boolean selected = false;
			do {
				do {
					try {
						System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
						next = scanner.nextInt();
						selected = true;
						if (next == 2) {
							mainSelection();
						}
					}
					catch(Exception ex) {
						System.out.println("Please enter 1 or 2 only\n");
						scanner.nextLine();
						System.out.println();
					}
				}while(next < 1 || next > 2);
			}while(!selected);
			
			return next;
		}
		
	//a method for manager to modify the details of staff
	public static int modifyStaffDetails() {
		String newEmployeeID, newEmployeeName, newEmployeePosition;;
		double newSalary = 0;
		String newLoginID, newLoginPassword;
		boolean valid, found = false, exist;
		
		int choice;
		int confirm = 0;
		Scanner scanner = new Scanner(System.in);
		Scanner getNewEmployeeID = new Scanner(System.in);
		Scanner getNewName = new Scanner(System.in);
		Scanner getNewPosition = new Scanner(System.in);
		Scanner getNewSalary = new Scanner(System.in);
		Scanner getNewLoginID = new Scanner(System.in);
		Scanner getNewPassword = new Scanner(System.in);
		
		Scanner getConfirm = new Scanner(System.in);
		Scanner getNext = new Scanner(System.in);
		
		String ID = "";
		System.out.println("Modify Staff Details");
		System.out.println("====================");
		do {
			try {
				System.out.print("Enter Employee ID for staff: ");
				ID = scanner.nextLine();
				for (int i = 0; i < staffArray.size(); i++) {
					if (ID.equals(staffArray.get(i).getEmployeeID())) {
						found = true;
					}
				}
				if (found == false) {
					System.out.println("Invalid ID, please try again.\n");
				}
			} catch (Exception ex) {
				scanner.nextLine();
				System.out.println();
			}
		} while (found == false);
		
		
		for (int i = 0; i < staffArray.size(); i++) {
			if (ID.equals(staffArray.get(i).getEmployeeID())) {
				System.out.println("==============================================================================");
				System.out.printf("| %-8s| %-20s| %-9s|  %-7s | %-8s | %-8s  |\n", "ID", "Name", "Position", "Salary", "Login ID", "Password");
				System.out.println("==============================================================================");
				System.out.printf("| %-8s| %-20s| %-9s| %8.2f | %-8s | %-8s |\n", staffArray.get(i).getEmployeeID(), staffArray.get(i).getEmployeeName(), staffArray.get(i).getEmployeePosition(), staffArray.get(i).getSalary(), staffArray.get(i).getStaffLoginID(), "Encrypted");
				System.out.println("==============================================================================");
			
				switch (choice = modifyStaffDetailsMenu()) {
				case 1: 
					do {
						System.out.print("Enter new Employee ID for Staff: ");
						newEmployeeID = getNewEmployeeID.nextLine();
						valid = validateEmployeeIDFormat(newEmployeeID);
						exist = validateExistingEmployeeID(newEmployeeID);
						if (valid == true && exist == false) {
							System.out.println("Input Accepted\n");
							System.out.println("Preview changes...");
							System.out.printf("Confirm change Employee ID from %s to %s?\n", staffArray.get(i).getEmployeeID(), newEmployeeID);
							do {
								try {
									System.out.print("Press 1 to confirm, press 2 to cancel: ");
									confirm = getConfirm.nextInt();
									if (confirm == 1) {
										staffArray.get(i).setEmployeeID(newEmployeeID);
										System.out.println("Staff Details Modification Success\n");
									}
									else if (confirm == 2) {
										System.out.println("Modification Cancelled\n");
									}
									else {
										System.out.println("Please enter 1 or 2 only\n");
									}
								} catch (Exception e) {
									System.out.println("Please enter 1 or 2 only");
									getConfirm.nextLine();
									System.out.println();
								}
							} while (confirm < 1 || confirm > 2);
							
						}
					} while (valid == false || exist == true);
					break;
					
				case 2:
					do {
						System.out.print("Enter new Staff name: ");
						newEmployeeName = getNewName.nextLine();
						valid = validateEmployeeName(newEmployeeName);
						if (valid == true) {
							System.out.println("Input Accepted\n");
							System.out.println("Preview changes...");
							System.out.printf("Confirm change Employee Name from %s to %s?\n", staffArray.get(i).getEmployeeName(), newEmployeeName);
							do {
								try {
									System.out.print("Press 1 to confirm / Press 2 to cancel: ");
									confirm = getConfirm.nextInt();
									if (confirm == 1) {
										staffArray.get(i).setEmployeeName(newEmployeeName);
										System.out.println("Staff Details Modification Success\n");
									}
									else if (confirm == 2) {
										System.out.println("Modification Cancelled\n");
									}
									else {
										System.out.println("Please enter 1 or 2 only\n");
									}
								} catch (Exception e) {
									System.out.println("Please enter 1 or 2 only");
									getConfirm.nextLine();
									System.out.println();
								}
							} while (confirm < 1 || confirm > 2);
							
						}
					} while (valid == false);
					break;
					
				case 3:
					System.out.print("Enter new staff position: ");
					newEmployeePosition = getNewPosition.nextLine();
					System.out.println("Input Accepted\n");
					System.out.println("Preview changes...");
					System.out.printf("Confirm change staff position from %s to %s?\n", staffArray.get(i).getEmployeePosition(), newEmployeePosition);
					do {
						try {
							System.out.print("Press 1 to confirm / Press 2 to cancel: ");
							confirm = getConfirm.nextInt();
							if (confirm == 1) {
								staffArray.get(i).setEmployeePosition(newEmployeePosition);
								System.out.println("Staff Details Modification Success\n");
							}
							else if (confirm == 2) {
								System.out.println("Modification Cancelled\n");
							}
							else {
								System.out.println("Please enter 1 or 2 only\n");
							}
						} catch (Exception e) {
							System.out.println("Please enter 1 or 2 only");
							getConfirm.nextLine();
							System.out.println();
						}
					} while (confirm < 1 || confirm > 2);
					break;
					
				case 4:
					boolean done = false;
					do {
						try {
							System.out.print("Enter new staff salary: ");
							newSalary = getNewSalary.nextDouble();
							if (newSalary > 1000) {
								done = true;
								System.out.println("Input Accepted\n");
								System.out.println("Preview changes...");
								System.out.printf("Confirm change staff salary from %.2f to %.2f?\n", staffArray.get(i).getSalary(), newSalary);
								do {
									try {
										System.out.print("Press 1 to confirm / Press 2 to cancel: ");
										confirm = getConfirm.nextInt();
										if (confirm == 1) {
											staffArray.get(i).setSalary(newSalary);
											System.out.println("Staff Details Modification Success\n");
										}
										else if (confirm == 2) {
											System.out.println("Modification Cancelled\n");
										}
										else {
											System.out.println("Please enter 1 or 2 only\n");
										}
									} catch (Exception e) {
										System.out.println("Please enter 1 or 2 only");
										getConfirm.nextLine();
										System.out.println();
									}
								} while (confirm < 1 || confirm > 2);
							}
							else {
								System.out.println("Salary amount must at least 1000\n");
							}
						} catch (Exception ex) {
							System.out.println("Only number are allowed\n");
							getNewSalary.nextLine();
							System.out.println();
						}
					} while (!done);
					break;
					
				case 5:
					do {
						System.out.print("Enter new staff Login ID: ");
						newLoginID = getNewLoginID.nextLine();
						valid = validateStaffLoginID(newLoginID);
						exist = validateExistingStaffLoginID(newLoginID);
						if (valid == true && exist == false) {
							System.out.println("Input Accepted\n");
							System.out.println("Preview changes...");
							System.out.printf("Confirm change Staff Login ID from %s to %s?\n", staffArray.get(i).getStaffLoginID(), newLoginID);
							do {
								try {
									System.out.print("Press 1 to confirm, press 2 to cancel: ");
									confirm = getConfirm.nextInt();
									if (confirm == 1) {
										staffArray.get(i).setStaffLoginID(newLoginID);
										System.out.println("Staff Details Modification Success\n");
									}
									else if (confirm == 2) {
										System.out.println("Modification Cancelled\n");
									}
									else {
										System.out.println("Please enter 1 or 2 only\n");
									}
								} catch (Exception e) {
									System.out.println("Please enter 1 or 2 only");
									getConfirm.nextLine();
									System.out.println();
								}
							} while (confirm < 1 || confirm > 2);
							
						}
					} while (valid == false || exist == true);
					break;
					
				case 6:
					do {
						System.out.print("Enter new staff password: ");
						newLoginPassword = getNewPassword.nextLine();
						valid = validatePasswordFormat(newLoginPassword);
						if (valid == true) {
							System.out.println("Input Accepted\n");
							System.out.println("Preview changes...");
							System.out.printf("Confirm change Staff Password to %s?\n", newLoginPassword);
							do {
								try {
									System.out.print("Press 1 to confirm, press 2 to cancel: ");
									confirm = getConfirm.nextInt();
									if (confirm == 1) {
										staffArray.get(i).setStaffPassword(newLoginPassword);
										System.out.println("Staff Details Modification Success\n");
									}
									else if (confirm == 2) {
										System.out.println("Modification Cancelled\n");
									}
									else {
										System.out.println("Please enter 1 or 2 only\n");
									}
								} catch (Exception e) {
									System.out.println("Please enter 1 or 2 only");
									getConfirm.nextLine();
									System.out.println();
								}
							} while (confirm < 1 || confirm > 2);
						}
					} while (valid == false);
				}
			}
		}
		
		boolean doneModify = false;
		int next = 0;
		do {
			do {
				try {
					System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
					next = getNext.nextInt();
					doneModify = true;
					if (next == 2) {
						mainSelection();
					}
				} catch (Exception ex) {
					System.out.println("Please enter 1 or 2 only.\n");
					getNext.nextLine();
					System.out.println();
				}
			} while (next < 1 || next > 2);
		} while (doneModify == false);
		return next;
	}
	
	//a menu for manager to choose which staff information they want to change
	public static int modifyStaffDetailsMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Choose which info you want to modify: ");
		System.out.println(" 1. Employee ID");
		System.out.println(" 2. Staff Name");
		System.out.println(" 3. Staff Position");
		System.out.println(" 4. Staff Salary");
		System.out.println(" 5. Staff Login ID");
		System.out.println(" 6. Staff Login Password");
		boolean done = false;
		
		do {
			do {
				try {
					System.out.print("Enter your choice: ");
					choice = scanner.nextInt();
					done = true;
					if (choice < 1 || choice > 6) {
						System.out.println("Please enter 1 to 6 only\n");
					}
				} catch (Exception ex) {
					System.out.println("Only numbers are allowed");
					scanner.nextLine();
					System.out.println();
				}
			} while (choice < 1 || choice > 6);
		} while (!done);
		return choice;
	}
	
	//a method for manager to remove a staff from the system
	public static int deleteStaffDetails() {
		int next = 0;
		int confirm = 0;
		boolean found = false;
		boolean done = false;
		Scanner scanner = new Scanner(System.in);
		Scanner getConfirm = new Scanner(System.in);
		System.out.println("\nDelete Staff Details");
		System.out.println("====================");
		
		do {
			System.out.print("Enter Employee ID of staff to delete: ");
			String delete = scanner.nextLine();
			for (int i = 0; i < staffArray.size(); i++) {
				if (delete.equals(staffArray.get(i).getEmployeeID())) {
					found = true;
					System.out.println("Preview Deletion...");
					System.out.println("============================================================================");
					System.out.printf("| %-8s| %-20s| %-9s| %-6s  | %-8s | %-8s |\n", "ID", "Name", "Position", "Salary", "Login ID", "Password");
					System.out.println("============================================================================");
					System.out.printf("| %-8s| %-20s| %-9s| %-7.2f | %-8s | %-8s |\n", staffArray.get(i).getEmployeeID(), staffArray.get(i).getEmployeeName(), staffArray.get(i).getEmployeePosition(), staffArray.get(i).getSalary(), staffArray.get(i).getStaffLoginID(), staffArray.get(i).getStaffPassword());
					System.out.println("============================================================================");
					System.out.println("Confirm to delete this staff?");
					do {
						try {
							System.out.print("Press 1 to delete / Press 2 to cancel: ");
							confirm = getConfirm.nextInt();
							if (confirm == 1) {
								System.out.printf("\nStaff %s has been removed.\n", staffArray.get(i).getEmployeeName());
								done = true;
								staffArray.remove(i);
							}
							else if (confirm == 2) {
								System.out.println("Cancelled...\n\n");
								done = true;
							}
							else {
								System.out.println("Please enter 1 or 2 only\n");
							}
						} catch (Exception e) {
							System.out.println("Please enter 1 or 2 only");
							getConfirm.nextLine();
							System.out.println();
						}
					} while (done == false);
				}
			}
			if (found == false) {
				System.out.println("No record found. Please try again.\n");
			}
		} while (!found);
		
		done = false;
		do {
			do {
				try {
					System.out.print("\nPress 1 to CONTINUE / Press 2 to LOG OUT: ");
					next = scanner.nextInt();
					done = true;
					if (next == 2) {
						mainSelection();
					}
				} catch (Exception ex) {
					System.out.println("Please enter 1 or 2 only.\n");
					scanner.nextLine();
					System.out.println();
				}
			} while (next < 1 || next > 2);
		} while (!done);
		return next;
	}
	
	
	/*validation start------------------------------------------------*/
	//to validate the format of employees' IDs
	public static boolean validateEmployeeIDFormat(String id) {
		String idFormat = "^[E,M,P]{3}[\\d]{4}";
		if(id.length() > 0 && id.length() < 8) {
			if (Character.isUpperCase(id.charAt(0)) == true && id.matches(idFormat) == true) {
				return true;
			}
			else {
				System.out.println("Employee ID must consists of 3 uppercase alphabet 'EMP' and 4 digit number.\n");
			}
		}
		else {
			System.out.println("Employee ID must consists of 3 uppercase alphabet 'EMP' and 4 digit number.\n");
		}
		return false;
	}
	
	//to validate the existing of employee's IDs in the system
	public static boolean validateExistingEmployeeID(String id) {
		boolean exist = false;
		for (int i = 0; i < staffArray.size(); i++) {
			if (id.equals(staffArray.get(i).getEmployeeID())) {
				exist = true;
				System.out.println("This ID has been used.\n");
			}
		}
		for (int i = 0; i < managerArray.size(); i++) {
			if (id.equals(managerArray.get(i).getEmployeeID())) {
				exist = true;
				System.out.println("This ID has been used.\n");
			}
		}
		return exist;
	}
	
	//to validate the length of employees' name
	public static boolean validateEmployeeName(String name) {
		String nameFormat = "^(?=.*[A-Za-z]).{1,20}";
		if (name.length() > 0 && name.length() <= 20) {
			if (name.matches(nameFormat) == true) {
				return true;
			}
			else {
				System.out.println("Symbols and numbers are not allows.\n");
			}
		}
		else {
			System.out.println("Name entered is too long. Maximum length for name is 20 characters.\n");
		}
		return false;
	}
	
	//to validate the format of staff login ID 
	public static boolean validateStaffLoginID(String id) {
		String IdFormat = "[S,T]{2}[\\d]{4}";
		if (id.length() > 0 && id.length() < 7) {
			if (id.matches(IdFormat) == true) {
				return true;
			}
			else {
				System.out.println("Staff log in ID must consists of 2 uppercase alphabet 'ST' and 4 digit numbers\n");
			}
		}
		else {
			System.out.println("Staff log in ID must consists of 2 uppercase alphabet 'ST' and 4 digit numbers\n");
		}
		return false;
	}
	
	//to validate the existing of staff login ID
	public static boolean validateExistingStaffLoginID(String id) {
		boolean exist = false;
		for (int i = 0; i < staffArray.size(); i++) {
			if (id.equals(staffArray.get(i).getStaffLoginID())) {
				exist = true;
				System.out.println("This ID has been used.\n");
			}
		}
		return exist;
	}
	
	//to validate the format of login password for staff and manager
	public static boolean validatePasswordFormat(String password) {
		boolean valid = false;
		String passwordFormat = "[a-zA-Z]{6}";
		if (password.matches(passwordFormat)) {
			return valid = true;
		}
		else {
			System.out.println("Password must consists of any 6 alphabets.\n");
		}
		return valid;
	}
	/*validation end--------------------------------------------------*/
	
	//display restaurant's logo
	public static void logo() {
		System.out.println("  .. ..  .  .. ..  .  .. ..  .  .. ..  .  .. .. .%@#.  ..  .  .. ..  .  .. ..  .  .. ..  .  .. ..  .");
		System.out.println("..  .  .. ..  .  .. ..  .  .. ..  .  ..@@@@@@& .. ..   &@@@@@@  .  .. ..  .  .. ..  .  .. ..  .  .. ");
		System.out.println("                                  @@@@/      #@@@@@@@@@(      %@@@(                                 ");
		System.out.println("  .. ..  .  .. ..  .  .. ..  . @@@&..  @@@@@@@@@@@@@@@@@@@@@@@.. .@@@@  .. ..  .  .. ..  .  .. ..  .");
		System.out.println("..  .  .. ..  .  .. ..  .  ..@@@  .@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@ ..@@@  .  .. ..  .  .. ..  .  .. ");
		System.out.println("..  .  .. ..  .  .. ..  .  @@@.. @@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@  .@@@.  .. ..  .  .. ..  .  .. ");
		System.out.println("  .. ..  .  .. ..  .  .. @@@ . @@@@@@@@@& .. @@@@@. @# @@ @@ @@@@@@@@@  .@@..  .  .. ..  .  .. ..  .");
		System.out.println("  .. ..  .  .. ..  .  ..@@@  @@@@@@@@@@@  .. @@@@@  @# @@ @@ @@@@@@@@@@@..@@@  .  .. ..  .  .. ..  .");
		System.out.println("..  .  .. ..  .  .. .. @@  @@@@@@@@@@@  ..  .@@@@@..@/.@@.@@..@@@@@@@@@@@@. @@. ..  .  .. ..  .  .. ");
		System.out.println("  .. ..  .  .. ..  .  @@ ..@@@@@@@@@@@ .  .. @@@@   @# @@ @@  @@@@@@@@@@@@ .(@@.  .. ..  .  .. ..  .");
		System.out.println("  .. ..  .  .. ..  .  @@ .%@@@@@@@@@@@ .  .. @@@@.  @# @@ @@  @@@@@@@@@@@@ ..@@.  .. ..  .  .. ..  .");
		System.out.println("..  .  .. ..  .  .. ..@@. /@@@@@@@@@@@. ..  .@@@@ ..@/.@@.@@..@@@@@@@@@@@@   @@ ..  .  .. ..  .  .. ");
		System.out.println("..  .  .. ..  .  .. ..@@   @@@@@@@@@@@. ..  .@@@@ ..  .  .. ..@@@@@@@@@@@@. (@@ ..  .  .. ..  .  .. ");
		System.out.println("..  .  .. ..  .  .. ..@@   @@@@@@@@@@@. ..  .@@@@ ..  .  .. ..@@@@@@@@@@@@. (@@ ..  .  .. ..  .  .. ");
		System.out.println("..  .  .. ..  .  .. ..@@   @@@@@@@@@@@. ..  .@@@@ ..  .  .. ..@@@@@@@@@@@@. (@@ ..  .  .. ..  .  .. ");
		System.out.println("  .. ..  .  .. ..  .  .@@..@@@@@@@@@@@ .  .. @@@@@  .. ..  . @@@@@@@@@@@@@ .@@ .  .. ..  .  .. ..  .");
		System.out.println("  .. ..  .  .. ..  .  .@@@. @@@@@@@@@@ .  .. @@@@@@@@@ ..@@@@@@@@@@@@@@@@. @@& .  .. ..  .  .. ..  .");
		System.out.println("..  .  .. ..  .  .. ..  @@@..@@@@@@@@@  ..  .@@@@@@@@@.  @@@@@@@@@@@@@@@  @@@.. ..  .  .. ..  .  .. ");
		System.out.println("..  .  .. ..  .  .. ..  ./@@. .@@@@@@@@@@.  .@@@@@@@@@.  %@@@@@@@@@@@@.. @@  .. ..  .  .. ..  .  .. ");
		System.out.println("  .. ..  .  .. ..  .  .. ..@@@   @@@@@@@@ .. @@@@@@@@@ .. @@@@@@@@@@ . @@@ ..  .  .. ..  .  .. ..  .");
		System.out.println("  .. ..  .  .. ..  .  .. ..  @@@.. @@@@@@ .. @@@@@@@@@ .. @@@@@@@@.  @@@.. ..  .  .. ..  .  .. ..  .");
		System.out.println("..  .  .. ..  .  .. ..  .  .. .@@@@  ..@@.  .@@@@@@@@@.  .@@@@  . @@@&..  .  .. ..  .  .. ..  .  .. ");
		System.out.println("..  .  .. ..  .  .. ..  .  .. ..  (@@@@ ..  . @@@@@@@ .  .. ..@@@@ .. ..  .  .. ..  .  .. ..  .  .. ");
		System.out.println("  .. ..  .  .. ..  .  .. ..  .  .. ..  @@@@@@@(  .  . #@@@@@@@.. ..  .  .. ..  .  .. ..  .  .. ..  .");
	}
	
	//a menu for user to choose their position to log into the system
	public static int loginMenu(){
		logo();
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(choice <= 0 || choice > 3){
			try{
				System.out.println("");
				System.out.println("========================");
				System.out.println("| Choose Your Position |");
				System.out.println("|       To Log In      |");
				System.out.println("========================");
				System.out.println("|     1. STAFF         |");
				System.out.println("|     2. MANAGER       |");
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
	
	//this is a method that allow user to choose which position they are to log in
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
						
						Employee checkStaffID = new Staff();
						
						if(((Staff) checkStaffID).verifyLoginID(loginID) == true){
							for(int i = 0; i < staffArray.size(); i++){
								if((loginID.equals(staffArray.get(i).getStaffLoginID())) && (loginPassword.equals(staffArray.get(i).getStaffPassword())) == true){
									Date date = new Date();
									System.out.printf("Welcome Staff %s %25s %s\n\n", staffArray.get(i).getEmployeeName(),"Logged In Time:", date);
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
						
						Employee checkManagerID = new Manager();
						
						if(((Manager) checkManagerID).verifyLoginID(loginID) == true) {
							for(int i = 0; i < managerArray.size(); i++) {
								if((loginID.equals(managerArray.get(i).getLoginID())) && (loginPassword.equals(managerArray.get(i).getPassword())) == true) {
									Date date = new Date();
									System.out.printf("Welcome Manager %s %25s %s\n\n", managerArray.get(i).getEmployeeName(), "Logged In Time:", date);
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
			case 3: 
				System.out.println("\nSystem shutting down...\nThank you! Goodbye!");
				System.exit(0);
			break;
		}
		return false;
	}
	
	//a menu that allow staff to do the daily pos work
	public static int staffMenu(){
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("================================");
		System.out.println("|          STAFF MENU          |");
		System.out.println("================================");
		System.out.println("| 1. Create New Order          |");
		System.out.println("| 2. View Transaction History  |");
		System.out.println("| 3. Log Out                   |");
		System.out.println("================================");
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
				if(choice < 1 || choice > 3) {
					System.out.print("Enter 1 to 3 only.\n");
				}
			}while(choice < 1 || choice > 3);
		}while(!selected);
		return choice;
	}
	
	//a menu that allow manager to set the details of staff and food
	public static int managerMenu(){
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("=======================================");
    	System.out.println("|            MANAGER MENU             |");   
    	System.out.println("=======================================");
    	System.out.println("|  1. Add A New Staff Details         |");
    	System.out.println("|  2. Modify Existing Staff Details   |");
    	System.out.println("|  3. Remove A Staff Details          |");
    	System.out.println("|  4. View All Staff Details          |");
    	System.out.println("=======================================");
    	System.out.println("|  5. Add New Food Details            |");
    	System.out.println("|  6. Modify Existing Food Details    |");
    	System.out.println("|  7. Remove A Food Details           |");
    	System.out.println("|  8. View All Food Details           |");
    	System.out.println("|  9. Top Sales                       |");
    	System.out.println("| 10. View Daily Sales Report         |");
    	System.out.println("| 11. Transaction History             |");
    	System.out.println("| 12. Log Out                         |");
    	System.out.println("=======================================");
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
    			if(choice < 1 || choice > 12) {
    				System.out.println("Enter 1 to 12 only\n");
    			}
    		}while(choice < 1 || choice > 12);
    	}while(!selected);
    	return choice;
	}
}
