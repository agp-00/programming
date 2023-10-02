import java.util.Scanner;

public class temperatura {
    public static void main(String args[]) {
        Scanner temperatura = new Scanner(System.in); {
            {
                System.out.println("¿Qué tipo de conversión desea realizar?");
                System.out.println("1.Celsius a Fahrenheit 2.Fahrenheit a Celsius");
                int temp = temperatura.nextInt();
                if (temp == 1) {
                    System.out.println("Introduce la temperatura en Celsius");
                    double C = temperatura.nextDouble();  
                    double i2 = ((C * 9/5) + 32);
                    System.out.println("La temperatura en Fahrenheit es " + i2 + " grados Fahrenheit");
                } else if (temp == 2) {
                    System.out.println("Introduce la temperatura en Fahrenheit");
                    double F = temperatura.nextDouble();
                    double i3 = ((F - 32) * 5/9);
                    System.out.println("La temperatura en Fahrenheit es " + i3 + " grados Celsius");
                }

            }
        }
    }
}