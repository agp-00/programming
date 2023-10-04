import java.util.Scanner;

public class primos {
    public static void main(String args[]) {
       
        Scanner numeros = new Scanner(System.in);
       
        System.out.println("Vamos a ver los números primos que hay entre los dos números elegidos");
        System.out.println("Elige el primer número");
        int num = numeros.nextInt();
        System.out.println("Elige el segundo número");
        int num2 = numeros.nextInt();
        System.out.println("Los números primos del " + num + " hasta el " + num2 + " son:");
        
        for (int i = num; i<=num2; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
            }
            numeros.close();
        }

        public static boolean esPrimo(int numero){
            int contador = 2;
            boolean primo=true;
            while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                    primo = false;
            contador++;
            }
            return primo;
        }
}