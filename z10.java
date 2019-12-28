import java.util.*;
public class z10
{
public static void main (String [] args) 
{
Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter n: ");
    int n = input.nextInt();   

  
    System.out.println("max");
int m=input.nextInt();
int [] []array=new int[n][n];
    for (int i = 0; i < n; i++) {
         for (int j=0; j<n; j++){
      array[i][j]=(int) (Math.random()*m);
   }
}
for (int i = 0; i < n; i++) {
         for (int j=0; j<n; j++){
System.out.print(array[i][j]+" ");
}
System.out.print("\n");
}

            System.out.println("Итог:");
     int max;
max=array[0][0];
int imax=0;
int jmax=0;
            for (int i=0;  i<n; i++)
                for (int j=0; j < n; j++) {
                    if (max<array[i][j]){
                       max=array[i][j];
                       imax=i;
                       jmax=j;
                        }
                    }
                System.out.println(max);
 
  System.out.println(jmax);
 System.out.println(imax);
 
int [][] mass =new int[n-1][n-1];
int newi=0; int newj=0;
for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++)   {
 if (i!=imax){
if (j!=jmax) {
mass[newi][newj]=array[i][j];
++newj;
}
}
else {
--newi;
break;
}
}
newi++;
newj=0;
}


for (newi=0;newi<n-1;newi++) {
for (newj=0;newj<n-1;newj++) {
 System.out.print(mass[newi][newj]+" ");}
System.out.print("\n");

}

}
}