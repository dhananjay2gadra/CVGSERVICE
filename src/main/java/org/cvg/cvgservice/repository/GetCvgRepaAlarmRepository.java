/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.GetCvgRepaAlarmModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**

 * @author MACINDUSR
 */
public interface GetCvgRepaAlarmRepository extends JpaRepository<GetCvgRepaAlarmModel,Integer> 
{
    @Procedure(name="getcvgrepaalarm")
    public List<GetCvgRepaAlarmModel> getcvgrepaalarm(@Param("p_owner") String p_owner,@Param("pfrmdate")String  pfrmdate ,@Param("ptodate")String ptodate );
    
}
