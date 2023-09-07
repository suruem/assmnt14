package employee;

public class FullTimeEmployee extends Employee {
	int salary,paymentperhour;
	FullTimeEmployee(int paymentperhour){
		this.paymentperhour=paymentperhour;
	}
	public void calculateSalary() {
		salary=paymentperhour*8;
		
	}
	public void print() {
		System.out.println("Salary of contract permanant employee = "+salary);
	}
	
public static void main(String args[]) {
	
	Contractor e1=new Contractor(4, 600);
	e1.calculateSalary();
	e1.print();
	FullTimeEmployee e2=new FullTimeEmployee(800);
	e2.calculateSalary();
	e2.print();
}
}

