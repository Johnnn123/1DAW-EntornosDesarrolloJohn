package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double r,area;
		System.out.println("Introduce el radio");
		r=teclado.nextDouble();
		area=(r*Math.PI*r);
		System.out.println("El area es "+area+" m2");
		}
}

