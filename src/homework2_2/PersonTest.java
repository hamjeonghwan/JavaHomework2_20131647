package homework2_2;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
	String fname = null, lname = null;
	
	System.out.println("성을 입력하세요");
	Scanner sc = new Scanner(System.in);
	lname = sc.nextLine();
	
	System.out.println("이름을 입력하세요");
	fname = sc.nextLine();
	
	
	Person person1 = new Person();
	person1.lastName = lname;
	person1.firstName = fname;
	System.out.println(person1.getLastName() + person1.getFirstName()); 
	
	
	System.out.println("성을 입력하세요");
	lname = sc.nextLine();
	
	System.out.println("이름을 입력하세요");
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