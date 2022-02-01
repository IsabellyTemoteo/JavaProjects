/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdascanetas;

/**
 *
 * @author Isabelly
 */
public class Caneta {
    private String Cor;
    private float Ponta;
    private boolean CanetaTampada;

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public float getPonta() {
        return Ponta;
    }

    public void setPonta(float Ponta) {
        this.Ponta = Ponta;
    }

    public boolean getCanetaTampada() {
        return CanetaTampada;
    }

    public void setCanetaTampada(boolean CanetaTampada) {
        this.CanetaTampada = CanetaTampada;
    }
    
    public void status(){
        System.out.println("Cor: " + this.Cor + "\n" + "Ponta: " + this.Ponta + "\n" + "Tampada: " + this.CanetaTampada);
    }
    
    public void tampar(){
        CanetaTampada = true;
    }
    
    public void destampar(){
        CanetaTampada = false;
    }
    
    public void escrever(){
        if(CanetaTampada){
            System.out.println("A caneta não escreve!");
        }
        else { System.out.println("A caneta escreve!");}
    }
}
