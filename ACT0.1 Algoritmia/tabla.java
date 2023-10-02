import java.util.Scanner;

public class tabla {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in); {
        System.out.println("Elige un número que multiplicar del 1 al 10");
        int numero = num.nextInt();
        int i;
        for (i=0;i<=10;i++) {
            int num2 = numero * i;
            System.out.println(numero + " multiplicado por " + i + " es igual a " + num2);
        }
        }
    }
}
