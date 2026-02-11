/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.AlarmSumRow;
import org.cvg.cvgservice.repository.AlarmSumRowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MACINDUSR
 */
@Service
@Transactional
public class AlarmSumRowService {
    @Autowired
   private AlarmSumRowRepository alarmSumRowRepository ;
    
    public List<AlarmSumRow> getalarmsumrow(String profile_id,String fdate,String todate)
    {
        return alarmSumRowRepository.getalarmsumrow(profile_id, fdate, todate);
    }
}
