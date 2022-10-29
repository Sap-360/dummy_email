package com.undostres.dummy_email.components;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestCronJob {
//    @Scheduled(cron = "0 0/1 * * * ?")
   @Scheduled(cron = "0 * * * * *")
   public void cronJobSch() {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date now = new Date();
      String strDate = sdf.format(now);

      log.info("Java cron job expression:: " + strDate);
   }
}
