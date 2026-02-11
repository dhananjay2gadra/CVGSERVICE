/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Device;
import org.cvg.cvgservice.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

/**
 *
 * @author machindia_cloud
 */
@Transactional
@Service
public class DeviceService {
    @Autowired
    DeviceRepository deviceRepository;
    public List<Device> getdevice(String powner_id)
    {
        return deviceRepository.getdevice(powner_id);
    }
}

