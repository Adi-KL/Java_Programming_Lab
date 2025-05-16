/*
=================================================
Design JAVA program to print a chessboard pattern.
=================================================
*/

public class ChessboardPattern {
public static void main(String[] args) {
int size = 8; // Size of the chessboard
for (int i = 0; i &lt; size; i++) {
for (int j = 0; j &lt; size; j++) {
if ((i + j) % 2 == 0) {
System.out.print(&quot;**&quot;);
} else {
System.out.print(&quot; &quot;);
}
}
System.out.println();
}
}
}
