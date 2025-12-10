package com.exemple.demo.sistema.de.restaurante.model;

public class Ingrediente {
    private Integer id;
    private String nome;
    private String validade;
    private String origem;

//construtor
    public Ingrediente(String nome, String validade, String origem) {
        this.nome = nome;
        this.validade = validade;
        this.origem = origem;
    }

public Ingrediente(String string, int i) {
        //TODO Auto-generated constructor stub
    }

    //get e set
    public Integer getId() { 
        return id; 

    }

    public void setId(Integer id) { 
        this.id = id; 

    }
    public String getNome() { 
        return this.nome; 
        }

    public void setNome(String nome) { 
        this.nome = nome; 
        }

    public String getValidade() { 
        return this.validade; 
        }

    public void setValidade(String validade) { 
        this.validade = validade; 
        }

    public String getOrigem() { 
        return this.origem; 
        }

    public void setOrigem(String origem) { 
        this.origem = origem; 
        }
}