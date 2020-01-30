public class zadan
{
public static void main (String[] args) {
int sum=0;
int p=1;
for (int i=0; i<args.length; i++) {
int invert=Integer.parseInt(args[i]);
sum=sum+invert;
p=p*invert;
}
System.out.println("Сумма "+sum);
System.out.println("Произведение "+p);
}
}
