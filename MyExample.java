package Assignment_4;
import java.util.ArrayList;
import java.util.List;
public class MyExample {
	public static void main(String[] args) {
List<Student> StudentList = new ArrayList<Student>();
StudentList.add(new Student("Meghana",22,210));
StudentList.add(new Student("Sumana",18,100));
StudentList.add(new Student("Jhanu",23,223));
StudentList.add(new Student("Navya",20,345));
System.out.println("Before Sorting the Student data:");

//java 8 forEach for printing the list
StudentList.forEach((s)-> System.out.println(s));
System.out.println("After Sorting the Student Id:");

//Lamba expression for sorting by Age
 StudentList.sort((Student s1,Student s2)-> s2.getStdId()-s1.getStdId());
StudentList.sort((Student s1,Student s2)->s2.getStdMarks()-s1.getStdMarks());

//java 8 forEach for printing the list
StudentList.forEach((s)->System.out.println(s));

}
}