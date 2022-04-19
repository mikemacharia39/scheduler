package com.mikehenry.scheduler.service;

import java.util.Date;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


/**
 * Scheduler
 * -------------------
 * Scheduler class. You can have as many schedulers as you want in a class
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class Scheduler {

    public final Mailer mailer;

    /**
     * This task is scheduled to run every seconds
     */
    @Scheduled(cron = "* * * ? * *")
    public void displayTime() {
        log.info("The time is {}", new Date());
    }

    /**
     * This task is scheduled to run every minute
     */
    @Scheduled(cron = "0 * * ? * *")
    public void sendEmail() throws InterruptedException {
        mailer.send();
    }
}
