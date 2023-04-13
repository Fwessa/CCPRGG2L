// Luisa T. Dala
// INF224

import java.util.*;
import java.io.*;

public class BookRental {

    // Number of Copies

    static int book0_Copy = 2; // Book 0 Sytem Analysis and Design, Gary B. Shelly
    static int book1_Copy = 3; // Book 1 Android Application, Corinne Hoisingto
    static int book2_Copy = 4; // Book 2 Programming Concepts and Logic Formulation, Rosauro E. Manuel
	
    // Main
	public static void main(String[] args) {
	    runMethod();
	    
	}
	
    // Runner
	public static void runMethod() {
		
        System.out.println("");
		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		System.out.println("*****************************");
		System.out.println("0 Sytem Analysis and Design, Gary B. Shelly");
		System.out.println("1 Android Application, Corinne Hoisington");
		System.out.println("2 Programming Concepts and Logic Formulation, Rosauro E. Manuel");
		System.out.println("*****************************");
		System.out.println("CHOOSE A NUMBER TO RENT YOUR FAVOURITE BOOK");
		
        // Scanner
		Scanner scan = new Scanner(System.in);  
		int bookNum = scan.nextInt();
		askBook(bookNum); // runs askBook()
		
		
	}
	
	public static void askBook(int bookNum) {
		
        try {

		int x = bookNum;
		String[] books = {"Sytem Analysis and Design, Gary B. Shelly", "Android Application, Corinne Hoisington", "Programming Concepts and Logic Formulation, Rosauro E. Manuel" };
	
				
			
            for (int index = 0; index < books.length; index++) {
                
                // book 0 Sytem Analysis and Design, Gary B. Shelly
                if(books[x].equals("Sytem Analysis and Design, Gary B. Shelly" ) ) {
				
                    if(book0_Copy !=0) {
                            
                        book0_Copy -=1; 
                        System.out.println("You Rented Sytem Analysis and Design, Gary B. Shelly");
                        System.out.println("Rent Again? Y/N");
                        Scanner scan = new Scanner(System.in);  
                        String answer = scan.next();
                        stop_Or_Continue(answer); // runs stop_Or_Continue()
                    }
                    
                    else{
                        System.out.println("");
                        System.out.println("No Copies Available");
                        System.out.println("Rent Again? Y/N");
                        Scanner scan = new Scanner(System.in);  
                        String answer = scan.next();
                        stop_Or_Continue(answer);// runs stop_Or_Continue()
                        
                    }
                    
                    
                // book 1 Android Application, Corinne Hoisington
                    if(books[x].equals("Android Application, Corinne Hoisington")) {
                        
                        if(book1_Copy !=0) {
                            book1_Copy -=1; 
                            System.out.println("");
                            System.out.println("You Rented Sytem Analysis and Design, Gary B. Shelly");
                            System.out.println("Rent Again? Y/N");
                            Scanner scan = new Scanner(System.in);  
                            String answer = scan.next();
                            stop_Or_Continue(answer);// runs stop_Or_Continue()
                        }
                        
                        else{
                        
                            System.out.println("");
                            System.out.println("No Copies Available");
                            System.out.println("Rent Again? Y/N");
                            Scanner scan = new Scanner(System.in);  
                            String answer = scan.next();
                            stop_Or_Continue(answer);// runs stop_Or_Continue()
                            
                        }
                    }

                    // book 2 Programming Concepts and Logic Formulation, Rosauro E. Manuel
                    if(books[x].equals("Programming Concepts and Logic Formulation, Rosauro E. Manuel")) {
                        
                        if(book2_Copy !=0) {
                            book2_Copy -=1; 
                            System.out.println("");
                            System.out.println("You Rented Programming Concepts and Logic Formulation, Rosauro E. Manuel");
                            System.out.println("Rent Again? Y/N");
                            Scanner scan = new Scanner(System.in);  
                            String answer = scan.next();
                            stop_Or_Continue(answer);// runs stop_Or_Continue()
                        }
                        
                        else{
                            System.out.println("");
                            System.out.println("No Copies Available");
                            System.out.println("Rent Again? Y/N");
                            Scanner scan = new Scanner(System.in);  
                            String answer = scan.next();
                            stop_Or_Continue(answer);// runs stop_Or_Continue()
                            
                        }
                    }
                }
            }
        }
                
		// For Error
        catch(ArrayIndexOutOfBoundsException e){
			System.out.println("INDEX DOES NOT EXIST, Try Again!");
		}
		
	}
	
	// Ask User to continue to rent or Stop
	public static void stop_Or_Continue(String answer){
		String a = answer; 
		
		if(a.equals("Y")) {
			runMethod();
		}else {
			System.out.println("System Ended");
            System.exit(0);
		}
			
	}
   
}
