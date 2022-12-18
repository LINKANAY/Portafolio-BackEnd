
package com.portafolio.BackEnd.controllers;

import com.portafolio.BackEnd.models.User;
import com.portafolio.BackEnd.services.UserService;
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
public class UserController {
    
     @Autowired UserService userService;

    @PostMapping("user/crear")
    public String crearUser(@RequestBody User user) {
        userService.crearUser(user);
        return "El usuario fue creado exitosamente";
    }

    @DeleteMapping("user/eliminar/{id}")
    public String eliminarUser(@PathVariable Long id) {
        userService.eliminarUser(id);
        return "El usuario fue eliminado exitosamente";
    }

    @GetMapping("user/traer")
    public List<User> listaUsers() {
        return userService.listaUsuarios();
    }

    @PutMapping("user/editar/{id}")
    public User editarUser(@PathVariable Long id, @RequestBody User user) {
        User user1 = userService.encontrarUser(id);
        user1.setUsuario(user.getUsuario());
        user1.setContraseña(user.getContraseña());
        return user1;

    }
    
}
