/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.Ownersdtalarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MAACDEV
 */
public interface OwnersdtalarmRepository extends JpaRepository<Ownersdtalarm,Integer> {
    
    @Procedure(name="owners_dt_alarm")
    public List<Ownersdtalarm> owners_dt_alarm(@Param("pprofileid") String pprofile);
    
}
