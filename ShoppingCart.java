package Store;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart   
    {  
        public static void main(String args[])   
            {  
                // declare variables  
                String id = null;  
                String productName = null;  
                int quantity = 0;  
                double price = 0.0;  
                double totalPrice = 0.0;  
                double overAllPrice = 0.0;  
                double cgst, sgst, subtotal=0.0, discount=0.0;  
                char choice = '\0';  
                //format of date and time  
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
                Date date = new Date();    
                Calendar calendar = Calendar.getInstance();  
                String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };  
                //print current date and time  
                System.out.println("Date: "+formatter.format(date)+"  "+days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);  
                // create Scanner class object
                Scanner scan = new Scanner(System.in);  
                System.out.print("Enter Customer Name: ");  
                String customername=scan.nextLine();  
                //create an ArrayList to store the product  
                List<Product> product = new ArrayList<Product>();  
                do   
                    {  
                        // set to read input values  
                        System.out.println("Enter the product details: ");  
                        System.out.print("Product Name: ");  
                        productName = scan.nextLine();
                        System.out.print("Description: ");
                        id = scan.nextLine();
                        System.out.print("Quantity: ");  
                        quantity = scan.nextInt();  
                        System.out.print("Price (per unit): ");  
                        price = scan.nextDouble();  
                        //calculate total price for a particular product  
                        totalPrice = price * quantity;  
                        //calculate the overall price  
                        overAllPrice = overAllPrice + totalPrice;  
                        //create Product class object and add it to the List  
                        product.add( new Product(id, productName, quantity, price, totalPrice) );  
                        // ask whether to continue shopping
                        System.out.print("Want to add more items? (y or n): ");  
                        //read a character Y or N  
                        choice = scan.next().charAt(0);  
                        //read remaining characters, don't store (no use)  
                        scan.nextLine();  
                    }   
                while (choice == 'y' || choice == 'Y');  
                //display all products with its properties    
                for (Product p : product)   
                {  
                    p.display();  
                }  
                // calculate price 
                System.out.println("Total Amount (Rs.) " +overAllPrice);  
                //calculate with discount added or counted
                discount = overAllPrice*2/100;  
                System.out.println("Discount (Rs.) " +discount);  
                // display the total amount after discount  
                subtotal = overAllPrice-discount;   
                System.out.println("Subtotal "+subtotal);  
                //calculate tax  
                sgst=overAllPrice*12/100;  
                System.out.println("SGST (%) "+sgst);  
                cgst=overAllPrice*12/100;  
                System.out.println("CGST (%) "+cgst);  
                //calculate the final amount to be paid by buyer  
                System.out.println("Total " +(subtotal+cgst+sgst));  
                System.out.println("Thank You for Shopping!!");  
                System.out.println("Visit Again!");  
                // close Scanner  
                scan.close();  
            }     
    }  