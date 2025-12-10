package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.RestauranteDAO;
import com.exemple.demo.sistema.de.restaurante.model.Restaurante;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestauranteController {

    private final RestauranteDAO restauranteDAO;

    public RestauranteController(RestauranteDAO restauranteDAO) {
        this.restauranteDAO = restauranteDAO;
    }

    @GetMapping("/restaurante")
    public String formularioRestaurante(Model model) {
        model.addAttribute("restaurante", new Restaurante());
        return "restaurante";
    }

    @PostMapping("/restaurante")
    public String salvarRestaurante(Restaurante restaurante) {
        restauranteDAO.create(restaurante);
        return "redirect:/restaurante";
    }
}
