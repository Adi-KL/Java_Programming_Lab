/*
==============================================================================
Write a Java program to implement a dynamic, growable queue using generics. The
queue should be able to store elements of any data type and dynamically resize
itself as needed to accommodate more elements.
==============================================================================
*/

import java.util.Arrays;
public class GQueue&lt;T&gt; {
T[] que;
static int size;
public GQueue() {
que = (T[]) new Object[2];
size = 0;
}
public void enqueue(T element) {
if (size == que.length) {
int newCapacity = que.length * 2;
que = Arrays.copyOf(que, newCapacity);
}
que[size++] = element;
}
public T dequeue() {
if (size==0) {
System.out.println(&quot;Queue is empty&quot;);
}
T del_element = que[0];
System.arraycopy(que, 1, que, 0, size - 1);
que[--size] = null;
return del_element;
}
public void display() {
for (T element : que) {
System.out.println(element);
}
}
public static void main(String[] args) {
GQueue&lt;Integer&gt; integerQueue = new GQueue&lt;&gt;();
// Enqueue elements
integerQueue.enqueue(10);
integerQueue.enqueue(20);
integerQueue.enqueue(30);
System.out.println(&quot;ELements in the queue are:&quot;);
integerQueue.display();
// Dequeue an element
int dequeuedElement = integerQueue.dequeue();
System.out.println(&quot;Dequeued element: &quot; + dequeuedElement);
// Display size of the queue
System.out.println(&quot;Queue size: &quot; +(++size));

}
}
