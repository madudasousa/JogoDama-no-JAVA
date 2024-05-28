package com.damas;

import com.damas.gui.JanelaPrincipal;

/**
 * Contém a classe principal do jogo de damas
*/
public class App {
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
}
