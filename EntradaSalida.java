/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryectoalumnos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {

    static Alumno obtenerDatosAlumno() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduzca el apellido");
        String apellido=sc.nextLine();
        System.out.println("Introduzca la edad");
        int edad=sc.nextInt();
        Alumno a=new Alumno(nombre, apellido, edad);
        return a;
    }
    static void listarAlumnos(ArrayList<Alumno> lista)
    {
        for(Alumno a: lista)
        {
            System.out.println(a);
        }
    }

    static String preguntarNombreBuscado() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Instroduzca el nombre del aluno buscado");
        String nombre=sc.nextLine();
        return nombre;
    }

    static int mostrarMenu() {
          Scanner sc=new Scanner(System.in);
        System.out.println("1-Insertar alumno");
        System.out.println("2-Listar alumnos");
        System.out.println("3-Buscar alumno por nombre");
        System.out.println("4-Salir");
        int opcion=sc.nextInt();
        return opcion;
    }
}
