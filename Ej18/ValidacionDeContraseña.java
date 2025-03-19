package Ej18;
import java.util.Scanner;

public class ValidacionDeContraseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String ContraseñaCorrecta = "Mario2010";

    System.out.println("Ingresar la contraseña");
    String contraseñaingresada = scanner.nextLine();

    if (ContraseñaCorrecta.equals(contraseñaingresada)){
        System.out.println("Contraseña valida . Acceso permitido");
        
    }else{
        System.out.println("Contraseña Incorrecta . Acceso denegado");
    }
    scanner.close();
    }
}

