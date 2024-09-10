/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade04;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Nitro 5
 */
public class Tela {
    private JFrame tela;
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private JList<String> ListaNomes;
    private JList<String> ListaCpf;
    private JList<String> ListaDatas;
    private JList<String> ListaIdades;
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
        JTextField nome=new JTextField(20);
        JLabel nomeJL = new JLabel("Nome");
        JTextField data=new JTextField(20);
         JLabel dataJL = new JLabel("Data");
        JTextField cpf=new JTextField(20);
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
       DefaultListModel<String> Nomes = new DefaultListModel<>();
       Nomes.addElement("Enzo");
       Nomes.addElement("Julia");
       ListaNomes = new JList(Nomes);
        DefaultListModel<String> Datas = new DefaultListModel<>();
        Datas.addElement("21/07/2003");
        Datas.addElement("12/05/2004");
       ListaDatas = new JList(Datas);
        DefaultListModel<String> Cpf = new DefaultListModel<>();
        Cpf.addElement("13312331");
        Cpf.addElement("133146731");
       ListaCpf = new JList(Cpf);
        DefaultListModel<String> Idades = new DefaultListModel<>();
        Idades.addElement("19 Anos");
        Idades.addElement("18 Anos");
       ListaIdades = new JList(Idades);
      GridBagConstraints constraints = new GridBagConstraints();
       {//Nome Label
        constraints.gridx = 0; // Grid column
        constraints.gridy = 0; // Grid row
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        constraints.insets = new Insets(10, 10, 10, 10); // Padding
        panel.add(nomeJL, constraints);
     
        }
       {// data Label
           constraints.gridx = 1; // Grid column
           panel.add(dataJL, constraints);
       }
       {//idade Label
            constraints.gridx = 2; // Grid column
           panel.add(idadeJL, constraints);
       }
       {//cpf Label
            constraints.gridx = 3; // Grid column
           panel.add(cpfJL, constraints);
       }
       {//Nome List
           constraints.gridx = 0; // Grid column
           constraints.gridy = 1; // Grid row
           panel.add(ListaNomes, constraints);
       }
       {//Data List
           constraints.gridx = 1; // Grid column
           
           panel.add(ListaDatas, constraints);
       }
       {//Idade List
           constraints.gridx = 2; // Grid column
          
           panel.add(ListaIdades, constraints);
       }
       {//Cpf List
           constraints.gridx = 3; // Grid column
           
           panel.add(ListaCpf, constraints);
       }
       tela.add(panel);
    }
}
