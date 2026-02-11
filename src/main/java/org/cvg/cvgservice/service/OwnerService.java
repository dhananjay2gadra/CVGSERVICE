/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.service;

import jakarta.transaction.Transactional;
import java.util.List;
import org.cvg.cvgservice.model.Owner;
import org.cvg.cvgservice.model.OwnerDetails;
import org.cvg.cvgservice.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MAACDEV
 */
@Transactional
@Service
public class OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    public List<OwnerDetails> getallowners()
    {
      return ownerRepository.getallowners();
    }
    
    
}
