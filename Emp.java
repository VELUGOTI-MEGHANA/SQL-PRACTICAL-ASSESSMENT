package Assignment_3;

public abstract class Emp {
	long employeeid;
	String employeeName;
	Address address;
	double basicpay;
	
	 abstract double calculatesalary();

	@Override
	public String toString() {
		return "Emp [employeeid=" + employeeid + ", employeeName=" + employeeName + "]";
	}

}
