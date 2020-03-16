/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fai.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Main {
    public static void main (String[] args){
        Main app = new Main();
        app.start();
            
    }

    private void start() {
        Cachorro primeiroCachorro = new Cachorro ("Tiburssinho");
        
        primeiroCachorro.setCor("azul");
        
        
        Cachorro segundoCachorro = new Cachorro ("Aroldo");
        
        //Gato primeiroGato = new Gato ("Chaninho");
        
        //criando uma lista
        List<Cachorro> ListaDeCachorros = new ArrayList <Cachorro>();
        
        ListaDeCachorros.add(primeiroCachorro);
        ListaDeCachorros.add(segundoCachorro);
        
        //exibindo lista dos atributos dos cachorros
        for(Cachorro cachorro : ListaDeCachorros){
            cachorro.som();
            cachorro.dizerMeuNome();
            cachorro.oQueGostoDeFazer();
            System.out.println("Qual sua cor: " + cachorro.getCor());
            System.out.println("___________");
                 
            
        }
        
        Gato primeiroGato = new Gato("chaninho");
        Gato segundoGato = new Gato ("Aspirina");
        
        List<Gato> ListaDeGatos = new ArrayList<>();
        
        ListaDeGatos.add(primeiroGato);
        ListaDeGatos.add(segundoGato);
        
        for (Gato gato : ListaDeGatos){
            gato.som();
            gato.dizerMeuNome();
            gato.oQueFacoDuranteANoite();
            
            System.out.println("Qual sua cor: " + gato.getCor());
            System.out.println("____________________");
        }
        
        
    }
  
    
}
