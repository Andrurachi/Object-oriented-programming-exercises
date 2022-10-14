/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
//Nombre de la clase
public class Estudiante
{
 //Atributos de la clase
    private String nombre_apellido;
    private int id;
    private String genero;
    private String c_personal;
    private String c_institucional;
    private Informacion_academica info_estudiante;
    private Curso curso_estudiante;
    private Datos_personales datos_estudiante;
    private Proceso_inscripcion inscripcion_estudiante;


 //Métodos de la clase
    public String getNombre_apellido (){
        return nombre_apellido;
   }
   public void setNombre_apellido (String nombre_apellido){
       this.nombre_apellido = nombre_apellido;
   }


    public int getId (){
        return id;
   }
   public void setId (int id){
       this.id = id;
   }


   public String getGenero (){
        return genero;
   }
   public void setGenero (String genero){
       this.genero = genero;
   }


    public String getC_personal (){
        return c_personal;
   }
   public void setC_personal (String c_personal){
       this.c_personal = c_personal;
   }


   public String getC_institucional (){
        return c_institucional;
   }
   public void setC_institucional (String c_institucional){
       this.c_institucional = c_institucional;
   }
 

    public Informacion_academica getInfo_estudiante() {
        return info_estudiante;
    }
    public void setInfo_estudiante(Informacion_academica info_estudiante) {
        this.info_estudiante = info_estudiante;
    }

    public Datos_personales getDatos_estudiante() {
        return datos_estudiante;
    }
    public void setDatos_estudiante(Datos_personales datos_estudiante) {
        this.datos_estudiante = datos_estudiante;
    }


    public Curso getCurso_estudiante() {
            return curso_estudiante;
    }
    public void setCurso_estudiante(Curso curso_docente) {
        this.curso_estudiante = curso_docente;
    }


    public Proceso_inscripcion getInscripcion_estudiante() {
            return inscripcion_estudiante;
    }
    public void setInscripcion_estudiante(Proceso_inscripcion inscripcion_estudiante) {
        this.inscripcion_estudiante = inscripcion_estudiante;
    }


   //Constructor 
   public Estudiante(String nombre_apellido, int id, String genero, String c_personal, String c_institucional,
        Informacion_academica info_estudiante, Curso curso_estudiante, Datos_personales datos_estudiante,
        Proceso_inscripcion inscripcion_estudiante) {
    this.nombre_apellido = nombre_apellido;
    this.id = id;
    this.genero = genero;
    this.c_personal = c_personal;
    this.c_institucional = c_institucional;
    this.info_estudiante = info_estudiante;
    this.curso_estudiante = curso_estudiante;
    this.datos_estudiante = datos_estudiante;
    this.inscripcion_estudiante = inscripcion_estudiante;
}
//Sobrecargar constructor
    public Estudiante(String nombre_apellido, int id, String genero, String c_institucional,
    Informacion_academica info_estudiante, Curso curso_estudiante, Datos_personales datos_estudiante,
    Proceso_inscripcion inscripcion_estudiante){
        this(nombre_apellido, id, genero, "No informado" , c_institucional, info_estudiante, curso_estudiante, datos_estudiante, inscripcion_estudiante);
    }

    @Override
    public String toString() {
        return "Estudiante [c_institucional=" + c_institucional + ", c_personal=" + c_personal + ", curso_estudiante="
                + curso_estudiante + ", datos_estudiante=" + datos_estudiante + ", genero=" + genero + ", id=" + id
                + ", info_estudiante=" + info_estudiante + ", inscripcion_estudiante=" + inscripcion_estudiante
                + ", nombre_apellido=" + nombre_apellido + "]";
    }

}
