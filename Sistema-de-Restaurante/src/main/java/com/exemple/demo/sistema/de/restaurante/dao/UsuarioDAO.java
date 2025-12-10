package com.exemple.demo.sistema.de.restaurante.dao;

import com.exemple.demo.sistema.de.restaurante.model.Usuario;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAO {

    private final JdbcClient jdbc;

    public UsuarioDAO(JdbcClient jdbc) {
        this.jdbc = jdbc;
    }

    public Integer create(Usuario usuario) {
        String sql = """
            INSERT INTO usuario (nome, idade, email, senha)
            VALUES (:nome, :idade, :email, :senha)
        """;

        return jdbc.sql(sql)
                .param("nome", usuario.getNome())
                .param("idade", usuario.getIdade())
                .param("email", usuario.getEmail())
                .param("senha", usuario.getSenha())
                .update();
    }
}