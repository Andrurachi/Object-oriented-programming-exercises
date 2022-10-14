package Datos;
//Nombre de la clase
public class Profesor
{
 //Atributos de la clase
    private String nombre_apellido;
    private int id;
    private String genero;
    private String c_personal;
    private String c_institucional;
    private Curso curso_profesor;
    private Datos_personales datos_profesor;


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


    public Curso getCurso_profesor() {
        return curso_profesor;
    }
    public void setCurso_profesor(Curso curso_profesor) {
        this.curso_profesor = curso_profesor;
    }


    public Datos_personales getDatos_profesor() {
        return datos_profesor;
    }
    public void setDatos_profesor(Datos_personales datos_profesor) {
        this.datos_profesor = datos_profesor;
    }

    //Constructor
    public Profesor(String nombre_apellido, int id, String genero, String c_personal, String c_institucional, Curso curso_profesor, Datos_personales datos_profesor) {
        this.nombre_apellido = nombre_apellido;
        this.id = id;
        this.genero = genero;
        this.c_personal = c_personal;
        this.c_institucional = c_institucional;
        this.curso_profesor = curso_profesor;
        this.datos_profesor = datos_profesor;
    } 
    
    //Sobrecarga Constructor
    public Profesor(String nombre_apellido, int id, String c_personal, String c_institucional, Curso curso_profesor, Datos_personales datos_profesor){
        this(nombre_apellido, id, "Otro" , c_personal, c_institucional, curso_profesor, datos_profesor);
    }

    //ToString()
    @Override
    public String toString() {
        return "Profesor [c_institucional=" + c_institucional + ", c_personal=" + c_personal + ", curso_profesor="
                + curso_profesor + ", datos_profesor=" + datos_profesor + ", genero=" + genero + ", id=" + id
                + ", nombre_apellido=" + nombre_apellido + "]";
    }
}
