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
@Entity
@Data
public class Dashorgalarminfo {
    @Id
    int seqnum;
    String owner_id;
    String devices;
    String alarm;
    
    
}
