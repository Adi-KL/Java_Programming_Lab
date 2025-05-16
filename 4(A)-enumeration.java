/*
=================================================================
Create an enumeration Day of Week with seven values SUNDAY through
SATURDAY. Add a method Workday() to the DayofWeek class that
returns true if the value on which it is called is MONDAY through
FRIDAY.
=================================================================
*/

import java.util.Scanner;
public class Enumeration {
public enum DayOfWeek {
SUNDAY,
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY;
public boolean isWorkday() {
return (this != SATURDAY &amp;&amp; this != SUNDAY);
}
}
public static void main(String[] args) {
System.out.println(&quot;Is Monday a workday? &quot; + DayOfWeek.MONDAY.isWorkday());
System.out.println(&quot;Is Saturday a workday? &quot; + DayOfWeek.SATURDAY.isWorkday());
}
}
