/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.controller;

import java.util.List;
import org.cvg.cvgservice.model.Owner;
import org.cvg.cvgservice.model.OwnerVehicle;
import org.cvg.cvgservice.model.Ownerdtalarm;
import org.cvg.cvgservice.service.OwnerInfoService;
import org.cvg.cvgservice.service.OwnerVehicleService;
import org.cvg.cvgservice.service.OwnerdtalarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MAACDEV
 */

@RestController
@CrossOrigin(origins = "*")
public class OrganizationController {
    
    @Autowired
 private   OwnerInfoService ownerInfoService;
    @Autowired
private    OwnerVehicleService ownerVehicleService;
    
    @Autowired
    private OwnerdtalarmService ownerdtalarmService;
    
     @GetMapping("/ownerinfo/{pprofileid}")//user id
    public  List<Owner> getOwner(@PathVariable String pprofileid)
    {
        return ownerInfoService.getOwner(pprofileid);
    }
    
    
    @GetMapping("/ownervehicle/{pprofileid}/{ownerid}")
    
    public List<OwnerVehicle> owner_alarm(@PathVariable String pprofileid,@PathVariable String ownerid )
    {
     return  ownerVehicleService.owner_alarm(pprofileid, ownerid);
    }
    
    @GetMapping("/ownerdtvehicle/{pprofileid}/{ownerid}")
    public List<Ownerdtalarm> owner_dt_alarm(@PathVariable String pprofileid,@PathVariable String ownerid )
    {
        return ownerdtalarmService.owner_dt_alarm(pprofileid, ownerid);
    }
    
    
    //ownerdtalarmService
    
    
    
    
            
   // OwnerVehicleService
    
}
