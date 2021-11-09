package Assignment_4;

public class UserEmp {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(123);
		e1.setEmpName("Meghana");
		e1.setEmpSal(400000);
		
		Employee e2=new Employee();
		e2.setEmpId(123);
		e2.setEmpName("aindhu");
		e2.setEmpSal(200000);
		
		EmployeeImp l1=new EmployeeImp1();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		System.out.println(l1.getEmployee());
		System.out.println(l1);
	}

}

