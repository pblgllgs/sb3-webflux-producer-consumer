package com.pblgllgs.producer;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        log.info("Message sent -> " + message);
        kafkaTemplate.send("my-topic",message);
    }
}
