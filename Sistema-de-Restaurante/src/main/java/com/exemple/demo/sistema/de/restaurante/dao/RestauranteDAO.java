package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.Restaurante;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class RestauranteDAO {

    private final JdbcClient jdbc;

    public RestauranteDAO(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    public Integer create(Restaurante r) {
        String sql = """
            INSERT INTO restaurante (nome, endereco)
            VALUES (:nome, :endereco)
        """;

        return jdbc.sql(sql)
                .param("nome", r.getNome())
                .param("endereco", r.getEndereco())
                .update();
    }
}
