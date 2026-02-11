/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import org.cvg.cvgservice.model.profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MAACDEV
 */
public interface ProfilemasterRepository extends JpaRepository<profile,Integer>
{
    
    
    @Procedure(name="getprofile")
    public profile getprofile(@Param("ppid")String ppid);
    
}
