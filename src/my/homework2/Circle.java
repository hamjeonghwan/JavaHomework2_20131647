package my.homework2;

public class Circle {
	static double radius;
	final double a = 3.14;
	public Circle(double radius) {
		this.radius= radius;
	}
	public double getRadius(double radius) {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius= radius;
	}
	public double computeArea() {
		return a*radius*radius;
	}
	public double computePerimeter() {
		return a*2*radius;
	}
}

