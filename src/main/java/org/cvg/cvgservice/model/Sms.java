/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.model;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cvg.cvgservice.service.OwnerInfoService;
import org.cvg.cvgservice.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author MAACDEV
 */
@Component
public class Sms  {
    
    
            
    SmsThread smsLiveThread;
    Thread th;
    
    
   // private final OwnerInfoService ownerService;
    
  
    
    @Autowired
    public Sms(SmsThread smsLiveThread) {
        this.smsLiveThread = smsLiveThread;
        this.th = new Thread(smsLiveThread);
    }
    
    
    
    
 
    public void start() {
        System.out.println("Service is starting.");
        th.start();
    }

    public void stop() {
        
        System.out.println("Service is stopping.");
        
    }
}





