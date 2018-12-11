package my.homework2;

public class Student {
	
	   private String name;
	   private int number;
	   private String department;
	   
	   public Student() {
	   }	   
	   public int getNumber() {
	      return number;
	   }
	   	   public void setNumber(int number) {
	      this.number = number;
	   }	   
	   public String getName() {
	      return name;
	   }	   
	   public void setName(String name) {
	      this.name = name;
	   }	   
	   public String getDepartment() {
	      return department;
	   }   
	   public void setDepartment(String department) {
	      this.department = department;
	   }
	   public String toString() {
	      return "(" + this.name + "," + this.number  + "," + this.department + ")";  
	   }
}
