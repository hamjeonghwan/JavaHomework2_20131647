package homework2_2;
import my.homework2.Student;

public class StudentTest {
	public static void main(String[] args) {
	    
	      Student student1 = new Student();
	      student1.setName("��ȯ");
	      student1.setNumber(100);
	      student1.setDepartment("��ǻ�Ͱ��а�");
	      System.out.println(student1);
	      
	      Student student2 = new Student();
	      student2.setName("����");
	      student2.setNumber(200);
	      student2.setDepartment("�濵�а�");
	      System.out.println(student2);
	      
	      student2.setDepartment("���������а�");
	      System.out.println(student2);
	   }
	}