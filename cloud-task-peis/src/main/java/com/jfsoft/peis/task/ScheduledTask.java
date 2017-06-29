package com.jfsoft.peis.task;

import com.jfsoft.peis.service.IPeisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by web on 2017/6/29.
 */
@Component
public class ScheduledTask {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IPeisService peisService;

    @Scheduled(cron = "*/5 * * * * ?")
    public void execute() {
        System.out.println("现在时间是："+System.currentTimeMillis());
        try {
            String testno = peisService.getPerCheckInfoProc("5009", "001");
            //schedualPeisService.peisSave(testno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
