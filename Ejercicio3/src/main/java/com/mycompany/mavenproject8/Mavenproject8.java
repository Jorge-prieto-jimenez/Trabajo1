/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;


public class Mavenproject8 {

    public static void main(String[] args) {
     double salario,horas,salario_neto,salario_bruto;
     
     salario = 5000;
     horas = 48;
     salario_bruto = salario*48;
     salario_neto = salario_bruto*0.125;
     
     System.out.println("El salario bruto del trabajador es: "+salario_bruto);
     System.out.println("El salario neto del trabajador es: "+salario_neto);

    }
}
