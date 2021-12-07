package icici.loans.carloans;

public class ICICI implements Rbi,Rbi1
{

	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in ICICI");
	}

	@Override
	public void statement() {
		// TODO Auto-generated method stub
		
	}

}
