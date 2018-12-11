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
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("직위 : ");
		String position = sc.nextLine();
		System.out.print("주민등록번호 : ");
		int jdn = Integer.valueOf(sc.nextLine());
		System.out.print("시간당 임금 : ");
		int hourlyWages = Integer.valueOf(sc.nextLine());
		
		employee = new Employee(name, position, jdn, hourlyWages);
		System.out.println(employee.getPay(5));
		
		employee.raise(employee.getPay(1) * 2);
		System.out.println(employee.getPay(5));
	}
}