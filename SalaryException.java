package Assignment_3;
class MyOwnException  extends Exception{
	 MyOwnException (String s){
		 super(s);
	 }

}

public class SalaryException extends Employee{

	
	
	 public double salCal(double TA, double HRA, double DA) throws MyOwnException  { 
		
	   if((this.EmpSal+TA+HRA+DA)*12 <100000)
		   throw new MyOwnException("Yearly Salary is less than One Lakh");
	   else
		   System.out.println("Yearly Salary is greater than One Lakh");
	   return (this.EmpSal+TA+HRA+DA)*12 ;
		   }

	 
	
		   public static void main(String args[]) throws MyOwnException {
			   SalaryException s1= new  SalaryException();
			   System.out.println(s1.salCal(500, 500, 500));
			  
		   }
}
