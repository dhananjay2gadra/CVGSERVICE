/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;

import org.cvg.cvgservice.model.Dashvehiclealarmsummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MAACDEV
 */
public interface DashvehiclealarmsummaryRepository extends JpaRepository<Dashvehiclealarmsummary,Integer>
{
    @Procedure(name="dash_vehicle_alarm_summary")
     List<Dashvehiclealarmsummary> dash_vehicle_alarm_summary(@Param("pprofileid") String pprofileid); 
}
