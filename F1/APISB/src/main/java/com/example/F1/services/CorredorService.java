package com.example.F1.services;

import com.example.F1.models.Corredor;
import com.example.F1.repositories.CorredorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service 
public class CorredorService {
   @Autowired  
   CorredorRepository CorredorRepo; 


   public ArrayList<Corredor> todoLosCorredores(){
       
        return (ArrayList<Corredor>) CorredorRepo.findAll();
   }

   public String guardar(Corredor corredor){
       CorredorRepo.save(corredor);
       return "guardado correctamente";
   }
    
   

}