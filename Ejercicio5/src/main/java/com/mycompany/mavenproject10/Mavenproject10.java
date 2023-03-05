/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

import java.util.Scanner;


public class Mavenproject10 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      double radio,area,longitud;
      
        System.out.println("Digite el radio del circulo");
        radio = entrada.nextDouble();
        
        area = Math.PI*Math.pow(radio, 2);
        
        longitud = 2*Math.PI*radio;
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud del circulo es: "+longitud);
        
        
        
    }
}
