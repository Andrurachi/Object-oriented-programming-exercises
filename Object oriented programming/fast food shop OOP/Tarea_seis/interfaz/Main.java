package logica;

import java.util.Scanner;

import interfaz.Menu;

public class Main {

	static Scanner teclado = new Scanner(System.in);

	private static String canasta = "";

	public static void main(String[] args) {
		Menu.bienvenida();
		Menu.menu();

		System.out.println("¿Deseas comprar algo más de la pastelería? (1 = Sí, 2 = No)");
		int comprar = teclado.nextInt();

		while (comprar == 1) {
			Menu.menu();
			System.out.println("¿Deseas comprar algo más de la pastelería? (1 = Sí, 2 = No)");
			comprar = teclado.nextInt();
		}
		System.out.println("------------------");
		System.out.println("Estas son todas las compras que llegarán a tu casa: " + Menu.getCanasta());

	}
}
