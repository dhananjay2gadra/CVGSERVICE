/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author MAACDEV
 */
@Data
@Entity
public class DashDeviceDetails {
     @Id
    private int seq;
   private String vehicleNo;
   private String orgName;
   private String onLineTime;
   private String lastALarmTime;
   private  int  totalAlarm;
    
    
}
