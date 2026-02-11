/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.offline;
import org.cvg.cvgservice.repository.OfflineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class OfflineService {
    
    @Autowired
    OfflineRepository offlineRepository;
     public List<offline> getoffline(String ppid,String pdate)
     {
         return offlineRepository.getoffline(ppid, pdate);
     }
    
}
