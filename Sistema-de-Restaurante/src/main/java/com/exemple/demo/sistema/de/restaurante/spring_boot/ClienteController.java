package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.ClienteDAO;
import com.exemple.demo.sistema.de.restaurante.model.Cliente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

    private final ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @GetMapping("/cliente")
    public String formularioCadastro(Model model) {
        model.addAttribute("cliente", new Cliente("", 0, "", ""));
        return "cliente"; 
    }

    @PostMapping("/cliente")
    public String salvarCliente(Cliente cliente) {
        clienteDAO.create(cliente);
        return "redirect:/cliente";
    }
}
