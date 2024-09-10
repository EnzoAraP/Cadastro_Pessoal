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
     private DefaultListModel<String> Idades = new DefaultListModel<>();
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
            }
            {//editar
        constraints.gridx = 2; // Grid column
        panel.add(editar, constraints);        
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
      String dia = data.getText();
      String diasemspaco =dia.trim();
      try{
      verificadordia(diasemspaco);
      }
      catch(DataExeption e)
      {
          
      }
      Datas.addElement(data.getText());
      ListaDatas = new JList(Datas);
     Nomes.addElement(nome.getText());
     ListaNomes = new JList(Nomes);
  
     
     Cpf.addElement(cpf.getText());
     ListaCpf= new JList (Cpf);
    
      
    }
    public boolean verificadordia (String Dia)throws DataExeption
    {
        JFrame MensagemErro = new JFrame("Erro Data!");
        MensagemErro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MensagemErro.setSize(300,200);
        JPanel panelErro = new JPanel();
    if(Dia.length()!=8)
    {
        JLabel ErroFormato = new JLabel("Formato incorreto!, utilize o formato DD/MM/AAAA");
        return false;
    }
    
    
        return true;
    }
}
