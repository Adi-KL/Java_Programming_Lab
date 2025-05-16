/* 
================================================================
Design a membership management system for a fitness center, where
the system should allow gym administrators to store information
about gym members- name, age, membership status(true/false), and
membership duration (in months). Calculate the membership fee
based on the membership duration using a predefined fee. Display
detailed information of the member. 
=================================================================
*/

import java.util.Scanner;
public class GymMembershipManager {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println(&quot;Welcome to the Gym Membership Management System!&quot;);
System.out.print(&quot;Enter member name: &quot;);
String name = scanner.nextLine();
System.out.print(&quot;Enter member age: &quot;);
int age = scanner.nextInt();
System.out.print(&quot;Is the membership active? (true/false): &quot;);
boolean isActive = scanner.nextBoolean();
System.out.print(&quot;Enter membership duration (in months): &quot;);
int duration = scanner.nextInt();

double membershipFee = duration * 50.0;

// Display member details
System.out.println(&quot;\nMember Details:&quot;);
System.out.println(&quot;Name: &quot; + name);
System.out.println(&quot;Age: &quot; + age);
System.out.println(&quot;Membership Status: &quot; + (isActive ? &quot;Active&quot; : &quot;Inactive&quot;));
System.out.println(&quot;Membership Duration: &quot; + duration + &quot; months&quot;);
System.out.println(&quot;Membership Fee: $&quot; + membershipFee);
scanner.close();
}
}
