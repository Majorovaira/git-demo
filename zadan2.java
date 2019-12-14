import java.util.Scanner;
public class zadan2 
{
public static void main (String [] args) 
{
Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter array length: ");
    int size = input.nextInt();     int array[] = new int[size]; 
    System.out.println("Insert array elements:");

    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();     }
int min,max;
min=array[0];
for (int i = 0; i < size; i++){
    if (min>array[i]) {
min=array[i];}
}
max=array[0];
for (int i = 0; i < size; i++){
    if (max<array[i]) {
max=array[i];}
}
  System.out.println(min+"-минимальное число ");
 System.out.println ( (min+"").length()+" его длина"); 
  
  System.out.println(max+"-максимальное число ");
 System.out.println ( (max+"").length()+" его длина");   
  
}
}