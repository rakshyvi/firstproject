package icici.loans.car;

public class HdfcBank implements Ibank {

	public static void main(String[] args) 
	{

        	HdfcBank obj1 = new HdfcBank();
        	obj1.deposit();
        	obj1.withdrawl();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("i override the withdraw from Hdfc");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i override the deposit from Hdfc");
		
	}

}
