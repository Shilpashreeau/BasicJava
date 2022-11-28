//Please write a java program to print the nth fibonacci series number (example : 9th fibonacci series is 34) 
//Hint : use simple if condition with recursive function call


public class Fibonacci {
	
	
	public static int fib(int n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fib(n - 1) + fib(n - 2);
	   }
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	}
