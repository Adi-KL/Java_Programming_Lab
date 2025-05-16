/*
===========================================================================
Write a JAVA program which has
i. An Interface class for Stack Operations
ii. A Class that implements the Stack Interface and creates a fixed length Stack.
iii. A Class that implements the Stack Interface and creates a Dynamic length
Stack.
iv. A Class that uses both the above Stacks through Interface reference and
does the Stack operations that demonstrates the runtime binding.
============================================================================
*/


// i. Interface for Stack Operations
interface Stack {
void push(int element);
int pop();
boolean isEmpty();
int size();
}

// ii. Fixed-Length Stack Implementation
class FixedLengthStack implements Stack {
private int[] stackArray;
private int top;
private int capacity;

public FixedLengthStack(int capacity) {
this.capacity = capacity;
this.stackArray = new int[capacity];
this.top = -1;
}

@Override
public void push(int element) {
if (top == capacity - 1) {
System.out.println(&quot;Stack Overflow: Cannot push element, stack is full.&quot;);
return;
}
stackArray[++top] = element;
}

@Override
public int pop() {
if (isEmpty()) {
System.out.println(&quot;Stack Underflow: Cannot pop element, stack is empty.&quot;);
return -1;
}
return stackArray[top--];
}

@Override
public boolean isEmpty() {
return top == -1;
}
@Override
public int size() {
return top + 1;
}
}
// iii. Dynamic-Length Stack Implementation
class DynamicLengthStack implements Stack {
private int[] stackArray;
private int top;
private int capacity;
public DynamicLengthStack() {
this.capacity = 10; // Initial capacity
this.stackArray = new int[capacity];
this.top = -1;
}
@Override
public void push(int element) {
if (top == capacity - 1) {
// If the stack is full, double the capacity
capacity *= 2;
int[] newStackArray = new int[capacity];
System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
stackArray = newStackArray;
}
stackArray[++top] = element;
}
@Override
public int pop() {
if (isEmpty()) {
System.out.println(&quot;Stack Underflow: Cannot pop element, stack is empty.&quot;);
return -1;
}
return stackArray[top--];
}

@Override
public boolean isEmpty() {
return top == -1;
}
@Override
public int size() {
return top + 1;
}
}
// iv. Class Demonstrating Runtime Binding and Stack Operations
class StackOperations {
public static void main(String[] args) {
// Using FixedLengthStack through Interface reference
Stack fixedStack = new FixedLengthStack(5);
System.out.println(&quot;Fixed Length Stack Operations:&quot;);
performStackOperations(fixedStack);

// Using DynamicLengthStack through Interface reference
Stack dynamicStack = new DynamicLengthStack();
System.out.println(&quot;\nDynamic Length Stack Operations:&quot;);
performStackOperations(dynamicStack);
}

public static void performStackOperations(Stack stack) {
System.out.println(&quot;Stack Size: &quot; + stack.size());
stack.push(10);
System.out.println(&quot;Stack Size: &quot; + stack.size());
stack.push(20);
System.out.println(&quot;Stack Size: &quot; + stack.size());
stack.push(30);
System.out.println(&quot;Stack Size: &quot; + stack.size());
System.out.println(&quot;Pop: &quot; + stack.pop());
System.out.println(&quot;Stack Size: &quot; + stack.size());
System.out.println(&quot;Pop: &quot; + stack.pop());
SystemThird.out.println(&quot;Stack Size: &quot; + stack.size());
System.out.println(&quot;Is Empty: &quot; + stack.isEmpty());
System.out.println(&quot;Stack Size: &quot; + stack.size());
System.out.println(&quot;Pop: &quot; + stack.pop());
System.out.println(&quot;Stack Size: &quot; + stack.size());
System.out.println(&quot;Is Empty: &quot; + stack.isEmpty());
}
}
