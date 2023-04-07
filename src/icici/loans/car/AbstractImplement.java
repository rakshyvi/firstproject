package icici.loans.car;

public class AbstractImplement extends SampleAbstract {

	public static void main(String[] args) 
	{
		AbstractImplement A = new AbstractImplement();
		A.m1();
		A.m2();
		A.m3();

	}

	@Override
	public void m2() 
	{

    System.out.println("m2 method from AbstractImplement ");
		
	}
	
	
}
