import java.util.Scanner;

public class caracter {
   public static void main(String []args) {
    Scanner frase = new Scanner(System.in);
    System.out.println("Si la frase contiene una 'X' se detendrá el programa.");
    System.out.println("Escoja una frase a analizar:");
    String frase1 = frase.nextLine();
    char ocurrencia = 'l';
    int count = 0;
     
    for (int i = 0; i < frase1.length(); i++) {
        if (frase1.charAt(i) == 'X') {
            break;
        }
        if (frase1.charAt(i) == ocurrencia && frase1.charAt(i+1) == 'a') {
            count++;
        }
    }
    System.out.println("La ocurrencia 'la' se repite " + count + " veces.");
   }
}