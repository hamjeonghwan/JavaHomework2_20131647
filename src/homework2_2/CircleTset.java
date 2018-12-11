package homework2_2;
import my.homework2.Circle;

public class CircleTset {

	public static void main(String[] args) {
		
		double area, perm;
		
			Circle cir =new Circle(0);
			cir.setRadius(5.0);
			
			area=cir.computeArea();
			perm=cir.computePerimeter();
			System.out.println(area);
			System.out.println(perm);
	}
}
