import java.util.Scanner;

public class nota {
    public static void main(String args[]) {
        
        boolean a = false;
        Scanner nota = new Scanner(System.in); {
            
            while (a == false) {
                
                System.out.println("Introduce la nota del alumno:");
                float i = nota.nextFloat();
                
                if (i>10) {
                    System.out.println("Introduce una nota válida");
                    break;
                }          
                if (i>=5) {
                    System.out.print("El alumno ha aprobado ");
                } else {
                    System.out.print("El alumno ha suspendido ");
                }
                    
                if (i <= 2.99) {
                    System.out.println("y ha conseguido un Muy deficiente");
                } else if (i < 5) {
                    System.out.println("y ha conseguido un Insuficiente");
                } else if (i <= 5.99) {
                System.out.println("y ha conseguido un Suficiente");
                } else if (i <= 6.99) {
                    System.out.println("y ha conseguido un Bien");
                } else if (i <= 8.99) {
                    System.out.println("y ha conseguido un Notable");
                } else if (i <= 10) {
                    System.out.println("y ha conseguido un Sobresaliente");
                }
                
                System.out.println("¿Desea comprobar otra nota?");
                System.out.println("1.Si 2.No");
                int i2 = nota.nextInt();
                
                if (i2 == 2) {
                    a = true;
                    nota.close();
                }
                }
            
            } 
        }
    }
