/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.cvg.cvgservice.model.Gps;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author MAACDEV
 */
public interface GpsRepository extends JpaRepository<Gps,Integer>{
 @Procedure(name="getgps")
 public List<Gps> getgps(@Param("ppid") String ppid);
 
}
