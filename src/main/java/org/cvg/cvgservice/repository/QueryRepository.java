/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.AlarmDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author mach-india
 */
public interface QueryRepository extends JpaRepository<AlarmDetails,Integer> {
    
        
        
    @Procedure(name="query")
    public List<AlarmDetails> query(@Param("powner") String powner,@Param("pfrmdate") String pfrmdate,@Param("ptodate") String ptodate,@Param("ptype") String ptype);
    
}
