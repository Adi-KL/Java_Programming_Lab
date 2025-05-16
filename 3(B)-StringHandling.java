/*
========================================================================
Write a program in Java for String handling which performs the following:
i. Checks the capacity of String Buffer objects.
ii. Reverses the contents of string given on console and converts the
resultant string in upper case.
iii. Reads a string from console and appends it to the resultant string.
==========================================================================
*/

import java.util.Scanner;
public class StringBufferHandling {
public static void main(String[] args) {
// Task i: Checking capacity of StringBuffer objects
StringBuffer sb1 = new StringBuffer();
System.out.println(&quot;Capacity of StringBuffer object sb1: &quot; + sb1.capacity());

StringBuffer sb2 = new StringBuffer(&quot;Hello&quot;);
System.out.println(&quot;Capacity of StringBuffer object sb2: &quot; + sb2.capacity());
// Task ii: Reversing the contents of string and converting to uppercase
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String inputString = scanner.nextLine();

StringBuffer reversedBuffer = new StringBuffer(inputString);
reversedBuffer.reverse();
String reversedUpperCase = reversedBuffer.toString().toUpperCase();
System.out.println(&quot;Reversed string in uppercase: &quot; + reversedUpperCase);

// Task iii: Reading a string from console and appending it
System.out.print(&quot;Enter a string to append: &quot;);
String appendString = scanner.nextLine();
reversedBuffer.append(appendString);
System.out.println(&quot;String after appending: &quot; + reversedBuffer);
scanner.close();
}
}
