/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.model.voicecallentity;

import lombok.Data;

/**
 *
 * @author MAACDEV
 */
@Data
public class CallRequest {
        private String clientId;
        //private String ip;
        //private int  tcpPort;
        //private int  udpPort;
        //private int  channelNo;
        //private int  mediaType;
        //private int  streamType;
        
        public String toString()
        {
            return clientId+" send";
        }
    
}
