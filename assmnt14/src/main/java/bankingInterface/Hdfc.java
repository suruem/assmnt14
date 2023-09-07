package bankingInterface;

public class Hdfc implements Rbi{

	int amount,duration;
	
	public Hdfc (int amount,int duration) {
	this.amount=amount;
	this.duration=duration;
	}
	
	public void recurringDeposit() {
	
		
		amount=duration*amount*(Rbi.interestrate);
	}
	public void print() {
		System.out.println("Amount in account = "+amount);
	}
public static void main(String args[]) {
	Hdfc ob=new Hdfc(10000,5);
	ob.recurringDeposit();
	ob.print();
}
}
