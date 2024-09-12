/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade04;
import javax.swing.*;
import java.awt.*;
import com.mycompany.atividade04.Botoes.*;
import com.mycompany.atividade04.Execeptions.*;
/**
 *
 * @author Nitro 5
 */
public class Tela {
    private JFrame tela;
    private final int WIDTH = 700;
    private final int HEIGHT = 500;
    private JList<String> ListaNomes;
    private JList<String> ListaCpf;
    private JList<String> ListaDatas;
    private JList<String> ListaIdades;
    private JTextField nome;
    private JTextField data;
    private JTextField cpf;
    private DefaultListModel<String> Nomes = new DefaultListModel<>();
    private  DefaultListModel<String> Datas = new DefaultListModel<>();
    private DefaultListModel<String> Cpf = new DefaultListModel<>();
     private DefaultListModel<Integer> Idades = new DefaultListModel<>();
    public void TelaJF (){
        tela = new JFrame("Formulario");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(WIDTH,HEIGHT);
        tela.setLayout(new GridLayout(1,2));
       // paneladicionador();
         paneladicionador();
       panelLista();
        tela.setVisible(true);
    }
    public void paneladicionador(){
        JPanel panel = new JPanel();
        nome=new JTextField(20);
        JLabel nomeJL = new JLabel("Nome");
         data=new JTextField(20);
         JLabel dataJL = new JLabel("Data");
         cpf=new JTextField(20);
         JLabel cpfJL = new JLabel("Cpf");
        JButton adicionar = new JButton("Adicionar");
        JButton remover = new JButton("Remover");
        JButton editar = new JButton("Editar");
           panel.setLayout(new GridBagLayout());
           GridBagConstraints constraints = new GridBagConstraints();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            
             {//Nome Label
        constraints.gridx = 0; // Grid column
        constraints.gridy = 0; // Grid row
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        constraints.insets = new Insets(5, 5, 5, 5); // Padding
        panel.add(nomeJL, constraints);
            }
            {//Nome
        constraints.gridx = 0; // Grid column
        constraints.gridy = 1; // Grid row
        constraints.gridwidth = 3; 
        constraints.gridheight = 1; 
        constraints.insets = new Insets(5, 5, 5, 5); // Padding
        panel.add(nome, constraints);
            }
            {//Data Label
                 constraints.gridy = 2; // Grid row
                 constraints.gridwidth = 1; 
                 panel.add(dataJL, constraints);
            }
            {//data
        constraints.gridy = 3; // Grid row
        constraints.gridwidth = 3; 
         panel.add(data, constraints);
            }
             {//Cpf Label
                 constraints.gridy = 4; // Grid row
                 constraints.gridwidth = 1; 
                 panel.add(cpfJL, constraints);
            }
            {//cpf
        constraints.gridy = 5; // Grid row
        constraints.gridwidth = 3; 
         panel.add(cpf, constraints);
            }
            {//adicionar
        constraints.gridx = 0; // Grid column
        constraints.gridy = 6; // Grid row
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        constraints.insets = new Insets(5, 5, 5, 5); // Padding
        panel.add(adicionar, constraints);
        adicionar.addActionListener(new BotaoAdd(this));
            }
            {//remover
        constraints.gridx = 1; // Grid column
        panel.add(remover, constraints);
        remover.addActionListener(new BotaoRemover(this));
            }
            {//editar
        constraints.gridx = 2; // Grid column
        panel.add(editar, constraints);    
        editar.addActionListener(new BotaoEditar(this));
            }
            
            
        tela.add(panel);
    }
    public void panelLista()
    {
     JPanel panel = new JPanel ();
      panel.setLayout(new GridBagLayout());
      JLabel nomeJL = new JLabel("Nome");
      JLabel dataJL = new JLabel("Data de Nascimento ");
      JLabel idadeJL = new JLabel("Idade");
      JLabel cpfJL = new JLabel("Cpf");
       ListaNomes = new JList(Nomes);
       ListaNomes.addListSelectionListener(new SelecionarNome(this));
       ListaDatas = new JList(Datas);
       ListaCpf = new JList(Cpf);
       ListaIdades = new JList(Idades);
      
      GridBagConstraints constraints = new GridBagConstraints();
       {//Nome Label
        constraints.gridx = 0; // Grid column
        constraints.gridy = 0; // Grid row
        constraints.gridwidth = 2; 
        constraints.gridheight = 1; 
        constraints.insets = new Insets(10, 10, 10, 10); // Padding
        panel.add(nomeJL, constraints);
     
        }
       {// data Label
           constraints.gridx = 2; // Grid column
           constraints.gridwidth = 1; 
           panel.add(dataJL, constraints);
           
       }
       {//idade Label
            constraints.gridx = 3; // Grid column
           panel.add(idadeJL, constraints);
       }
       {//cpf Label
            constraints.gridx = 4; // Grid column
           panel.add(cpfJL, constraints);
       }
       {//Nome List
           constraints.gridx = 0; // Grid column
           constraints.gridy = 1; // Grid row
           constraints.gridwidth = 2; 
           panel.add(ListaNomes, constraints);
       }
       {//Data List
           constraints.gridx = 2; // Grid column
           constraints.gridwidth = 1; 
           
           panel.add(ListaDatas, constraints);
       }
       {//Idade List
           constraints.gridx = 3; // Grid column
          
           panel.add(ListaIdades, constraints);
       }
       {//Cpf List
           constraints.gridx = 4; // Grid column
           
           panel.add(ListaCpf, constraints);
       }
       tela.add(panel);
    }
    public void AdicionaContato()
    {
        JFrame MensagemErro = new JFrame("Erro");
        MensagemErro.setSize(300,200);
        MensagemErro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      String dia = data.getText();
      String diasemspaco =dia.trim();
      JPanel panelErro = new JPanel();
      int erro=0;
        panelErro.setLayout(new FlowLayout());
      try{
      verificadordia(diasemspaco);
      }
      catch(DataExeption e)
      {
       
        JLabel ErroFormato = new JLabel("Formato da Data de Nascimento incorreto!, utilize o formato DD/MM/AAAA");
        panelErro.add(ErroFormato);
        MensagemErro.add(panelErro);
        MensagemErro.setVisible(true);
        erro++;
      }
    String cpfantes=cpf.getText();
    String cpfsemspaco=cpfantes.trim();
     try{
         verificaorcpf(cpfsemspaco);
         
     }
     catch(CpfExeption e)
     {
         JLabel ErroFormato = new JLabel("Cpf incorreto!, utilize o formato DDD.DDD.DDD-DD");
        panelErro.add(ErroFormato);
        MensagemErro.add(panelErro);
        MensagemErro.setVisible(true);
        erro++;
     }
     if(erro!=0){
     } else {
         Integer idade = PegaAno(data.getText());
         Idades.addElement(idade);
         
         Datas.addElement(data.getText());
         Nomes.addElement(nome.getText());
         
         Cpf.addElement(cpf.getText());
       
        }
      
    }
    public void verificadordia (String Dia)throws DataExeption
    {
      
    if(Dia.length()!=10)
    {
     throw new DataExeption();
    }
    char primeirabarra= Dia.charAt(2);
    char segundabarra= Dia.charAt(5);
    if(primeirabarra!='/'||segundabarra!='/')
    {
        throw new DataExeption();
    }
  
    String Datadividido[]=Dia.split("/");
    String dia= Datadividido[0];
    String mes= Datadividido[1];
    String ano =Datadividido[2];
    if(dia.length()!=2||mes.length()!=2||ano.length()!=4)
    {
        System.out.println("Erro tamanho");
          throw new DataExeption();
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
    if((diaint>30||diaint<1)||(mesint>12||mesint<1)||anoint>2024||anoint<0)
    {
            
        throw new DataExeption();
    }
    
    }
    public void verificaorcpf(String Cpf) throws CpfExeption
    {
     if(Cpf.length()!=14)
     {
         throw new CpfExeption();
    }
    char primeiroponto=Cpf.charAt(3);
    char segundoponto=Cpf.charAt(7);
    char traco=Cpf.charAt(11);
     if(primeiroponto!='.'||segundoponto!='.'||traco!='-')
     {
         throw new CpfExeption();
     }
     String cpfverif []=Cpf.split("-");
     if(cpfverif[0].length()!=11||cpfverif[1].length()!=2)
     {
         throw new CpfExeption();
     }
     String cpfParte1[]=cpfverif[0].split("\\.");
     String cpfparte0e1 =cpfParte1[0].concat(cpfParte1[1]);
     String cpf9dig=cpfparte0e1.concat(cpfParte1[2]);
     if(Einteiro(cpf9dig)==false)
     {
         throw new CpfExeption();
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
   if(Einteiro(cpfverif[1])==false)
   {
       throw new CpfExeption();
   }
   int dig2 = cpfverif[1].charAt(0)-48;
   int dig1 = cpfverif[1].charAt(1)-48;
   int primeiraSomaprod;
   primeiraSomaprod =(dig3*2)+(dig4*3)+(dig5*4)+(dig6*5)+(dig7*6)+(dig8*7)+(dig9*8)+(dig10*9)+(dig11*10);
   int resto1= primeiraSomaprod%11;
   if(resto1 ==0||resto1==1)
   {
       if(dig2!=0)
       {
           throw new CpfExeption();
       }
   }
   else
   {
       int verificador = 11-resto1;
       if(dig2!=verificador)
       {
           throw new CpfExeption();
       }
   }
    int segundaSomaprod=(dig2*2)+(dig3*3)+(dig4*4)+(dig5*5)+(dig6*6)+(dig7*7)+(dig8*8)+(dig9*9)+(dig10*10)+(dig11*11);
    int resto2 = segundaSomaprod%11;
    if(resto2 ==0||resto2==1)
   {
       if(dig1!=0)
       {
           throw new CpfExeption();
       }
   }
   else
   {
       int verificador = 11-resto2;
       if(dig1!=verificador)
       {
           throw new CpfExeption();
       }
   }
}
     public boolean Einteiro (String a)
      {
         for(int i =0;i<a.length();i++)
                 {
                 if('0'>a.charAt(i)||a.charAt(i)>'9')
                 {
                     return false;
                 }
                 }
          
return true;
      }
     public int PegaAno(String data)
     {
             String Datadividido[]=data.split("/");
             String ano = Datadividido[2];
             int ano1 = ano.charAt(0)-48;
             int ano2 = ano.charAt(1)-48;
             int ano3 = ano.charAt(2)-48;
             int ano4 = ano.charAt(3)-48;
             int anoint = (ano1*1000)+(ano2*100)+(ano3*10)+(ano4);
             int diferenca = 2024-anoint;
             return diferenca;
     }
     public void RemoveContato()
     {
         JFrame MensagemErro = new JFrame("Erro");
         MensagemErro.setSize(300,200);
        MensagemErro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panelErro= new JPanel();
        panelErro.setLayout(new FlowLayout());
         
         int selectedIndex =ListaNomes.getSelectedIndex();
         System.out.println("Valor Lista Nomes 0: "+ Nomes.getElementAt(0));
         System.out.println("Valor de selectedIndex: "+selectedIndex);
         
                if(selectedIndex ==-1)
                {
                  
                    JLabel mensagem = new JLabel("Selecione algum Nome que queira remover!");
                    panelErro.add(mensagem);
                    MensagemErro.add(panelErro);
                    MensagemErro.setVisible(true);
                    
                    
                }
                if(selectedIndex != -1)
                {
                    Nomes.remove(selectedIndex);
                    Cpf.remove(selectedIndex);
                    Idades.remove(selectedIndex);
                    Datas.remove(selectedIndex);
                }
                
     }
     public void EditarContato()
     {
        JFrame MensagemErro = new JFrame("Erro");
        MensagemErro.setSize(300,200);
        MensagemErro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panelErro= new JPanel();
        panelErro.setLayout(new FlowLayout());
         int selectedIndex =ListaNomes.getSelectedIndex();
         int erro=0;
        
                     if(selectedIndex ==-1)
                {
                  
                    JLabel mensagem = new JLabel("Selecione algum Nome que queira editar!");
                    panelErro.add(mensagem);
                    MensagemErro.add(panelErro);
                    MensagemErro.setVisible(true);
                    
                    
                }
                if(selectedIndex != -1)
                {
                     String dia = data.getText();
      String diasemspaco =dia.trim();
                try{
      verificadordia(diasemspaco);
      }
      catch(DataExeption e)
      {
       
        JLabel ErroFormato = new JLabel("Formato da Data de Nascimento incorreto!, utilize o formato DD/MM/AAAA");
        panelErro.add(ErroFormato);
        MensagemErro.add(panelErro);
        MensagemErro.setVisible(true);
        erro++;
      }
    String cpfantes=cpf.getText();
    String cpfsemspaco=cpfantes.trim();
     try{
         verificaorcpf(cpfsemspaco);
         
     }
     catch(CpfExeption e)
     {
         JLabel ErroFormato = new JLabel("Cpf incorreto!, utilize o formato DDD.DDD.DDD-DD");
        panelErro.add(ErroFormato);
        MensagemErro.add(panelErro);
        MensagemErro.setVisible(true);
        erro++;
     }
     if(erro!=0){
     } else {
         Integer idade = PegaAno(data.getText());
         Idades.set(selectedIndex,idade );
         
         Datas.set(selectedIndex,data.getText() );
        
          Nomes.set(selectedIndex,nome.getText() );
         
          Cpf.set(selectedIndex,cpf.getText() );
       
        }
        
                }

        }
     
     
     public void atualizarFormulario()
     {
        int selectedIndex =ListaNomes.getSelectedIndex();
        
                if(selectedIndex != -1)
                {
                 nome.setText(Nomes.elementAt(selectedIndex));
                 data.setText(Datas.elementAt(selectedIndex));
                 cpf.setText(Cpf.elementAt(selectedIndex));
                }

        
}
}
     

