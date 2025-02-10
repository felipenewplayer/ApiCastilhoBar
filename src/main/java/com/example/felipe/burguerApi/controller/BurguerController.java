package com.example.felipe.burguerApi.controller;

import com.example.felipe.burguerApi.model.Burguer;
import com.example.felipe.burguerApi.service.BurguerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
@CrossOrigin("https://castilhos-h0nwhsaiq-felipenewplayers-projects.vercel.app/")
public class BurguerController {

    private final BurguerService service;

    public BurguerController(BurguerService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Burguer> listarBuguers(){
        return  service.pegarLista();
    }
}
