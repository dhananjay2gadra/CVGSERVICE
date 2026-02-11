/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.userdemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MAACDEV
 */
@Repository
public interface usrAuthenticationRepository extends JpaRepository<userdemo,Integer> {
    @Procedure(name="usr_authentication")
    List<userdemo> usr_authentication(@Param("p_usr_id") String usr_id,@Param("p_usr_pass") String pass);
    
}
