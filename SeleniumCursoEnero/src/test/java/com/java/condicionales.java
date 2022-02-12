package com.java;

public class condicionales {

	public static void main(String[] args) {
		// CONDIOCIONALES

		// Automovil conduciento a exceso de velocidad

		int velocidadActual = 45;
		int velocidadMaxima = 90;
		boolean carretera = true;

		/*
		 * if(velocidadActual > velocidadMaxima){
		 * System.out.println("Exceso de Velocidad"); }
		 */

		// IF ELSE

//	if(velocidadActual > velocidadMaxima){
//		System.out.println("Exceso de Velocidad");
//	}else
//		System.out.println("Descuento");
//	
		// IF ANIDADO

//	if(carretera){
//	if(velocidadActual > 90)
//		System.out.println("Exceso de Velocidad - Carretera");
//	}else
//		System.out.println("Descuento");

		// IF ELSE IF

		if (carretera) {
			velocidadMaxima = 90;

			if (velocidadActual > velocidadMaxima) {
				System.out.println("Multa - Vas en Carretera");
			} else {
				System.out.println("Descuento - Vas en Carretera");
			}
		} else if (velocidadActual > velocidadMaxima) {
			System.out.println("Multa - Vas en Calle");
		} else
			System.out.println("Descuento - Vas en Calle");

		// SWITCH CASE
		int temperatura = 2;

		switch (temperatura) {
		case 10:
			System.out.println("México");
			System.out.println("Costa Rica");
			break;

		case 3:
			System.out.println("Argentina");
			System.out.println("USA");
			break;

		case 25:
			System.out.println("Australia");
			break;

		case 30:
			System.out.println("Acapulco - México");
			break;
		default:
			System.out.println("Temperatura de otro lugar");
			break;

		}
	}
}
