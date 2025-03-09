package Ej13;
/* Solicita una temperatura en grados Celsius, conviértela a Fahrenheit usando la 
fórmula F = (C * 9/5) + 32 y muestra un mensaje indicando si 
la temperatura es "fría" (menos de 50°F) o "cálida" (50°F o más).
● Operadores utilizados: aritméticos y relacionales*/

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

       
        double fahrenheit = (celsius * 9 / 5) + 32;

   
        System.out.println("La temperatura fahrenheit es: " + fahrenheit);

        if (fahrenheit < 50) {
            System.out.println("Hace frio");
        } else {
            System.out.println("Hace calor");
        }

        scanner.close();
    }
}
