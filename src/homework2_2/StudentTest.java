package homework2_2;
import my.homework2.Student;

public class StudentTest {
	public static void main(String[] args) {
	    
	      Student student1 = new Student();
	      student1.setName("정환");
	      student1.setNumber(100);
	      student1.setDepartment("컴퓨터공학과");
	      System.out.println(student1);
	      
	      Student student2 = new Student();
	      student2.setName("정순");
	      student2.setNumber(200);
	      student2.setDepartment("경영학과");
	      System.out.println(student2);
	      
	      student2.setDepartment("영여영문학과");
	      System.out.println(student2);
	   }
	}