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
public class EjercicioDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombre
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula 
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombres:
    Ciudad de Nacimiento:
    Edad:
    Matricula:
    */
   public static void main(String[] args){ 
    
       Scanner entrada = new Scanner (System.in);
       
       String nombre;
       String ciudad_nacimiento;
       int edad;
       double matricula; 
       
       System.out.println("Ingrese sus nombre");
       nombre = entrada.nextLine();
       System.out.println("Ingrese su ciudad de nacimiento");
       ciudad_nacimiento = entrada.nextLine();
       System.out.println("Ingrese su edad");
       edad = entrada.nextInt();
       System.out.println("Ingrese su matricula");
       matricula = entrada.nextDouble(); // ingreso de decimales
       
       System.out.printf("Datos Personales:\nNombres:%s\nCiudad de Nacimiento:"
               + "%s\nEdad:%d\nMatricula:%.2f\n", nombre , ciudad_nacimiento, 
               edad, matricula);
      /* 
       matricula tiene que ir con coma y no con punto
       */
       
       
}
}
 
