
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
public class ColectivoWhile {
       
    public void principal() {
        Scanner scanner = new Scanner(System.in); 
        boolean llegadaColectivo; 
        System.out.println("Esperando el colectivo"); 
        System.out.println("Llegó el colectivo? (true o false)"); 
        llegadaColectivo = scanner.nextBoolean(); 
        while(llegadaColectivo == false) { 
            System.out.println("Esperando el colectivo"); 
            System.out.println("Llegó el colectivo? (true o false)"); 
            llegadaColectivo = scanner.nextBoolean(); 
        } 
        System.out.println("Ya llegó el colectivo");
    }
    
    public static void main(String[] args) {
        ColectivoWhile c = new ColectivoWhile();
        c.principal();
    } 
}
