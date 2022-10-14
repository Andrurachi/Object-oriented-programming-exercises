//Desarrollado por Lina Espinal, Laura Agudelo y Andrés R. Chiquillo

import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    
    String [] lista = {"paz", "respeto", "perdon", "empatia", "convivencia", "justicia", "equidad", "bienestar", "amor", "responsabilidad", "gratitud", "conciliacion" , "comprension"};
    Scanner teclado = new Scanner(System.in);
    int num = (int)(Math. random()*12+0);
    String palabra = lista[num];
    //System.out.println(palabra);
    int intentos = 0;
    String boceto = "";
    String muneco = "(,x_x,)";
    String mostrando = "";
    for(int i = 0; i < palabra.length(); i++){
      boceto = boceto + "_";
    }
    System.out.println("");
    System.out.println("Bienvenido al juego ahorcado, descubra la palabra relacionada con la cultura de paz /(˚˘˚)˩: ");
    System.out.println("");
    System.out.println("La longitud de la palabra es: " + boceto);
          
    while(verificar1(intentos,palabra,boceto)) {
      System.out.print("Ingresa una letra: ");
      char caracter = input(teclado);
      if (verificar2(palabra,caracter,boceto) == false){
        mostrando = mostrando + muneco.charAt(intentos);
        intentos += 1;
      }else{
        boceto = cambiar(boceto,palabra,caracter);
      }

      System.out.println("Progreso de la palabra: " + boceto);
      System.out.println("No dejes que se complete el dibujito: " + mostrando);
      System.out.println("");
    }
    if(intentos >= 7){
      System.out.println("Lo siento. Te quedaste sin vidas. Sigue intentando /(̇ ͡ ͘ )¬");
    }else{
      System.out.println("¡Felicidades!, encontraste la palabra ˥(˚͝ᐁ˚)̷");
    }
  }

  public static String cambiar(String boceto, String palabra, char caracter){
    for(int i = 0; i < palabra.length(); i++){
      if(palabra.charAt(i) == caracter){
        StringBuilder newString = new StringBuilder(boceto);
        newString.setCharAt(i, caracter);
        boceto = newString.toString();
        } 
    } return boceto;  
  }

  public static boolean verificar2(String palabra, char caracter, String boceto){
    boolean bandera = false;
    for(int i = 0; i < palabra.length(); i++){
      if(palabra.charAt(i) == caracter){
        bandera = true;
      }
    }return bandera;
  }

  public static char input(Scanner teclado){
    char caracter = teclado.next().charAt(0);
    System.out.println("");
    return caracter;
  }
  
  public static boolean verificar1(int intentos, String palabra, String boceto){
    if(intentos >= 7 || palabra.equals(boceto)){
      return false;
    }else{
      return true;
    }
  }    
}