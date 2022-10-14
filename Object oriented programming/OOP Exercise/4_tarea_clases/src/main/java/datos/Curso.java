/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
//Nombre de la clase
public class Curso
{
 //Atributos de la clase
    private double codigo;
    private String nombre_m;
    private int horas;
    private boolean unDocente;


 //Métodos de la clase
    public double getCodigo (){
        return codigo;
   }
   public void setCodigo (double codigo){
       this.codigo = codigo;
   }


    public String getNombre_m (){
        return nombre_m;
   }
   public void setNombre_m (String nombre_m){
       this.nombre_m = nombre_m;
   }


   public int getHoras (){
        return horas;
   }
   public void SetHoras (int horas){
       this.horas = horas;
   }


   public boolean getUnDocente (){
        return unDocente;
   }
   public void setUnDocente (Boolean unDocente){
       this.unDocente = unDocente;
   }

    //Constructor
    public Curso(double codigo, String nombre_m, int horas, boolean unDocente) {
        this.codigo = codigo;
        this.nombre_m = nombre_m;
        this.horas = horas;
        this.unDocente = unDocente;
    }

    //Sobrecargar constructor
    public Curso(double codigo, String nombre_m, boolean unDocente){
        this(codigo, nombre_m, 00 , unDocente);
    }

    //ToString()
    @Override
    public String toString() {
        return "Curso [codigo=" + codigo + ", horas=" + horas + ", nombre_m=" + nombre_m + ", unDocente=" + unDocente
                + "]";
    }
}
