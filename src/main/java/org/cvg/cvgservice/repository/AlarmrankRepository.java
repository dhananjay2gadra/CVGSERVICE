/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.Alarmrank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MAACDEV
 */
public interface AlarmrankRepository extends JpaRepository<Alarmrank,Integer>
{
    @Procedure(name="getalarmrank")
    public List<Alarmrank> getalarmrank(@Param("pplate_no") String pplate_no,@Param("pfromdt") String pfromdt,@Param("ptodt") String ptodt);

}
