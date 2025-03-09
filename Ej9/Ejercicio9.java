package Ej9;
/*Desarrolla un programa que solicite un número y determine 
si es múltiplo de 3 y de 5 simultáneamente. 
Usa el operador módulo junto con operadores lógicos para evaluar 
ambas condiciones y muestra el resultado.*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;

        System.out.println("Ingrese un numero: ");
        numero1 = scanner.nextInt();

        if(numero1 % 3 == 0 && numero1 % 5 == 0){
            System.out.println("El numero es multiplo de 3 y de 5");
        }
        else{
            System.out.println("El numero no es multiplo de 3 y de 5");
        }
        scanner.close();
    }
}
