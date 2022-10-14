package Datos;

//Nombre de la clase
public class Informacion_academica
{
 //Atributos de la clase
    private int avance;
    private String calificaciones;
    private String horario;
    private String[] planes;
    private String[] tutores;


 //Métodos de la clase
    public int getAvance (){
        return avance;
   }
   public void setAvance (int avance){
       this.avance = avance;
   }


    public String getCalificaciones (){
        return calificaciones;
   }
   public void setCalificaciones (String calificaciones){
       this.calificaciones = calificaciones;
   }


   public String getHorarios (){
        return horario;
   }
   public void setHorario (String horario){
       this.horario = horario;
   }


    public String[] C_personal (){
        return planes;
   }


   public String[] C_institucional (){
        return tutores;
   }

    //constructor
    public Informacion_academica(int avance, String calificaciones, String horario, String[] planes, String[] tutores) {
        this.avance = avance;
        this.calificaciones = calificaciones;
        this.horario = horario;
        this.planes = planes;
        this.tutores = tutores;
    }

    //Sobrecarga constructor
    public Informacion_academica(int avance, String horario, String[] planes, String[] tutores){
        this(avance, "Pendiente" , horario, planes, tutores);
    }

    //Array to String
    public String planes_string(String[] planes){
        String planes_string = "";
        for (int i = 0; i < planes.length; i++){
            planes_string += planes[i];
        }
        return planes_string;
    }

    public String tutores_string(String[] tutores){
        String tutores_string = "";
        for (int i = 0; i < tutores.length; i++){
            tutores_string += tutores[i] + ", ";
        }
        return tutores_string;
    }


    //ToString()
    @Override
    public String toString() {
        return "Informacion_academica [avance=" + avance + ", calificaciones=" + calificaciones + ", horario=" + horario
                + ", planes=" + planes_string(planes) + ", tutores=" + tutores_string(tutores) + "]";
    }
}