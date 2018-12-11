package my.homework2;

import java.util.Scanner;

public class Employee {
	private String name, position;
	private int jdn, hourlyWages;
	
	public Employee(String name, String position, int jdn, int hourlyWages) {
		this.name = name;
		this.position = position;
		this.jdn = jdn;
		this.hourlyWages = hourlyWages;
	}
	
	public int getPay(int hour) {
		return hourlyWages * hour;
	}
	
	public void raise(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	public static void main(String[] args) {
		Employee employee;
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		String position = sc.nextLine();
		System.out.print("�ֹε�Ϲ�ȣ : ");
		int jdn = Integer.valueOf(sc.nextLine());
		System.out.print("�ð��� �ӱ� : ");
		int hourlyWages = Integer.valueOf(sc.nextLine());
		
		employee = new Employee(name, position, jdn, hourlyWages);
		System.out.println(employee.getPay(5));
		
		employee.raise(employee.getPay(1) * 2);
		System.out.println(employee.getPay(5));
	}
}