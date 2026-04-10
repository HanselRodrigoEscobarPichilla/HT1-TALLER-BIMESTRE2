package com.alejandromax.primeraPaginaThy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BiografiaController {

    @GetMapping("/biografia")
    public String mostrarBiografia(Model model) {

        model.addAttribute("Nombre", "Hansel");
        model.addAttribute("Edad", 17);
        model.addAttribute("Ciudad", "Amatitlan");

        List<String> lista = Arrays.asList("Java", "MySQL", "SpringBoot", "HTML", "CSS", "JS");
        model.addAttribute("Habilidades", lista);

        return "biografia";
    }
}
