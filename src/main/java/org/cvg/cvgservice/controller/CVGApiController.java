/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cvg.cvgservice.controller;

import java.util.ArrayList;
import java.util.List;
import org.cvg.cvgservice.model.AlarmSum;
import org.cvg.cvgservice.model.AlarmSumRow;
import org.cvg.cvgservice.model.Alarminfo;
import org.cvg.cvgservice.model.Alarmrank;
import org.cvg.cvgservice.model.DashDeviceDetails;
import org.cvg.cvgservice.model.DashInfo;

import org.cvg.cvgservice.model.DashVehicleAlarm;
import org.cvg.cvgservice.model.Dashboard;
import org.cvg.cvgservice.model.Dashorgalarminfo;
import org.cvg.cvgservice.model.Dashvehiclealarmsummary;
import org.cvg.cvgservice.model.Device;
import org.cvg.cvgservice.model.GetCvgRepaAlarmModel;
import org.cvg.cvgservice.model.profile;
import org.cvg.cvgservice.model.userdemo;
import org.cvg.cvgservice.model.Gps;
import org.cvg.cvgservice.model.Mobileno;
import org.cvg.cvgservice.model.Modelprogpslog;
import org.cvg.cvgservice.model.OwnerDetails;
import org.cvg.cvgservice.model.alarmtotalrank;
import org.cvg.cvgservice.model.offline;
import org.cvg.cvgservice.model.onlineinfo;
import org.cvg.cvgservice.model.userinfo;
import org.cvg.cvgservice.model.voicecallentity.CallRequest;
import org.cvg.cvgservice.service.AlarmSumRowService;
import org.cvg.cvgservice.service.AlarmSumService;
import org.cvg.cvgservice.service.AlarminfoService;
import org.cvg.cvgservice.service.AlarmrankService;
import org.cvg.cvgservice.service.AlarmtotalrankService;
import org.cvg.cvgservice.service.AuthenticationService;
import org.cvg.cvgservice.service.DashInfoService;
import org.cvg.cvgservice.service.DashorgalarminfoService;
import org.cvg.cvgservice.service.GpsService;
import org.cvg.cvgservice.service.DashvehiclealarmService;
import org.cvg.cvgservice.service.DashvehiclealarmsummaryService;
import org.cvg.cvgservice.service.DeviceService;
import org.cvg.cvgservice.service.GetCvgRepaAlarmService;
import org.cvg.cvgservice.service.MobileService;
import org.cvg.cvgservice.service.OfflineService;
import org.cvg.cvgservice.service.OnlineInfoService;
import org.cvg.cvgservice.service.OwnerService;
import org.cvg.cvgservice.service.ProfilemasterService;
import org.cvg.cvgservice.service.ProgpslogService;
import org.cvg.cvgservice.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MAACDEV
 */

@RestController
@CrossOrigin(origins = "*")
public class CVGApiController {
    @Autowired
    AuthenticationService authenticationService;
    
    @Autowired
    DashInfoService dashInfoService;
    
    @Autowired
    DashorgalarminfoService dashorgalarminfoService;
    
    @Autowired
    DashvehiclealarmService dashvehiclealarmService;
    
    @Autowired
    DashvehiclealarmsummaryService dashvehiclealarmsummaryService;
    
    @Autowired
    ProfilemasterService profilemasterService;
    
    @Autowired
    GpsService gpsService;
    @Autowired 
    AlarminfoService alarminfoService;
    
    @Autowired
    MobileService mobileService;
    
    @Autowired
    OfflineService offlineService;
    
    @Autowired
    AlarmtotalrankService alarmtotalrankService;
    
    @Autowired
    AlarmrankService alarmrankService;
    
    @Autowired
    OwnerService ownerService;
    
    @Autowired
    DeviceService deviceService;
    
    @Autowired
    UserinfoService userinfoService;
    
    
    @Autowired
    GetCvgRepaAlarmService getCvgRepaAlarmService;
    
    @Autowired
    OnlineInfoService onlineInfoService;
    
    @Autowired
    ProgpslogService progpslogService;
    
    @Autowired
    AlarmSumService alarmSumService;
    
    @Autowired
    AlarmSumRowService alarmSumRowService;
    
    @GetMapping("/dashboard/{id}")//user id
    public Dashboard getdashmaster(@PathVariable int id)
    {
        Dashboard db=new Dashboard();
        return db;
        
    }
    
    
    
     @GetMapping("/DashInfo/{pprofile}")//user id
    public List<DashInfo> getDashInfo(@PathVariable String pprofile)
    {
        
       return dashInfoService.getDashInfo(pprofile);
    }
    
    
    //dashorgalarminfoService
    
     @GetMapping("/dashorgalarminfo/{pprofile}")//user id
    public List<Dashorgalarminfo> getDashorgalarminfo(@PathVariable String pprofile)
    {
        
       return dashorgalarminfoService.dash_org_alarm_info(pprofile);//.getDashInfo(pprofile);
    }
    
    
    
    @GetMapping("/dashvehicle/{orgid}")
    public List<DashDeviceDetails> getdashvehicle(@PathVariable int orgid) 
    {
        
        List<DashDeviceDetails> lsd=new ArrayList<DashDeviceDetails>();
        DashDeviceDetails d0=new DashDeviceDetails();
        d0.setLastALarmTime("2024-06-12 00:00:01");
        d0.setOnLineTime("2024-06-12 00:00:01");
        d0.setOrgName("IBMD");
        d0.setTotalAlarm(30);
        d0.setVehicleNo("JH05BS8264");
        
        lsd.add(d0);
        return lsd;
        
    }
    
    
    @GetMapping("/dashvehalarm/{pplate_no}")
    public List<DashVehicleAlarm> getdashvehalarm(@PathVariable String pplate_no) 
    {
     return dashvehiclealarmService.getDashVehicleAlarm(pplate_no);
      
        
    } 
    
    
    
    @GetMapping("/dvas/{pprofile}")
    public List<Dashvehiclealarmsummary> getdvas(@PathVariable String pprofile) 
    {
     return dashvehiclealarmsummaryService.getDashvehiclealarmsummary(pprofile);
      
        
    } 
    
    @GetMapping("/profile/{ppid}")
    public profile getprofile(@PathVariable String ppid)
    {
      return  profilemasterService.getprofile(ppid);
    }
    
    
    
    
    
    
    @GetMapping("/auth/{usrid}/{pass}")//user id
    public  List<userdemo> getdashmaster(@PathVariable String usrid,@PathVariable String pass)
    {
     return   authenticationService.get_usr_authentication(usrid, pass);
    }
    
     @GetMapping("/getgps/{ppid}")//user id
    public  List<Gps> getgps(@PathVariable String ppid)
    {
     return   gpsService.getgps(ppid);
    }
    
     @GetMapping("/getalarminfo/{ppid}")//user id
    public  List<Alarminfo> getalarminfo(@PathVariable String ppid)
    {
     return   alarminfoService.getalarm(ppid);
    }
    
    
     @GetMapping("/getContact/{ownerid}")//user id
    public  List<Mobileno> getmobileno(@PathVariable String ownerid)
    {
     return   mobileService.getmobileno(ownerid);
    }
    
    
    @GetMapping("/getOffline/{ppid}/{pdate}")//user id
    public  List<offline> getOffline(@PathVariable String ppid,@PathVariable String pdate)
    {
     return   offlineService.getoffline(ppid, pdate);//.getmobileno(ownerid);
    }
    
    
    
    @GetMapping("/getAlarmtotalrank/{pwonerid}/{pfromdt}/{ptodt}")//user id
    public  List<alarmtotalrank> getAlarmtotalrank(@PathVariable String pwonerid,@PathVariable String pfromdt,@PathVariable String ptodt)
    {
     return   alarmtotalrankService.getalarmtotalrank(pwonerid, pfromdt, ptodt);
    }
    
    
   // AlarmrankService
    
     @GetMapping("/getAlarmrank/{pplate_no}/{pfromdt}/{ptodt}")//user id
    public  List<Alarmrank> getAlarmrank(@PathVariable String pplate_no,@PathVariable String pfromdt,@PathVariable String ptodt)
    {
     return   alarmrankService.getalarmrank(pplate_no, pfromdt, ptodt);
    }
    

    
    
     @GetMapping("/getAllOwners")//user id
    public  List<OwnerDetails> getAllOwners()
    {
     return   ownerService.getallowners();
    }
    
    
     @GetMapping("/getUserInfo/{padid}")//user id
    public  List<userinfo> getUserInfo(@PathVariable String padid)
    {
     return   userinfoService.getuserdetails(padid);
    }
    
        
      @GetMapping("/getDevice/{ownerid}")//user id
    public  List<Device> getDevice(@PathVariable String ownerid)
    {
     return   deviceService.getdevice(ownerid);
    }
    
    
    
    //GetCvgRepaAlarmService
    
     @GetMapping("/GetCvgRepaAlarm/{ownerid}/{frmdate}/{todate}")//user id
    public  List<GetCvgRepaAlarmModel> GetCvgRepaAlarm(@PathVariable String ownerid,@PathVariable String frmdate,@PathVariable String todate)
    {
        return  getCvgRepaAlarmService.getcvgrepaalarm(ownerid, frmdate, todate);
    }
    
    
    
     @GetMapping("/GetOnlineInfo/{plate_no}/{frmdate}/{todate}")//user id
    public  List<onlineinfo> GetOnlineInfo(@PathVariable String plate_no,@PathVariable String frmdate,@PathVariable String todate)
    {
        return  onlineInfoService.getonlinef(plate_no, frmdate, todate);
    }
    
    @GetMapping("/getgpsdis24hrs/{owner}/{frmdate}/{todate}")//user id
    public  List<onlineinfo> Getgpsdis24hrs(@PathVariable String owner,@PathVariable String frmdate,@PathVariable String todate)
    {
        return  onlineInfoService.pro_gpsdis24hrs(owner, frmdate, todate);
    }
    
    //ProgpslogService
    
    
    @GetMapping("/Getgpslog/{owner}/{frmdate}/{todate}")//user id
    public  List<Modelprogpslog> Getgpslog(@PathVariable String owner,@PathVariable String frmdate,@PathVariable String todate)
    {
        return  progpslogService.pro_gpslog(owner, frmdate, todate);
    }
    
    
   // "clientId": "791074535102",
   //             "ip": "103.30.118.143",
   //             "tcpPort": 6603,
   //             "udpPort": 6603,
   //             "channelNo": 1,
   //             "mediaType": 0,
   //             "streamType": 0
    
    
    @PostMapping("/voicecall")
    public CallRequest voicecall(@RequestBody CallRequest callreq )
    {
        return callreq;//.toString();
    }
    
    
    
     @GetMapping("/getalarmsum/{profileid}/{frmdate}/{todate}")//user id
    public  List<AlarmSum> Getalarmsum(@PathVariable String profileid,@PathVariable String frmdate,@PathVariable String todate)
    {
        return  alarmSumService.getalarmsum(profileid, frmdate, todate);
    }
    
    @GetMapping("/getalarmsumraw/{profileid}/{frmdate}/{todate}")//user id
    public  List<AlarmSumRow> Getalarmsumraw(@PathVariable String profileid,@PathVariable String frmdate,@PathVariable String todate)
    {
        return  alarmSumRowService.getalarmsumrow(profileid, frmdate, todate);
    }
    
}
