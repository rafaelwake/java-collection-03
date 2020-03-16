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
public class Cachorro extends Animal{
    
    public Cachorro(String nome){
        
        setNome(nome);
        
    }
    
    @Override
    public void som(){
        System.out.println("Eu gosto de latir");
       
    }
    
    public void oQueGostoDeFazer(){
        System.out.println("Gosto de morder "
        + "carteiro");
    }
    
}
