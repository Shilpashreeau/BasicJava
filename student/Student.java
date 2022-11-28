package student;

import java.util.Scanner;

//import java.util.Scanner;

public class Student {
	int Maths;
	int Science;
	int English;
	int Social;
	int sum;
	
	public int totalMarks(){
		
	    sum=Maths+Science+English+Social;
		System.out.println("Total marks obtained " + sum);
		return sum;
	}
	public void avgMarks(){
		
		int avg;
		avg=sum/4;
		System.out.println("Average marks obtained " + avg);
	}
	

public static void main(String[] args){
	Student Arti=new Student();
	Student Lakshmi=new Student();
	Student Ramya=new Student();
	Student Shilpa=new Student();
	
	//Marks of Arti
	Arti.English=20;
	Arti.Maths=20;
	Arti.Science=25;
	Arti.Social=15;
	Arti.totalMarks();
	Arti.avgMarks();
	
	//Marks of Lakshmi
	Lakshmi.English=23;
	Lakshmi.Maths=20;
	Lakshmi.Science=19;
	Lakshmi.Social=24;
	Lakshmi.totalMarks();
	Lakshmi.avgMarks();
	
	//Marks of Ramya
	Ramya.English=22;
	Ramya.Maths=24;
	Ramya.Science=15;
	Ramya.Social=25;
	Ramya.totalMarks();
	Ramya.avgMarks();
	
	//Marks of Shilpa
	Scanner ip=new Scanner(System.in);
	System.out.println("Please enter marks of English: ");
	Shilpa.English=ip.nextInt();
	System.out.println("Please enter marks of Maths: ");
	Shilpa.Maths=ip.nextInt();
	System.out.println("Please enter marks of Science: ");
	Shilpa.Science=ip.nextInt();
	System.out.println("Please enter marks of Social: ");
	Shilpa.Social=ip.nextInt();
	
	Shilpa.totalMarks();
	Shilpa.avgMarks();
	
}
}
