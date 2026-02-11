/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.Owner;
import org.cvg.cvgservice.model.OwnerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

/**
 *
 * @author MAACDEV
 */
public interface OwnerRepository extends JpaRepository<OwnerDetails,Integer> {
    
    @Procedure(name="owners_dt_alarm")
    public List<OwnerDetails> getallowners();
    
}
