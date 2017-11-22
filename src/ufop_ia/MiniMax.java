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

    public int contador = 0;

    public EstadoJogo miniMaxDecision(EstadoJogo st) {
        st.naoapagar = true;
        Double v = maxValue(st, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

        for (EstadoJogo filho : st.estadosAlcancaveis(1)) {
            //  System.out.println(filho.getTab());
            filho.naoapagar = true;
            contador++;
            // System.out.println(contador);
            if (filho.getValue() == v) {
                return filho;
            }
        }
        return null;

    }

//    private int nextPlayer(int p) {
//        if (p == 1) {
//            System.out.println("o jogador é o lobo");
//            return 0;
//        }
//        System.out.println("o jogador é a ovelha");
//        return 1;
//    }
    public Double maxValue(EstadoJogo st, Double alfa, Double beta) {

        int player = 1; // A ovelha é o MAX

        if (st.isTerminal()) {
            //   System.out.println("Terminal1!\n\n\n\n\n\n\n\n\n\n\n");
            //   System.out.println(st);
            // System.out.println(st.getValue());
            return st.getValue();
        }

        Double v = Double.NEGATIVE_INFINITY;
            for (EstadoJogo filho : st.estadosAlcancaveis(player)) {
                //   System.out.println(filho.getTab());
                contador++;
                //  System.out.println(contador);
                v = Math.max(v, minValue(filho, alfa, beta));
                filho.setValue(v);
                if (v >= beta) {
                    return v;
                }
                alfa = Math.max(alfa, v);
            }
       
        if (!st.naoapagar) {
            st.filhos.clear();
            st.filhos = null;
        }
        
        return v;

    }

    public Double minValue(EstadoJogo st, Double alfa, Double beta) {

        int player = 0; // O lobo é o MIN

        if (st.isTerminal()) {
            //  System.out.println("Terminal2:::!\n\n\n\n\n\n\n\n\n\n\n");
            //    System.out.println(st);
            //   System.out.println(st.getValue());
         
            return st.getValue();
        }

        Double v = Double.POSITIVE_INFINITY;
            for (EstadoJogo filho : st.estadosAlcancaveis(player)) {
                contador++;
                //    System.out.println(contador);
                //   System.out.println(filho.getTab());
                v = Math.min(v, maxValue(filho, alfa, beta));
                filho.setValue(v);
                if (v <= alfa) {
                    return v;
                }
                beta = Math.min(beta, v);
            }
        
        if (!st.naoapagar) {
            st.filhos.clear();
            st.filhos = null;
        }
        return v;

    }

}
