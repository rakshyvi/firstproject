package icici.loans.car;

public class samplemath {
	
	//Data properties
	 int a=100,b=20,result;
	
	//Behaviors
	 public void add() {
		 result=a+b;
		 System.out.println("Add of a & b :"+result);
		 //return result;
		 
	 }
	 public void sub() {
		 result=a-b;
				 System.out.println("sub of a & b:"+result);
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 3;
		int result = a*b;
		/*
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 System.out.println("multiplication result="+result);
		
		
		if(result>20) {
			System.out.println("the amount is too big");
			
			}
		else {
			System.out.println("The amount is credited ");
		}
		*/
		samplemath obj=new samplemath();
		 obj.add();
		 obj.sub();
		
		}
		

}
