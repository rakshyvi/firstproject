package icici.loans.car;

public class IciciBank implements Ibank  {

	public static void main(String[] args) 
	{
		IciciBank obj = new IciciBank();
		obj.withdrawl();
		obj.deposit();

	}

	@Override
	public void withdrawl() 
	{
		
		System.out.println("i override the withdraw from Icici");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i override the deposit from Icici");
		
	}

}
