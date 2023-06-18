package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double h3,h2,a,b,c,h;
		System.out.println("Introduce numero para a");
		a=teclado.nextDouble();
		System.out.println("Introduce numero para b");
		b=teclado.nextDouble();
		System.out.println("Introduce numero para c");
		c=teclado.nextDouble();
		h=(b*b)-4*a*c;
		if (h<0) {
		System.out.println("No es posible");
		}
		else {
		h3=(-b+Math.sqrt(h))/(2*a);	
		h2=(-b-Math.sqrt(h))/(2*a);	
		System.out.println("x= "+h3);
		System.out.println("x= "+h2);
		}
		}
}