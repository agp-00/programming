import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {
        
        Scanner num = new Scanner(System.in);
        System.out.println("Elige de que número quieres hacer la secuencia de Fibonacci:");
        int i1 = num.nextInt();
        
        int i = 0;
        int j = 1;
        int suma = 1;
        
        for (int k = 1;k<i1;k++) {
            suma = i + j;
            i = j;
            j = suma;
        }
        num.close();
        System.out.println("La secuencia de Fibonacci de " + i1 + " es igual a " + i);
    }
}
