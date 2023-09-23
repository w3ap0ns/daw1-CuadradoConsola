import java.util.Scanner;

public class app {

    public static void main(String[] arg){

        /*En el ejercicio 2 (CuadradoConsola) se solicita al usuario el lado del
        cuadrado a calcular (usa decimales).*/

        Scanner readln = new Scanner(System.in);

        // Declaración de variables:
        double lado = 0;
        double areaCuadrado = 0;

        // Operación - Pedir lado al usuario:
        System.out.printf("Introduce el lado del cuadrado para calcular su área;...\n");
        lado = readln.nextDouble();
        areaCuadrado = Math.pow(lado,2);

        // Output:
        System.out.printf("Calculando...\n");
        System.out.printf("El área del cuadrado es: %.2f\n", areaCuadrado);

        } // public static void main(String[] arg)

} // public class app
