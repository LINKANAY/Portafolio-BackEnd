
package com.portafolio.BackEnd.repositories;

import com.portafolio.BackEnd.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    
}
