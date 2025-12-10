package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.IngredienteDAO;
import com.exemple.demo.sistema.de.restaurante.model.Ingrediente;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IngredienteController {

    private final IngredienteDAO ingredienteDAO;

    public IngredienteController(IngredienteDAO ingredienteDAO) {
        this.ingredienteDAO = ingredienteDAO;
    }

    @GetMapping("/ingrediente")
    public String formularioIngrediente(Model model) {
        model.addAttribute("ingrediente", new Ingrediente("",0));
        return "ingrediente";
    }

    @PostMapping("/igrediente")
    public String salvarIngrediente(Ingrediente ingrediente) {
        ingredienteDAO.create(ingrediente);
        return "redirect:/igrediente";
    }
}