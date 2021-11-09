package Assignment_3;

public class Square extends Shape{
	@Override
	public double area() {
		return Length*Length;
	}
	Square(double L){
	this.Length = L;
	

	}
	public static void main(String[] args) {
		Square s1 = new Square(8);
		System.out.println("area of the Square:" +s1.area());

}
}