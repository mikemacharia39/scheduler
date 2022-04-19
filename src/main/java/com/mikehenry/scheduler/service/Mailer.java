package com.mikehenry.scheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Mailer {

    public void send() throws InterruptedException {
        log.info("Sending email notification...");
        Thread.sleep(3000);
        log.info("Hurray! Email sent.");
    }
}
