
package com.portafolio.BackEnd.services;

import com.portafolio.BackEnd.models.Skill;
import com.portafolio.BackEnd.repositories.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    
    @Autowired SkillRepository skillRepository;
    
    public void crearSkill(Skill skill){
        skillRepository.save(skill);
    }
    
    public void eliminarSkill(Long id){
        skillRepository.deleteById(id);
    }
    
    public List<Skill> listaSkill(){
        return skillRepository.findAll();
    }
    
    public Skill encontrarSkill(Long id){
        return skillRepository.findById(id).orElse(null);
    }
    
}
