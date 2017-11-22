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
public class App {
    public static void main(String[] args) {
        Tabuleiro t1 = new Tabuleiro(4,4);
      // t1.iniciaTabuleiro();
    // int tab[][]={{0,-1,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{1,0,2,0,3}};
       int tab[][]={{0,-1,0,0},{0,0,0,0},{0,0,0,0},{1,0,2,0}};
       t1.setTab(tab);
        EstadoJogo inicial = new EstadoJogo(t1);
        
        //System.out.println(inicial.getTab());
        
        //System.out.println(inicial.estadosAlcancaveis(0));
        
//        for (EstadoJogo a : inicial.estadosAlcancaveis(0)) {
//            System.out.println(a.estadosAlcancaveis(0));
//        }
        

        MiniMax m1 = new MiniMax();
        
        System.out.println("estado:\n"+m1.miniMaxDecision(inicial));
        System.out.println("Numero de estados:"+m1.contador);
        
        
        //System.out.println(m1.miniMaxDecision(inicial, 1).getTab());
    }
    
}