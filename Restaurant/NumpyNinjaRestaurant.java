package Restaurant;

import java.util.Scanner;



public class NumpyNinjaRestaurant {
	
	static double  itemprice;
	static double runningTotal;
	static boolean ordering = true;
	
	static Scanner scanner  = new Scanner(System.in); 

        public static void select() {
                int n = 1;
               // String S="";

                //Scanner scanner  = new Scanner(System.in); 
               


                System.out.println("Hello Welcome to Numpy Ninja restaurant !\r\n"
                                + "\r\n"
                                + "Please select the service offering from below list :\r\n"
                                + "\r\n"
                                + "[1] dine-in\r\n"
                                + "\r\n"
                                + "[2] take away ");
                n=scanner.nextInt();

                switch (n){
                case 1:System.out.println("Please select the category from the below list :"+"\n");
                		System.out.println("[1] vegetarian [2] Non-vegetarian"+"\n");
                			scanner.nextInt();
                			//vegMenu();
                	break;
                case 2:System.out.println("Please select the category from the below list :"+"\n");
                		scanner.nextInt();
                		//nonVegMenu();
                	break;
                default:System.out.println("Wrong input");

                }
        }
                
                
                //to display menu
            public static void nonVegMenu(){
                    System.out.println("1. Chicken briyani - Rs. 200.00 (per item)"+"\n"+

                    				"2. Fish curry - Rs. 150.00 (per item)"+"\n"+

                    				"3. Chicken 65 - Rs. 120.00 (per item)"+"\n"+

                    			     "4. Mutton gravy - Rs. 220.00 (per item)"+"\n"+

                    			    "5. Chicken fried rice - Rs. 180.00 (per item)"+"\n");
                }
            
            public static void vegMenu(){
            	 System.out.println("1. Paneer tikka - Rs. 120.00 (per item)"+"\n"+

            "2. Cashew pulao - Rs. 150.00 (per item)"+"\n"+

            	"3. Veg fried rice - Rs. 130.00 (per item)"+"\n"+

            	"4. Gobi 65 - Rs. 100.00 (per item)"+"\n"+

            	"5. Veg. thali - Rs. 140.00 (per item)"+"\n");
            	
            }
            
            
            
            
            public static double itemPrice(int foodItem) {
        	    if (foodItem == 1) {
        	        //Paneer Tikka= 120.00
        	        System.out.println("You have ordered Paneer Tikka"+"\n");
        	        itemprice = 120.00;
        	    }
        	    if (foodItem == 2) {
        	        //Cashew Pulao
        	        System.out.println("You've ordered Cashew Pulao"+"\n");
        	        itemprice = 150.00;
        	    }
        	    if (foodItem == 3) {
        	        //Veg fried rice = $1.00
        	        System.out.println("You've ordered a Veg Fried rice"+"\n");
        	        itemprice = 130.00;
        	    }
        	    
        	    if (foodItem == 4) {
        	        //Gobi 65 = $1.00
        	        System.out.println("You've ordered a Gobi 65"+"\n");
        	        itemprice = 100.00;
        	    }
        	    
        	    if (foodItem == 5) {
        	        //Veg Thali
        	        System.out.println("You've ordered a Veg Thali"+"\n");
        	        itemprice = 140.00;
        	    }
        	    if (foodItem==6) {
        	    	System.out.println("done with order?");
        	    }
        	    quantity();
        	    return itemprice;
        	}
        	public static double quantity() {
        	    System.out.println("Enter quantity");       
        	    double quantity = scanner.nextDouble();
        	    subTotal(quantity, itemprice);
        	    return quantity;
        	 }
        	
        	
        	public static double subTotal(double quantity, double itemPrice) {
        	    double subTotal = quantity*itemPrice;
        	    System.out.println("Subtotal: "+ subTotal);
        	    runningTotal += subTotal;
        	    return subTotal;
        	}
            
        	public static void done(){
        	    ordering = false;
        	    System.out.println(runningTotal);
        	    System.out.println("Enjoy your meal");
        	}
            
            
            
          public static void main(String[] args){
        	  select();
        	
        	int menuOption;
    	    int foodItem = 0;
    	   
    	   
    	   
    	   // char c;
			boolean bn;
			char c;
			do{
    	        double runningTotal=0;
    	        
    	        vegMenu();
    	        
    	        menuOption = scanner.nextInt();    
    	        switch(menuOption){
    	            case 1:
    	                foodItem = 1;
    	                itemPrice(foodItem);
    	                break;
    	            case 2:
    	                foodItem = 2;
    	                itemPrice(foodItem);
    	                break;
    	            case 3:
    	                foodItem = 3;
    	                itemPrice(foodItem);
    	                break;
    	            case 4:
    	                foodItem = 4;
    	                itemPrice(foodItem);
    	                break;
    	            case 5:
    	                foodItem = 5;
    	                itemPrice(foodItem);
    	                break;
    	            case 6:
    	            	done();    	
    	                break;      
    	            default:
    	                System.out.println("Invalid option.");
    	        }
    	        System.out.println("Would you like to order one more dish ? [Y] or [N]");
    	    	c=scanner.next().charAt(0);
    	        // bn = scanner.nextBoolean();


    	    } while(c=='y'|| c=='n'); {
    	    	
    	    	
    	}
    	    
    	   
        	
        	
        
        }
}


