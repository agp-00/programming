public class pruebabidimensional {
    public static void main(String args[]) {
        int [][] matriz = {{2, 3, 4, 61, 1, 654, 94, 354, 54},
                           {8, 9, 10},
                           {5, 6, 7}};
        
        for (int [] array : matriz) {
            for (int a : array) {
                    System.out.println(a);
            }
        }
    }
}
