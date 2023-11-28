package com.pblgllgs.controller;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import com.pblgllgs.stream.WikimediaStreamConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {

    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    @GetMapping
    public void getStream(){
        wikimediaStreamConsumer.consumerStringAndPublish();
    }
}
