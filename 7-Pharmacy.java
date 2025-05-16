/*
==========================================================================================
Consider a small hospital with a pharmacy that needs a simple inventory
management system to keep track of its medications and medical supplies. Each
item in the inventory has a unique ID, name, quantity in stock, and price. The
hospital wants functionalities to add new items, update existing items, remove
items, display the list of all items, and search for a specific item by its ID.
=========================================================================================
*/

import java.util.ArrayList;

class Pharmacy {
public final int id;
public final String name;
public int quantity;
public double price;
public Pharmacy(int id, String name, int quantity, double price) {
this.id = id;
this.name = name;
this.quantity = quantity;
this.price = price;
}
}
public class PharmacyManagementSystem {
private ArrayList&lt;Pharmacy&gt; inventory = new ArrayList&lt;&gt;();
// Add new item to inventory
public void addItem(Pharmacy item) {
inventory.add(item);
}

public void updateItem(int id, int quantity, double price) {
for (Pharmacy item : inventory) {
if (item.id == id) {
item.quantity = quantity;
item.price = price;
break;
}
}
}
// Remove item from inventory
public void removeItem(int id) {
inventory.removeIf(item -&gt; item.id == id);
}
// Display list of all items
public void displayInventory() {
System.out.println(&quot;Inventory:&quot;);
for (Pharmacy item : inventory) {
System.out.println(item.id + &quot; | &quot; + item.name + &quot; | Quantity: &quot; + item.quantity + &quot; |
Price: &quot; + item.price);
}
}

public Pharmacy searchItemByID(int id) {
for (Pharmacy item : inventory) {
if (item.id == id) {
return item;
}
}
return null; 
}
public static void main(String[] args) {
PharmacyManagementSystem ims = new PharmacyManagementSystem();
// Adding sample items
ims.addItem(new Pharmacy(1, &quot;Crocin&quot;, 100, 2.5));
ims.addItem(new Pharmacy(2, &quot;Calpol&quot;, 50, 3.0));
ims.addItem(new Pharmacy(3, &quot;Crickmol&quot;, 200, 1.0));

// Displaying inventory
ims.displayInventory();
// Updating an item
ims.updateItem(1, 90, 2.0);

// Displaying inventory after update
ims.displayInventory();
// Searching for an item
System.out.println(&quot;Searching for item with ID 2:&quot;);
Pharmacy foundItem = ims.searchItemByID(2);
if (foundItem != null) {
System.out.println(&quot;Item found: &quot; + foundItem.name);
} else {
System.out.println(&quot;Item not found.&quot;);
}
ims.removeItem(2);
ims.displayInventory();
}
}
