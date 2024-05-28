package com.damas.objetos;

/**
 * Representa uma Casa do tabuleiro.
 * Possui uma posiçao (i,j) e pode conter uma Peça.
 */
public class Casa {

    private int x;
    private int y;
    private Pedra peca;

    public Casa(int x, int y) {
        this.x = x;
        this.y = y;
        this.peca = null;
    }
    
    /**
     * @param peca a Peça a ser posicionada nesta Casa.
     */
    public void colocarPeca(Pedra peca) {
        this.peca = peca;
    }

    /**
     * Remove a peca posicionada nesta casa, se houver.
     */
    public void removerPeca() {
        peca = null;
    }
    
    /**
     * @return a Peca posicionada nesta Casa, ou Null se a casa estiver livre.
     */
    public Pedra getPeca() {
        return peca;
    }
    
    /**
     * @return true se existe uma peça nesta casa, caso contrario false.
     */
    public boolean possuiPeca() {
        return peca != null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
