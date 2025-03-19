import java.util.Scanner;

public class CalificacionParaBeca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
   System.out.println("ingrese su calificacion (0-100)");
   double calificacion = scanner.nextDouble();

   System.out.println("Ingrese porcentaje de asistencia: ");
    double asistencia = scanner.nextDouble();

    if (CalificacionParaBeca(calificacion, asistencia)) {
        System.out.println("¡Felicidades! Calificas para la beca");
        
         }else{
            System.err.println("¡Lo sentimos!No calificas para la beca");
       }
        scanner.close();
  }
    public static boolean CalificacionParaBeca(double calificacion , double asistencia){
        return(calificacion >= 8.5 && asistencia >= 90);
    }
  
  
  
  
    }

