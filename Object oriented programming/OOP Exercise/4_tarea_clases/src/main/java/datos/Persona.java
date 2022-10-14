package datos;
//Nombre de la clase
public class Persona
{
 //Atributos de la clase
    private String  correo;
    private int clave;
    private String cargo;


 //Métodos de la clase
 
    public String getCorreo (){
        return correo;
   }
   public void setCorreo (String correo){
       this.correo = correo;
   }


   public int getclave (){
        return clave;
   }
   public void setClave (int clave){
       this.clave = clave;
   }


    public String getCargo (){
        return cargo;
   }
   public void setCargo (String cargo){
       this.cargo = cargo;
   }

    //Constructor
    public Persona(String correo, int clave, String cargo) {
        this.correo = correo;
        this.clave = clave;
        this.cargo = cargo;
    }
    

    //Sobrecarga Constructor inválida. Todos los atributos son necesarios

    //ToString()
    @Override
    public String toString() {
        return "Persona [cargo=" + cargo + ", clave=" + clave + ", correo=" + correo + "]";
    }
   
}