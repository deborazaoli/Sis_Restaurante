package com.exemple.demo.sistema.de.restaurante.model;

public class Funcionario extends Usuario {
    private Integer id;
    private int numeroConta;
    private String especializacao;
    private Integer restauranteId;

    
    public Funcionario() { super(); }
//construtor
    public Funcionario(String nome, int idade, String email, String senha, int numeroConta) {
        super(nome, idade, email, senha);
        this.numeroConta = numeroConta;
    }

//get e set
    public Integer getId() { 
        return id; 
    }
    public void setId(Integer id) { 
        this.id = id; 
    }

    public int getNumeroConta() { 
        return this.numeroConta; 
        }

    public void setNumeroConta(int numeroConta) { 
        this.numeroConta = numeroConta; 
        }

    public String getEspecializacao() { 
        return this.especializacao; 
        }

    public void setEspecializacao(String especializacao) { 
        this.especializacao = especializacao; 
        }

    public Integer getRestauranteId() { 
        return restauranteId; 
        }

    public void setRestauranteId(Integer restauranteId) { 
        this.restauranteId = restauranteId; 
    }

//sobrescrita do metodo imprimi
    @Override
    public void imprimeInfo() {
        System.out.println("\nFuncionário");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Especialização: " + this.especializacao);
    }
    public Object getCargo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCargo'");
    }
    public Object getSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalario'");
    }
}