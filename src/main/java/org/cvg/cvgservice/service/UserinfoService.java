/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Alarminfo;
import org.cvg.cvgservice.model.userinfo;
import org.cvg.cvgservice.repository.AlarminfoRepository;
import org.cvg.cvgservice.repository.UserinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author MACINDUSR
 */
@Transactional
@Service
public class UserinfoService {
   @Autowired
   UserinfoRepository userinfoRepository;
   public List<userinfo> getuserdetails(String ppid)
   {
       return userinfoRepository.getuserdetails(ppid);
   }
}






