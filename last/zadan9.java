import java.util.*;
public class zadan9
{
public static void main (String [] args) 
{
Scanner input = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Enter n: ");
    int n = input.nextInt();   
System.out.println("столбец для проверки");
int k=input.nextInt();
  int array[][] = new int[n][n]; 
    System.out.println("max");
int m=input.nextInt();
    for (int i = 0; i < n; i++) {
         for (int j=0; j<n; j++){
      array[i][j]=(int) (Math.random()*m);
   }
}


            System.out.println("Итог:");
 
            for (int i=0;  i<n; i++)
                for (int l=i+1; l < n; l++) {
                    if (array[i][k] > array[l][k]){
                        for (int j=0; j < n; j++) {
                            int temp = array[i][j];
                            array[i][j]=array[l][j];
                            array[l][j]=temp;
                        }
                    }
                }
 
 
 
            for (int i=0; i<n; i++)
            {
                for (int j=0; j<n; j++)
                {
                    System.out.print(array[i][j]+" ");
                }
                System.out.print("\n");
            }
}
}
