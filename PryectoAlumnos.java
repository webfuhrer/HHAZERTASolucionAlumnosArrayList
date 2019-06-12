/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryectoalumnos;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PryectoAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion=EntradaSalida.mostrarMenu();
       ArrayList<Alumno> lista_alumnos=new ArrayList();
       while(opcion!=4)
       {
           
           switch(opcion)
           {
               case 1:
                   Alumno a=EntradaSalida.obtenerDatosAlumno();
                   lista_alumnos.add(a);
                   break;
               case 2:
                   EntradaSalida.listarAlumnos(lista_alumnos);
                   break;
               case 3:
                   String nombre_buscado=EntradaSalida.preguntarNombreBuscado();
                   boolean encontrado=false;
                   for(int i=0; i<lista_alumnos.size(); i++)
                   {
                       
                       Alumno alumno=lista_alumnos.get(i);
                       String nombre_alumno=alumno.getNombre();
                       if (nombre_alumno.equals(nombre_buscado))
                       {
                           encontrado=true;
                           System.out.println("ENCONTRADO: ");
                           System.out.println(alumno);
                       }
                       
                   }
                   if(encontrado==false)
                   {
                       System.out.println("No encotrado");
                   }
                   break;
                   
           }
           
           
           opcion=EntradaSalida.mostrarMenu();
       }
        System.out.println("Hasta la vista");
       
    }
    
}
