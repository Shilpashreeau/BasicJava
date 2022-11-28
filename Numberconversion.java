//Please write a java program to print the binary, octal, hexadecimal form of a given decimal number
//(example : for the input 10, print 1010(binary), 12 (octal), A (hexa))
public class Numberconversion {
	
	
	public static void toBinary(int num) {
		String binary = Integer.toBinaryString(num);
		 
        System.out.println(binary);
		
	}
	public static void toOctal(int num) {
		String octal= Integer.toOctalString(num) ;
		System.out.println(octal);
	}
	public static void toHexadecimal(int num) {
		String hex=Integer.toHexString(num);
		System.out.println(hex);
	}

	public static void main(String[] args) {
		toBinary(10);
		toOctal(10);
		toHexadecimal(10);
	}

}
