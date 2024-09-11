/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade04.Botoes;

import com.mycompany.atividade04.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nitro 5
 */
public class BotaoRemover implements ActionListener {
    private Tela telao;
   public BotaoRemover(Tela receptor)
    {
        telao = receptor;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
      telao.AdicionaContato();
    } 
}
