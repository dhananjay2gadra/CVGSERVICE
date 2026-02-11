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
 * @author mach-india
 */
@Data
@Entity
public class AlarmDetails {
    
  private String plate_no;
  private String device_id;
  private String device_model;
  private String maker_id;
  private String plate_color;
  private String province_id;
  private String owner_id;
  @Id
  private String id;
  private String latitude;
  private String longitude;
  private String speed;
  private String type;
  private String direction;
  private String devicetime;
  private String alarmid;
  private String path;
  private String pic;
  private String vid;
    
    
}
