import java.util.Scanner;
public class Ejercicio1 { // Clase principal
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.print("Introduza su nombre: ");
int nombre = sc.nextInt();
System.out.print("Introduzca su apellido: ");
int apellido =sc.nextInt();
System.out.print( nombre + apellido);
sc.close();
}
}