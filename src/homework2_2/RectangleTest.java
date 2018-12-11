package homework2_2;

import my.homework2.Rectangle;

public class RectangleTest {

public static void main(String[] args) {
		
		double area, perm;
		
		Rectangle rec =new Rectangle();
			rec.setLength(3.0);
			rec.setWidth(5.0);
			
			area=rec.calculateArea();
			perm=rec.calculatePerimeter();
			
			System.out.println(rec.getLength());
			System.out.println(rec.getWidth());
			System.out.println("면적\n" +area);
			System.out.println("둘레\n" +perm);	
	}
}