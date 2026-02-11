package org.cvg.cvgservice;

import java.util.List;
import org.cvg.cvgservice.model.AlarmSumRow;
import org.cvg.cvgservice.service.AlarmSumRowService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CvgserviceApplicationTests {

    @Autowired
    AlarmSumRowService alarmSumRowService;
    @Value("${server.port}")
    private String pval;
	@Test
	void contextLoads() {
            System.out.println("Used Port:"+pval);
          // List<AlarmSumRow>  data =  alarmSumRowService.getalarmsumrow("p001", "2025-05-01","2025-05-10");
          // for(AlarmSumRow d:data)
           //{
           //    System.out.println(d.getPlate_no());
          // }
	}

}
