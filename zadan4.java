import java.util.*;
public class zadan4
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
float summOfAll=0f;
for (String cel : array) {
summOfAll+=(float) cel.length();
}
summOfAll/=array.length;
System.out.println(summOfAll);
for (int i=0; i<size; i++) {
if (array[i].length()<summOfAll) {
System.out.println(array[i]+"длина"+array[i].length());
}
}
}
}