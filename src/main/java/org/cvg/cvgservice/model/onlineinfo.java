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
public class onlineinfo {
    @Id
    int seq_no;
    double discover;
    double totalhr;
    String plate_no;
    String fromdt;
    String todt;
    
}
