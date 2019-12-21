import java.util.*;
public class zadan3
{
public static void main (String [] args) 
{
Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter array length: ");
    int size = input.nextInt();   
  String array[] = new String[size]; 
    System.out.println("Insert array elements:");

    for (int i = 0; i < size; i++) {
        array[i] = input.next();     }
for (int i=array.length-1;i>0;i--) {
for (int j=0; j<i; j++) {
if (array[j].length()>array[j+1].length()) {
String tmp=array[j];
array[j]=array[j+1];
array[j+1]=tmp;}
}
}
for (int i=0; i<array.length; i++) {
System.out.println(array[i]);
}
}
}
