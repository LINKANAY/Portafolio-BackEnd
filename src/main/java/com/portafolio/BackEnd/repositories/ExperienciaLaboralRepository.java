package com.portafolio.BackEnd.repositories;

import com.portafolio.BackEnd.models.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long>{
    
}
