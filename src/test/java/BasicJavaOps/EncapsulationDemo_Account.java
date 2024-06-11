package BasicJavaOps;

public class EncapsulationDemo_Account {

	private int accno;
	private String name;
	private double balance;
	
	int getAccno()
	{
		return accno;
	}
	void setAccno(int accno)
	{
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
