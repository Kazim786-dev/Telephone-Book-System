import java.util.Scanner;

public class TDS {


	public static void main(String[] args) {
		
		//Scanner object to take input from user
		Scanner sc=new Scanner(System.in);	
		
	//object of Function class to access functions from class
		Functions obj=new Functions();
	
		boolean iterate=true;
		int selection=0;
		while(iterate)
	  {	
			selection=0;
			
		System.out.println("1- Insert record\n"
				+ "2- Delete record\n"
				+ "3- View record\n"
				+ "4- Update record\n"
				+ "5- Sort record\n"
				+ "6- Search record\n"
				+ "7- Recent birthdays\n"
				+ "8- Exit\n");
		 
		
		while(selection<1||selection>8) {
			selection=sc.nextInt();
		}
		
		switch(selection) {
		case 1:{
			obj.insertRecord(sc);     //calling insert method and pass scanner object
			break;
		}
		case 2:{
			obj.deleteRecord(sc);
			break;
		}
		case 3:{
			obj.viewrecord(sc);
			break;
		}
		case 4:{
			obj.updateRecord(sc);
			break;
		}
		case 5:{
			obj.sortRecord(-1, 0);
			break;
		}
		case 6:{
			obj.searchRecord(sc);
			break;
		}
		case 7:{
			obj.recentBirthday();
			break;
		}
		case 8:{
			System.out.println("Thank u for using our service!");
			iterate=false;
			break;
		}
		default:{
			System.out.println("Wrong input!\n");
		}
		}
		
	  }	
		
	}
	
}
