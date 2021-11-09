package Assignment_3;

public class Developer extends Employee implements EmployeeInterface{
	@Override
	public double SalCal(double TA , double HRA , double DA) {
		return this.EmpSal+TA+HRA+DA;

		
	}
	@Override
	public void display() {
		//TODO Auto-generated method stub
		System.out.println(this.EmpId);
		System.out.println(this.EmpName);
		System.out.println(this.EmpSal);
	}
public static void main(String args[]) {
	Developer d1 = new Developer();
	d1.EmpId= 76;
	 d1.EmpName= "Sumana";
	 d1.EmpSal= 50000;
	d1.display();
	System.out.println(d1.SalCal(70,80,90));
}


}
