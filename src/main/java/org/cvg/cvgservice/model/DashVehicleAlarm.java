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
public class DashVehicleAlarm {

    @Id
    private int id;
    private String latitude;
    private String longitude;
    private String speed;
    private String direction;
    private String devicetime;
    private String alarmid;
    private String plate_no;
    private String deviceid;
    private String path;
    private String type;
    private String pic1;
    private String vid1;

}
