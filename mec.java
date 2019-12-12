import java.util.Scanner;
public class mec
{
public static void main (String[] args) 
{
System.out.println("Enter number from 1 to 12 ");
Scanner num = new Scanner(System.in);
int mec = num.nextInt();

if (mec ==1) {
System.out.println("January");
}
else if (mec ==2) {
System.out.println("Feb");
}
else if (mec ==3) {
System.out.println("Marc");
}
else if (mec ==4) {
System.out.println("April");
}
else if (mec ==5) {
System.out.println("May");
}
else if (mec ==6) {
System.out.println("Jn");
}
else if (mec ==7) {
System.out.println("Jl");
}
else if (mec ==8) {
System.out.println("Aug");
}
else if (mec ==9) {
System.out.println("Sept");
}
else if (mec ==10) {
System.out.println("Oct");
}
else if (mec ==11) {
System.out.println("Nov");
}
else if (mec ==12) {
System.out.println("Dec");
}
else {
System.out.println("Error");
}
}
}