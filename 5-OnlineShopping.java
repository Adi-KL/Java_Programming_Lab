/*
=====================================================================================================
Develop an online shopping platform to manage a dynamic list of products available for sale.
i. Implement a program called OnlineShoppingManager that uses a Vector 
to store product objects. Each product should have attributes for name, price and category.
ii. Design methods in the OnlineShoppingManager class to add products
to the inventory, remove products from the inventory and display all
products in the inventory.
====================================================================================================
*/

import java.util.Vector;
class Product {
String name;
double price;
String category;
public Product(String name, double price, String category) {
this.name = name;
this.price = price;
this.category = category;
}
}

public class OnlineShoppingManager {
private Vector&lt;Product&gt; inventory;
public OnlineShoppingManager() {
inventory = new Vector&lt;&gt;();
}

public void addProduct(String name, double price, String category) {
Product product = new Product(name, price, category);
inventory.add(product);
}

public void removeProduct(String name) {
for (int i = 0; i &lt; inventory.size(); i++) {
if (inventory.get(i).name.equalsIgnoreCase(name)) {
inventory.remove(i);
break;
}
}
}
 public void displayInventory() {
System.out.println(&quot;Inventory:&quot;);
for (Product product : inventory) {
System.out.println(&quot;Name: &quot; + product.name + &quot;, Price: &quot; + product.price + &quot;, Category: &quot;
+ product.category );
}
}
public static void main(String[] args) {
OnlineShoppingManager manager = new OnlineShoppingManager();

manager.addProduct(&quot;Laptop&quot;, 40000, &quot;Electronics&quot;);
manager.addProduct(&quot;T-shirt&quot;, 550, &quot;Clothing&quot;);
manager.addProduct(&quot;Book&quot;, 920, &quot;Books&quot;);

manager.displayInventory();

manager.removeProduct(&quot;Book&quot;);

manager.displayInventory();
manager.removeProduct(&quot;Laptop&quot;);

manager.displayInventory();
}
}
