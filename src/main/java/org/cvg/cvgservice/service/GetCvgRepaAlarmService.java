/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.GetCvgRepaAlarmModel;
import org.cvg.cvgservice.repository.DeviceRepository;
import org.cvg.cvgservice.repository.GetCvgRepaAlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MACINDUSR
 */
@Transactional
@Service
public class GetCvgRepaAlarmService {
        @Autowired
        GetCvgRepaAlarmRepository getCvgRepaAlarmRepository;        
        public List<GetCvgRepaAlarmModel> getcvgrepaalarm(String p_owner,String  pfrmdate ,String ptodate )
        {
            return getCvgRepaAlarmRepository.getcvgrepaalarm(p_owner, pfrmdate, ptodate);
        }    
}
