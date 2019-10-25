/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioTres {
   /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombres completos de un estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del Alumno
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:  
    */ 
    public static void main(String[] args){
      
        Scanner entrada = new Scanner (System.in);
        
        String nombresCompletos;
        String ciclo;
        int nota1;
        int nota2;
        
       System.out.println("Ingrese nombres del alumno");
       nombresCompletos = entrada.nextLine();
       
       System.out.println("Ingrese nota 1");
       nota1 = entrada.nextInt();
       System.out.println("Ingrese nota 2");
       nota2 = entrada.nextInt();
       entrada.nextLine();
       System.out.println("Ingrese el ciclo que cursa");
       ciclo = entrada.nextLine();
       
       System.out.printf("Informacion del Alumno:\nNombres del Alumno:%s\n"
               + "Ciclo:%s\nNota1:%d\nNota2:%d\n", nombresCompletos, ciclo,nota1, 
               nota2);
      
      
      
} 
}
