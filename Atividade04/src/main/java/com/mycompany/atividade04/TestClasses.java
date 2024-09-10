/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade04;

import java.util.Scanner;

/**
 *
 * @author Nitro 5
 */
public class TestClasses {
      public void verificadordia ()
    {
      Scanner teclado = new Scanner(System.in);
      String Dia;
      Dia=teclado.nextLine();
        System.out.println("Tamnho de dia="+Dia.length());
    if(Dia.length()!=10)
    {
        System.out.println("Erro Tamanho");
    }
    char primeirabarra= Dia.charAt(2);
    char segundabarra= Dia.charAt(5);
    if(primeirabarra!='/'||segundabarra!='/')
    {
                System.out.println("Erro barra");
       
    }
  
    String Datadividido[]=Dia.split("/");
    String dia= Datadividido[0];
    String mes= Datadividido[1];
    String ano =Datadividido[2];
    if(dia.length()!=2||mes.length()!=2||ano.length()!=4)
    {
        System.out.println("Erro tamanho dia/mes/ano");
       
    }
    int dia1 = dia.charAt(0)-48;
    int dia2 = dia.charAt(1)-48;
    int mes1 = mes.charAt(0)-48;
    int mes2 = mes.charAt(1)-48;
    int ano1 = ano.charAt(0)-48;
    int ano2 = ano.charAt(1)-48;
    int ano3 = ano.charAt(2)-48;
    int ano4 = ano.charAt(3)-48;
    int diaint = (dia1*10)+dia2;
    int mesint = (mes1*10)+mes2;
    
    int anoint = (ano1*1000)+(ano2*100)+(ano3*10)+(ano4);
        System.out.println("Valor de dia :"+diaint+"Valor de mes "+mesint+"Valor de ano:"+anoint );
    if((diaint>30||diaint<1)||(mesint>12||mesint<1)||anoint>2024||anoint<0)
    {
                System.out.println("Erro data");
      
    }
}
     
}
