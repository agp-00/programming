import java.util.Scanner;

public class impar {
    public static void main(String args[]) {
        
        Scanner num = new Scanner(System.in);
        System.out.println("Elige el número a comprobar si es par o impar:");
        int i = num.nextInt();
        
        if (i % 2 == 0) {
            System.out.println("El número introducido es par");
        } else if (i % 2 != 0) {
            System.out.println("El número introducido es impar");
        }
        num.close();
    }
}
