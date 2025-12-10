package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.ComidaDAO;
import com.exemple.demo.sistema.de.restaurante.model.Comida;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComidaController {

    private final ComidaDAO comidaDAO;

    public ComidaController(ComidaDAO comidaDAO) {
        this.comidaDAO = comidaDAO;
    }

    @GetMapping("/comida")
    public String formularioCadastro(Model model){
        model.addAttribute("comida", new Comida("",0,0,0,0));
        return "comida";
    }

    @PostMapping("/comida")
    public String salvar(Comida comida) {
        comidaDAO.create(comida);
        return "redirect:/comida";
    }
}
