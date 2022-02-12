package com.java;

public class Metodos {

	public static void main(String[] args) {
		/*
		 * Caracteristicas de un metodo
		 * 
		 * #1 - Un metodo no puede escribirse fuera de la clase #2 - Un metodo no se
		 * puede escribir dentro de otro metodo #3 - El metodo main es el punto de
		 * entrada del programa #4 - Un metodo comienza con { y termina con otra } #5
		 * -Dentro de un metodo se puede invocar otro metodo
		 * 
		 * #6 - Un metodo se puede sobrecargar (Overloading)
		 * 
		 */

//		algo();

//		printHola();
//		System.out.println(resta(10.5,6.7));
//		System.out.println("He is Man?: "+isMan());

		algo();
		int suma3enteros = suma(6, 7, 8);
		System.out.println(suma3enteros);
		int suma2enteros = suma(5, 7.7);
		System.out.println(suma2enteros);
		double resta3enterosdouble = resta(6.7, 134.5, 12.3);
		System.out.println(resta3enterosdouble);

		boolean isReallyMan = isMan(false);
		System.out.println(isReallyMan);

	}

	public static void printHola() {
		System.out.println("hola");
	}

	public static double resta(double x, double y) {
		return x - y;
	}

	// OVERLOADING
	public static double resta(double x, double y, double z) {
		double resta = x - y - z;
		return resta;
	}

	public static int suma(int x, int y, int z) {
		int suma = x + y + z;
		return suma;
	}

	// OVERLOADING
	public static int suma(int x, double y) {
		double suma = x + y;
		return (int) suma;
	}

	public static boolean isMan() {
		return true;
	}

	// OVERLOADING
	public static boolean isMan(boolean man) {
		return man;
	}

	public static void algo() {
		printHola();
		System.out.println("He is Man?: " + isMan());
		System.out.println(resta(10.5, 6.7));
	}

	// QA
	public static void loginPortal(String user, String password) {
		System.out.println("Ingrese su usuario" + user);
		System.out.println("Ingrese su contraseña" + password);
	}

	// Demo
	public static void loginPortal(String user, String password, String token) {
		System.out.println("Ingrese su usuario" + user);
		System.out.println("Ingrese su contraseña" + password);
		System.out.println("Ingrese su token" + token);
	}

}
