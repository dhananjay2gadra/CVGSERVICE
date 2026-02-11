/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Gps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.cvg.cvgservice.repository.GpsRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class GpsService 
{
    @Autowired
    GpsRepository gpsRepository;
    public List<Gps> getgps( String ppid)
    {
        return gpsRepository.getgps(ppid);
    }
    
}
