package datos;

import java.util.Arrays;

//Nombre de la clase
public class Proceso_inscripcion
{
//Atributos de la clase
    private boolean cita_inscripcion;
    private String[] asignaturas_pendientes;
    private String inscripcion;
    private String resumen_pago;


//Métodos de la clase

    public boolean Cita_inscripcion (){
        return cita_inscripcion;
   }


    public String getInscripcion (){
        return inscripcion;
   }
   public void setInscripcion (String inscripcion){
       this.inscripcion = inscripcion;
   }


   public String Resumen_pago (){
    return resumen_pago;
}


    public String[] a_pendientes (){
        return asignaturas_pendientes;
   }

    //Constructor
    public Proceso_inscripcion(boolean cita_inscripcion, String[] asignaturas_pendientes, String inscripcion, String resumen_pago) {
        this.cita_inscripcion = cita_inscripcion;
        this.asignaturas_pendientes = asignaturas_pendientes;
        this.inscripcion = inscripcion;
        this.resumen_pago = resumen_pago;
    }

    //Sobrecarga Constructor
    public Proceso_inscripcion(boolean cita_inscripcion, String[] asignaturas_pendientes, String resumen_pago){
        this(cita_inscripcion, asignaturas_pendientes, "No especificada", resumen_pago);
    }

    @Override
    public String toString() {
        return "Proceso_inscripcion [asignaturas_pendientes=" + Arrays.toString(asignaturas_pendientes)
                + ", cita_inscripcion=" + cita_inscripcion + ", inscripcion=" + inscripcion + ", resumen_pago="
                + resumen_pago + "]";
    }  
}