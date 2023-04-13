
// Luisa T. Dala
// INF224

import java.util.*;
import java.io.*;

public class BookRental {

    // Book Titles
    static String[] bookTitles = {
        "System Analysis and Design, Gary B. Shelly",
        "Android Application, Corinne Hoisington",
        "Programming Concepts and Logic Formulation, Rosauro E. Manuel",
    };

    static int[] bookCopies = {2, 3, 4}; // Books Number of Coppies

    public static void main(String[] args) {
        runMethod();
    }

    // Runner
	public static void runMethod() {
        int inventory = 0;
        
        // books counter
        for(int i: bookCopies){
            inventory +=i;
        }

        // if there's no more books left
        if(inventory <= 0){
            System.out.println("");
            System.out.println("No more books to rent!");
            System.exit(0);
        }

        System.out.println("");
		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		System.out.println("*****************************");
		System.out.println("0 Sytem Analysis and Design, Gary B. Shelly");
		System.out.println("1 Android Application, Corinne Hoisington");
		System.out.println("2 Programming Concepts and Logic Formulation, Rosauro E. Manuel");
		System.out.println("*****************************");
		System.out.println("CHOOSE A NUMBER TO RENT YOUR FAVOURITE BOOK");

        // Scanner
        // Ask the user to picked a book
		Scanner scan = new Scanner(System.in);  
		int selectedBook = scan.nextInt();
		askBook(selectedBook ); // runs askBook()


	}

    public static void askBook(int selectedBook ) {
        try {
            // get the selected book from the arrays
            int copies = bookCopies[selectedBook ];
            String bookTitle = bookTitles[selectedBook ];

            // checks if theres a copies left
            if (copies > 0) {
                bookCopies[selectedBook ] = copies - 1;
                System.out.println("You Rented " + bookTitle);
            } else {
                System.out.println("No Copies Available");
            }

            // Check if the user wants to rent again
            System.out.println("Rent Again? Y/N");
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
            stopOrContinue(answer);

            // For error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INDEX DOES NOT EXIST, Try Again!");
            System.exit(0);
        }
    }

            //Stopper
    public static void stopOrContinue(String answer) {
        if (answer.equalsIgnoreCase("Y")) {
            runMethod();
        } else {
            System.out.println("System Ended");
            System.exit(0);
        }

    }
}
