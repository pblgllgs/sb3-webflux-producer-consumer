package com.pblgllgs.consumer;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {


    @KafkaListener(topics = "wikimedia-stream", groupId = "pblgllgs")
    public void consumer(String message) {
        log.info("Message received: " + message);
    }
}
