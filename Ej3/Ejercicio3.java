package Ej3;
/*Diseña una calculadora que reciba dos números y un símbolo de operador (+, -, *, /, %). 
Según el operador ingresado, realiza la operación correspondiente. 
Considera la validación para evitar la división por cero.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int numero1;
        int numero2;
        String operador;
        int resultado = 0;
    
        System.out.println("Ingrese el primer numero:");
        numero1 = scanner.nextInt();
    
        System.out.println("Ingrese el segundo numero:");
        numero2 = scanner.nextInt();
    
        System.out.println("Ingrese el operador aritmetico:");
        operador = scanner.next();

        switch (operador) {

            case "+":
                resultado = numero1 + numero2;
                break;

            case "-":
                resultado = numero1 - numero2;
                break;

            case "*":
                resultado = numero1 * numero2;
                break;

            case "/":
                if(numero1 == 0 || numero2 == 0){
                    System.out.println("No se puede dividir por cero :(");
                }
                else{
                    resultado = numero1 / numero2;
                break;
                }
            
            case "%":
                resultado = numero1 % numero2;
                break;
        
            default:
                System.out.println("Operador aritmetico no valido");
                break;
        }

        System.out.println(resultado);
        scanner.close();
    }

}
