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
		Person a = new Person("��", "��ȯ");
		a.setFirstName("��");
		a.setLastName("��ȯ");
		
		    System.out.println( "�� ��  :"+a.getLastName() + "  ��  :" + a.getFirstName());
		    System.out.println((a.getFirstName()+a.getLastName()).length());
	}
}