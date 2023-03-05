    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

 import java.util.Scanner;
public class Mavenproject6 {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        int juan,alberto,ana,mama;
        
        System.out.println("Cual es tu edad juan: ");
        juan = entrada.nextInt();
        
        alberto = juan*2/3;
        ana = juan*4/3;
        mama = juan+alberto+ana;
        
        System.out.println("La edad de la mama es: "+mama);
        System.out.println("La edad de juan es: "+juan);
        System.out.println("La edad de alberto es: "+alberto);
        System.out.println("la edad de ana es: "+ana);
        
        
        
        
        
    }
}
