/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.onlineinfo;
import org.cvg.cvgservice.repository.AlarmrankRepository;
import org.cvg.cvgservice.repository.OnlineInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author MACINDUSR
 */

@Transactional
@Service
public class OnlineInfoService {
 @Autowired
 OnlineInfoRepository onlineInfoRepository;
 public List<onlineinfo> getonlinef(String pplate_no,String pfromdt,String ptodt )
 {
     List<onlineinfo> data=onlineInfoRepository.getonlinef(pplate_no, pfromdt, ptodt);
     return data;
 }
 
 public List<onlineinfo> pro_gpsdis24hrs(String powner ,String pfromdt, String ptodt )
 {
     List<onlineinfo> data=onlineInfoRepository.pro_gpsdis24hrs(powner, pfromdt, ptodt);
     return data;
 }
}
