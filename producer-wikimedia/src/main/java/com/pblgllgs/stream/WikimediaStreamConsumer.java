package com.pblgllgs.stream;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import com.pblgllgs.producer.WikimediaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class WikimediaStreamConsumer {

    private final WebClient webClient;
    private final WikimediaProducer wikimediaProducer;

    public WikimediaStreamConsumer(WebClient.Builder webClientBuilder, WikimediaProducer wikimediaProducer) {
        this.webClient = webClientBuilder.baseUrl("https://stream.wikimedia.org/v2").build();
        this.wikimediaProducer = wikimediaProducer;
    }

    public void consumerStringAndPublish(){
        webClient.get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(wikimediaProducer::sendMessage);
    }
}
