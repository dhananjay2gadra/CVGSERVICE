/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.cvg.cvgservice.model.Sms;
import org.cvg.cvgservice.model.SmsThread;



/**
 *
 * @author MAACDEV
 */

@Configuration
public class SmsConfig {
    
//     @Bean(initMethod = "start", destroyMethod = "stop")
//    public Sms myService() {
//        return new Sms();
//        
//    }
//    
    
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Sms myService(SmsThread smsLiveThread) {
        return new Sms(smsLiveThread);
    }

  //  @Bean
  ///  public SmsThread smsLiveThread() {
   //     return new SmsThread();
   // }
    
}
