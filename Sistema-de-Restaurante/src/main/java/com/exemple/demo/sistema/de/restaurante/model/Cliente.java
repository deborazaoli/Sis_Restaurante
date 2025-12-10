package com.exemple.demo.sistema.de.restaurante.model;

import java.util.List;

public class Cliente extends Usuario {
    private Integer id;
    private String restricaoAlimentar;
    private List<Comida> comidas;

    public Cliente() { super(); }
//construtor
    public Cliente(String nome, int idade, String email, String senha) {
        super(nome, idade, email, senha);
    }                                      

//get e set
    public Integer getId() { 
        return id; 
    }
    
    public void setId(Integer id) { 
        this.id = id; 
    }

    public String getRestricaoAlimentar() { 
        return this.restricaoAlimentar; 
    }

    public void setRestricaoAlimentar(String restricaoAlimentar) { 
        this.restricaoAlimentar = restricaoAlimentar; 
    }

    public List<Comida> getComidas() { 
        return this.comidas; 
    }

    public void setComidas(List<Comida> comidas) { 
        this.comidas = comidas; 
    }

//Sobrescrita/Polimorfismo
    @Override
    public void imprimeInfo() {
        System.out.println("\nCliente");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Restrição alimentar: " + this.restricaoAlimentar);
    }
}