package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.UsuarioDAO;
import com.exemple.demo.sistema.de.restaurante.model.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    private final UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @GetMapping("/usuario")
    public String formularioUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario";
    }

    @PostMapping("/usuario")
    public String salvarUsuario(Usuario usuario) {
        usuarioDAO.create(usuario);
        return "redirect:/usuario";
    }
}
