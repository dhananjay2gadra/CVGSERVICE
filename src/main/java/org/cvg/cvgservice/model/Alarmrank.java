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
public class Alarmrank {
    @Id
   private int id;
   private String plate_no;
   private String type;
   private String log_time;
   private String pic2;
   private String vid1;
    
}
