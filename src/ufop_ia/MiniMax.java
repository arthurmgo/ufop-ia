/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufop_ia;

/**
 *
 * @author arthu
 */
public class MiniMax {

    public EstadoJogo miniMaxDecision(EstadoJogo st) {
        return null;

    }
    
    private int nextPlayer(int p){
        if(p == 1){
            return 0;
        }
        return 1;
    }

    public Double maxValue(EstadoJogo st, int player) throws CloneNotSupportedException {

        if (st.isTerminal()) {
            return st.getValue().doubleValue();
        }
        
        Double v = Double.NEGATIVE_INFINITY;
        for(Tabuleiro filhos : st.estadosAlcancaveis(player)){
            v = Math.max(v, minValue(new EstadoJogo(filhos), nextPlayer(player)));
        }
        return v;

    }
    
    
    public Double minValue(EstadoJogo st, int player) throws CloneNotSupportedException {

        if (st.isTerminal()) {
            return st.getValue().doubleValue();
        }
        
        Double v = Double.POSITIVE_INFINITY;
        for(Tabuleiro filhos : st.estadosAlcancaveis(player)){
            v = Math.min(v, maxValue(new EstadoJogo(filhos), nextPlayer(player)));
        }
        return v;

    }
    
}
