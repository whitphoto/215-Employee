 // Fig. 8.7: Date.java
 // Date class declaration.

 public class Date
 {
	 private static int month; // 1-12
	 private static int day; // 1-31 based on month
	 private static int year; // any year

 private static final int[] daysPerMonth =
	 { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

 // constructor: confirm proper value for month and day given the year
 
 public static void setDate(int amonth, int aday, int ayear)
	 {
	 month = amonth;
	 day = aday;
	 year = ayear;
	 
	 // check if month in range
	 if (month <= 0 || month > 13)
	 throw new IllegalArgumentException(
	 "month (" + month + ") must be 1-12");
	
	 // check if day in range for month
	 if (day <= 0 ||
	 (day > daysPerMonth[month] && !(month == 2 && day == 29)))
	 throw new IllegalArgumentException("day (" + day +
	 ") out-of-range for the specified month and year");
	
	 // check for leap year if month is 2 and day is 29
	 if (month == 2 && day == 29 && !(year % 400 == 0 ||
	 (year % 4 == 0 && year % 100 != 0)))
	 throw new IllegalArgumentException("day (" + day +
	 ") out-of-range for the specified month and year");
	
	
	
	 
	 }

 public static int getMonth()
	 {
		 return month;
	 }
	 
 public int getDay()
	 {
		 return day;
	 }
 
 public int getYear()
	 {
		 return year;
	 }
 // return a String of the form month/day/year
 public String toString()
	 {
	 return String.format("%d/%d/%d", month, day, year);
	 }
 
	
	
 } // end class Date