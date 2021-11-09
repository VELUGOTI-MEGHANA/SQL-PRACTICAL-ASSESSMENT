package Assignment_4;
import java.util.ArrayList;
public class Student {
String StdName;
int StdId;
int StdMarks;
public Student() {}
public Student(String StdName,int StdId,int StdMarks) {
	super();
	this.StdName = StdName;
	this.StdId = StdId;
	this.StdMarks = StdMarks;
}
private int stdMarks;
public String getStdName() {
	return StdName;
}
public void setStdName(String stdName) {
	StdName = stdName;
}
public int getStdAge() {
	return StdId;
}
public void setStdAge(int stdAge) {
	StdId = stdAge;
}
public int getStdId() {
	return StdMarks;
}
public void setStdId(int stdId) {
	
	StdMarks = stdMarks;
}

@Override
public String toString() {
	return "Student [StdName=" + StdName + ", StdAge=" + StdId + ", StdId=" + StdMarks + "]";
}
public int getStdMarks() {
	// TODO Auto-generated method stub
	return 0;
}

}

	