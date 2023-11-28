package com.pblgllgs.producer;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import com.pblgllgs.model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaJsonProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(Student student) {
        log.info("Message sent -> " + student);
        Message<Student> message = MessageBuilder
                .withPayload(student)
                .setHeader(KafkaHeaders.TOPIC, "my-topic-json")
                .build();
        kafkaTemplate.send(message);
    }
}
