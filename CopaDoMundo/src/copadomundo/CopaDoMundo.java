/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copadomundo;

import java.util.Random;

/**
 *
 * @author cleiston
 */
public class CopaDoMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Selecao s1 = new Selecao("Brasil", 5);
        Selecao s2 = new Selecao("França", 2);
        Selecao s3 = new Selecao("Alemanha", 4);
        Selecao s4 = new Selecao("Suíça", 0);
        
        Partida partidas[] = new Partida[5];
        
        partidas[0] = new Partida(s1, s2);
        partidas[1] = new Partida(s3, s4);
        partidas[2] = new Partida(s1, s3);
        partidas[3] = new Partida(s1, s4);
        partidas[4] = new Partida(s2, s3);
        
        for(Partida p : partidas){
            p.iniciarPartida();
            p.decretaResultado();
            System.out.println();
        }
        
        Selecao todasAsSelecoes[] = { s1, s2, s3, s4 };
        
        for(Selecao s : todasAsSelecoes){
            s.informa();
        }
    }
    
}
