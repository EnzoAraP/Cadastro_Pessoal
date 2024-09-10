/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade04.Botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.atividade04.Tela;


/**
 *
 * @author Nitro 5
 */
public class BotaoAdd  implements ActionListener {
    private Tela telao;
   public BotaoAdd(Tela receptor)
    {
        telao = receptor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
      telao.AdicionaContato();
    }
    
}
