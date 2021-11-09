package Assignment_3;


public class Manager extends Employee implements EmployeeInterface{
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
	Employee m1 = new Manager();
	m1.EmpId = 27;
	m1.EmpName = "Meghana";
	m1.EmpSal = 25000;
	m1.display();
	System.out.println(m1.SalCal(30,40,50));
}
}

