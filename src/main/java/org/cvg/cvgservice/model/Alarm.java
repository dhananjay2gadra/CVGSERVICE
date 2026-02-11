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
public class Alarm {
    @Id
    private int id;
    private Long latitude;
    private Long longitude;
    private Integer speed;
    private Integer direction;
    private String devicetime;
    private Integer alarmid;
    private String plateNo;
    private String deviceid;
    private String path;
    private String type;
    private Integer level;
    private Integer fatiguedegree;
    private Integer reserves;
    private String pic1;
    private String pic2;
    private String pic3;
    private String vid1;
    private String logTime;
    private String smsstatus;
    
}