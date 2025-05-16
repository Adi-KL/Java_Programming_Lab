/*
==============================================================================
Define one class A in package apack. In class A, four variables are defined of
access modifiers default, protected, private and public.
Define class B in package bpack which extends A and write display() method
which access variables of class A.
Define class C in package cpack which has one method display() in that create one
object of class A and display its variables.
Define class ProtectedDemo in package dpack which contains the main () method.
Create objects of class B and C and call display method for both these objects.
Analyze the program by interpreting the access modifiers and provide valid
conclusion.
==============================================================================
*/

package apack;

public class A {
int defaultVar = 10;
protected int protectedVar = 20; 
private int privateVar = 30;
public int publicVar = 40;
package bpack;

import apack.A;
public class B extends A {
public void display() {
System.out.println("Protected: " + protectedVar);
System.out.println("Public: " + publicVar);
}
}
package cpack;
import apack.A;
public class C {
public void display() {
A obj = new A();
System.out.println("Public: " + obj.publicVar);
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
public static void main(String[] args) {
B bObj = new B();
C cObj = new C();
System.out.println("From Class B:");
bObj.display();
System.out.println("From Class C:");
cObj.display();
}
}
  
