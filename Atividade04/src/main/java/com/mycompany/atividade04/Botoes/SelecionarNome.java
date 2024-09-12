/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade04.Botoes;

import com.mycompany.atividade04.Tela;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Nitro 5
 */
public class SelecionarNome implements ListSelectionListener{
     private Tela telao;
   public SelecionarNome(Tela receptor)
    {
        telao = receptor;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        telao.atualizarFormulario();
    }
}
