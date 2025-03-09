/*Solicita tres números que representan longitudes de lados. 
 Verifica si pueden formar un triángulo (la suma de dos lados debe ser mayor que el tercero). 
 Si es posible, clasificarlo como:
 ○ Equilátero (los tres lados iguales)

 ○ Isósceles (dos lados iguales)

 ○ Escaleno (todos diferentes)

 ● Operadores utilizados: aritméticos, relacionales y lógicos*/


import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Tercer lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isosceles");
            } else {
                System.out.println("Es un triángulo escaleno");
            }
        } else {
            System.out.println("Los datos ingresados no representan a un triangulo");
        }

        scanner.close();
    }
}
