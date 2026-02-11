/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.userdemo;
import org.cvg.cvgservice.repository.usrAuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class AuthenticationService {
    @Autowired
   private usrAuthenticationRepository authenticationRepository;
    
    public List<userdemo> get_usr_authentication(String usr_id,String pass)
    {
       return  authenticationRepository.usr_authentication(usr_id, pass);
    }
    
    
}
