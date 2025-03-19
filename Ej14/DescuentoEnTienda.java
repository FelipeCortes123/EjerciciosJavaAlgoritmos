package Ej14;
import java.util.Scanner;

public class DescuentoEnTienda {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el monto de la compra");
    double monto = scanner.nextDouble();

    double descuento = calcularDescuento(monto);
    double totalPagar = monto - descuento;

    System.out.println("Descuento aplicado: $" + descuento);
    System.out.println("Total a pagar: $" + totalPagar);

    scanner.close();
}
 public static double calcularDescuento(double monto){
 if (monto > 50) {
    return monto * 0.15; // 15% de descuento
    
}else{
    return 0;// sin descuento
}

}
}

