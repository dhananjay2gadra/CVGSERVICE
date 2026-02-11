/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import org.cvg.cvgservice.model.profile;
import org.cvg.cvgservice.repository.ProfilemasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class ProfilemasterService {
    @Autowired
    ProfilemasterRepository profilemasterRepository;
    
    public profile getprofile(String ppid)
    {
        return profilemasterRepository.getprofile(ppid);
    }
    
}
