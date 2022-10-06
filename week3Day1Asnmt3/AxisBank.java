package week3Day1Asnmt3;

public class AxisBank  extends BankInfo{
	public void deposit() {
		System.out.println("This is AxisBank deposit method");

	}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	BankInfo b=new BankInfo();
	a.deposit();
	b.deposit();
	b.fixed();
	b.saving();
}
}
