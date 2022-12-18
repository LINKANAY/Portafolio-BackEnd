
package com.portafolio.BackEnd.services;

import com.portafolio.BackEnd.models.User;
import com.portafolio.BackEnd.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired UserRepository userRepository;
    
    public void crearUser(User user){
        userRepository.save(user);
    }
    
    public void eliminarUser(Long id){
        userRepository.deleteById(id);
    }
    
    public List<User> listaUsuarios(){
        return userRepository.findAll();
    }
    
    public User encontrarUser(Long id){
        return userRepository.findById(id).orElse(null);
    }
    
}
