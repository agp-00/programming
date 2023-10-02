public class arrayburbuja {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int lng = array.length;
        for (int i = 0; i < lng - 1; i++) {
            // Realiza 1a pasada
            for (int j = 0; j < lng - i - 1; j++) {
                // Compara elementos adyacentes y los intercambia si están en el orden incorrecto
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Muestra el array ordenado
        System.out.println("Array ordenado:");
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
