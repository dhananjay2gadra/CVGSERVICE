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
 * @author MACINDUSR
 */
@Entity
@Data
public class GetCvgRepaAlarmModel {
   @Id
   private int id;
   private String plate_no;
   private String deviceid;
   private String path;
   private String type;
   private String pic1;
   private String devicetime;
   private String vid1;
    
}
