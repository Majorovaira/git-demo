import java.util.Scanner;
public class Priv {

    public static void main(String[] args) {
System.out.println("Введи свое имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        scan.close();
}
}