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
public class Suma {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = 0;
        for(int i = num1; i <= num2; i++)
            suma += i;
        System.out.println("El resultado de la suma es: " + suma);
    }
}
