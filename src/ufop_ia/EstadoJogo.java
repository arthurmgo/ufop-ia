/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufop_ia;

import java.util.ArrayList;

/**
 *
 * @author jean
 */
public class EstadoJogo {
    
    private Tabuleiro tab;
    
    public EstadoJogo(Tabuleiro tab) throws CloneNotSupportedException{
        this.tab =  tab.clone();
    }
    
    //idVez indica a vez de jogar
    //0 para lobo, 1 para ovelhas
    public ArrayList<Tabuleiro> estadosAlcancaveis(int idVez) throws CloneNotSupportedException{
        ArrayList <Tabuleiro> alcancaveis = new  ArrayList <Tabuleiro>();
        if(idVez==0){
            int posicaoLobo[];
            posicaoLobo = tab.buscaPosicao(-1);
            int line = posicaoLobo[0];
            int column= posicaoLobo[1];
            //4 diagonais possiveis
            
            //Primeira Diagonal
            line--;
            column++;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                    int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    
                    
                   
                    tabNovo[posicaoLobo[0]][posicaoLobo[1]]=0;
                    tabNovo[line][column]= -1;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //Segunda Diagonal
            
            line = posicaoLobo[0];
            column= posicaoLobo[1];
            
            line--;
            column--;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoLobo[0]][posicaoLobo[1]]=0;
                    tabNovo[line][column]= -1;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //terceira Diagonal
            
            line = posicaoLobo[0];
            column= posicaoLobo[1];
            
            line++;
            column++;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                    int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoLobo[0]][posicaoLobo[1]]=0;
                    tabNovo[line][column]= -1;
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //Quarta Diagonal
            
            line = posicaoLobo[0];
            column= posicaoLobo[1];
            
            line++;
            column--;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                    int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoLobo[0]][posicaoLobo[1]]=0;
                    tabNovo[line][column]= -1;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
            }
            
        }
        
        
        if(idVez==1){
            //4 ovelhas podem se movimentar
            
            //ovelha 1
            int posicaoOvelha1[];
            posicaoOvelha1 = tab.buscaPosicao(1);
            int line = posicaoOvelha1[0];
            int column= posicaoOvelha1[1];
            //2 diagonais possiveis
            
            //1 diagonal
            line--;
            column--;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                    int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha1[0]][posicaoOvelha1[1]]=0;
                    tabNovo[line][column]= 1;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //2 diagonal
            line = posicaoOvelha1[0];
            column= posicaoOvelha1[1];
            line--;
            column++;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha1[0]][posicaoOvelha1[1]]=0;
                    tabNovo[line][column]= 1;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            
            //ovelha 2
            int posicaoOvelha2[];
            posicaoOvelha2 = tab.buscaPosicao(2);
            line = posicaoOvelha2[0];
            column= posicaoOvelha2[1];
            //2 diagonais possiveis
            
            //1 diagonal
            line--;
            column--;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha2[0]][posicaoOvelha2[1]]=0;
                    tabNovo[line][column]= 2;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //2 diagonal
            line = posicaoOvelha2[0];
            column= posicaoOvelha2[1];
            line--;
            column++;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha2[0]][posicaoOvelha2[1]]=0;
                    tabNovo[line][column]= 2;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            
            //ovelha 3
            int posicaoOvelha3[];
            posicaoOvelha3 = tab.buscaPosicao(3);
            line = posicaoOvelha3[0];
            column= posicaoOvelha3[1];
            //2 diagonais possiveis
            
            //1 diagonal
            line--;
            column--;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha3[0]][posicaoOvelha3[1]]=0;
                    tabNovo[line][column]= 3;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //2 diagonal
            line = posicaoOvelha3[0];
            column= posicaoOvelha3[1];
            line--;
            column++;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha3[0]][posicaoOvelha3[1]]=0;
                    tabNovo[line][column]= 3;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //ovelha 4
            int posicaoOvelha4[];
            posicaoOvelha4 = tab.buscaPosicao(4);
            line = posicaoOvelha4[0];
            column= posicaoOvelha4[1];
            //2 diagonais possiveis
            
            //1 diagonal
            line--;
            column--;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha4[0]][posicaoOvelha4[1]]=0;
                    tabNovo[line][column]= 4;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            //2 diagonal
            line = posicaoOvelha4[0];
            column= posicaoOvelha4[1];
            line--;
            column++;
            if(line>=0 && line<=7 && column >=0 && column <=7){
                if(tab.getTab()[line][column]==0){
                     int tabNovo [][] = new int [8][8];
                    for(int i=0;i<tab.getTab().length;i++){
                        for(int j=0;j<tab.getTab()[0].length;j++){
                            tabNovo[i][j]=tab.getTab()[i][j];
                        }
                    }
                    tabNovo[posicaoOvelha4[0]][posicaoOvelha4[1]]=0;
                    tabNovo[line][column]= 4;
                    
                    Tabuleiro novoTab = new Tabuleiro(tabNovo);
                    alcancaveis.add(novoTab);
                }
                
            }
            
            
        }
        
        
        return alcancaveis;
    }
    
    
}
