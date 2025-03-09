/*Solicita la edad de una persona y clasifícala en:

○ "Niño" si es menor de 12 años

○ "Adolescente" si está entre 12 y 17 años

○ "Adulto" si es 18 o mayor

● Operadores utilizados: relacionales y lógicos. */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
  
        if (edad < 12) {
            System.out.println("Eres un niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un adolscente");
        } else { 
            System.out.println("Eres un adulto");
        }

        scanner.close();
    }
}
