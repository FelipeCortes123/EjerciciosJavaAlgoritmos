package Ej19;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la velocidad del vehiculo");
        int velocidad = scanner.nextInt();

        int limite = 60;

        if (velocidad <= limite) {
            System.out.println("Velocidad permitida");
        } else if (velocidad > limite && velocidad <= limite + 20) {
            System.out.println("Exceso leve de velocidad");
        } else {
            System.out.println("Exceso grave de velocidad");
        }

        scanner.close();
    }
}
