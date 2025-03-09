package Ej7;
/*Crea un programa que solicite el monto de una compra y si el cliente es miembro (valor booleano). 
Si el monto supera los $100 y el cliente es miembro, aplica un descuento del 10% y muestra el monto final; 
de lo contrario, muestra el monto original. Utiliza operadores aritméticos, relacionales y lógicos.*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int montoCompra = 0;
        boolean miembro = false;
        double montoConDescuento = 0.0;

        System.out.println("Ingrese el monto de la compra: ");
        montoCompra = scanner.nextInt();
        System.out.println("Es miembro (Diga si o no): ");
        String miembroString = scanner.next();

        if (miembroString.equals("si")) {
            miembro = true;
        }
        
        if (montoCompra > 100 && miembro == true) {
            montoConDescuento =  montoCompra - (montoCompra * 0.10);
            System.out.print("Monto con descuento: ");
            System.out.print(montoConDescuento);
        }
        else
        {
            System.out.println("Monto sin descuento: ");
            System.out.println(montoCompra);
        }

        scanner.close();
        
    }
}
