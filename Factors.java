//Please write a java program to print the factors and total number of factors of given number
public class Factors {
	
	public static void calculateFactor(int num) {

	   

	    System.out.print("Factors of " + num + " are: ");

	   
	    for (int i = 1; i <= num; ++i) {

	      // if num is divided by i,i is the factor
	      
	      if (num % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	}

	public static void main(String[] args) {
		calculateFactor(60);

	}

}
