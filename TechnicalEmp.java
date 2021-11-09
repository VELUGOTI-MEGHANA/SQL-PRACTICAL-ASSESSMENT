package Assignment_3;

public class TechnicalEmp extends Emp{
	String technicalskills;
	 double Salary;

	@Override
	double calculatesalary() {
		// TODO Auto-generated method stub
		this.Salary=this.basicpay+(this.basicpay*0.12);
		return this.Salary;
	}

	public TechnicalEmp(String technicalskills, double salary) {
		super();
		this.technicalskills = technicalskills;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "TechnicalEmployee [technicalskills=" + technicalskills + ", Salary=" + Salary + "]";
	}

}
