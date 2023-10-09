import java.util.Scanner;

public class ex1 {
    public static void main(String args[]) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Introduce un número entero a analizar:");
        int num = numero.nextInt();
        System.out.println("Los números divisibles de " + num + " son los siguientes:");
        numero.close();

        for (int i = 1; i<=num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
            }
        }

}