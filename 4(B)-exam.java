/*
=====================================================================
Design a JAVA program to help a teacher track the exam scores of five
students in a class. The teacher wants to input the exam scores of each
student and then view statistics such as the sum of all scores and the
highest score attained.
======================================================================
*/

public class ExamScoreTracker {
public static void main(String[] args) {
final int NUM_STUDENTS = 5;
int[] examScores = new int[NUM_STUDENTS];
// Input exam scores for each student
Scanner scanner = new Scanner(System.in);
System.out.println(&quot;Enter exam scores for each student:&quot;);
for (int i = 0; i &lt; NUM_STUDENTS; i++) {
System.out.print(&quot;Enter score for student &quot; + (i + 1) + &quot;: &quot;);
examScores[i] = scanner.nextInt();
}
int sum = 0;
int highestScore = examScores[0];
for (int score : examScores) {
sum += score;
if (score &gt; highestScore) {
highestScore = score;
}
}
// Display statistics
System.out.println(&quot;\nExam score statistics:&quot;);
System.out.println(&quot;Sum of all scores: &quot; + sum);
System.out.println(&quot;Highest score attained: &quot; + highestScore);
}
}
