/*
=================================================================================
Develop a text processing tool for a language learning platform. The tool needs
to compare strings, concatenate strings, and create copies of strings for various
languages. Implement appropriate Java functionalities.
==================================================================================
*/

public class String_Functions {
public static boolean compareStrings(String str1, String str2) {
return str1.equals(str2);
}
public static String copyString(String original) {
return new String(original);
}

public static String concatenateStrings(String str1, String str2) {
return str1 + str2;
}
public static void main(String[] args) {


String str1 = &quot;Hello&quot;;
String str2 = &quot;hello&quot;;
System.out.println(&quot;String comparison:&quot;);
System.out.println(&quot;Are the strings equal? &quot; + compareStrings(str1, str2));

String original = &quot;Copy me!&quot;;
String copied = copyString(original);
System.out.println(&quot;\nString copy:&quot;);
System.out.println(&quot;Original string: &quot; + original);
System.out.println(&quot;Copied string: &quot; + copied);

String part1 = &quot;Hello, &quot;;
String part2 = &quot;world!&quot;;
String concatenated = concatenateStrings(part1, part2);
System.out.println(&quot;\nString concatenation:&quot;);
System.out.println(&quot;Concatenated string: &quot; + concatenated);
}
}
