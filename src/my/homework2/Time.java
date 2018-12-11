package my.homework2;

public class Time {

	   int hour, minute, second;
	   	   	   
	   public int getHour() {
	      return hour;
	   }
	   public int getMinute() {
	      return minute;
	   }
	   public int getSecond() {
	      return second;
	   }
	   public void setHour(int hour) {
	      this.hour = hour;
	   }
	   public void setMinute(int minute) {
	      this.minute = minute;
	   }
	   public void setSecond(int second) {
	      this.second = second;
	   }
	   public void adjustHour(int hour) {
	      this.hour = this.hour + hour;
	      this.hour = this.hour%24;
	      }
	   public void adjustMinute (int minute) {
	      this.minute = this.minute + minute;
	      this.minute = this.minute % 60;
	      }
	   public void adjustSecond (int second) {
	      this.second = this.second + second;
	         adjustMinute(this.second/60);
	         this.second = this.second % 60;
	      }
	   void printTime() {
	      System.out.println(getHour() + "Ω√ " + getMinute() + "∫– " + getSecond() + "√ " );
	   }
	   public static void main(String[] args) {
	      Time t = new Time();
	      t.setHour(2);
	      t.setMinute(42);
	      t.setSecond(50);
	      t.printTime();
	      t.adjustHour(2);
	      t.adjustMinute(42);
	      t.adjustSecond(50);
	      t.printTime();
	      t.adjustHour(2);
	      t.adjustMinute(42);
	      t.adjustSecond(50);
	      t.printTime();
	   }
	}