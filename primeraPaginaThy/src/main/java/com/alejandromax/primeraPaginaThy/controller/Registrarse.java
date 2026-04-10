package com.alejandromax.primeraPaginaThy.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Registrarse {

    private final InMemoryUserDetailsManager userManager;
    private final PasswordEncoder passwordEncoder;

    public Registrarse(InMemoryUserDetailsManager userManager, PasswordEncoder passwordEncoder) {
        this.userManager = userManager;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/registrarse")
    public String mostrarFormulario() {

        return "registrarse";
    }

    @PostMapping("/registrarse")
    public String register(@RequestParam String username, @RequestParam String password) {

        UserDetails user = User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .roles("ADMIN")
                .build();

        userManager.createUser(user);

        return "redirect:/login";
    }
}
