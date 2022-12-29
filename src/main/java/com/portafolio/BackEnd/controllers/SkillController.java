
package com.portafolio.BackEnd.controllers;

import com.portafolio.BackEnd.models.Skill;
import com.portafolio.BackEnd.services.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    @Autowired SkillService skillService;
    
    @PostMapping("skill/crear")
    public String crearSkill(@RequestBody Skill skill){
        skillService.crearSkill(skill);
        return "El skill fue creado exitosamente";
    }
    
    @DeleteMapping("skill/eliminar/{id}")
    public String eliminarSkill(@PathVariable Long id){
        skillService.eliminarSkill(id);
        return "El skill fue eliminado exitosamente";
    }
    
    @GetMapping ("skill/traer")
    public List<Skill> listaSkills(){
        return skillService.listaSkill();
    }
    
    @PutMapping("skill/editar/{id}")
    public Skill editarSkill(@PathVariable Long id, @RequestBody Skill skill){
        Skill ski = skillService.encontrarSkill(id);
        ski.setSkill(skill.getSkill());
        ski.setPorcentaje(skill.getPorcentaje());
        skillService.crearSkill(ski);
        return ski;
        
    }
    
}
