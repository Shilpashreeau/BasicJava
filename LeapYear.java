

public class LeapYear {

	public static void main(String[] args) {
		//2. Please write a java program to print the leap years between 2000 and 2100 - 
		//Hint : for loop and multiple if-else
		for(int year=2000;year<2100;year++) {
			 if(year%400==0) {
               	System.out.println(year);}
               else  if(year%100==0) {
			 		continue;
               }
                else if(year%4==0) {                    
	    		System.out.println(year);}
                  	       else {
                  	    	   continue;
                  	       }
	   		                       
	 }
			
			}
			
		}

	


