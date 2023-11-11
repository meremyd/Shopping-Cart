import java.util.Stack;       
import java.util.Scanner;     

public class Main {          
    public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in); 
        Stack<String> cart = new Stack<>(); 
        
            System.out.println("WELCOME TO MERRY MART!!!");
        while (true) {
            System.out.println("Shopping Cart Menu:"); 
            System.out.println("1. Add to cart");
            System.out.println("2. Update cart");
            System.out.println("3. Delete item");
            System.out.println("4. View");
            System.out.println("5. Search");
            System.out.println("6. Quit");
            System.out.print("Enter your choice (1-6): "); 
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt(); 
                scanner.nextLine(); 

                switch (choice) { 
                    case 1:
                        System.out.println("Enter the item you want to add: "); 
                        String newItem = scanner.nextLine(); 
                        cart.push(newItem); 
                        System.out.println(newItem + " added to the cart."); 
                        break;

                    case 2:
                        if (!cart.isEmpty()) { 
                            System.out.println("Items in the cart:"); 
                            for (String item : cart) {
                                System.out.println(item); 
                            }
                            System.out.print("Enter the item to update in the cart: "); 
                            String itemToUpdate = scanner.nextLine(); 
                            if (cart.contains(itemToUpdate)) { 
                                cart.remove(itemToUpdate); 
                                System.out.print("Enter the new item to replace it: "); 
                                String updatedItem = scanner.nextLine(); 
                                cart.push(updatedItem);
                                    System.out.println("Updated items in the cart:");
import java.util.Stack;       
import java.util.Scanner;     

public class Main {          
    public static void main(String[] args) {  

        Scanner scanner = new Scanner(System.in); 
        Stack<String> cart = new Stack<>(); 
        
            System.out.println("WELCOME TO MERRY MART!!!");
        while (true) {
            System.out.println("Shopping Cart Menu:"); 
            System.out.println("1. Add to cart");
            System.out.println("2. Update cart");
            System.out.println("3. Delete item");
            System.out.println("4. View");
            System.out.println("5. Search");
            System.out.println("6. Quit");
            System.out.print("Enter your choice (1-6): "); 
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt(); 
                scanner.nextLine(); 

                switch (choice) { 
                    case 1:
                        System.out.println("Enter the item you want to add: "); 
                        String newItem = scanner.nextLine(); 
                        cart.push(newItem); 
                        System.out.println(newItem + " added to the cart."); 
                        break;

                    case 2:
                        if (!cart.isEmpty()) { 
                            System.out.println("Items in the cart:"); 
                            for (String item : cart) {
                                System.out.println(item); 
                            }
                            System.out.print("Enter the item to update in the cart: "); 
                            String itemToUpdate = scanner.nextLine(); 
                            if (cart.contains(itemToUpdate)) { 
                                cart.remove(itemToUpdate); 
                                System.out.print("Enter the new item to replace it: "); 
                                String updatedItem = scanner.nextLine(); 
                                cart.push(updatedItem);
                                    System.out.println("Updated items in the cart:");
                                     for (String item : cart) {
                                      System.out.println(item);
                                     }
                                System.out.println("Cart updated."); 
                            } else {
                                System.out.println(itemToUpdate + " is not in the cart."); 
                            }
                        } else {
                            System.out.println("Cart is empty."); 
                        }
                        break;

                    case 3:
                        if (!cart.isEmpty()) { 
                            System.out.println("Items in the cart:"); 
                            for (String item : cart) {
                                System.out.println(item); 
                            }
                            System.out.print("Enter the item to remove from the cart: "); 
                            String itemToRemove = scanner.nextLine(); 
                            if (cart.remove(itemToRemove)) { 
                                System.out.println(itemToRemove + " removed from the cart."); 
                                 System.out.println("Updated items in the cart:"); 
                                     for (String item : cart) {
                                      System.out.println(item);
                                     }
                            } else {
                                System.out.println(itemToRemove + " is not in the cart."); 
                            }
                        } else {
                            System.out.println("The cart is empty."); 
                        }
                        break;

                    case 4:
                        if (!cart.isEmpty()) { 
                            System.out.println("Items in the cart:"); 
                            for (String item : cart) {
                                System.out.println(item); 
                            }
                        } else {
                            System.out.println("Cart is empty."); 
                        }
                        break;

                    case 5:
                        System.out.print("Enter the item to search in the cart: "); 
                        String itemToSearch = scanner.nextLine().toLowerCase(); 
                        boolean found = false;
                        for (String item : cart) {
                            if (item.toLowerCase().contains(itemToSearch)) { 
                                System.out.println(item + " is in the cart."); 
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println(itemToSearch + " is not in the cart."); 
                        }
                        break;

                    case 6:
                        System.out.println("Have a great day! Thank you for shopping!");
                        scanner.close(); 
                        System.exit(0); 
                        break;

                    default:
                        System.out.println("Invalid choice. Please choose a valid option (1-6)."); 
                        break;
                    
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number (1-6)."); 
                scanner.nextLine(); 
            }
        }
    }
}
￼Enter                                     for (String item : cart) {
                                      System.out.println(item);
                                     }
                                System.out.println("Cart updated."); 
                            } else {
                                System.out.println(itemToUpdate + " is not in the cart."); 
                            }
                        } else {
                            System.out.println("Cart is empty."); 
                        }
                        break;

                    case 3:
                        if (!cart.isEmpty()) { 
                            System.out.println("Items in the cart:"); 
                            for (String item : cart) {
                                System.out.println(item); 
                            }
                            System.out.print("Enter the item to remove from the cart: "); 
                            String itemToRemove = scanner.nextLine(); 
                            if (cart.remove(itemToRemove)) { 
                                System.out.println(itemToRemove + " removed from the cart."); 
                                 System.out.println("Updated items in the cart:"); 
                                     for (String item : cart) {
                                      System.out.println(item);
                                     }
                      } else {
                                System.out.println(itemToRemove + " is not in the cart."); 
                            }
                        } else {
                            System.out.println("The cart is empty."); 
                        }
                        break;

                    case 4:
                        if (!cart.isEmpty()) { 
                            System.out.println("Items in the cart:"); 
                            for (String item : cart) {
                                System.out.println(item); 
                            }
                        } else {
                            System.out.println("Cart is empty."); 
                        }
                        break;

                    case 5:
                        System.out.print("Enter the item to search in the cart: "); 
                        String itemToSearch = scanner.nextLine().toLowerCase(); 
                        boolean found = false;
                        for (String item : cart) {
                            if (item.toLowerCase().contains(itemToSearch)) { 
                                System.out.println(item + " is in the cart."); 
