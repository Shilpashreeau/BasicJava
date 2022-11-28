//Please write a java program to calculate sum & average of given 4 marks via constructor,
//if three or two marks only passed from main method,then keep the missing value(s) as 35) - Hint - multiple parameterized constructo



public class StudentMarks {
	
	float m1;
	float m2;
	float m3;
	float m4;
    float sum;
	float avg;
	
	public StudentMarks(float marks1,float marks2,float marks3,float marks4) {
		m1=marks1;
		m2=marks2;
		m3=marks3;
		m4=marks4;
		
	}
	public StudentMarks(float marks1,float marks2,float marks3) {
		m1=marks1;
		m2=marks2;
		m3=marks3;
		m4=35;
		
	}
	public StudentMarks(float marks1,float marks2) {
		m1=marks1;
		m2=marks2;
		m3=35;
		m4=35;
		
	}
	public StudentMarks(float marks1) {
		m1=marks1;
		m2=35;
		m3=35;
		m4=35;
		
	}
	
	public  float sum(String studentname) {
		
		sum=m1+m2+m3+m4;
		System.out.println("Sum of marks for student "+studentname+" is "+sum);
		return sum;
	}
	
	public void avg(String studentname) {
		float result=sum(studentname);
		avg=result/4;
		System.out.println("Average of marks for student "+studentname+" is "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks s1=new StudentMarks(50,30,60,70);
		StudentMarks s2 =new StudentMarks(100,100,100);
		StudentMarks s3 =new StudentMarks(75,65);
		StudentMarks s4 =new StudentMarks(90);
		//s1.sum("Shilpa");
		s1.avg("Shilpa");
		s2.avg("Mahati");
	}

}
