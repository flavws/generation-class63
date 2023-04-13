package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String bsm(){
        return "Comunicação" + "\nPersistência" + "\nResponsabilidade Pessoal" + "\nOrientação ao Detalhe" + "\nTrabalho em Equipe" +
                "\nProatividade" + "\nOrientação ao Futuro";
    }

    @GetMapping("/obj")
    public String objetivo(){
        return "Aperfeiçoar meus conhecimentos sobre o desenvolvimento de APIs REST";
    }
}
