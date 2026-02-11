/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.AlarmSum;
import org.cvg.cvgservice.repository.AlarmSumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MACINDUSR
 */
@Service
@Transactional
public class AlarmSumService {
  @Autowired
    AlarmSumRepository alarmSumRepository;
   public List<AlarmSum>getalarmsum(String pprofileid, String pformdt,String ptodt)
   {
       return alarmSumRepository.getalarmsum(pprofileid, pformdt, ptodt);
   }
  
}
