package Assignment_3;

public class Tester extends Employee implements EmployeeInterface{
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
	Tester t1 = new Tester();
	t1.EmpId = 67;
	t1.EmpName = "Jhansi";
	t1.EmpSal = 28000;
	t1.display();
	System.out.println(t1.SalCal(30,40,50));
}


}
