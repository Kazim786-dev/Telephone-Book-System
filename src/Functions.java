import java.util.Arrays;
import java.util.Scanner;

public class Functions {

	Functions(){
		
	}
	
	//Scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		
		//create object of Contact class 
		Contact obj=new Contact();
		
		// insertRecord method to add contact details
		
		void insertRecord(Scanner sc) {
			String waste = sc.nextLine();
			 waste = sc.nextLine();
			System.out.println("Enter First name");
			String fname=sc.next();
			
			obj.setfName(fname);
			System.out.println("Enter last name");
			String lname=sc.next();
			obj.setLname(lname);
			System.out.println("Enter Country");
			String country=sc.next();
			obj.setCountry(country);
			System.out.println("Enter City");
			String city=sc.next();
			obj.setCity(city);
			System.out.println("Enter Address ( sector/street#/house# ) ");
			String residentialAddress=sc.next();
			obj.setResidentialAddress(residentialAddress);
			System.out.println("Enter your personal Mobile number");
			String mobile=sc.next();
			obj.setMobile(mobile);
			System.out.println("Enter Company in which you work");
			String company=sc.next();
			obj.setCompany(company);
			System.out.println("Enter your date of birth (only date)");
			int dateofbirth=sc.nextInt();
			obj.setDateoBirth(dateofbirth);
			System.out.println("Enter your month of birth");
			String monthofbirth=sc.next();
			obj.setMonthofbirth(monthofbirth);
			System.out.println("Enter your year of birth");
			int yearofbirth=sc.nextInt();
			obj.setYearofbirth(dateofbirth);
			System.out.println("Enter your phone number");
			String phoneNumber=sc.next();
			obj.setPhoneNumber(phoneNumber);
			System.out.println("Enter your website name");
			String website=sc.next();
			obj.setWebsite(website);
			
			String ID="#s"+(obj.code+6+obj.getLength())+"fw";
			obj.setID(ID);
			obj.code+=1;
			
			//create object of class 
			Contact obj1=new Contact(ID,fname, lname, city, country, residentialAddress,website, mobile, company,dateofbirth,monthofbirth,yearofbirth,phoneNumber);
			
			//assign object of class to specific index of object array 
			
			obj.details[obj.getLength()-1]=obj1;
			if(obj.details[obj.getLength()-1]!=null) {
				System.out.println("\nDetails inserted successfully in phone book!\n");
				int length=obj.getLength();
				obj.setLength(++length);
				
				System.out.println("==> Remember your ID."+ID+"\n");
				
				
				obj.details=Arrays.copyOf(obj.details, obj.getLength()+(1));
			}
			
		}
		
		// deleteRecord method to delete specific contact from phone book
		
		void deleteRecord(Scanner sc){
			obj.setID("");
			obj.setfName("");
			obj.setLname("");
			System.out.println("Select method to delete the contact from phone book");
			System.out.println("1- By id\n2- By name");
			int choice=-1;
			String id="";
			String Fname="",Lname="";
			
			while(choice<0||choice>2) {    //loop continue until correct number is entered
				choice=sc.nextInt();
			}
			if(choice==1) {
				System.out.println("Enter ID please!");
				 id=sc.next();
				
			}
			if(choice==2) {
				System.out.println("Enter first name");
				 Fname=sc.next();
				System.out.println("Enter last name");
				 Lname=sc.next();
			}
			
			
			// for loop to delete and assign index to 1 previous due to null index
			for(int i=0; i<obj.getLength()-1; i++) {
				
				if(obj.details[i]!=null)
				if(obj.details[i].getID().equals(id) || (obj.details[i].getfName().equals(Fname) && obj.details[i].getLname().equals(Lname))) {
					obj.details[i]=null;
					Contact obj=new Contact();
					
					//loop to assign the previous index with the next one bcz we are deleting
					
						for(int j=i;j<obj.getLength()-2;j++) {
							
							obj.details[j]=obj.details[++j];
							//System.out.println(details[j]);
						} 
					obj.setLength(obj.getLength()-1);
					System.out.println("\nContact successfully deleted\n");
				    choice=3;
				    
				break;    // if found and deleted, loop will terminate
				}
				
			}
			
			
			if(choice!=3) {
				System.out.println("Something went wrong");
			}
			
			
		}
		
		// viewrecord method to view specific contact details
		
		void viewrecord(Scanner sc) {
			
			String id="";
			String Fname="",Lname="";
			int choice=-1;
			System.out.println("Select one!\n"
					+ "1- View all \n"
					+ "2- view specific");
			while(choice<0||choice>2) {
				choice=sc.nextInt();
			}
			
		if(choice==1) {
			for(int i=0; i<(obj.getLength()-(1)); i++) {
				
				if(obj.details[i]!=null) {
					System.out.println("\nContact details==>\n\n");
					
					System.out.println("ID : "+obj.details[i].getID());
					
					System.out.println("First name  :  "+obj.details[i].getfName());
					
					System.out.println("last name  :  "+obj.details[i].getLname());
					
					System.out.println("Country  :  "+obj.details[i].getCountry());
					
					System.out.println("City  :  "+obj.details[i].getCity());
					
					System.out.println("Address  :  "+obj.details[i].getResidentialAddress());
					
					System.out.println("Mobile number  :  "+obj.details[i].getMobile());

					System.out.println("Company in which you work  :  "+obj.details[i].getCompany());
					
					System.out.println("Date of birth  :  "+obj.details[i].getDateofBirth()+"/"+obj.details[i].getMonthofbirth()+"/"+obj.details[i].getYearofbirth());
					
					System.out.println("Phone number  :  "+obj.details[i].getPhoneNumber());

	                System.out.println("Website name  :  "+obj.details[i].getWebsite()+"\n");
				}
			}
		 }
			
		 else if(choice==2) {
			choice=-1;
			System.out.println("Select method to view the contact details from phone book");
			System.out.println("1- By id\n2- By name");
			
			while(choice<0||choice>2) {
				choice=sc.nextInt();
			}
			if(choice==1) {
				System.out.println("Enter ID please!");
				id=sc.next();
				
			}
			if(choice==2) {
				System.out.println("Enter first name");
				Fname=sc.next();
				System.out.println("Enter last name");
				Lname=sc.next();
			}
			
			
			// for loop to find and print specific contact details
			
					for(int i=0; i<(obj.getLength()-(1)); i++) {
					
					if(obj.details[i]!=null)	
					if( obj.details[i].getID().equals(id) || (obj.details[i].getfName().equalsIgnoreCase(Fname) && obj.details[i].getLname().equalsIgnoreCase(Lname))) {
							
							System.out.println("Contact details==>\n\n");
							
							System.out.println("ID : "+obj.details[i].getID());
					
							System.out.println("First name  :  "+obj.details[i].getfName());
							
							System.out.println("last name  :  "+obj.details[i].getLname());
							
							System.out.println("Country  :  "+obj.details[i].getCountry());
							
							System.out.println("City  :  "+obj.details[i].getCity());
							
							System.out.println("Address  :  "+obj.details[i].getResidentialAddress());
							
							System.out.println("Mobile number  :  "+obj.details[i].getMobile());

							System.out.println("Company in which you work  :  "+obj.details[i].getCompany());
							
							System.out.println("Date of birth  :  "+obj.details[i].getDateofBirth()+"/"+obj.details[i].getMonthofbirth()+"/"+obj.details[i].getYearofbirth());
							
							System.out.println("Phone number  :  "+obj.details[i].getPhoneNumber());

	                        System.out.println("Website name  :  "+obj.details[i].getWebsite()+"\n");
							
						choice=3;
						break;
						
						}
					}
					
					if(choice!=3) {
						System.out.println("\nSomething went wrong\n");
					}
		        }	
			
		}
		
		//method to update name of contact
		
		void updateRecord(Scanner sc){
			
			String ID="";
			String Fname="",Lname="";
			System.out.println("Select method to find and update the contact from phone book\n");
			System.out.println("1- By id\n2- By name");
			int choice=-1;
			while(choice<0||choice>2) {
				choice=sc.nextInt();
			}
			if(choice==1) {
				System.out.println("Enter ID please!");
				ID=sc.next();
				
			}
			if(choice==2) {
				System.out.println("Enter first name");
				Fname=sc.next();
				System.out.println("Enter last name");
				Lname=sc.next();
			}
			
			for(int i=0; i<obj.getLength()-1; i++) {
				if(obj.details[i]!=null)
				if( obj.details[i].getID().equals(ID) || (obj.details[i].getfName().equals(Fname)&&obj.details[i].getLname().equals(Lname))) {
					
					System.out.println("==> Old record");
					System.out.println("First name : "+ obj.details[i].getfName());
					System.out.println("Last name : "+obj.details[i].getLname());
					System.out.println("\nNow enter new record!\n");
					System.out.println("First name");
					Fname=sc.next();
					System.out.println("Last name");
					Lname=sc.next();
					
					obj.details[i].setfName(Fname);
					obj.details[i].setLname(Lname);
					
					System.out.println("Contact Updated!\n");
				
					choice=3;
				
				break;    // if found and deleted, loop will terminate
				}
			}
			if(choice!=3) {
				System.out.println("Something went wrong");
			}
			
		}
		
		
	    void sortRecord(int choice , int x){
	    	
	    if(choice==-1)	
	     {	
	    	System.out.println("1- Sort By ID\n2- Sort By Name");
			
			while(choice<0||choice>2) {
				choice=sc.nextInt();
			}
	    }
			if(choice==1) {            // sort by id in ascending order 
				
				System.out.println("1- Sort Ascendingly\n2- Sort Descendingly");
				choice=-1;
				while(choice<0||choice>2) {
					choice=sc.nextInt();
				}
				
					int i,min, temp1, temp2, j;
					String id1,id2;
				    for (i = 0; i < obj.getLength()-2; i++)
				    {
				    	min=i;
				    	
				    	id1=obj.details[i].getID();
				    	id1=id1.substring(2, id1.length()-2);  // exclude characters other than integers from string
				        temp1 = Integer.parseInt(id1);
				        
				     // Find min: the index of the integer that should go into cell j.
				        // Look through the unsorted integers (those at j or higher)
				    	
				       for( j=i+1; j<obj.getLength()-1; j++) {
				    	   
				    	   id2=obj.details[j].getID();
					    	id2=id2.substring(2, id2.length()-2);
					    	temp2=Integer.parseInt(id2);
				    	   
					    	if(temp2<temp1 && choice==1)
				    		   min=j;
					    	else if(temp2>temp1 && choice==2) {
					    		min=j;
					    	}
				       }
				        
				        Contact tempObj=obj.details[min];
				        obj.details[min]=obj.details[i];
				        obj.details[i]=tempObj;
				    	
				    }
				choice=-1;
				
				
			}
			
			if(choice==2) {
				
				String name1,name2;
				for ( int j=0; j < obj.getLength()-2; j++ )
			    {
			      // Find minimum: the index of the string reference that should go into cell j.
			
			      int min = j;
			      name1=obj.details[j].getfName();
			      
			      for ( int k=j+1; k < obj.getLength()-1; k++ ) {
			    	  name2=obj.details[k].getfName();
			    	  int l=0;
			    	 
			    	  if(name2.length()<=name1.length()) {
			    		  
			    		 if( ! name1.equalsIgnoreCase(name2) ) {
			    			 
			    			 name1=name1.toUpperCase();
			    			 name2=name2.toUpperCase();
			    			
						      }  
			    			 
			    	  while( l<name2.length() ){
			    	  if ( name2.charAt(l)< name1.charAt(l) ) {
			        	min = k;
			        	//name1=name2;
			        	
			        	 break;
			    	  }
			    	  else if( name2.charAt(l) > name1.charAt(l) ) {
			    		  break;
			    	  }
			    	  l++;
			        
			    	  } //while close
			      }  // outermost if close
			    	  
			    	   if(name1.length()<name2.length()) {
			    		   
			    		   if( ! name1.equalsIgnoreCase(name2) )
			    		   {
			    			   name1=name1.toUpperCase();
				    			 name2=name2.toUpperCase();   
				    			 
			    		   }
			    		 
				    	  while( l<name1.length() ){
				    	  if ( name2.charAt(l)< name1.charAt(l) ) {
				        	min = k;
				        //	name1=name2;
				        	
				        	break; 
				    	  }
				    	  else if( name2.charAt(l) > name1.charAt(l) ) {
				    		  break;
				    	  }
				    	  l++;
				        } // while close
				    	  
			    	   } 
			    	  
			    	  
			      }
			      
			      
			      // Swap the reference at j with the reference at min 
			      Contact tempObj=obj.details[min];
			      obj.details[min]=obj.details[j];
			      obj.details[j]=tempObj;
			    }
				
			}
	    	
			if(x!=1)
			System.out.println("\nSuccessfully Sorted! \n");
	    	
		}
	    
	    
	    void searchRecord(Scanner sc){
			
	    	sortRecord(2,1);
	    	
	    	System.out.println("Enter first name whose details you want");
			String Fname=sc.next();
			
			int mid;  
			int last=obj.details.length-2;
			int start=0;
		    String name1;
			
		    
		    if(obj.details.length==1) {
		    	if(obj.details[0].getfName().equalsIgnoreCase(Fname) )
		        {  
		        	
		            System.out.println("\nAddress : "+obj.details[0].getResidentialAddress()
		            		+ "\nPhone # "+obj.details[0].getPhoneNumber()+"\n"); 
		            
		        }
		    }
		    
		   else
			while( start<=last )   
		    {     
	 
				mid=(start+last)/2;
				
				//System.out.println(obj.details.length+"   "+mid);
				
		        if(obj.details[mid].getfName().equalsIgnoreCase(Fname) )
		        {  
		        	
		            System.out.println("\nAddress : "+obj.details[mid].getResidentialAddress()
		            		+ "\nPhone # "+obj.details[mid].getPhoneNumber()+"\n"); 
		            start=last+1;
		        }  
		        else {
		        	name1=obj.details[mid].getfName();
		        	name1=name1.toUpperCase();
		        	Fname=Fname.toUpperCase();
		        	int index=0;
		        	while( index < Fname.length())//obj.details[mid].getfName().length())   
		        {  
		            if(name1.charAt(index)<Fname.charAt(index)) {
		            	start=mid+1;
		            	break;
		            }
		            else if(name1.charAt(index)>Fname.charAt(index)) {
		            	last=mid-1;
		            	break;
		            }  // else if closing bracket
		       index+=1;
		            
		       } // inner while closing bracket
		         
		      
		    }  
		     
		} // outer while closeing 
			
	    	
	    	
		}
		
		
	    void recentBirthday(){
			
	    	
	    	int date=java.time.LocalDateTime.now().getDayOfMonth();
	    	String month=java.time.LocalDateTime.now().getMonth().toString();
	    	String monthvalue=java.time.LocalDateTime.now().getMonthValue()+"";
	    	int year=java.time.LocalDateTime.now().getYear(); 
	    
	    	int count=-1;
	    	
	    	System.out.println("1- All birthdays in this month\n"
	    			+ "2- Upcoming birthdays in this month");
	    	while(count<0||count>2) {
				count=sc.nextInt();
			}
	    	
	    	if(count==1) {
	    		count=0;
	    	for( int i=0; i<obj.getLength()-1; i++) {
	    	if( obj.details[i].getMonthofbirth().equalsIgnoreCase(month)|| obj.details[i].getMonthofbirth().equals(monthvalue)) {
	    		System.out.println("Name : "+obj.details[i].getfName()+"\nID : "
	        			+ obj.details[i].getID());
	        			System.out.println("Born on "+obj.details[i].getDateofBirth()+"/"+obj.details[i].getMonthofbirth()+"/"+obj.details[i].getYearofbirth()+"\n");
	        			
	        			
	        			count++;
	    	}
	    }
	    	if(count==0) {
	    		System.out.println("No birthdays in this month\n");
	    	}
	    	else {
	    		System.out.println("Total birthdays in this month : "+ count+"\n");
	    	}
	    	count=0;
	    	}
	    	else if(count==2) {
	    	count=0;
	    	for( int i=0; i<obj.getLength()-1; i++) {
	    		if(obj.details[i]!=null)
	    		if( obj.details[i].getMonthofbirth().equalsIgnoreCase(month)|| obj.details[i].getMonthofbirth().equals(monthvalue) && obj.details[i].getDateofBirth()>date ) {
	    		
	    		
	    			System.out.println("Name : "+obj.details[i].getfName()+"\nID : "
	    			+ obj.details[i].getID());
	    			System.out.println("Born on "+obj.details[i].getDateofBirth()+"/"+obj.details[i].getMonthofbirth()+"/"+obj.details[i].getYearofbirth());
	    			System.out.println( (obj.details[i].getDateofBirth()-date) +" Day/s remaining\n");
	    			
	    			count++;
	    		}
	    		
	    		else if(obj.details[i].getMonthofbirth().equalsIgnoreCase(month)|| obj.details[i].getMonthofbirth().equals(monthvalue) && obj.details[i].getDateofBirth()==date) {
	    			System.out.println("\nToday is the birthday of");
	    			System.out.println("Name : "+obj.details[i].getfName()+"\nID : "
	    	    			+ obj.details[i].getID());
	    	    			System.out.println("Born on "+obj.details[i].getDateofBirth()+"/"+obj.details[i].getMonthofbirth()+"/"+obj.details[i].getYearofbirth());
	    	    			System.out.println(obj.details[i].getfName()+ " is now " + (obj.details[i].getYearofbirth()-year) + " years old");
	    	    			System.out.println(" Send good wishes to "+obj.details[i].getfName());
	    	    			count++;
	    		}
	    		
	    	}
	    	if(count==0) {
	    		System.out.println("No upcoming birthdays in this month\n");
	    	}
	    	else {
	    		System.out.println("Total upcoming birthdays in this month : "+ count+"\n");
	    	}
	    }
	    	
		}
	
	
}
