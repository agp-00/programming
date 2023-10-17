public class recorrerrandom {
    public static void main(String args[]) {
        final int min = 100;
        final int max = 200;
        int [] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        
        for (int a : numeros) {
        System.out.println(a);
        } 
    }
}
