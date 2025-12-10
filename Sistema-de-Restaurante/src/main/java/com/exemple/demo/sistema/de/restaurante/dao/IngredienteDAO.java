package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.Ingrediente;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class IngredienteDAO {

    private final JdbcClient jdbc;

    public IngredienteDAO(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    public Integer create(Ingrediente ingrediente) {
        String sql = """
            INSERT INTO ingrediente (nome, quantidade)
            VALUES (:nome, :quantidade)
        """;

        return jdbc.sql(sql)
                .param("nome", ingrediente.getNome())
                .param("quantidade", ingrediente.getValidade())
                .update();
    }
}
