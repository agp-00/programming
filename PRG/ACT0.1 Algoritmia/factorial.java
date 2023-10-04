import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner facto = new Scanner(System.in);
       
        System.out.println("Elige de que número quieres hacer el factorial:");
        int base = facto.nextInt();
        int j = 1;
       
        for (int i=base;i>0;i--) {
            j= j * i;
        }
       
        facto.close();
    
        System.out.println("El factorial de " + base + " es igual a " + j);
    }
}
