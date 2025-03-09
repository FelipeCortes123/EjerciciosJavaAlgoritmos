/*Enunciado: Pide tres números que podrían representar los lados de un triángulo. 
Utiliza el teorema de Pitágoras para verificar si el triángulo es rectángulo 
(a² + b² = c², considerando el mayor como hipotenusa).
● Operadores utilizados: aritméticos, relacionales y lógicos. */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Ingresa el segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Ingresa el tercer lado: ");
        int lado3 = scanner.nextInt();

        int hipotenusa = Math.max(lado1, Math.max(lado2, lado3));
        int cateto1, cateto2;

        if (hipotenusa == lado1) {
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (hipotenusa == lado2) {
            cateto1 = lado1;
            cateto2 = lado3;
        } else {
            cateto1 = lado1;
            cateto2 = lado2;
        }

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if ((cateto1 * cateto1) + (cateto2 * cateto2) == (hipotenusa * hipotenusa)) {
                System.out.println("Triangulo Rectangulo");
            } else {
                System.out.println("Forman un triangulo pero no un rectangulo");
            }
        } else {
            System.out.println("No se puede formar un triangulo");
        }

        scanner.close();
    }
}
