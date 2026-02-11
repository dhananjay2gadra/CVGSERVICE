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
public class AlarmSumRow {
    @Id
   private int seq;
   private String plate_no;
   private String owner_id;
   private int total;
   private int dalt;
   private int ect;
   private int ldt;
   private int seatbelt;
   private int smokingt;
   private int sost;
   private int telt;
   private int yt;
   private int aut;
   private int overspt;
   private String aldate;
}
