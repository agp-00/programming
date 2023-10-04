import java.util.Scanner;

public class mayor {
    public static void main(String args[]) {
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Vamos a ver cual de los dos números introducidos es mayor");
        System.out.println("Elige el primer número a comprobar:");
        int i = num.nextInt();
        
        System.out.println("Elige ahora el segundo número a comprobar");
        int i2 = num.nextInt();
        
        if (i<i2) {
            System.out.println(i2 + " es mayor que " + i);
        } else if (i>i2) {
            System.out.println(i + " es mayor que " + i2);
        } else if (i==i2) {
            System.out.println("Ambos números tienen el mismo valor");
        }
        num.close();
    }
}
