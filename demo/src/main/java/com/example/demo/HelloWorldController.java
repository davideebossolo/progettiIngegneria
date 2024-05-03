package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld(Model model) {
        // Puoi aggiungere attributi al modello se necessario
        model.addAttribute("message", "Hello, World from Thymeleaf!");
        return "welcome"; // Nome del file HTML senza estensione .html
    }
    // Metodo per gestire le richieste GET verso /creaStoria
    @GetMapping("/creastoria")
    public String creaStoria(Model model) {
        // Aggiungi attributi al modello se necessario
        model.addAttribute("title", "Crea la tua Storia");

        return "creastoria"; // Ritorna il nome della pagina HTML senza estensione .html
    }
}