import java.util.Arrays;
import java.util.Scanner;

public class longitudarray {
    public static void main(String args[]){
        Scanner longi = new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int N = longi.nextInt();
        int[] array = new int[0];
        array = Arrays.copyOf(array, N);
        System.out.println("Introduce los valores que habrá en el array");
        array[N] = longi.nextInt();
        longi.close();
        System.out.println(Arrays.toString(array));
    }
}
