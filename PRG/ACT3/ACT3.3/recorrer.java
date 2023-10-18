public class recorrer{
    public static void main(String args[]) {
        int [] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        
        for (int a : numeros) {
        System.out.println(a);
        } 
    }
}