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
public class Tabuleiro {
    
    private int tab[][];
    
    public Tabuleiro(int numLine,int numColumn){
        tab= new int[numLine][numColumn];
        for(int i=0;i<numLine;i++){
            for(int j=0;j<numColumn;j++){
                tab[i][j]=0;
            }
        }  
        //Posiciona Lobo e as 4 Ovelhas para 8X8
        if(numLine==8&&numColumn==8){
            tab[0][1]=-1;
            tab[7][0]=1;
            tab[7][2]=2;
            tab[7][4]=3;
            tab[7][6]=4;
        }
    }
    
    /**
     *
     */
    @Override
    public String toString(){
        String tabuleiro = "";
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab[0].length;j++){
                if(tab[i][j]!=-1){
                    tabuleiro = tabuleiro.concat(String.valueOf(" " +tab[i][j])+" ");
                }else{
                    tabuleiro = tabuleiro.concat(String.valueOf(tab[i][j])+" ");
                }
            }
            tabuleiro = tabuleiro.concat("\n");
        }
        return tabuleiro;
    }
    
}

