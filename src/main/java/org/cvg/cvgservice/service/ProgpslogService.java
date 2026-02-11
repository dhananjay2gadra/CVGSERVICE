/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Modelprogpslog;
import org.cvg.cvgservice.repository.ProgpslogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MACINDUSR
 */

@Transactional
@Service
public class ProgpslogService {
 @Autowired
 ProgpslogRepository progpslogRepository;
 public List<Modelprogpslog> pro_gpslog(String powner,String pfromdt,String ptodt)
 {
     return progpslogRepository.pro_gpslog(powner, pfromdt, ptodt);
 }
}
