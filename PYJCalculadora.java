package pyjcalculadora;
import java.util.*;

public class PYJCalculadora {    
    int numero1;
    int numeroPorTeclado;
    
    public PYJCalculadora(){
        this.numero1 = 1;
        this.numeroPorTeclado = 1;
    }

    public PYJCalculadora(int numero1, int numeroPorTeclado) {
        this.numero1 = numero1;
        this.numeroPorTeclado = numeroPorTeclado;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumeroPorTeclado() {
        return numeroPorTeclado;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumeroPorTeclado(int numeroPorTeclado) {
        this.numeroPorTeclado = numeroPorTeclado;
    }
        
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seleccion = 0;
        Boolean salir = false;
        
        do{
            System.out.println("----------MENU----------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Salir");
            System.out.print("¿Que ecuacion quiere elegir? ");
            seleccion = teclado.nextInt();
            
            switch (seleccion) {
                case 1:
                    System.out.print("Introduzca un numero a sumar: ");
                    int sum1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero a sumar: ");
                    int sum2 = teclado.nextInt();
                    System.out.println("La suma de " + sum1 + " + " + sum2 + " = "+"\u001B[36m"+(sum1+sum2)+"\u001B[0m");
                    break;
                case 2:
                    System.out.print("Introduzca un numero a restar: ");
                    int resta1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero a restar: ");
                    int resta2 = teclado.nextInt();
                    System.out.println("La resta de " + resta1 + " - " + resta2 + " = "+"\u001B[36m"+(resta1-resta2)+"\u001B[0m");
                    break;
                case 3:
                    System.out.print("Introduzca un numero para dividir: ");
                    int div1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero para dividir: ");
                    int div2 = teclado.nextInt();
                    System.out.println("La division de " + div1 + " / " + div2 + " = "+"\u001B[36m"+(div1/div2)+"\u001B[0m");
                    break;
                case 4:
                    System.out.print("Introduzca un numero a multiplicar: ");
                    int multi1 = teclado.nextInt();
                    System.out.print("Introduzca el segundo numero a multiplicar: ");
                    int multi2 = teclado.nextInt();
                    System.out.println("La multiplicacion de " + multi1 + " * " + multi2 + " = "+"\u001B[36m"+(multi1*multi2)+"\u001B[0m");
                    break;
                default:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
            }
        }while(salir == false);
    }
}