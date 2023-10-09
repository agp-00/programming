import java.util.Scanner;

public class caracter {
   public static void main(String []args) {
    //Creación de scanner con nombre frase
    Scanner frase = new Scanner(System.in);
    System.out.println("Si la frase contiene una 'X' se detendrá el programa.");
    System.out.println("Escoja una frase a analizar:");
    //creación de string llamada frase 1, 
    //frase.nextline() -> frase = nombre del scanner donde guarda la frase que introduzcamos, nextLine() = proxima string introducida
    String frase1 = frase.nextLine();
    // creo variable ocurrencia y ocurrencia2 para usarlas despues para encontrarlas en la frase introducida justo ahora
    char ocurrencia = 'l';
    char ocurrencia2 = 'L';
    //variable int creada para contar las veces que se repita la secuencia
    int count = 0;
     // variable i para recorrer la string introducida, el programa siempre empieza a contar desde 0 en vez de desde 1
     //frase1.length para que el bucle termine en cuanto i sea igual a la longitud de la frase introducida
     //i++ para que al terminar el bucle sume 1 a la variable i y vuelva a hacer la comprobacion
    for (int i = 0; i < frase1.length(); i++) {
        //if frase1 para que sea la frase que ha guardado el scanner, charAt(i) = el numero de caracter por el que va comprobando
        //Si la frase contiene una X o una x dejará de recorrer la frase
        //importante poner esto antes de la comprobacion de caracteres para que deje de contar antes
        if (frase1.charAt(i) == 'X' || frase1.charAt(i) == 'x') {
            break;
        }  
        /* == ocurrencia para comprobar que sea una l minuscula el caracter que esta mirando
         * && se usa como 'and'
         * (i+1) para que que al encontrar una l compruebe si el siguiente caracter es una a, luego || que significa 'or' y lo mismo con A
         * count++ para que en caso de encontrar un resultado sume 1 a las veces que ha encontrado algo
        */
        if (frase1.charAt(i) == ocurrencia && frase1.charAt(i+1) == 'a' || frase1.charAt(i+1) == 'A') {
            count++;
        } else if (frase1.charAt(i) == ocurrencia2 && frase1.charAt(i+1) == 'a' || frase1.charAt(i+1) == 'A') {
            count++;
        }
        //cerramos el scanner para dar por terminado el programa
        frase.close();
    }
    System.out.println("La ocurrencia 'la' se repite " + count + " veces.");
   }
}