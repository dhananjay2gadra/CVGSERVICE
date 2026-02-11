/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.AlarmDetails;
import org.cvg.cvgservice.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author mach-india
 */
@Transactional
@Service
public class QueryService {
    @Autowired
    QueryRepository queryRepository;
    
    
    public List<AlarmDetails> query(String powner,String pfrmdate, String ptodate,String ptype)
    {
      return queryRepository.query(powner, pfrmdate, ptodate, ptype);
    }
    
}
