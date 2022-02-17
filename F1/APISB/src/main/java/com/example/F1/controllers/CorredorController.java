package com.example.F1.controllers;

import java.util.ArrayList;

import com.example.F1.models.Corredor;
import com.example.F1.services.CorredorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/Corredor")
public class CorredorController {
    @Autowired
    CorredorService CorredorService;

        
    @GetMapping()
    public ArrayList<Corredor> obtenerCorredores(){
        return CorredorService.todoLosCorredores();
    }

    @PostMapping()
    public String guardar(@RequestBody Corredor corredor){
        return CorredorService.guardar(corredor);
    }

    


    
}
