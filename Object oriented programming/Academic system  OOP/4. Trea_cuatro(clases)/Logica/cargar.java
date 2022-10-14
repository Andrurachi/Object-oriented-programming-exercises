package Logica;
import Datos.*;
import java.util.Scanner;

public class cargar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String correo;
        int clave;
        String cargo;
        int info_disponible_de;

        System.out.println("Bienvenido. ¿Qué función cumples en la universidad? (docente, estudiante, otro):");
        cargo = teclado.nextLine();
        System.out.println("Por favor ingresa tu correo institucional:");
        correo = teclado.nextLine();
        System.out.println("Ahora, por favor ingresa tu clave (únicamente números):");
        clave = teclado.nextInt();
        System.out.println();
        System.out.println("-----------------");
        System.out.println();
        System.out.println("Bienvenido de vuelta, " + correo + ". Accediendo a la información disponible...");
        System.out.println();
        System.out.println("-----------------");
        System.out.println("¿De qué persona deseas conocer la información disponible en el sistema? (Andrés = 1, Laura = 2, Lina = 3 y Profe Alexei = 4)");
        info_disponible_de = teclado.nextInt();


        //**CLASE Persona**

        Persona usuario = new Persona(correo, clave, cargo);
        Persona persona1 = new Persona("aramirez@unal.edu.co", 1234 , "estudiante");
        Persona persona2 = new Persona("Laura@unal.edu.co", 130803 , "estudiante");
        Persona persona3 = new Persona("Lina@unal.edu.co", 123456 , "estudiante");
        Persona dios = new Persona("ProfeAlexei@unal.edu.co", 777666 , "Profesor");


        //**ClASE Proceso_inscripción**

        String[] a_pendientes1 = {"Calculo vectorial", "Mecánica Newtoniana"}; 
        Proceso_inscripcion inscripcion_est1 = new Proceso_inscripcion(false, a_pendientes1, "Asignaturas en curso", "tercer fraccionamiento pendiente");

        String[] a_pendientes2 = {};
        Proceso_inscripcion inscripcion_est2 = new Proceso_inscripcion(false, a_pendientes2, "Asignaturas en curso", "tercer fraccionamiento pendiente");
        
        String[] a_pendientes3 = {"Calculo integral", "Algebra lineal"};
        Proceso_inscripcion inscripcion_est3 = new Proceso_inscripcion(false, a_pendientes3, "Asignaturas en curso", "tercer fraccionamiento pendiente");
        

        //**CLASE Informacion_academica**
        
        String[] planes1 = {"Estudiante que no debe nivelar", "Periodo académico 2021 - II"};
        String[] tutores1 = {"No infromados"};
        Informacion_academica info_academica1 = new Informacion_academica(16, "Sobresalientes", "lunes a jueves de 7:00 am a 11:00 am", planes1, tutores1);

        String[] planes2 = {"Estudiante que debe nivelar", "Periodo académico 2021 - II", "trámites pendientes"};
        String[] tutores2 = {"Liliana Sisa", "Juan Echeverría"};
        Informacion_academica info_academica2 = new Informacion_academica(16, "Excelente", "lunes a MIercoles de 7:00 am a 11:00 am y viernes de 7:00 am a 9:00 am", planes2, tutores2);

        String[] planes3 = {"Estudiante que no debe nivelar", "suspendió semestre en 2021 - I"};
        String[] tutores3 = {"No infromados"};
        Informacion_academica info_academica3 = new Informacion_academica(16, "Sobresalientes", "lunes a jueves de 7:00 am a 11:00 am", planes3, tutores3);


        //**CLASE Curso**

        Curso curso1 = new Curso(10002, "Física innecesaria para ingenieros", 4 , false);
        Curso curso2 = new Curso(10007, "Álgebra lineal", 6 , false);
        Curso curso3 = new Curso(10043, "Programación Orienteada a Objetos", 4, true);


        //**CLASE Datos_personales**

        Datos_personales datos1 = new Datos_personales("Estudiante. Ramírez Chiquillo Andrés David. Duitama. TI 100243124");
        Datos_personales datos2 = new Datos_personales("Estudiante. Agudelo Cruz  Laura Daniela. Bogotá. CC 110243124");
        Datos_personales datos3 = new Datos_personales("Estudiante. Espinel Lina Sofía. Bogotá. CC 120243124");
        Datos_personales datos4 = new Datos_personales("Docente. Ochoa Duarte Alexei Gabriel  . Cúcuta. CC 105243124");


        //**CLASE Profesor**

        Profesor profe_Alexei = new Profesor("Alexei Gabriel Ochoa Duarte" ,  105243124 , "Masculino, digo yo", "agochoad@unal.edu.co", curso3, datos4);


        //**Clase Estudiante**

        Estudiante estudiante1 = new Estudiante("Andrés David Ramírez Chiquillo",100243124, "Masculino, creo", "andruvrch@gmail.com", "aramirez@unal.edu.co" , info_academica1, curso1, datos1, inscripcion_est1);
        Estudiante estudiante2 = new Estudiante("Laura Daniela Agudelo Cruz",110243124, "Femenino", "lauraagudelo@unal.edu.co" , info_academica2, curso2, datos2, inscripcion_est2);
        Estudiante estudiante3 = new Estudiante("Lina Sofía Espinel",120243124, "Femenino", "linaesoinel@unal.edu.co" , info_academica3, curso3, datos3, inscripcion_est3);


        //**PRINTS DE LA INFROMACIÓN**

        while(info_disponible_de != 5){
            if(info_disponible_de == 1){
                System.out.println();
                System.out.println(correo + " ,la información que se encuentra hasta la fecha del estudiante Andrés Ramírez es: ");
                System.out.println();
                System.out.println(estudiante1);
                System.out.println();
            }else if(info_disponible_de == 2){
                System.out.println();
                System.out.println(correo + " ,la información que se encuentra hasta la fecha de la estudiante Laura Agudelo es: ");
                System.out.println();
                System.out.println(estudiante2);
                System.out.println();
            }else if (info_disponible_de == 3){
                System.out.println();
                System.out.println(correo + " ,la información que se encuentra hasta la fecha de la estudiante Lina Espinel es: ");
                System.out.println();
                System.out.println(estudiante3);
                System.out.println();
            }else if (info_disponible_de == 4){
                System.out.println();
                System.out.println(correo + " ,la información que se encuentra hasta la fecha del profesor Alexei Ochoa es: ");
                System.out.println();
                System.out.println(profe_Alexei);
                System.out.println();
                
            }else{
                System.out.println();
                System.out.println("El valor ingresado no es válido. Disponible 1, 2, 3, 4. O presiona 5 para salir:");
            }
            
            System.out.println("Para salir presione 5. Para continuar mirando la información del sistema seleccione otra persona (Andrés = 1, Laura = 2, Lina = 3 y Profe Alexei = 4)");
            info_disponible_de = teclado.nextInt();
        }
        System.out.println();
        System.out.println("Gracias por tu visita, " + correo + ". Te esperamos de vuelta :D");   
    }
}