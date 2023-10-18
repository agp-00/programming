package PRG.prueba;

import java.util.Arrays;
import java.util.Scanner;

public class array {
        public static void main(String args[]){
        Scanner longi = new Scanner(System.in);
        System.out.println("Introduce la longitud del array:");
        int N = longi.nextInt();
        int[] array = new int[N];
        double suma = 0;

        for(int i = 0 ; i < N; i++){
            System.out.println("Introduce el siguiente valor que habrá en el array:");
            array[i] = longi.nextInt();
            suma = suma + array[i];
            if (i == N-1) {
                System.out.println("Los elementos del array son los siguientes:");
                for (i = 0; i < N; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println("\nLa media de los numeros del array es: " + (suma/N));
                Arrays.sort(array);
                System.out.println("El valor mínimo del array es " + array[0]);
                System.out.println("El valor máximo del array es " + array[N-1]);
                double j;
            }
        }
        

        longi.close();
    }
}
