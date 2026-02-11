/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.DashInfo;
import org.cvg.cvgservice.repository.DashInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */

@Transactional
@Service
public class DashInfoService {
  @Autowired
private  DashInfoRepository dashInfoRepository;
  
   public List<DashInfo> getDashInfo(String pprofile)
   {
     return   dashInfoRepository.dash_info(pprofile);
   }
  
  
}
