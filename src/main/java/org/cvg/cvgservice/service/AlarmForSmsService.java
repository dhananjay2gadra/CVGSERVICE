/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Alarm;
import org.cvg.cvgservice.model.Alarminfo;
import org.cvg.cvgservice.repository.AlarmForSms;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class AlarmForSmsService {
    @Autowired
    AlarmForSms alarmForSms;
     public List<Alarm> getsms( String owner_id)
     {
         List<Alarm>obj= alarmForSms.getsms(owner_id);
         return (obj);
     }
    
    
    
}
