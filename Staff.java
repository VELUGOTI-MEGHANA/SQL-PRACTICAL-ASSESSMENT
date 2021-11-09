package Assignment_3;

public class Staff extends Emp{
	String title;
	double salary;

	@Override
	double calculatesalary() {
		this.salary=this.salary+(this.salary*0.18);
		return this.salary;
	}

	public Staff(String title, double salary) {
		super();
		this.title = title;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + ", salary=" + salary + "]";
	}
	
	

}
