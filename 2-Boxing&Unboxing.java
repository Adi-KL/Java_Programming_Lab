/*
==========================================================
Demonstrate boxing of primitive data types into their corresponding
wrapper class objects and unbox them back to their primitive
forms.
==========================================================
*/

public class boxing {
public static void main(String[] args) {
Integer boxedInt = Integer.valueOf(10);
Double boxedDouble = Double.valueOf(20.5);
Character boxedChar = Character.valueOf(&#39;A&#39;);
Boolean boxedBoolean = Boolean.valueOf(true);
Float boxedFloat = Float.valueOf(30.5f);
int unboxedInt = boxedInt.intValue();
double unboxedDouble = boxedDouble.doubleValue();
char unboxedChar = boxedChar.charValue();
boolean unboxedBoolean = boxedBoolean.booleanValue();
float unboxedFloat = boxedFloat.floatValue();
// Display results
System.out.println(&quot;Boxed Integer: &quot; + boxedInt);
System.out.println(&quot;Unboxed Integer: &quot; + unboxedInt);
System.out.println(&quot;Boxed Double: &quot; + boxedDouble);
System.out.println(&quot;Unboxed Double: &quot; + unboxedDouble);
System.out.println(&quot;Boxed Character: &quot; + boxedChar);
System.out.println(&quot;Unboxed Character: &quot; + unboxedChar);
System.out.println(&quot;Boxed Boolean: &quot; + boxedBoolean);
System.out.println(&quot;Unboxed Boolean: &quot; + unboxedBoolean);
System.out.println(&quot;Boxed Float: &quot; + boxedFloat);
System.out.println(&quot;Unboxed Float: &quot; + unboxedFloat);
}
}

