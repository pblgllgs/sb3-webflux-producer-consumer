package com.pblgllgs.controller;

import com.pblgllgs.model.Student;
import com.pblgllgs.producer.KafkaJsonProducer;
import com.pblgllgs.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */
@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer producer;
    private final KafkaJsonProducer jsonProducer;

    @PostMapping("/send-message")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        producer.sendMessage(message);
        return new ResponseEntity<>("Message sent from controller", HttpStatus.OK);
    }

    @PostMapping("/send-json")
    public ResponseEntity<String> sendJson(@RequestBody Student student){
        jsonProducer.sendMessage(student);
        return new ResponseEntity<>("Student sent from controller", HttpStatus.OK);
    }
}
