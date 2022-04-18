import java.util.Scanner;
public class main {
	public static void main (String[]  args) {
		Scanner scnr = new Scanner (System.in);
		
		
		
		String Phrase1 = "yes";
		String Phrase2 = "no";
		String OrderName = null;
		String Answer;
		String FoodOrder = "";
		String FoodOrder2 = "";
		String FoodOrder3 = "";
		
		
		
		    System.out.println("Welcome to the food festival!");
			System.out.println("Would you like to place an order?");			
			Answer = scnr.nextLine();
			
			while(Answer != null) {
				
				if (Answer.equalsIgnoreCase(Phrase2)){
					System.out.println("Thank you for stopping by, maybe next time you'll sample our menu.");
					break; 
				}
				else if (Answer.equalsIgnoreCase(Phrase1)){
				System.out.println("What is the name of your order?");   
				OrderName = scnr.nextLine();
				
				break;
			}
			 System.out.println("Would you like to place an order?");
			 Answer = scnr.nextLine();
			
			}
			
			while (Answer.equalsIgnoreCase(Phrase1)) {
				 
				int choice;
				System.out.println("Select from menu," + OrderName);
				System.out.println("     0 - Nothing" + "\n     1 - Appetizer" + "\n     2 - Main Course" + "\n     3 - Dessert");
				System.out.println("Enter the number of your selection: ");
				choice = scnr.nextInt();
	               
					if(choice == 1) {
						System.out.println("Appetizer Menu:");
						System.out.println("     0 - Nothing");
				        System.out.println("     1 - Buffalo Wings");
				        System.out.println("     2 - Onion Rings");
				        System.out.println("     3 - Bread Sticks");
				        System.out.println("Enter the number of your appetizer section");
				        choice = scnr.nextInt();
				        
				        while (Answer.equalsIgnoreCase(Phrase1)) {
				        
				        	if (choice == 1) {
								FoodOrder = FoodOrder + " Buffalo Wings:";
								while(Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0-Nothing");
						            System.out.println("   1-BBQ Sauce");
						            System.out.println("   2-Ketchup");
						            System.out.println("   3-Blue Cheese Sauce");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						           
						           
									
						            if (choice == 1) {
						            	FoodOrder = FoodOrder + " BBQ Sauce";
						            }
						            else if(choice == 2){
						            	FoodOrder = FoodOrder + ", Ketchup";
						            }
						            else if (choice == 3) {
						            	FoodOrder = FoodOrder + ", Blue Cheese Sauce";
						            }
						            else {
						            	break;
						            }
							}
							
						}
							else if(choice == 2){
								FoodOrder = FoodOrder + " Onion Rings:";
								while(Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0-Nothing");
						            System.out.println("   1-BBQ Sauce");
						            System.out.println("   2-Ketchup");
						            System.out.println("   3-Blue Cheese Sauce");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						           
						             if (choice == 1) {
						            	FoodOrder = FoodOrder + " BBQ Sauce";
						            }
						            else if(choice == 2){
						            	FoodOrder = FoodOrder + ", Ketchup";
						            }
						            else if (choice == 3) {
						            	FoodOrder = FoodOrder + ", Blue Cheese Sauce";
						            }
						            else {
						            	break;
						            }
								}
							
							}
							else if(choice == 3) {
								FoodOrder = FoodOrder + " Bread Sticks:";
								while(Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0-Nothing");
						            System.out.println("   1-BBQ Sauce");
						            System.out.println("   2-Ketchup");
						            System.out.println("   3-Blue Cheese Sauce");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						            
						            if (choice == 1) {
						            	FoodOrder = FoodOrder + " BBQ Sauce";
						            }
						            else if(choice == 2){
						            	FoodOrder = FoodOrder + ", Ketchup";
						            }
						            else if (choice == 3) {
						            	FoodOrder = FoodOrder + ", Blue Cheese Sauce";
						            }
						            else {
						            	break;
						            }
								}
								
							}
							else {
								break;
							}
							
							
						}
						
					} 
					else if(choice == 2){
						System.out.println("Main Course Menu");
						System.out.println("     0 - Nothing");
				        System.out.println("     1 - Lasagna");
				        System.out.println("     2 - Shrimp Alfredo");
				        System.out.println("     3 - Beef Wellington");
				        System.out.println("Enter the number for your main section:");
						choice = scnr.nextInt();
						
						while(Answer.equalsIgnoreCase(Phrase1)) {	
							if (choice == 1) {
								FoodOrder2 = FoodOrder2 + " Lasagna:";
								while(Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0 - Nothing");
						            System.out.println("   1 - Hot Sauce");
						            System.out.println("   2 - Salt");
						            System.out.println("   3 - Pepper");
						            System.out.println("Enter the number for your toppings selection:");
						            choice = scnr.nextInt();
						           
						           
									
						            if (choice == 1) {
						            	FoodOrder2 = FoodOrder2 + " Hot Sauce";
						            }
						            else if(choice == 2){
						            	FoodOrder2 = FoodOrder2 + ", Salt";
						            }
						            else if (choice == 3) {
						            	FoodOrder2 = FoodOrder2 + ", Pepper";
						            }
						            else {
						            	break;
						            }
							}
							
						}
							else if(choice == 2){
								FoodOrder2 = FoodOrder2 + " Shrimp Alfredo:";
								while(Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0 - Nothing");
						            System.out.println("   1 - Hot Sauce");
						            System.out.println("   2 - Salt");
						            System.out.println("   3 - Pepper");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						            
						           
						             if (choice == 1) {
						            	FoodOrder2 = FoodOrder2 + " Hot Sauce";
						            }
						            else if(choice == 2){
						            	FoodOrder2 = FoodOrder2 + ", Salt";
						            }
						            else if (choice == 3) {
						            	FoodOrder2 = FoodOrder2 + ", Pepper";
						            }
						            else {
						            	break;
						            }
								}
							
							}
							else if(choice == 3) {
								FoodOrder2 = FoodOrder2 + " Beef Wellington:";
								while(Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0 - Nothing");
						            System.out.println("   1 - Hot Sauce");
						            System.out.println("   2 - Salt");
						            System.out.println("   3 - Pepper");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						            
						            if (choice == 1) {
						            	FoodOrder2 = FoodOrder2 + " Hot Sauce";
						            }
						            else if(choice == 2){
						            	FoodOrder2 = FoodOrder2 + ", Salt";
						            }
						            else if (choice == 3) {
						            	FoodOrder2 = FoodOrder2 + ", Pepper";
						            }
						            else {
						            	break;
						            }
								}
								
							}
							else {
								break;
							}
							
							
						}
						
					} 
					else if(choice == 3) {
						   System.out.println("Dessert Menu");
	                       System.out.println("   0-Nothing");
	                       System.out.println("   1 - Ice Cream Sundea");
	                       System.out.println("   2 - Apple Pie");
	                       System.out.println("   3 - Brownie Deluxe");
	                       System.out.println("Enter the number for your dessert selection");
	                       choice = scnr.nextInt();
						while (Answer.equalsIgnoreCase(Phrase1)) {
							
							if (choice == 1) {
								FoodOrder3 = FoodOrder3 + " Ice Cream Sundea:";
								while (Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0 - Nothing");
						            System.out.println("   1 - Chocolate Sprinkles");
						            System.out.println("   2 - Chocolate Sauce");
						            System.out.println("   3 - Oreo Bits");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						            
						           
						             if (choice == 1) {
						            	FoodOrder3 = FoodOrder3 + " Chocolate Sprinkles";
						            }
						            else if(choice == 2){
						            	FoodOrder3 = FoodOrder3 + ", Chocolate Sauce";
						            }
						            else if (choice == 3) {
						            	FoodOrder3 = FoodOrder3 + ", Oreo Bits";
						            }
						            else {
						            	break;
						            }
								}
							}
							else if (choice == 2) {
								FoodOrder3 = FoodOrder3 + " Apple Pie:";
								while (Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0 - Nothing");
						            System.out.println("   1 - Chocolate Sprinkles");
						            System.out.println("   2 - Chocolate Sauce");
						            System.out.println("   3 - Oreo Bits");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						            
						             if (choice == 1) {
						            	FoodOrder3 = FoodOrder3 + " Chocolate Sprinkles";
						            }
						            else if(choice == 2){
						            	FoodOrder3 = FoodOrder3 + ", Chocolate Sauce";
						            }
						            else if (choice == 3) {
						            	FoodOrder3 = FoodOrder3 + ", Oreo Bits";
						            }
								else {
									break;
								}
							}
						}
				
							else if (choice == 3) {
								FoodOrder3 = FoodOrder3 + " Brownie Deluxe:";
								while (Answer.equalsIgnoreCase(Phrase1)) {
									System.out.println("Toppings Menu: ");
						            System.out.println("   0 - Nothing");
						            System.out.println("   1 - Chocolate Sprinkles");
						            System.out.println("   2 - Chocolate Sauce");
						            System.out.println("   3 - Oreo Bits");
						            System.out.println("Enter the number for your Toppings selection");
						            choice = scnr.nextInt();
						            
						             if (choice == 1) {
						            	FoodOrder3 = FoodOrder3 + " Chocolate Sprinkles";
						            }
						            else if(choice == 2){
						            	FoodOrder3 = FoodOrder3 + ", Chocolate Sauce";
						            }
						            else if (choice == 3) {
						            	FoodOrder3 = FoodOrder3 + ", Oreo Bits";
						            }
						            else {
						            	break;
						            }
							} 
					        
						}
							else {
								break;
							}
				}

						
			}
					else {
						System.out.println("Here is your order, " + OrderName);
						System.out.println("Ordered Items:" + "\n" + "[" + "Appetizer:" + FoodOrder.replaceAll(", $","") + "]" +  "\n" + "["+ "Main Course:" +  FoodOrder2  + "]"  + "\n" + "[" + "Dessert:" + FoodOrder3 + "] ");
						System.out.println("Enjoy your meal.");
						break;
					}
					
        }
			scnr.close();	
	  } 
	
	}