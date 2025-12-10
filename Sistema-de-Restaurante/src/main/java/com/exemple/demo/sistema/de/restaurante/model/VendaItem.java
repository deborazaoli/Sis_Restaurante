package com.exemple.demo.sistema.de.restaurante.model;

import java.util.List;

public class VendaItem {
    private Integer id;
    private String data;
    private String hora;
    private int quantidade;
    private String pedido;
    private String infoAdicional;
    private float valorTotal;
    private Comida comida;
    private List<Cliente> cliente;

//construtor
    public VendaItem(String data, String hora, int quantidade, String pedido, float valorTotal) {
        this.data = data;
        this.hora = hora;
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.valorTotal = valorTotal;
    }

public VendaItem() {}

    //get e set
    public Integer getId() { 
        return id; 
    }

    public void setId(Integer id) { 
        this.id = id; 
    }

    public String getData() { 
        return this.data; 
        }

    public void setData(String data) { 
        this.data = data; }

    public String getHora() { 
        return this.hora; 
    }

    public void setHora(String hora) { 
        this.hora = hora; 
        }

    public int getQuantidade() { 
        return this.quantidade; 
        }

    public void setQuantidade(int quantidade) { 
        this.quantidade = quantidade; 
        }

    public String getPedido() { 
        return this.pedido; 
    }

    public void setPedido(String pedido) { 
        this.pedido = pedido; 
        }

    public String getInfoAdicional() { 
        return this.infoAdicional; 
        }

    public void setInfoAdicional(String infoAdicional) { 
        this.infoAdicional = infoAdicional; 
        }

    public float getValorTotal() { 
        return this.valorTotal; 
        }

    public void setValorTotal(float valorTotal) { 
        this.valorTotal = valorTotal; 
        }

    public Comida getComida() { 
        return this.comida; 
        }

    public void setComida(Comida comida) { 
        this.comida = comida; 
    }

    public List<Cliente> getCliente() { 
        return this.cliente; 
        }
    public void setCliente(List<Cliente> cliente) { 
        this.cliente = cliente; 
        }

//imprimir
    public void imprimeInfo() {
        System.out.println("\nVenda");
        System.out.println("Data: " + this.data);
        System.out.println("Hora: " + this.hora);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Pedido: " + this.pedido);
        System.out.println("Valor Total: R$" + this.valorTotal);
    }

    public Object getComidaId() {
        throw new UnsupportedOperationException("Unimplemented method 'getComidaId'");
    }
}