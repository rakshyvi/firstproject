package icici.loans.car;

public interface Ibank 
{
  public void withdrawl();
  public void deposit();
 
	public static void main(String[] args)
	{
		//Ibank i = new Ibank();
		
		Ibank i = new IciciBank();
		i.deposit();
		i.withdrawl();
		i =new HdfcBank();
		  i.deposit();
		  i.withdrawl();
		
	}
}

