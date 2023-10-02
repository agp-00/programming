import java.util.Arrays;

public class ordenarray {
    public static void main(String args[]) {
        int [] numeros = {1, 4, 6, 2, 3, 7, 5};
        Arrays.sort(numeros);
        for (int n : numeros) {
            System.out.print(n + ", ");
        }
    }
}
