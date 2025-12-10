package com.exemple.demo.sistema.de.restaurante.model;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Ingrediente ing1 = new Ingrediente("Tomate", "10/10/2025", "Local");
        Ingrediente ing2 = new Ingrediente("Queijo", "05/11/2025", "Itália");
        Ingrediente ing3 = new Ingrediente("Carne", "15/10/2025", "Brasil");
        Ingrediente ing4 = new Ingrediente("Alface", "08/10/2025", "Escócia");

        List<Ingrediente> ingredientes1 = new ArrayList<>();
        ingredientes1.add(ing1);
        ingredientes1.add(ing2);

        List<Ingrediente> ingredientes2 = new ArrayList<>();
        ingredientes2.add(ing3);
        ingredientes2.add(ing4);

        Comida comida1 = new Comida("Pizza de Calabresa", 850, 25, 90, 45.0f);
        comida1.setIgredientes(ingredientes1);

        Comida comida2 = new Comida("Hambúrguer Artesanal", 950, 40, 110, 35.0f);
        comida2.setIgredientes(ingredientes2);

        Funcionario func1 = new Funcionario("Lucas", 30, "marcos@email.com", "1234", 987654);
        func1.setEspecializacao("Chef de Cozinha");

        Funcionario func2 = new Funcionario("Laura", 27, "laura@email.com", "abcd", 456789);
        func2.setEspecializacao("Atendente");

        List<Funcionario> funcionarios1 = new ArrayList<>();
        funcionarios1.add(func1);
        funcionarios1.add(func2);

        Restaurante rest1 = new Restaurante("Sabores Latinos", "12.345.678/0001-90", "contato@sabores.com", "Brasileiro", "Recife");
        rest1.setFuncionario(funcionarios1);

        Restaurante rest2 = new Restaurante("Delícias Nordestinas", "98.765.432/0001-12", "contato@delicias.com", "Regional", "Olinda");
        rest2.setFuncionario(funcionarios1);

        Cliente cliente1 = new Cliente("Ana", 22, "ana@email.com", "senha123");
        cliente1.setRestricaoAlimentar("Sem lactose");
        List<Comida> comidasAna = new ArrayList<>();
        comidasAna.add(comida1);
        cliente1.setComidas(comidasAna);

        Cliente cliente2 = new Cliente("João", 28, "joao@email.com", "senha456");
        cliente2.setRestricaoAlimentar("Sem glúten");
        List<Comida> comidasJoao = new ArrayList<>();
        comidasJoao.add(comida2);
        cliente2.setComidas(comidasJoao);

        VendaItem venda1 = new VendaItem("10/09/2025", "18:00", 2, "Pedido #001", 90.0f);
        venda1.setComida(comida1);
        List<Cliente> clientesVenda1 = new ArrayList<>();
        clientesVenda1.add(cliente1);
        venda1.setCliente(clientesVenda1);

        VendaItem venda2 = new VendaItem("01/10/2025", "20:30", 1, "Pedido #002", 35.0f);
        venda2.setComida(comida2);
        List<Cliente> clientesVenda2 = new ArrayList<>();
        clientesVenda2.add(cliente2);
        venda2.setCliente(clientesVenda2);

        System.out.println("\n--- Polimorfismo");
        Usuario u1 = cliente1;
        Usuario u2 = func1;
        Usuario u3 = cliente2;
        Usuario u4 = func2;
        u1.imprimeInfo();
        u2.imprimeInfo();
        u3.imprimeInfo();
        u4.imprimeInfo();

        System.out.println("\n--- Restaurantes");
        System.out.println(rest1.getNome() + " - " + rest1.getGastronomia());
        System.out.println(rest2.getNome() + " - " + rest2.getGastronomia());

        System.out.println("\nFuncionários do restaurante:");
        for (Funcionario f : rest1.getFuncionario()) {
            System.out.println("- " + f.getNome() + " (" + f.getEspecializacao() + ")");
        }

        System.out.println("\n--- Vendas Feitas");
        venda1.imprimeInfo();
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Comida: " + comida1.getNome());

        venda2.imprimeInfo();
        System.out.println("Cliente: " + cliente2.getNome());
        System.out.println("Comida: " + comida2.getNome());
    }
}