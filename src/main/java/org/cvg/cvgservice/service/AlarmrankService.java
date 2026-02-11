/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Alarmrank;
import org.cvg.cvgservice.repository.AlarmrankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */

@Transactional
@Service
public class AlarmrankService 
{
   @Autowired
   AlarmrankRepository alarmrankRepository;
   public List<Alarmrank> getalarmrank(String pplate_no, String pfromdt,String ptodt)
   {
      return alarmrankRepository.getalarmrank(pplate_no, pfromdt, ptodt);
   }
}
