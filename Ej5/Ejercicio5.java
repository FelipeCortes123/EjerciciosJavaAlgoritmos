package Ej5;
/*Elabora un programa que pida al usuario un nombre de usuario y una contraseña. 
Compara los valores ingresados con credenciales predefinidas utilizando operadores relacionales y lógicos. 
Si ambos coinciden, muestra "Acceso permitido"; de lo contrario, muestra "Acceso denegado".*/

import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String usuarioDefinido = "juan";
        String passwordDefinido = "1234";
        String usuarioConsola = "";
        String passwordConsola = "";

        System.out.println("Ingrese el usuario:");
        usuarioConsola = scanner.next();

        System.out.println("Ingrese la contraseña:");
        passwordConsola = scanner.next();

        if(usuarioConsola.equals(usuarioDefinido) && passwordConsola.equals(passwordDefinido)){
            System.out.println("Bienvenido :)");
        }
        else{
            System.out.println("Acceso Denegado :(");
        }

        scanner.close();

    }
}