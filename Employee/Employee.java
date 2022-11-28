package Employee;

public class Employee {
	double takehomeSalary;
	float basicSalary;
	float boa;
	double t;
	float bonus;
	int l;
	
	
	//considering employee gets monthly bonus
	
	public Employee(int level,float bn,float basketofAllowence,float baseSal){
		l=level;
	   	bonus=bn;
	   	boa=basketofAllowence;
	    basicSalary=baseSal;
	   	
	}
	
	public void calculateSalary(double tax){
		float totalSalary;
		double pfdeduction;
		double afterpfdeduction;
		
		totalSalary=(basicSalary+boa+bonus)*12;
		pfdeduction=0.12*basicSalary;
		
		afterpfdeduction=(basicSalary-pfdeduction)+boa+bonus;
		
		if(totalSalary<250000){
			t=0;
			
		}
		else{
			t=tax*afterpfdeduction;
		}
		
		takehomeSalary=afterpfdeduction-t;
		System.out.println("Employees in level "+ l +" salary is " + takehomeSalary);
	}
	/*public double calculateTax(){
		
		}
		
	}*/
	public static void main(String[] args){
		Employee e1=new Employee(4,3500,10000,15000);
		e1.calculateSalary(0.05);
		Employee e2= new Employee(2,2500,7000,10000);
		e2.calculateSalary(0);
		
	}
}
