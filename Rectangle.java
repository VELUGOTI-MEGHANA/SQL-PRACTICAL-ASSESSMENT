package Assignment_3;

public class Rectangle extends Shape {
	@Override
public double area() {
	return Length*Width;
}
Rectangle(double L, double W){
this.Length = L;
this.Width = W;

}
public static void main(String[] args) {
	Rectangle r1 = new Rectangle(6,6);
	System.out.println("area of the rectangle :" +r1.area());
}
}
