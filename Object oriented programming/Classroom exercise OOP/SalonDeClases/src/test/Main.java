package logica;

import datos.Salon;

public class Main {

    private static long tiempo = System.currentTimeMillis();


    private static int[] est_salon_uno = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static int[] profes_salon_uno = { 1, 2, 3, 4, 5, 6 };
    private static String[] materias_salon_uno = { "Español", "Sociales", "Matematica", "Recreo", "Química", "Almuerzo", "Tecnológía", "Artística", "Educación física" };
    private static int[] horas_clase_uno = { 1, 1, 2, 1, 1, 2, 1, 1 };

    private static Salon salon_uno = new Salon("uno", est_salon_uno, profes_salon_uno, materias_salon_uno, horas_clase_uno, tiempo);


    private static int[] est_salon_dos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static int[] profes_salon_dos = { 1, 2, 3, 4, 5, 6 };
    private static String[] materias_salon_dos = { "Programación", "Geografía", "Ética", "Recreo", "Dibujo Técnico", "Filosofía", "Almuerzo", "Espiritualidad", "Lectores Competentes" };
    private static int[] horas_clase_dos = { 2, 2, 1, 2, 1, 1, 1, 1 };

    private static Salon salon_dos = new Salon("dos", est_salon_dos, profes_salon_dos, materias_salon_dos, horas_clase_dos, tiempo);


    public static void main(String[] args) {
        Contador horario_uno = new Contador(salon_uno);
        Contador horario_dos = new Contador(salon_dos);
        horario_uno.start();
        horario_dos.start();
    }
}
