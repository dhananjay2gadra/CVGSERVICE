/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;
import lombok.*;

/**
 *
 * @author MAACDEV
 */

@Data
@Entity
public class Dashboard {
    @Id
    private int seq;
    private int noOrg;//no of organization
    private int noAlarm;
    private int noDevice;
    private int noOflineDev;
   // private List<DashOrg> lstOrg;
    
}
