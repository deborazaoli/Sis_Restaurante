package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.VendaItem;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class VendaItemDAO {

    private final JdbcClient jdbc;

    public VendaItemDAO(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    public Integer create(VendaItem v) {
        String sql = """
            INSERT INTO venda_item (comida_id, quantidade)
            VALUES (:comidaId, :quantidade)
        """;

        return jdbc.sql(sql)
                .param("comidaId", v.getComidaId())
                .param("quantidade", v.getQuantidade())
                .update();
    }
}