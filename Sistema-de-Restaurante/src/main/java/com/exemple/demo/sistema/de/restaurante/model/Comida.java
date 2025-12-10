package com.exemple.demo.sistema.de.restaurante.model;
import java.util.List;

public class Comida {
    private Integer id;
    private String nome;
    private int calorias;
    private int proteinas;
    private int carboidratos;
    private float valor;
    private List<Ingrediente> igredientes;


// construtor
    public Comida(String nome, int calorias, int proteinas, int carboidratos, float valor) {
        this.nome = nome;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.carboidratos = carboidratos;
        this.valor = valor;
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

    public int getCalorias() { 
        return this.calorias; 
        }

    public void setCalorias(int calorias) { 
        this.calorias = calorias; 
        }

    public int getProteinas() { 
        return this.proteinas; 
        }

    public void setProteinas(int proteinas) { 
        this.proteinas = proteinas; 
        }

    public int getCarboidratos() { 
        return this.carboidratos; 
        }

    public void setCarboidratos(int carboidratos) { 
        this.carboidratos = carboidratos; 
        }

    public float getValor() { 
        return this.valor; 
        }

    public void setValor(float valor) { 
        this.valor = valor; 
        }

    public List<Ingrediente> getIgredientes() { 
        return this.igredientes; 
        }

    public void setIgredientes(List<Ingrediente> igredientes) { 
        this.igredientes = igredientes; 
        }

    public Object getIngredienteId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIngredienteId'");
    }

    public Object getPreco() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPreco'");
    }
}