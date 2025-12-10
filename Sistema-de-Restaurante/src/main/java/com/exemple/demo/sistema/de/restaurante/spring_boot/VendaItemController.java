package com.exemple.demo.sistema.de.restaurante.spring_boot;

import com.exemple.demo.sistema.de.restaurante.dao.VendaItemDAO;
import com.exemple.demo.sistema.de.restaurante.model.VendaItem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VendaItemController {

    private final VendaItemDAO vendaItemDAO;

    public VendaItemController(VendaItemDAO vendaItemDAO) {
        this.vendaItemDAO = vendaItemDAO;
    }

    @GetMapping("/vendaItem")
    public String formularioVendaItem(Model model) {
        model.addAttribute("vendaItem", new VendaItem());
        return "vendaItem";
    }

    @PostMapping("/vendaItem")
    public String salvarVendaItem(VendaItem vendaItem) {
        vendaItemDAO.create(vendaItem);
        return "redirect:/vendaItem";
    }
}