//Luisa T. Dala
//INF224

import java.util.*;


public class BookRentalMain {

	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		
		Book book_1 = new Book();
		
		book_1.setName("System Analysis and Design");
		book_1.setAuthor("Gary B. Shelly");
		book_1.setCopies(2);
		
		
		Book book_2 = new Book();
		
		book_2.setName("Android Application");
		book_2.setAuthor("Corinne Hoisington");
		book_2.setCopies(3);
	
		Book book_3 = new Book();
		
		book_3.setName("Programming Concepts and Logic Formulation");
		book_3.setAuthor("Rosauro E. Manuel");
		book_3.setCopies(4);
	
		books.add(book_1);
		books.add(book_2);
		books.add(book_3);
		
		// ***********************************************************


		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		System.out.println("*****************************");
		
		for(int x = 0; x<books.size(); x++){
			System.out.println(x + " - "+ books.get(x).getName()+ ", "+ books.get(x).getAuthor());
        }

        System.out.println("*****************************");
        System.out.println("CHOOSE A NUMBER TO RENT YOUR FAVOURITE BOOK");

        boolean stop = false;

        while(!stop){

            try{
            
                Scanner scan = new Scanner(System.in);  
                int selectedBook = scan.nextInt();
                
                   for (int i = 0; i < books.size(); i++) {
                    int copies = books.get(selectedBook).getCopies();
                    
                        if (books.get(selectedBook).getCopies() > 0) {
                            copies -= 1;
                            books.get(selectedBook).setCopies(copies);
                            System.out.println("");
                            System.out.println("Book Rented Succesfully");
                            System.out.println("You Rented " + books.get(selectedBook).getName());
                            break;
                        } else {
                            System.out.println("");
                            System.out.println("No Copies Available");
                            break;
                        }
                    }

                }
                catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("INVALID INPUT");
    
                }
                catch(InputMismatchException ex){
                    System.out.println("INVALID INPUT");
    
                }
                catch(IndexOutOfBoundsException ex){
                    System.out.println("INVALID INPUT");
    
                }

                System.out.println("Rent Again? Y/N");
                Scanner scan1 = new Scanner(System.in);
                String answer = scan1.next();
                   

                if(answer.equalsIgnoreCase("N")){
                    stop = true;
                }else{
                    System.out.println("CHOOSE A NUMBER TO RENT YOUR FAVOURITE BOOK");
                }

                int inventory = 0;
        
                // books counter
                for(int x = 0; x<books.size(); x++){
                    inventory = inventory + books.get(x).getCopies();
                }
        
                // if there's no more books left
                if(inventory <= 0){
                    System.out.println("");
                    System.out.println("No more books to rent!");
                    stop = true;
                }
         
        }
        System.out.println("PROGRAM ENDS");
	}
}
