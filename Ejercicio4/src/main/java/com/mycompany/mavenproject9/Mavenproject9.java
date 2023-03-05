/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

public class Mavenproject9 {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         double numero,numero1,numero2;
         
         System.out.println("Digite un numero: ");
         numero = entrada.nextInt();
         
         numero1 = Math.pow(numero, 2);
         numero2 = Math.pow(numero, 3);
         
         System.out.println("Su numero al cuadrado es: "+numero1);
         System.out.println("Su numero al cubo es: "+numero2);
         
        
    }
}
