/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.DashVehicleAlarm;
import org.cvg.cvgservice.repository.DashvehiclealarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */

@Transactional
@Service
public class DashvehiclealarmService {
    
    @Autowired
private  DashvehiclealarmRepository dashvehiclealarmRepository;
  
   public List<DashVehicleAlarm> getDashVehicleAlarm(String pplate_no)
   {
     return   dashvehiclealarmRepository.dash_vehicle_alarm(pplate_no);
   }
    
}
