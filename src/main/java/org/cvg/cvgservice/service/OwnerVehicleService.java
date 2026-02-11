/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.OwnerVehicle;
import org.cvg.cvgservice.repository.OwnerVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author mach-india
 */
@Transactional
@Service
public class OwnerVehicleService  {
   @Autowired
   OwnerVehicleRepository ownerVehicleRepository;
   public List<OwnerVehicle> owner_alarm( String pprofileid,String pownerid )
   {
       return ownerVehicleRepository.owner_alarm(pprofileid, pownerid);
   }
   
   
}
