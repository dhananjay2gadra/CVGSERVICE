///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package org.cvg.cvgservice.model;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.cvg.cvgservice.service.AlarmForSmsService;
//import org.cvg.cvgservice.service.MobileService;
//import org.cvg.cvgservice.service.OwnerInfoService;
//import org.cvg.cvgservice.service.OwnerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SmsThread extends Thread
//{
//    
//    private final OwnerService ownerService ;
//    private final MobileService mobileService;
//    private final AlarmForSmsService alarmForSmsService;
//    
//    @Autowired
//    public SmsThread(OwnerService ownerService,MobileService mobileService,AlarmForSmsService alarmForSmsService) {
//        this.ownerService = ownerService;
//        this.mobileService= mobileService;
//        this.alarmForSmsService=alarmForSmsService;
//    }
//    
//    
//    
//    
//    public void run()
//    {
//        while(true)
//        {
//            //System.out.println("Sms Called");
//            
//         List<Owner> owners=   ownerService.getallowners();//getOwner("p001");
//         
//         for(Owner o:owners)
//         {
//             String owner_id=o.getOwner_id();
//             List<Mobileno> mlist= mobileService.getmobileno(owner_id);
//             List<Alarm> alist= alarmForSmsService.getsms(owner_id);
//            
//                       
//            String phlist="";
//            
//            
//             for(Mobileno m:mlist)
//            {
//                //System.out.println(m.getMobileno());
//                phlist=phlist+m.getMobileno()+",";
//            }
//             
//             phlist=phlist.substring(0,phlist.length()-1);
//            
//             System.out.println(o.getOwner_id());
//             
//             for(Alarm a:alist)
//             {
//               //NONAME DHAN Eye Closure 2024-06-22 13:30:11.388459
//               
//              String pic="https://www.machindia.io/vmimg/2024_06_22/354311090756217-20240622133011_201_1.jpg";
//                       
//             String  vid="https://www.machindia.io/vmvideo/2024_06_22/354311090756217-20240622133011_201.mp4";
//               
//              String  urlsms="http://sms.hspsms.com/sendSMS?username=machindia&message=MACHINDIA "+owner_id+" "+a.getPlateNo()+" Alert: "+a.getType()+" Date%26Time "+a.getDevicetime()+" Pic: "+pic+" Video: "+vid+"&sendername=MACHMI&smstype=TRANS&numbers="+phlist+"&apikey=2540c90a-b861-4e00-9c8a-ed7bc5ee58aa";
//               
//              try{
//              URL obj = new URL(urlsms);
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//            con.setRequestMethod("GET");
//            
//            // Set headers
//            con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
//            con.setRequestProperty("Accept-Encoding", "gzip, deflate");
//            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
//            con.setRequestProperty("Connection", "keep-alive");
//            con.setRequestProperty("Host", "sms.hspsms.com");
//            con.setRequestProperty("Priority", "u=1");
//            con.setRequestProperty("Upgrade-Insecure-Requests", "1");
//            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:127.0) Gecko/20100101 Firefox/127.0");
//
//            
//            
//
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//
//            System.out.println(response.toString());
//
//              }catch(Exception Ex)
//              {
//                  System.out.println(Ex.getMessage());
//              }
//            
//          
//             }
//         }
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(SmsThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//}


package org.cvg.cvgservice.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cvg.cvgservice.service.AlarmForSmsService;
import org.cvg.cvgservice.service.MobileService;
import org.cvg.cvgservice.service.OwnerInfoService;
import org.cvg.cvgservice.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmsThread extends Thread {

    private final OwnerService ownerService;
    private final MobileService mobileService;
    private final AlarmForSmsService alarmForSmsService;
    private static final Logger LOGGER = Logger.getLogger(SmsThread.class.getName());

    @Autowired
    public SmsThread(OwnerService ownerService, MobileService mobileService, AlarmForSmsService alarmForSmsService) {
        this.ownerService = ownerService;
        this.mobileService = mobileService;
        this.alarmForSmsService = alarmForSmsService;
    }

    @Override
    public void run() {
        while (true) {
            try {
                List<OwnerDetails> owners = ownerService.getallowners();
                for (OwnerDetails ownerDetails : owners) {
                    String ownerId = ownerDetails.getOwner_id();
                    List<Mobileno> mobileNumbers = mobileService.getmobileno(ownerId);
                    List<Alarm> alarms = alarmForSmsService.getsms(ownerId);

                    String phoneList = mobileNumbers.stream()
                            .map(Mobileno::getMobileno)
                            .reduce((m1, m2) -> m1 + "," + m2)
                            .orElse("");

                    for (Alarm alarm : alarms) {
                        String picUrl = "http://www.machindia.io/vmimg/2024_06_22/354311090756217-20240622133011_201_1.jpg";
                        String vidUrl = "http://www.machindia.io/vmvideo/2024_06_22/354311090756217-20240622133011_201.mp4";
                        String message = String.format("MACHINDIA %s %s Alert: %s Date&Time %s Pic: %s Video: %s",
                                ownerId, alarm.getPlateNo(), alarm.getType(), alarm.getDevicetime(), picUrl, vidUrl);
                        String urlStr = String.format("http://sms.hspsms.com/sendSMS?username=machindia&message=%s&sendername=MACHMI&smstype=TRANS&numbers=%s&apikey=2540c90a-b861-4e00-9c8a-ed7bc5ee58aa",
                                URLEncoder.encode(message, "UTF-8"), phoneList);

                        //sendSms(urlStr);
                    }
                }
                Thread.sleep(2000);
            } catch (Exception ex) {
                LOGGER.log(Level.SEVERE, "Error in SmsThread: ", ex);
            }
        }
    }

    private void sendSms(String urlStr) {
        try {
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
            con.setRequestProperty("Accept-Encoding", "gzip, deflate");
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            con.setRequestProperty("Connection", "keep-alive");
            con.setRequestProperty("Host", "sms.hspsms.com");
            con.setRequestProperty("Priority", "u=1");
            con.setRequestProperty("Upgrade-Insecure-Requests", "1");
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:127.0) Gecko/20100101 Firefox/127.0");

            int responseCode = con.getResponseCode();
            if (responseCode == 200) { // success
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String inputLine;
                    StringBuilder response = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    System.out.println("Response: " + response.toString());
                }
            } else {
                System.out.println("GET request not worked. Response Code: " + responseCode);
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error sending SMS: ", e);
        }
    }
}
