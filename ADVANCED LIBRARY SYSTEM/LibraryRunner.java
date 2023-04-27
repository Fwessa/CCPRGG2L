// Luisa T. Dala
// INF224

import java.util.*;



public class LibraryRunner {

    
	public static void main(String[] args) {
	
    //----------------------------Books---------------------------------

    ArrayList<Books> books = new ArrayList<Books>();

    Books book_1 = new Books("0","System Analysis and Design","Gary B. Shelly",2);
    Books book_2 = new Books("1","Android Application","Corinne Hoisington",3);
    Books book_3 = new Books("2","Programming Concepts and Logic Formulation","Rosauro E. Manuel",4);

    books.add(book_1);
    books.add(book_2);
    books.add(book_3);
    
    
    //---------------------------Accounts-------------------------------

    ArrayList<Accounts> adminAccounts = new ArrayList<Accounts>();
    ArrayList<Accounts> librarianAccounts = new ArrayList<Accounts>();

    // admins
    Accounts admin_1 = new Accounts("Admin_01","AdminOne");
    Accounts admin_2 = new Accounts("Admin_02","AdminTwo");
    Accounts admin_3 = new Accounts("Admin_03","AdminThree");

    adminAccounts.add(admin_1);
    adminAccounts.add(admin_2);
    adminAccounts.add(admin_3);

    // librarians
    Accounts librarian_1 = new Accounts("Librarian_01","LibOne");
    Accounts librarian_2 = new Accounts("Librarian_02","LibTwo");
    Accounts librarian_3 = new Accounts("Librarian_03","LibThree");
    
    librarianAccounts.add(librarian_1);
    librarianAccounts.add(librarian_2);
    librarianAccounts.add(librarian_3);
    
    LibraryWindow.LogIn(adminAccounts, librarianAccounts,books);


    }

}
