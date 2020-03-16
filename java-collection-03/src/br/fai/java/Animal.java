/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fai.java;

/**
 *
 * @author Rafael
 */
public abstract class Animal {

    
    private String cor = "preto";
    private final int idade = 5;
    private String nome = "nao definido";
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
    public void som(){
        System.out.println("Qual é meu som: ");
    }
    
    public void dizerMeuNome(){
        
        
        System.out.println("O nome do animal eh: " + nome);
    }
    
    private void dizerMinhaIdade(){
        System.out.println("Minha idade eh: " + idade);
    }
    
    
    
}
