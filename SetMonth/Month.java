//package setMonth;
import java.util.Scanner;
public class Month 
{
static void setMonth (int a)
{
String [] month ={"январь", "феваль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
String s;
try {
s=month[a-1];
System.out.println(s);
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println("error");
}
}
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter num");
int n=sc.nextInt();
setMonth(n);
}
}
