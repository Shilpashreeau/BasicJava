//Please write a java program to find the first 30 prime numbers. Hint : for loop and multiple if-else
public class Prime {

	public static void main(String[] args) {

		  int num = 30, count;

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
		 }

	}



