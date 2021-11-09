package Assignment_3;

public class UsingPeople {
	public static void main (String [] args) {
		TechnicalEmp technicalemployee=new TechnicalEmp("jva",2000);
		Address address=new Address("1-246","KanamanambeduStreet","Srikalahasthi",456);
		System.out.println(technicalemployee);
		System.out.println("salary is:"+technicalemployee.calculatesalary());
		Staff staff=new Staff("manager",400000);
		System.out.println(staff);
		System.out.println("salary is:"+staff.calculatesalary());
		
	}

}

