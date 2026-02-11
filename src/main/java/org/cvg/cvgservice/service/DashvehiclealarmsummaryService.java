/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.DashInfo;
import org.cvg.cvgservice.model.Dashvehiclealarmsummary;
import org.cvg.cvgservice.repository.DashvehiclealarmsummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */

@Transactional
@Service
public class DashvehiclealarmsummaryService {
 @Autowired
 DashvehiclealarmsummaryRepository dashvehiclealarmsummaryRepository;
 public List<Dashvehiclealarmsummary> getDashvehiclealarmsummary(String pprofile)
   {
     return   dashvehiclealarmsummaryRepository.dash_vehicle_alarm_summary(pprofile);
   }
}
