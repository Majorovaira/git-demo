import java.util.*;
public class zadan5
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
int SumOfChet=0;
int numb=0;
int dl;
for (String cel:array) {
char [] result=cel.toCharArray();
for (int j=0; j<result.length; j++) {
if (result[j]%2==0) {
numb=numb+1;
dl=result.length;
if (numb==dl) {
SumOfChet=SumOfChet+1;
}
}
}
numb=0;
}
System.out.println(SumOfChet);
}
}