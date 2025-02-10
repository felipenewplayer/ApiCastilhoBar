package com.example.felipe.burguerApi.service;

import com.example.felipe.burguerApi.model.Burguer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BurguerService {


    public List<Burguer> pegarLista(){
        return List.of(
                new Burguer(1l, "Clássico da Casa", "Mussarela,Cebola,Salada,Tomate",29.99),
                new Burguer(2l, "Dos Deuses", "Mussarela,Cebola,Salada,Tomate",49.99),
                new Burguer(3l, "Tradicional", "Mussarela,Cebola,Salada,Tomate",24.99),
                new Burguer(4l, "Burger raiz", "Mussarela,Cebola,Salada,Tomate",32.99),
                new Burguer(5l, "Vegetariano", "Mussarela,Cebola,Salada,Tomate",32.99),
                new Burguer(6l, "O soberano", "Mussarela,Cebola,Salada,Tomate",39.99)
        );
    }
}
