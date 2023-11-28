package com.pblgllgs.consumer;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import com.pblgllgs.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "my-topic",groupId = "pblgllgs")
    public void consumer(String message){
        log.info("Message received: " + message);
    }

    @KafkaListener(topics = "my-topic-json",groupId = "pblgllgs")
    public void consumer(Student student){
        log.info("Message received: " + student);
    }
}
