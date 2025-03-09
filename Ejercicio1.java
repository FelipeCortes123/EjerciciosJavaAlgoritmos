/*Crea un programa que solicite dos números al usuario. Utiliza operadores aritméticos para calcular y 
mostrar la suma y la resta de dichos números.*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado;
        System.out.println("Ingrese el primer numero:");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = scanner.nextInt();
        resultado = numero1 + numero2;
        System.out.println("Suma de los dos numeros -> " + resultado);
        scanner.close();

    }
}