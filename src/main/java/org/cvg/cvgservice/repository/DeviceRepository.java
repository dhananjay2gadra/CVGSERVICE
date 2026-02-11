/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.cvg.cvgservice.repository;

import java.util.List;
import org.cvg.cvgservice.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author machindia_cloud
 */
public interface DeviceRepository extends JpaRepository<Device,Integer> {
    @Procedure(name="getdevice")
    public List<Device> getdevice(@Param("powner_id")String powner_id);
    
}