import java.util.Arrays;

public class arrayburbuja {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int lng = array.length;
        for (int i = 0; i < lng - 1; i++) {
            for (int j = 0; j < lng - i - 1; j++) {
                if (array[j] > array[j+1]) {
                   int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Array ordenado:" + Arrays.toString(array));
    }
}
