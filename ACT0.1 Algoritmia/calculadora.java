import java.util.Scanner;

public class calculadora {
    public static void main(String args[]) {
        Scanner operador = new Scanner(System.in); {
            System.out.println("Qué desea hacer");
            System.out.println("1. Suma 2. Resta 3. Multiplicación 4. División");
            int elec = operador.nextInt();
            if (elec>=1 && elec<=4) {
                if (elec==1) {
                    System.out.println("Elige el primer número que sumar");
                    double i = operador.nextDouble();
                    System.out.println("Elige el segundo número que sumar");
                    double i2 = operador.nextDouble();
                    double i3 = i + i2;
                    System.out.println("La suma de los dos números és " + i3);
                } else if (elec==2) {
                    System.out.println("Elige el primer número que restar");
                    double i = operador.nextDouble();
                    System.out.println("Elige la cantidad a restar");
                    double i2 = operador.nextDouble();
                    double i3 = i - i2;
                    System.out.println("La resta de los dos números és " + i3);
                } else if (elec==4) {
                    System.out.println("Elige el dividendo");
                    double i = operador.nextDouble();
                    System.out.println("Elige el divisor");
                    double i2 = operador.nextDouble();
                    double i3 = i / i2;
                    System.out.println("La división de los dos números és " + i3);
                } else if (elec==3) {
                    System.out.println("Elige el número que multiplicar");
                    double i = operador.nextDouble();
                    System.out.println("Elige el número por el que se multiplicará");
                    double i2 = operador.nextDouble();
                    double i3 = i * i2;
                    System.out.println("La multiplicación de los dos números és " + i3);
                } else {
                    System.out.println("Ha ocurrido un error, vuelva a intentarlo");
                }
            }
        }
    }
}
