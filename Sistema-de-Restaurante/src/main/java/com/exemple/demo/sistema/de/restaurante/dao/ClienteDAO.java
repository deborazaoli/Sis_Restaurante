package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.Cliente;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDAO {

    private final JdbcClient jdbc;
    private final UsuarioDAO usuarioDAO;

    public ClienteDAO(JdbcClient jdbc, UsuarioDAO usuarioDAO) {
        this.jdbc = jdbc;
        this.usuarioDAO = usuarioDAO;
    }

    public Integer create(Cliente cliente) {
        usuarioDAO.create(cliente);

        String sql = """
            INSERT INTO cliente (id, restricao)
            VALUES (LAST_INSERT_ID(), :restricao)
        """;

        return jdbc.sql(sql)
                .param("restricao", cliente.getRestricaoAlimentar())
                .update();
    }
}
