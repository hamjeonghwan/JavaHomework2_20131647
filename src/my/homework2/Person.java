package my.homework2;

public class Person {
	private String lastName;
	public Person(String b, String c) {
		
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String firstName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person("한", "정환");
		a.setFirstName("한");
		a.setLastName("정환");
		
		    System.out.println( "이 름  :"+a.getLastName() + "  성  :" + a.getFirstName());
		    System.out.println((a.getFirstName()+a.getLastName()).length());
	}
}