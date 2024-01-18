package br.com.alura.screenmatchspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerieController {

    @GetMapping("/series")
    public String obterSeries() {
        return "Aqui vão ser listadas as séries";
    }
}