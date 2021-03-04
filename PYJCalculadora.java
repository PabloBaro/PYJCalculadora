package pyjcalculadora;
import java.util.*;

public class PYJCalculadora {    
    int numero1;
    int numeroPorTeclado;
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        
        do{
            System.out.println("----------MENU----------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. División");
            System.out.println("4. Multiplicación");
            System.out.println("5. Salir");
            System.out.print("¿Qué ecuación quiere elegir? ");
            seleccion = teclado.nextInt();
            
            switch (seleccion) {
                case 1:
                    System.out.print("Introduzca un número a sumar: ");
                    int sum1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo número a sumar: ");
                    int sum2 = teclado.nextInt();
                    System.out.println("La suma de " + sum1 + " + " + sum2 + " = "+"\u001B[36m"+(sum1+sum2)+"\u001B[0m");
                    break;
                case 2:
                    System.out.print("Introduzca un número a restar: ");
                    int resta1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo número a restar: ");
                    int resta2 = teclado.nextInt();
                    System.out.println("La resta de " + resta1 + " - " + resta2 + " = "+"\u001B[36m"+(resta1-resta2)+"\u001B[0m");
                    break;
                case 3:
                    System.out.print("Introduzca un número para dividir: ");
                    int div1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo para dividir: ");
                    int div2 = teclado.nextInt();
                    System.out.println("La division de " + div1 + " / " + div2 + " = "+"\u001B[36m"+(div1/div2)+"\u001B[0m");
                    break;
                case 4:
                    System.out.print("Introduzca un número a multiplicar: ");
                    int multi1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo número a multiplicar: ");
                    int multi2 = teclado.nextInt();
                    System.out.println("La multiplicación de " + multi1 + " * " + multi2 + " = "+"\u001B[36m"+(multi1*multi2)+"\u001B[0m");
                    break;
                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }while(seleccion!=5);
    }
}