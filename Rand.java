import java.util.Scanner;
import java.util.Random;
public class Rand{
public static void main (String [] args) {
System.out.println("number");
Scanner in=new Scanner(System.in);
int x=in.nextInt();
int i=0;
while (i<x){
Random rand=new Random();
int ix=rand.nextInt();
System.out.println(ix);
i=i+1;
}
}
}