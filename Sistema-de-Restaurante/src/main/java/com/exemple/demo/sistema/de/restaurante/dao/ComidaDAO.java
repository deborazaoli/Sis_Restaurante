package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.Comida;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class ComidaDAO {

    private final JdbcClient jdbc;

    public ComidaDAO(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    public Integer create(Comida comida) {
        String sql = """
            INSERT INTO comida (nome, preco, ingrediente_id)
            VALUES (:nome, :preco, :ingredienteId)
        """;

        return jdbc.sql(sql)
                .param("nome", comida.getNome())
                .param("preco", comida.getPreco())
                .param("ingredienteId", comida.getIngredienteId())
                .update();
    }
}