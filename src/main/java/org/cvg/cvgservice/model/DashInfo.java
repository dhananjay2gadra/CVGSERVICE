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
public class DashInfo {
 @Id 
 private  int seqnum;
 private  int nodevice;
 private  int owner;
 private int totalalarm;
 private int doffline;
}
