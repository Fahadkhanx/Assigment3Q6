//1. 
public class Assignment3Q6 {
 public static void main(String args[]) {
 int rows = 5;
 int c = 1;
 while (c <= rows) {
 int d = 1;
 while (d <= c) {
 System.out.print("*");
 d++;
 }
 System.out.println();
 c++;
}
//2. 
 int e = 1;
 while (e <= rows) {
 int space = 1;
 while (space <= rows - e) {
 System.out.print(" ");
 space++;
 }
 int f = 1;
 while (f <= e) {
 System.out.print("*");
 f++;
 }
 System.out.println();
 e++;
 }
//3. 
 int g = 1;
 while (g <= rows) {
 int space = 1;
 while (space <= rows - g) {
 System.out.print(" ");
 space++;
 }
 int h = 1;
 while (h <= 2 * g - 1) {
 System.out.print("*");
 h++;
 }
 System.out.println();
 g++;
}
//4.
 int i = 1;
 while (i <= rows) {
 int space = 1;
 while (space <= rows - i) {
 System.out.print(" ");
 space++;
 }
 int j = 1;
 while (j <= 2 * i - 1) {
 System.out.print(i);
 j++;
 }
 System.out.println();
 i++;
}
//5.
 int k = 1;
 while (k <= rows) {
 int space = 1;
 while (space <= rows - k) {
 System.out.print(" ");
 space++;
 }
 int l = k;
 while (l >= 1) {
 System.out.print(l);
 l--;
 }
 l = 2;
 while (l <= k) {
 System.out.print(l);
 l++;
 }
 System.out.println();
 k++;
 }
 }
 }