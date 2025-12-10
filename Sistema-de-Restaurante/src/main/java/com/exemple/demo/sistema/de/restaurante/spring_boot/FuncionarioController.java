package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.FuncionarioDAO;
import com.exemple.demo.sistema.de.restaurante.model.Funcionario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FuncionarioController {

    private final FuncionarioDAO funcionarioDAO;

    public FuncionarioController(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    @GetMapping("/funcionario")
    public String formularioFuncionario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "funcionario";
    }

    @PostMapping("/funcionario")
    public String salvarFuncionario(Funcionario funcionario) {
        funcionarioDAO.create(funcionario);
        return "redirect:/funcionario";
    }
}
