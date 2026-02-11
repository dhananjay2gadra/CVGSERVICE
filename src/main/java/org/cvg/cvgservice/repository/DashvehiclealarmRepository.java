/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;


import java.util.List;
import org.cvg.cvgservice.model.DashVehicleAlarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MAACDEV
 */
public interface DashvehiclealarmRepository extends JpaRepository<DashVehicleAlarm,Integer> {
    @Procedure(name="dash_vehicle_alarm")
     List<DashVehicleAlarm> dash_vehicle_alarm(@Param("pplate_no") String pprofile);
}
