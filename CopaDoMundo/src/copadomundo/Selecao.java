/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copadomundo;

/**
 *
 * @author cleiston
 */
public class Selecao {
    private String nome;
    private int titulos;
    private int pontos;

    public Selecao(String nome, int titulos) {
        this.nome = nome;
        this.titulos = titulos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public void informa(){
        System.out.println("Seleção: " + this.nome);
        System.out.println("Titulos: " + this.titulos);
        System.out.println("Quantidade de pontos: " + this.pontos);
        System.out.println();
    }
    
    public String toString(){
        return this.nome;
    }
}
