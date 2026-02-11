/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.Modelprogpslog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MACINDUSR
 */
public interface ProgpslogRepository extends JpaRepository<Modelprogpslog,Integer> {
   @Procedure(name="pro_gpslog") 
   public List<Modelprogpslog> pro_gpslog(@Param("powner") String powner,@Param("pfromdt") String pfromdt,@Param("ptodt")String ptodt);
}
