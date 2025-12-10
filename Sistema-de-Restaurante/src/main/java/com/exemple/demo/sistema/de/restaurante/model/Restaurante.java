package com.exemple.demo.sistema.de.restaurante.model;

import java.util.List;

public class Restaurante {
    private Integer id;
    private String nome;
    private String CNPJ;
    private String email;
    private String gastronomia;
    private String localizacao;
    private List<Funcionario> funcionario;

//construtor
    public Restaurante(String nome, String CNPJ, String email, String gastronomia, String localizacao) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.email = email;
        this.gastronomia = gastronomia;
        this.localizacao = localizacao;
    }

public Restaurante() {}

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

    public String getCNPJ() { 
        return this.CNPJ; 
        }

    public void setCNPJ(String CNPJ) { 
        this.CNPJ = CNPJ; 
        }

    public String getEmail() { 
        return this.email; 
        }

    public void setEmail(String email) { 
        this.email = email; 
        }

    public String getGastronomia() { 
        return this.gastronomia; 
        }
    public void setGastronomia(String gastronomia) { 
        this.gastronomia = gastronomia; 
        }

    public String getLocalizacao() { 
        return this.localizacao; 
        }
    public void setLocalizacao(String localizacao) { 
        this.localizacao = localizacao; 
        }

    public List<Funcionario> getFuncionario() { 
        return this.funcionario; 
        }

    public void setFuncionario(List<Funcionario> funcionario) { 
        this.funcionario = funcionario; 
        }

    public Object getEndereco() {
        throw new UnsupportedOperationException("Unimplemented method 'getEndereco'");
    }
}