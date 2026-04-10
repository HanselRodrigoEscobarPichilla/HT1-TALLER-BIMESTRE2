package com.alejandromax.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model) {

        model.addAttribute("Nombre", "Alejandro Max");
        model.addAttribute("Edad", 21);

        return "datos";
    }
}