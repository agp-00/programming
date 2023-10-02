import java.util.Scanner;

public class exponente {
    public static void main(String args[]) {
        Scanner numero = new Scanner(System.in); {
            System.out.println("Elige el número a exponer:");
            int num = numero.nextInt();
            System.out.print("¿Cuál será el exponente?");
            int num2 = numero.nextInt();
            double num3 = Math.pow(num, num2);
            System.out.println("El resultado es " + num3);
        }
    }
}