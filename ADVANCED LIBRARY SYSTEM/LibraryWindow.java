// Luisa T. Dala
// INF224


import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;


public class LibraryWindow {
    
    public static void LogIn(ArrayList<Accounts>  admin, ArrayList<Accounts> librarian, ArrayList<Books> books ){

        JFrame logInFrame = new JFrame("Login");
        JLabel wJLabel = new JLabel("LIBRARY MANAGEMENT");
        JLabel uJLabel = new JLabel("Username: ");
        JLabel pJLabel = new JLabel("Password: ");
        JTextField usernamTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JPanel panel = new JPanel();
        JFrame f = new JFrame();
        JPanel backPanel = new JPanel();
        
        //LABELS
        wJLabel.setFont(new Font("Times New Roman" ,Font.BOLD, 20));
        wJLabel.setBounds(130, 40, 250, 30);

        uJLabel.setFont(new Font("Roboto" ,Font.BOLD, 14));
        uJLabel.setBounds(50, 140, 250, 30);

        pJLabel.setFont(new Font("Roboto" ,Font.BOLD, 14));
        pJLabel.setBounds(53, 163, 250, 30);
        backPanel.setBounds(30, 95, 430, 135);
        backPanel.setBackground(null);
        backPanel.setBorder(BorderFactory.createLineBorder(new Color(0x808080), 1));

        JLabel login = new JLabel("Login Complete");
        login.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel welcome = new JLabel("Welcome to NU Library System");
        welcome.setHorizontalAlignment(JLabel.CENTER);
        
        
        //Textbox and PasswordField

        usernamTextField.setBounds(130, 147, 250, 20);
        passwordField.setBounds(130, 170, 250, 20);
        

        //Jcombobox
        String[] options = {"ADMIN","LIBRARIAN"};
        JComboBox<String> LoginSelection = new JComboBox<>(options);
        LoginSelection.setPreferredSize(new Dimension(250, 20));
        ((JLabel)LoginSelection.getRenderer()).setHorizontalAlignment(JLabel.CENTER);
        LoginSelection.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(LoginSelection);
        panel.setBounds(130, 110, 250, 30);
        

        JButton button1 = new JButton("Confirm");
        button1.setBounds(185, 200, 150, 20);
        button1.setFocusable(false);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                try{
                
                String selectedItem = (String) LoginSelection.getSelectedItem();
                String u_Input = usernamTextField.getText();
                String p_Input = new String(passwordField.getPassword());

                if(selectedItem.equals("ADMIN")){
                    
                    for (int i = 0; i < admin.size(); i++) {

                        String username = admin.get(i).getUsername();
                        String password = admin.get(i).getPassword();

                        if(u_Input.matches(username) && p_Input.matches(password)){
                            JOptionPane.showMessageDialog(f, login,"Login Successfully!",JOptionPane.PLAIN_MESSAGE);
                            logInFrame.dispose();
                            userAdmin();
                            break;
                        }else if(u_Input.matches("") && p_Input.matches("")){
                            JOptionPane.showMessageDialog(null, "Error: Invalid Username and Password!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else if(u_Input.matches(username) && !p_Input.matches(password)){
                            JOptionPane.showMessageDialog(null, "Error: Invalid Password!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else if(!u_Input.matches(password) && p_Input.matches(password)){
                            JOptionPane.showMessageDialog(null, "Error: Invalid Username!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "Error: Invalid Username and Password!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }


                else if(selectedItem.equals("LIBRARIAN")){
                
                    for (int i = 0; i < admin.size(); i++) {

                        String username = librarian.get(i).getUsername();
                        String password = librarian.get(i).getPassword();

                        if(u_Input.matches(username) && p_Input.matches(password)){
                            JOptionPane.showMessageDialog(f, login,"Login Successfully!",JOptionPane.PLAIN_MESSAGE);
                            JOptionPane.showMessageDialog(f, welcome ,"Login Successfully!",JOptionPane.PLAIN_MESSAGE);
                            logInFrame.dispose();
                            UserLibrary(admin, librarian, books);
                            break;

                        }else if(u_Input.matches("") && p_Input.matches("")){
                            JOptionPane.showMessageDialog(null, "Error: Invalid Username and Password!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else if(u_Input.matches(username) && !p_Input.matches(password)){
                            JOptionPane.showMessageDialog(null, "Error: Invalid Password!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else if(!u_Input.matches(password) && p_Input.matches(password)){
                            JOptionPane.showMessageDialog(null, "Error: Invalid Username!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "Error: Invalid Username and Password!", "Invalid", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        
                    }
            
                }

                }  catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "System Error!", "Error!", JOptionPane.ERROR_MESSAGE);
                    System.out.println(ex.getMessage());

                }
         


            }


        });


        logInFrame.setBounds(0, 0, 500, 300);

        logInFrame.add(wJLabel);
        logInFrame.add(uJLabel);
        logInFrame.add(pJLabel);
        logInFrame.add(panel);
        logInFrame.add(usernamTextField);
        logInFrame.add(passwordField);
        logInFrame.add(button1);
        logInFrame.add(backPanel);

        logInFrame.setLayout(null);
        logInFrame.setLocationRelativeTo(null);
        logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logInFrame.setVisible(true);

    }


    public static void UserLibrary(ArrayList<Accounts>  admin, ArrayList<Accounts> librarian, ArrayList<Books>  books){
        
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        JPanel panel = new JPanel();
        JFrame f = new JFrame("Library");
        JLabel wJLabel = new JLabel("Welcome to NU Library System");
        JLabel pJLabel = new JLabel("Please select the desired book to rent");
        JLabel bJLabel = new JLabel("Book: ");
        JPanel background = new JPanel();
        JTextField selectedBook = new JTextField("Enter Book Number");

        // ---------------------------Lables---------------------------------

        wJLabel.setFont(new Font("Times New Roman" ,Font.BOLD, 25));
        wJLabel.setBounds(190, 30, 400, 30);


        pJLabel.setFont(new Font("Roboto" ,Font.PLAIN, 12));
        pJLabel.setForeground(new Color(0x0000CD));
        pJLabel.setBounds(262, 70, 300, 30);

        bJLabel.setFont(new Font("Roboto" ,Font.BOLD, 12));
        bJLabel.setBounds(150, 169, 250, 30);

        selectedBook.setFont(new Font("Roboto" ,Font.BOLD, 11));
        selectedBook.setBounds(187, 175, 250, 20);

        background.setBounds(30, 65, 627, 140);
        background.setBackground(null);
        background.setBorder(BorderFactory.createLineBorder(new Color(0x808080), 1));

        
        f.add(wJLabel);
        f.add(pJLabel);
        f.add(bJLabel);
        f.add(selectedBook);
        
        // ---------------------------Table Layouts--------------------------
        
        // Table Columns
        model.addColumn("Book Number");
        model.addColumn("Copies");
        model.addColumn("Book Titles");
        model.addColumn("Authors");
        model.addRow(new Object[]{"Book Number","Copies", "Book Titles","Authors"});
        
        // add to table
        for (Books obj : books) {
            model.addRow(new Object[]{obj.getBookNumber(),obj.getCopies(), obj.getTitle(), obj.getAuthor()});
        }
        // Set the model for the JTable
        table.setModel(model);
        // set the column width for each column
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(270);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        table.setLayout(null);
        table.setBounds(0, 0, 700, 400);
        panel.setBounds(40, 95, 600, 100); 
        panel.add(table);


        // -------------------------- Buttons ------------------------------

        JButton confirm_B = new JButton("Confirm");    // onced confirmed the gui will reset to show the new data
        confirm_B.setBounds(445, 175, 100, 20);
        confirm_B.setFocusable(false);
        confirm_B .addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{


                    String s = selectedBook.getText();
                    int selected = Integer.parseInt(s);
                    int inventory = 0;

                    for (int index = 0; index < books.size(); index++) {
                        inventory = inventory + books.get(index).getCopies();   
                    }

                
                    if(inventory > 0 ){
                    
                       for (int i = 0; i < books.size(); i++) {
                        int copies = books.get(selected).getCopies();
                        
                            if (books.get(selected).getCopies() > 0) {
                                copies -= 1;
                                books.get(selected).setCopies(copies);
                                JOptionPane.showMessageDialog(null, "Book rented successfully!"+"\nYou Rented: " + books.get(selected).getTitle(), "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                                selected = selected +1;
                                model.setValueAt(copies, selected, 1);
                                break;

                            } else {
                                JOptionPane.showMessageDialog(null, "No more book to rent!", "Information", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }
    
                    }else if(inventory == 0){
                        JOptionPane.showMessageDialog(null,"No more books to rent!",  "System is Shuting Down!", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }

                }

                    catch(ArrayIndexOutOfBoundsException ex){
                        JOptionPane.showMessageDialog(null, "Invalid input!", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                    catch(InputMismatchException ex){
                        JOptionPane.showMessageDialog(null, "Invalid input!", "Error!", JOptionPane.ERROR_MESSAGE);

                    }
                    catch(IndexOutOfBoundsException ex){
                        JOptionPane.showMessageDialog(null, "Invalid input!", "Error!", JOptionPane.ERROR_MESSAGE);

        
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Invalid input!", "Error!", JOptionPane.ERROR_MESSAGE);

        
                }

            }
        });
    
        f.add(confirm_B);
        f.add(panel);
        f.add(background);
        f.setBounds(0, 0, 700, 300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

    public static void userAdmin(){
        
        JFrame f = new JFrame();
        JLabel nJLabel = new JLabel("We're still working on this program.");

        nJLabel.setFont(new Font("Roboto" ,Font.PLAIN, 12));
        nJLabel.setForeground(new Color(0x0000CD));
        nJLabel.setBounds(20, 70, 400, 30);

        f.add(nJLabel);
        f.setBounds(0, 0, 500, 300);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
