package com.curso.clase04.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.clase04.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar por nombre:
    // List<User> findByName(String name);

}
