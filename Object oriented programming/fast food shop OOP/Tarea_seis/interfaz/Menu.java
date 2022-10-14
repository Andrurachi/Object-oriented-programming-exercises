package interfaz;

import java.util.Random;
import java.util.Scanner;

import datos.Comestible;
import datos.Comestible_cupcakes;
import datos.Comestible_pasteles;
import datos.Cupcake_chocolate;
import datos.Cupcake_vainilla;
import datos.Decoraciones;
import datos.Decoraciones_carteles;
import datos.Decoraciones_velitas;
import datos.Horarios_preparacion;
import datos.Pastel_milkyway;
import datos.Pastel_vino;
import datos.Velitas_cumpleaños;
import datos.Velitas_matrimonio;

public class Menu {

	static Scanner teclado = new Scanner(System.in);
	private final static Random jornadas = new Random();
	private final static Random ordenes = new Random();

	int orden = ordenes.nextInt(3);
	private final static int jornada = jornadas.nextInt(2);
	private static int servicio;
	private static int reposteria;
	private static int decoracion;
	private static int velita;

	private static String pedido = "";
	private static String canasta = "";

	private static final Horarios_preparacion horarios_preparacion_mañana = new Horarios_preparacion("mañana", true);
	private static final Horarios_preparacion horarios_preparacion_tarde = new Horarios_preparacion("tarde", true);

	private static final Comestible comestible1 = new Comestible(true, false, false);
	private static final Comestible comestible2 = new Comestible(false, true, false);
	private static final Comestible comestible3 = new Comestible(false, false, true);

	private static final Decoraciones decoracion1 = new Decoraciones("a mano", "material", true);
	private static final Decoraciones decoracion2 = new Decoraciones("a mano", "cartulina", true);
	private static final Decoraciones decoracion3 = new Decoraciones("impreso", "foami", false);

	private static final Comestible_cupcakes comestible_cupcakes1 = new Comestible_cupcakes(true, true, "grande",
			horarios_preparacion_mañana);
	private static final Comestible_cupcakes comestible_cupcakes2 = new Comestible_cupcakes(true, false, "pequeño",
			horarios_preparacion_mañana);
	private static final Comestible_cupcakes comestible_cupcakes3 = new Comestible_cupcakes(false, false, "mediano",
			horarios_preparacion_mañana);

	private static final Comestible_pasteles comestible_pasteles1 = new Comestible_pasteles("mediano", true, false,
			horarios_preparacion_tarde);
	private static final Comestible_pasteles comestible_pasteles2 = new Comestible_pasteles("grande", false, false,
			horarios_preparacion_tarde);
	private static final Comestible_pasteles comestible_pasteles3 = new Comestible_pasteles("pequeño", true, true,
			horarios_preparacion_tarde);

	private static final Decoraciones_velitas decoraciones_velitas1 = new Decoraciones_velitas("", true, "verde");
	private static final Decoraciones_velitas decoraciones_velitas2 = new Decoraciones_velitas("cumple", false, "rojo");
	private static final Decoraciones_velitas decoraciones_velitas3 = new Decoraciones_velitas("matrimonio", true,
			"azul");

	private static final Decoraciones_carteles decoraciones_carteles1 = new Decoraciones_carteles("Cumple", "morado",
			"mati");
	private static final Decoraciones_carteles decoraciones_carteles2 = new Decoraciones_carteles("aniversario", "azul",
			"Ana y Carlos");
	private static final Decoraciones_carteles decoraciones_carteles3 = new Decoraciones_carteles("prom", "morado",
			"colpre");

	private static final Cupcake_chocolate cupcake_chocolate1 = new Cupcake_chocolate(3500, true, false);
	private static final Cupcake_chocolate cupcake_chocolate2 = new Cupcake_chocolate(3500, false, true);
	private static final Cupcake_chocolate cupcake_chocolate3 = new Cupcake_chocolate(3500, false, false);

	private static final Cupcake_vainilla cupcake_vainilla1 = new Cupcake_vainilla(3500, true, false);
	private static final Cupcake_vainilla cupcake_vainilla2 = new Cupcake_vainilla(3500, true, true);
	private static final Cupcake_vainilla cupcake_vainilla3 = new Cupcake_vainilla(3500, false, true);

	private static final Pastel_milkyway pastel_milkyway1 = new Pastel_milkyway(43500, true, "redondo");
	private static final Pastel_milkyway pastel_milkyway2 = new Pastel_milkyway(3500, true, "cuadrado");
	private static final Pastel_milkyway pastel_milkyway3 = new Pastel_milkyway(3500, false, "espiral");

	private static final Pastel_vino pastel_vino1 = new Pastel_vino(37500, false, false);
	private static final Pastel_vino pastel_vino2 = new Pastel_vino(37500, true, false);
	private static final Pastel_vino pastel_vino3 = new Pastel_vino(37500, true, true);

	private static final Velitas_cumpleaños velitas_cumpleaños1 = new Velitas_cumpleaños(12, "Mario Bros", 2300);
	private static final Velitas_cumpleaños velitas_cumpleaños2 = new Velitas_cumpleaños(14, "hentai", 2300);
	private static final Velitas_cumpleaños velitas_cumpleaños3 = new Velitas_cumpleaños(3, "fornai", 2300);

	private static final Velitas_matrimonio velitas_matrimonio1 = new Velitas_matrimonio("mujeres", "grande", 2300);
	private static final Velitas_matrimonio velitas_matrimonio2 = new Velitas_matrimonio("hombres", "pequeño", 2300);
	private static final Velitas_matrimonio velitas_matrimonio3 = new Velitas_matrimonio("hombre y mujer", "grande",
			2300);

	public final static void bienvenida() {

		if (jornada == 0) {
			System.out.println(
					"Buenos días, bienvenido a la pastelería de Laura y Andrés. A continuación te mostraré los servicios que disponemos esta linda mañana.");
		} else {
			System.out.println(
					"Buenos tardes, bienvenido a la pastelería de Laura y Andrés. A continuación te mostraré los servicios que disponemos esta linda tarde.");
		}
	}

	public final static void servicios() {
		System.out.println(
				"¿Vienes por nuestro servicio de repostería o estas buscado decorativos para algua celebración? (1 = Repostería, 2 = Decoraciones)");
		servicio = teclado.nextInt();
		if (servicio == 1) {
			reposterias();
		} else if (servicio == 2) {
			decoraciones();
		}

	}

	public final static void reposterias() {
		if (jornada == 0) {
			System.out.println(
					"En cuanto a la sección de repostería, en las mañanas solo tenemos disponibilidad de la sección de pasteles. Tenemos pastel tipo milkyway y de tipo vino. ¿Cúal te gustaría  ordenar? (1 = Milkyway, 2 = Vino, 3 = volver a servicios");
			reposteria = teclado.nextInt();

			if (reposteria == 1) {
				pedido = comestible1.toString() + comestible_pasteles1.toString() + pastel_milkyway1.toString();
				System.out.println(
						"Tu pastel de características: " + pedido + "pronto estará en tu casa. Graciapor preferirnos");
				canasta += pedido;
			} else if (reposteria == 2) {
				pedido = comestible1.toString() + comestible_pasteles1.toString() + pastel_vino1.toString();
				System.out.println(
						"Tu pastel de características: " + pedido + "pronto estará en tu casa. Graciapor preferirnos");
				canasta += pedido;
			} else if (reposteria == 3) {
				servicios();
			}

		} else if (jornada == 1) {
			System.out.println(
					"En cuanto a la sección de repostería, en las tardes solo tenemos disponibilidad de la sección de cupcakes. Tenemos cupcakes de chocolate y de vainilla. ¿Cúal te gustaría  ordenar? (1 = Chocolate, 2 = Vainilla, 3 = volver a servicios");
			reposteria = teclado.nextInt();

			if (reposteria == 1) {
				pedido = comestible1.toString() + comestible_cupcakes1.toString() + cupcake_chocolate1.toString();
				System.out.println(
						"Tu Cupcake de características: " + pedido + "pronto estará en tu casa. Graciapor preferirnos");
				canasta += pedido;
			} else if (reposteria == 2) {
				pedido = comestible1.toString() + comestible_cupcakes1.toString() + cupcake_vainilla1.toString();
				System.out.println(
						"Tu Cupcake de características: " + pedido + "pronto estará en tu casa. Graciapor preferirnos");
				canasta += pedido;
			} else if (reposteria == 3) {
				servicios();
			}
		}
	}

	public final static void decoraciones() {
		System.out.println(
				"Para decoraciones te podemos ofrecer velitas par aadornar a tu pastel y carteles personalizados dependiendo de la ocasión que desees celebrar ¿Qué estás buscando? (1 = velitas, 2 = carteles, 3 = volver a servicios");
		decoracion = teclado.nextInt();
		if (decoracion == 1) {
			velitas();
		} else if (decoracion == 2) {
			carteles();
		} else if (decoracion == 3) {
			servicios();
		}
	}

	public final static void velitas() {
		System.out.println(
				"Te ofrecemos dos tipos de velitas. Tenemos con motivo de cumpleaños o con motivo de matrimonio. ¿Cuál de estas deseas? (1 = Cumple, 2 = Matrimonio, 3 = volver a decoraciones");
		velita = teclado.nextInt();

		if (velita == 1) {
			pedido = decoracion1.toString() + decoraciones_velitas1.toString() + velitas_cumpleaños1.toString();
			System.out.println("Tu velita de cumpleaños de características: " + pedido
					+ "pronto estará en tu casa. Graciapor preferirnos");
			canasta += pedido;
		} else if (velita == 2) {
			pedido = decoracion1.toString() + decoraciones_velitas1.toString() + velitas_matrimonio1.toString();
			System.out.println("Tu velita de matrimonio de características: " + pedido
					+ "pronto estará en tu casa. Graciapor preferirnos");
			canasta += pedido;
		} else if (velita == 3) {
			decoraciones();
		}
	}

	public final static void carteles() {
		System.out.println(
				"Ahora solo me queda preguntarte la ocasión en la que usaras tu cartel y así lo podamos crear de manera personalizada:");

		String cartel = teclado.nextLine();
		pedido = decoracion1.toString() + decoraciones_carteles1.toString();

		System.out.println("Tu cartél con motivo de " + cartel + " y de características" + pedido
				+ " llegará muy pronto a tu casa. Gracias por elegirnos.");
		canasta += pedido;
	}

	public static final void menu() {

		servicios();

	}

	public static String getCanasta() {
		return canasta;
	}

	public static void setCanasta(String canasta) {
		Menu.canasta = canasta;
	}

}
