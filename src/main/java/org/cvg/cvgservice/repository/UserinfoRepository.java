/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MACINDUSR
 */
public interface UserinfoRepository extends JpaRepository<userinfo,Integer> {
    
    @Procedure(name="getuserdetails")
    public List<userinfo> getuserdetails(@Param("padid") String ppid);
    
}
