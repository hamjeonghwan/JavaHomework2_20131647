package my.homework2;

public class Rectangle {
	static double length, width;

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public double calculateArea() {
		return length*width;
		
	}	
	public double calculatePerimeter() {
		return (length+width)*2;
	}
}

