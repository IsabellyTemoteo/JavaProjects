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
public class Partida {
    private Selecao a;
    private Selecao b;
    
    Partida(Selecao a, Selecao b){
        this.a = a;
        this.b = b;
    }

    public Selecao getB() {
        return b;
    }

    public void setB(Selecao b) {
        this.b = b;
    }

    public Selecao getA() {
        return a;
    }

    public void setA(Selecao a) {
        this.a = a;
    }
    
    public void iniciarPartida(){
        System.out.println("Partida iniciada entre seleção " + this.a.toString() + " e " + this.b.toString());
    }
    
    public void decretaResultado(){
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(3);
        
        if(resultado == 0){ // selecao a venceu
            System.out.println("Seleção " + this.a.getNome() + " venceu!");
            this.a.setPontos(this.a.getPontos() + 3);
        }
        else if(resultado == 1){ // selecao b venceu
            System.out.println("Seleção " + this.b.getNome() + " venceu!");
            this.a.setPontos(this.b.getPontos() + 3);
        }
        else{ // empate
            System.out.println("Empate!!");
            this.a.setPontos(this.a.getPontos() + 1);
            this.a.setPontos(this.b.getPontos() + 1);
        }
    }
}
