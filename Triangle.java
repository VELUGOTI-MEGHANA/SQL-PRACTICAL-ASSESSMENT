package Assignment_3;

public class Triangle extends Shape{
	@Override
	public double area() {
		return (Width*Height)/2;
	}
	Triangle(double W, double H){
	
	this.Width = W;
	this.Height = H;

	}
	public static void main(String[] args) {
		Triangle t1 = new Triangle(6,7);
		System.out.println("area of the Triangle:" +t1.area());
	}
	}


