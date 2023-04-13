// Luisa T. Dala
// INF224

import java.util.*;

public class BookRental {
    public static void main(String[] args) {

        // Book Selection and Copies
        int[] selected = {0, 1, 2};
        int book0 = 2; // Book 0 Sytem Analysis and Design, Gary B. Shelly
        int book1 = 3; // Book 1 Android Application, Corinne Hoisington
        int book2 = 4; // Book 2 Programming Concepts and Logic Formulation, Rosauro E. Manuel

        while (true) {
            System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
            System.out.println("*****************************");
            System.out.println("0 Sytem Analysis and Design, Gary B. Shelly");
            System.out.println("1 Android Application, Corinne Hoisington");
            System.out.println("2 Programming Concepts and Logic Formulation, Rosauro E. Manuel");
            System.out.println("*****************************");
            System.out.println("CHOOSE A NUMBER TO RENT YOUR FAVOURITE BOOK");

            Scanner scan = new Scanner(System.in);
            int book = scan.nextInt();

            try {
                String[] booksSelection = {"System Analysis and Design, Gary B. Shelly", "Android Application, Corinne Hoisington", "Programming Concepts and Logic Formulation, Rosauro E. Manuel"};
                Boolean rentedSuccessfully = false;

                // Match and Select Books to rent
                if (book >= 0 && book <= selected.length) {
                    int bookIndex = book;

                    if (selected[bookIndex] >= 0 && selected[bookIndex] <= 2 ) {

                        // Rent the book and update selected array and copies
                        selected[bookIndex]--; 
                        if (bookIndex == 0) {
                            book0--;
                            if (book0 <= 0) {
                                System.out.println("No copies available");
                            }else{
                                rentedSuccessfully = true;
                            }
                        } else if (bookIndex == 1) {
                            book1--;
                            if (book1 <= 0) {
                                System.out.println("No copies available");
                            }else{
                                rentedSuccessfully = true;
                            }
                        } else if (bookIndex == 2) {
                            book2--;
                            if (book2 <= 0) {
                                System.out.println("No copies available");
                            }else{
                                rentedSuccessfully = true;
                            }
                        }
                       
                    }
                    if (rentedSuccessfully) {
                        System.out.println("You Rented " + booksSelection[bookIndex]);
                    }
                } else{
                    System.out.println("INDEX DOES NOT EXIST, Try Again!");
                    System.exit(0);
                }
            
                // Check if the user wants to proceed renting or to stop
                System.out.println("Rent Again? Y/N");
                Scanner scan1 = new Scanner(System.in);
                String answer = scan1.next();
                stop_Or_Continue(answer);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("INDEX DOES NOT EXIST, Try Again!");
                System.exit(0);
            }
        }
    }

    // to stop the program
    public static void stop_Or_Continue(String answer) {
        String a = answer;

        if (a.equalsIgnoreCase("Y")) {
            
        } else {
            System.out.println("System Ended");
            System.exit(0);
        }
    }
}
