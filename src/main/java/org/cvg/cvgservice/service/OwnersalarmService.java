/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Ownersalarm;
import org.cvg.cvgservice.repository.OwnersalarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class OwnersalarmService {
     @Autowired
    private OwnersalarmRepository ownersalarmRepository;
     public List<Ownersalarm> getDashInfo(String pprofile)
   {
     return   ownersalarmRepository.owners_alarm(pprofile);
   }
}
