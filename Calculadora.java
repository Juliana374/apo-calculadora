//Calculadora que pide al usuario 2 números
/*Entradas: numero 1 y numero 2
 *Salidas: 5 por cada resultado de la operación aritmética
 */
import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);

        Double numero1, numero2;
        System.out.println ("Por favorcito deme el primer numerito: ");
        numero1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("El número que ingresaste es: " + numero1);

      
        System.out.println ("Por favorcito deme el segundo numerito: ");
        numero2 = entrada.nextDouble();
        entrada.nextLine();
       
        double suma, resta, multiplicacion, division, modulo;
        suma= numero1 + numero2;
        resta= numero1 - numero2;
        multiplicacion = numero1 * numero2;
        modulo = numero1 % numero2;
        division = numero1 / numero2;

          System.out.println("El resultado de la suma es: " + suma);
          System.out.println("El resultado de la resta es: " + resta);
          System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
          System.out.println("El resultado de la división es: " + division);
          System.out.println("El resultado del modelo es: " + modulo);


  }
    public static double sumar(double a, double b) {
        double sumar = a + b;
        return sumar; 
        }
    public static double restar(double a, double b) {
        double restar = a - b;
        return restar; 
        }
    public static double dividir(double a, double b) {
        double dividir = a / b;
        return dividir; 
        }
    public static double modelo(double a, double b) {
        double modelo = a % b;
        return modelo; 
        }
}




