package com.example.F1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.F1.models.Corredor;

@Repository
public interface CorredorRepository extends CrudRepository<Corredor,Long> {
    
}
