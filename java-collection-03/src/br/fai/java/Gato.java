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
public class Gato extends Animal{
    
    
    public Gato(String cor){
        setCor("branco");
        
    }
    public void Gato(String cor){
        
    }
    
    @Override
    public void som(){
        super.som();
        System.out.println("eu gosto de miar");
    }
    
    public void oQueFacoDuranteANoite(){
        System.out.println("Gosto de pular a " + "cerca toda noite");
    }
}
