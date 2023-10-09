public class sumapares {
    public static void main(String args[]) {
        int j = 0;
        for (int i=1;i<=100;i++) {
            if (i%2 == 0) {
                j+= i;
            }
        }
        System.out.println("La suma de los números pares del 1 al 100 es " + j);
    }
}
