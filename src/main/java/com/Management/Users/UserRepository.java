/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Management.Users;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository <User, Integer>{
    public Long countById (Integer id);
    
}
