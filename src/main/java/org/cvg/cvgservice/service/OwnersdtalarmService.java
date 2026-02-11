/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Ownersdtalarm;
import org.cvg.cvgservice.repository.OwnersdtalarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */

@Transactional
@Service
public class OwnersdtalarmService {
    @Autowired
    OwnersdtalarmRepository ownersdtalarmRepository;
    public List<Ownersdtalarm> getOwnersdtalarm(String pprofile)
   {
     return ownersdtalarmRepository.owners_dt_alarm(pprofile);
   }
    
}
