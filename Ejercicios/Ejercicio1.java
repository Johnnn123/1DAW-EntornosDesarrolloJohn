package Ejercicios;
import java.util.Scanner;


public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nume;
		String a;
		System.out.println("Introduce un numero");
		a=teclado.next();
		nume=a.length();
		System.out.println("El número "+a+" tiene "+nume+" caracteres.");
		}
}
