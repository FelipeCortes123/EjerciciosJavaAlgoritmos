import java.util.Scanner;

public class EvaluacionDeNotaas {
     
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
 //igresar el numero del estudiante
  System.out.println("ingrese la nota del estudiante");
  int nota = scanner.nextInt();

// verificar si aprobo o reprobo

  if (nota >= 6) {
    System.out.println("la nota"+ nota + "  aprobo");
   
  } else  {
    System.out.println("la nota"+ nota + "  reprobo");


}
 scanner.close();


}
}
