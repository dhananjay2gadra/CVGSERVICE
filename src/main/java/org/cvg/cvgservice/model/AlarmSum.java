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
public class AlarmSum 
{
    @Id
private long seq_no;
private String   owner_id;
private String aldate; 
private long  total; 
private long  dalt; 
private long  ect; 
private long  ldt; 
private long  seatbelt; 
private long  smokingt; 
private long  sost; 
private long  telt; 
private long  yt; 
private long  aut; 
private long  overspt;
}
