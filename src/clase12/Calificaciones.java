
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandrorago
 */
public class Calificaciones {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String nombreAlumno; 
        float notaPractica, notaProblemas, notaTeorica, notaFinal; 
        System.out.println("Ingrese el nombre del alumno (vacío para cortar)"); 
        nombreAlumno = scanner.nextLine(); 
        while(nombreAlumno.isEmpty() == false) { 
            System.out.print("Nota práctica: "); notaPractica = scanner.nextFloat(); 
            System.out.print("Nota problemas: "); notaProblemas = scanner.nextFloat(); 
            System.out.print("Nota teórica: "); notaTeorica = scanner.nextFloat(); 
            if((notaPractica <= 10 && notaPractica >= 0) && (notaProblemas <= 10 && notaProblemas >= 0) && (notaTeorica <= 10 && notaTeorica >= 0)) { 
                notaFinal = notaPractica * 0.1f + notaProblemas * 0.5f + notaTeorica * 0.4f; 
                System.out.print("La nota final de " + nombreAlumno + " es: " + notaFinal); 
            } 
            else { 
                System.out.print("Error en las notas ingresadas"); 
            } 
            System.out.println("Ingrese el nombre del alumno (vacío para cortar)"); 
            nombreAlumno = scanner.nextLine(); 
        }
    }
    
    public static void calificaciones(){
        
    }
}