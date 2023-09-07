package employee;

public class Contractor extends Employee{
 int workinghours,paymentperhour,salary;
 public Contractor(int wh,int pph) {
	workinghours=wh;
	paymentperhour=pph;	 
 }
	public void calculateSalary() {
		// TODO Auto-generated method stub
		salary=paymentperhour*workinghours;
	}
	public void print() {
		System.out.println("Salary of contract employee = "+salary);
	}
	

}
