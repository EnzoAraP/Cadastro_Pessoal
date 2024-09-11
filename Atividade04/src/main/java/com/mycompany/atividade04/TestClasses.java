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
         public void verificaorcpf() 
    {
        Scanner teclado = new Scanner(System.in);
      String Cpfa;
      Cpfa=teclado.nextLine();
      String Cpf=Cpfa.trim();
     if(Cpf.length()!=14)
     {
         System.out.println("Tamnho Errado");
    }
    char primeiroponto=Cpf.charAt(3);
        System.out.println("Valor de primeiroponto "+ primeiroponto);
    char segundoponto=Cpf.charAt(7);
      System.out.println("Valor de segundoponto "+ segundoponto);
    char traco=Cpf.charAt(11);
      System.out.println("Valor de traco "+ traco);
     if(primeiroponto!='.'||segundoponto!='.'||traco!='-')
     {
         System.out.println(". ou - nao ta no lugar");
     }
     String cpfverif []=Cpf.split("-");
     if(cpfverif[0].length()!=11||cpfverif[1].length()!=2)
     {
         System.out.println("Tamanho primeira ou segunda parte errada");
     }
     String cpfParte1[]=cpfverif[0].split("\\.");
     String cpfparte0e1 =cpfParte1[0].concat(cpfParte1[1]);
     String cpf9dig=cpfparte0e1.concat(cpfParte1[2]);
        System.out.println("Valor de cpf9dig:"+cpf9dig);
     if(Einteiro(cpf9dig)==false)
     {
         System.out.println("Não é inteiro");
     }
   int dig11= cpf9dig.charAt(0)-48;
   int dig10= cpf9dig.charAt(1)-48;
   int dig9= cpf9dig.charAt(2)-48;
   int dig8= cpf9dig.charAt(3)-48;
   int dig7= cpf9dig.charAt(4)-48;
   int dig6= cpf9dig.charAt(5)-48;
   int dig5= cpf9dig.charAt(6)-48;
   int dig4= cpf9dig.charAt(7)-48;
   int dig3= cpf9dig.charAt(8)-48;
        System.out.println("digg11: "+dig11);
         System.out.println("digg3: "+dig3);
     System.out.println("Valor de cpfverif:"+cpfverif[1]);
   if(Einteiro(cpfverif[1])==false)
   {
       System.out.println("Não é inteiro part2");
   }
   int dig2 = cpfverif[1].charAt(0)-48;
   int dig1 = cpfverif[1].charAt(1)-48;
   int primeiraSomaprod;
   primeiraSomaprod =(dig3*2)+(dig4*3)+(dig5*4)+(dig6*5)+(dig7*6)+(dig8*7)+(dig9*8)+(dig10*9)+(dig11*10);
        System.out.println("primeiraSomaprod :"+primeiraSomaprod);
   int resto1= primeiraSomaprod%11;
        System.out.println("Resto1: "+resto1);
   if(resto1 ==0||resto1==1)
   {
       if(dig2!=0)
       {
           System.out.println("verificador 1 errado:caso 0");
       }
   }
   else
   {
       int verificador = 11-resto1;
       System.out.println("verificador: "+verificador);
       System.out.println("dig2 "+dig2);
       if(dig2!=verificador)
       {
           System.out.println("Verificador 1 errado");
       }
   }
   int segundaSomaprod=(dig2*2)+(dig3*3)+(dig4*4)+(dig5*5)+(dig6*6)+(dig7*7)+(dig8*8)+(dig9*9)+(dig10*10)+(dig11*11);
    int resto2 = segundaSomaprod%11;
    if(resto2 ==0||resto2==1)
   {
       if(dig1!=0)
       {
           System.out.println("verificador2 errado caso 0");
       }
   }
   else
   {
       int verificador = 11-resto2;
       if(dig1!=verificador)
       {
           System.out.println("Verificador 2 errado");
       }
   }
}
          public boolean Einteiro (String a)
      {
         for(int i =0;i<a.length();i++)
                 {
                 if('0'>a.charAt(i)||a.charAt(i)>'9')
                 {
                     System.out.println("Entrou if"+a.charAt(i));
                     
                     return false;
                 }
                 }
          
return true;
      }
}
