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
public class Alarminfo {    
         private String  plate_no;
         private String  device_id; 
         private String  device_model; 
         private String  maker_id; 
         private String  plate_color; 
         private String  province_id; 
         private String  owner_id;
         @Id        
         private int  id; 
         private int  latitude; 
         private int  longitude; 
         private int  speed; 
         private String  type; 
         private int  direction; 
         private String  devicetime; 
         private int  alarmid; 
         private String  deviceid; 
         private String  path;
         private String  log_time;
         private String  pic; 
         private String  vid;
            
            
            
}
