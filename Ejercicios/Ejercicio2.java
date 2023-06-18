package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double ra,area;
		System.out.println("Introduce el radio");
		ra=teclado.nextDouble();
		area=(ra*Math.PI*ra);
		System.out.println("El area es "+area+" m2");
		System.out.println("holaaa");
		}
}

