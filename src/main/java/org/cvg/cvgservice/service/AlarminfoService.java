/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Alarminfo;
import org.cvg.cvgservice.repository.AlarminfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class AlarminfoService {
    @Autowired
    AlarminfoRepository alarminfoRepository;
    
    public List<Alarminfo> getalarm(String ppid)
    {
        return alarminfoRepository.getalarm(ppid);
    }
    
}
