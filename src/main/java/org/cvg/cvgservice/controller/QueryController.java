/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.controller;

import java.util.List;
import org.cvg.cvgservice.model.AlarmDetails;
import org.cvg.cvgservice.model.OwnerVehicle;
import org.cvg.cvgservice.service.QueryService;
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
public class QueryController {
    @Autowired
    QueryService queryService;
    
    
    @GetMapping("/query/{powner}/{pfrmdate}/{ptodate}/{ptype}")
    
    public List<AlarmDetails> query(@PathVariable String powner,@PathVariable String pfrmdate,@PathVariable String ptodate,@PathVariable String ptype)
    {
        return queryService.query(powner, pfrmdate, ptodate, ptype);
    }
    
    
    
    //public List<OwnerVehicle> owner_alarm(@PathVariable String pprofileid,@PathVariable String ownerid )
    //{
    // return  ownerVehicleService.owner_alarm(pprofileid, ownerid);
   // }
    
}
