/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Ownerdtalarm;
import org.cvg.cvgservice.repository.OwnerdtalarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author mach-india
 */
@Transactional
@Service
public class OwnerdtalarmService {
   
    
    @Autowired
    OwnerdtalarmRepository ownerdtalarmRepository;
    public List<Ownerdtalarm> owner_dt_alarm(String pprofileid,String pownerid )
    {
        return ownerdtalarmRepository.owner_dt_alarm(pprofileid, pownerid);
    }
    
    
}
