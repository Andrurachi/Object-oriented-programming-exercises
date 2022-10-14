package logica;

import java.util.Random;

import datos.Salon;

public class Contador extends Thread {
    private Salon salon;


    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }


    public Contador(Salon salon) {
        this.salon = salon;
    }


    @Override
    public void run() {
        int num_estudiantes = 0;
        Random Ausentes = new Random();
        int ausentes = Ausentes.nextInt(7);
        int presentes = salon.getEstudiantes().length - ausentes;
 
        System.out.println("En el día de hoy se encuentran " + presentes + " estudiantes presentes en el salón " + salon.getSalon_num() + ".");
        System.out.println("");

        for (int i = 0; i < salon.getHoras_clase().length; i++) {
            if (i == 4) {
                System.out.println("Los estudiantes del salón " + salon.getSalon_num() + " salen a descanso");
                num_estudiantes = 0;
            }else if (i == 6) {
                System.out.println("Los estudiantes del salón " + salon.getSalon_num() + " salen a almorzar");
                num_estudiantes = 0;
            } else {
                num_estudiantes = salon.getEstudiantes().length - ausentes;
                System.out.println("Los estudiantes del salón " + salon.getSalon_num() + " deben recibir clase de " + salon.getMaterias_salon()[i] + " a la hora  " + (System.currentTimeMillis() - salon.getTiempo())/100 + ".");
            }
            if(salon.getSalon_num() == "uno"){
                int la_hora = i + 1;
                System.out.println("");
                System.out.println("----HAN PASADO " + la_hora + " HORAS DESDE EL INICIO DE LA JORNADA----");
                System.out.println("");
            }
            Sleeper.waitXSeconds(salon.getHoras_clase()[i]);
        }System.out.println("En el día de hoy hubo " + ausentes + " ausentes en el salón " + salon.getSalon_num() + ".");
    } 
}
