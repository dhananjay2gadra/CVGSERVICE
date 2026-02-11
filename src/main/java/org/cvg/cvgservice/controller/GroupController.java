/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.controller;

import java.util.List;
import org.cvg.cvgservice.model.Ownersalarm;
import org.cvg.cvgservice.model.Ownersdtalarm;
import org.cvg.cvgservice.service.OwnersalarmService;
import org.cvg.cvgservice.service.OwnersdtalarmService;
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
public class GroupController {
    @Autowired
    OwnersalarmService ownersalarmService;
    @Autowired
     OwnersdtalarmService ownersdtalarmService;
    
     @GetMapping("/ownersalarm/{pprofileid}")//user id
    public  List<Ownersalarm> getownersalarm(@PathVariable String pprofileid)
    {
        return ownersalarmService.getDashInfo(pprofileid);
    }
    
    
    @GetMapping("/ownersdtalarm/{pprofileid}")//user id
    public  List<Ownersdtalarm> getownersdtalarm(@PathVariable String pprofileid)
    {
        return ownersdtalarmService.getOwnersdtalarm(pprofileid);
    }
    
    
}
