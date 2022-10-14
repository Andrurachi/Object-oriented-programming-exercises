package Datos;
//Nombre de la clase
public class Datos_personales
{
 //Atributos de la clase
    private String mis_datos;

 //Métodos de la clase
   public String Mis_datos (){
        return mis_datos;
   }

   //Constructor
   public Datos_personales(String mis_datos) {
      this.mis_datos = mis_datos;
   }

   //Sobrecargar constructor
   public Datos_personales(){
     this("No informados");
   }

   //ToString()
   @Override
   public String toString() {
      return "Datos_personales [mis_datos=" + mis_datos + "]";
   }
}
