import java.util.Arrays;
import java.util.Collections;

public class ordeninverso {
    public static void main(String args[]) {
        Integer [] numeros = {1, 4, 6, 2, 3, 7, 5};
        Arrays.sort(numeros, Collections.reverseOrder());
        for (int n : numeros) {
            System.out.print(n + ", ");
        }
    }
}
