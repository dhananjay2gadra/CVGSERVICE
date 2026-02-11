/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Dashorgalarminfo;
import org.cvg.cvgservice.repository.DashorgalarminfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Service
@Transactional
public class DashorgalarminfoService {
    @Autowired
    DashorgalarminfoRepository dashorgalarminfoRepository;
    
   public List<Dashorgalarminfo> dash_org_alarm_info(String pprofile)
   {
       return dashorgalarminfoRepository.dash_org_alarm_info(pprofile);
   }
    
    
    
}
