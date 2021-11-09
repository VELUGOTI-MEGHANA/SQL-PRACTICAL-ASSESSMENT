package Assignment_3;

public class Employee {
int EmpId;
String EmpName;
double EmpSal;

public Employee() {}
public Employee (int empid,String empName, double empSal) {
	EmpId = empid;
	EmpName = empName;
	EmpSal = empSal;
}
public double SalCal(double TA,double HRA,double DA) {
	 return this. EmpSal+TA+HRA+DA;
}
public void display() {
	System.out.println("EmpId");
	System.out.println("EmpName");
	System.out.println("EmpSal");
	System.out.println();
}
}
