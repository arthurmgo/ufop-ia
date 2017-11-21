/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufop_ia;

/**
 *
 * @author jean
 */
public class Tabuleiro implements Cloneable {
    
    private int tab[][];
    
    public Tabuleiro(int numLine, int numColumn) {
        tab = new int[numLine][numColumn];
        for (int i = 0; i < numLine; i++) {
            for (int j = 0; j < numColumn; j++) {
                tab[i][j] = 0;
            }
        }        
    }
    
    public Tabuleiro(int[][] tab) {
        this.tab = tab;
    }
    
    public void iniciaTabuleiro() {
        //Posiciona Lobo e as 4 Ovelhas para 8X8
        if (tab.length == 8 && tab[0].length == 8) {
            tab[0][1] = -1;
            tab[7][0] = 1;
            tab[7][2] = 2;
            tab[7][4] = 3;
            tab[7][6] = 4;
        }        
    }
    
    public void iniciaTabuleiro4(){
        //Posiciona Lobo e as 2 Ovelhas para 4x4
        if (tab.length == 4 && tab[0].length == 4) {
            tab[0][1] = -1;
            tab[3][0] = 1;
            tab[3][2] = 2;
        } 
    }
    
    public int[][] getTab() {
        return tab;
    }
    
    public void setTab(int[][] tab) {
        this.tab = tab;
    }
    
    public int[] buscaPosicao(int idPeca) {
        int posicao[] = new int[2];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (tab[i][j] == idPeca) {
                    posicao[0] = i;
                    posicao[1] = j;
                    break;
                }
                
            }            
        }
        
        return posicao;
    }

    /**
     *
     * @return 
     */
    @Override
    public String toString() {
        String tabuleiro = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                if (tab[i][j] != -1) {
                    tabuleiro = tabuleiro.concat(String.valueOf(" " + tab[i][j]) + " ");
                } else {
                    tabuleiro = tabuleiro.concat(String.valueOf(tab[i][j]) + " ");
                }
            }
            tabuleiro = tabuleiro.concat("\n");
        }
        return tabuleiro;
    }
    
    @Override
    public Tabuleiro clone() {
        
        return new Tabuleiro(tab.clone());
        
    }
    
}