package com.java;

public class Loops {

	public static void main(String[] args) {
		// WHILE

		// Contador de un rango de numeros

		int numeroActual = 10;
		int numeroMaximo = 100;

		while (numeroActual <= numeroMaximo) {
			System.out.println("Contador del numero: " + numeroActual);
			numeroActual++;
		}

		// DO WHILE

		// ¿Cuantas veces se tiene que sumar un mismo para llegar a 100?
		int x = 2;
		int suma = x;
		int count = 0;

		do {
			System.out.println("Numero: " + suma);
			suma = x + suma;
			count++;

		} while (suma <= 100);
		System.out.println("El numero se sumo a si mismo: " + count);

		// FOR

		// Contador de un numero limite

		for (numeroActual = 0; numeroActual <= numeroMaximo; numeroActual++) {
			System.out.println("Contador for de numero:" + numeroActual);

		}

	}
}
