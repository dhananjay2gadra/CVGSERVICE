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
@Data
@Entity
public class Modelprogpslog {
    @Id
   private Integer seq_no;
   private String vehicle_id;
   private String device_id;
   private String gps_time;
   private double longitude;
   private double latitude;
   private double gps_speed;
}
