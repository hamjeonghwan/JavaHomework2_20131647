package homework2_2;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
	String fname = null, lname = null;
	
	System.out.println("���� �Է��ϼ���");
	Scanner sc = new Scanner(System.in);
	lname = sc.nextLine();
	
	System.out.println("�̸��� �Է��ϼ���");
	fname = sc.nextLine();
	
	
	Person person1 = new Person();
	person1.lastName = lname;
	person1.firstName = fname;
	System.out.println(person1.getLastName() + person1.getFirstName()); 
	
	
	System.out.println("���� �Է��ϼ���");
	lname = sc.nextLine();
	
	System.out.println("�̸��� �Է��ϼ���");
	fname = sc.nextLine();
	
	
	Person person2 = new Person();
	person2.lastName = lname;
	person2.firstName = fname;
	System.out.println(person2.getLastName() + person2.getFirstName());
	}
}

class Person {
	String lastName;
	String firstName;
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getLength() {
		return (lastName + firstName).length();
	}
}