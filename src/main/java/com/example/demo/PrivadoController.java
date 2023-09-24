package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author char_
 */
@RestController
@RequestMapping("/privado")
@RequiredArgsConstructor
public class PrivadoController {

    @GetMapping("prueba")
    public String login() {
        return "Prueba desde endpoint privado";
    }
}
