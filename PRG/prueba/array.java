package PRG.prueba;

import java.util.Collections;
import java.util.Scanner;

public class array {
        public static void main(String args[]){
        Scanner longi = new Scanner(System.in);
        System.out.println("Introduce la longitud del array:");
        int N = longi.nextInt();
        int[] array = new int[N];

        for(int i = 0 ; i < N; i++){
            System.out.println("Introduce el siguiente valor que habrá en el array:");
            array[i] = longi.nextInt();
            if (i == N-1) {
                System.out.println("Los elementos del array son los siguientes:");
                for (i = 0; i < N; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        
        longi.close();
    }
}
