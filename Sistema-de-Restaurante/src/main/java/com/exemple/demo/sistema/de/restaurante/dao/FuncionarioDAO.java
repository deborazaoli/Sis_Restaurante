package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.Funcionario;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDAO {

    private final JdbcClient jdbc;
    private final UsuarioDAO usuarioDAO;

    public FuncionarioDAO(JdbcClient jdbc, UsuarioDAO usuarioDAO) {
        this.jdbc = jdbc;
        this.usuarioDAO = usuarioDAO;
    }

    public Integer create(Funcionario funcionario) {
        usuarioDAO.create(funcionario);

        String sql = """
            INSERT INTO funcionario (id, cargo, salario)
            VALUES (LAST_INSERT_ID(), :cargo, :salario)
        """;

        return jdbc.sql(sql)
                .param("cargo", funcionario.getCargo())
                .param("salario", funcionario.getSalario())
                .update();
    }
}