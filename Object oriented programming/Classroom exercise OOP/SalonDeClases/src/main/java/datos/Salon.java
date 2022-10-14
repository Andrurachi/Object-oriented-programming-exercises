package datos;

import java.util.Arrays;

public class Salon {

    private String salon_num;    
    private int[] estudiantes;
    private int[] profesores;
    private String[] materias_salon;
    private int[] horas_clase;
    private long tiempo;


    public String getSalon_num() {
        return salon_num;
    }

    public void setSalon_num(String salon_num) {
        this.salon_num = salon_num;
    }


    public int[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(int[] estudiantes) {
        this.estudiantes = estudiantes;
    }


    public int[] getProfesores() {
        return profesores;
    }

    public void setProfesores(int[] profesores) {
        this.profesores = profesores;
    }


    public String[] getMaterias_salon() {
        return materias_salon;
    }

    public void setMaterias_salon(String[] materias_salon) {
        this.materias_salon = materias_salon;
    }


    public int[] getHoras_clase() {
        return horas_clase;
    }

    public void setHoras_clase(int[] horas_clase) {
        this.horas_clase = horas_clase;
    }


    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }



    public Salon(String salon_num, int[] estudiantes, int[] profesores, String[] materias_salon, int[] horas_clase, long tiempo) {
        this.salon_num = salon_num;
        this.estudiantes = estudiantes;
        this.profesores = profesores;
        this.materias_salon = materias_salon;
        this.horas_clase = horas_clase;
        this.tiempo = tiempo;
    }


    @Override
    public String toString() {
        return "Salon [horas_clases=" + Arrays.toString(horas_clase) + ", materias_salon=" + Arrays.toString(materias_salon)
                + ", tiempo=" + tiempo + ", salon_num=" + salon_num + ", estudiantes="
                + Arrays.toString(estudiantes) + ", profesores=" + Arrays.toString(profesores) + "]";
    }

}
