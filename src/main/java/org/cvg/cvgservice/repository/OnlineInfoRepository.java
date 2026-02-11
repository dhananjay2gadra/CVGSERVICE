/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.onlineinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author MACINDUSR
 */
public interface OnlineInfoRepository extends JpaRepository<onlineinfo,Integer> {
    @Procedure(name="getonlinef")
    public List<onlineinfo> getonlinef(@Param("pplate_no") String pplate_no,@Param("pfromdt") String pfromdt,@Param("ptodt") String ptodt );
    
    
    @Procedure(name="pro_gpsdis24hrs")
    public List<onlineinfo> pro_gpsdis24hrs(@Param("powner") String powner,@Param("pfromdt") String pfromdt,@Param("ptodt") String ptodt );
}
