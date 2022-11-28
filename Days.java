import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		//1. Please write a java program to print the day of the week when number is given 
		//(example : 1 means Sunday should be printed) - Hint : Switch case
		int num;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number: "+"\n");
		num=input.nextInt();
		
		
		switch(num){
		case 1:System.out.println("Sunday"+"\n");
			break;
		case 2:System.out.println("Monday"+"\n");
			break;
		case 3:System.out.println("Tuesday"+"\n");
			break;
		case 4:System.out.println("Wednesday"+"\n");
		 	break;
		case 5:System.out.println("Thursday"+"\n");
			break;
		case 6:System.out.println("Friday"+"\n");
			break;
		case 7:System.out.println("Saturday"+"\n");
			break;
		default: 
			System.out.println("Please provide right input"+"\n");
		
			
		}
		

	}

}
