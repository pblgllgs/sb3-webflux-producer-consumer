package com.pblgllgs.config;
/*
 *
 * @author pblgl
 * Created on 27-11-2023
 *
 */

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

    @Bean
    public NewTopic topicString(){
        return TopicBuilder.name("wikimedia-stream").build();
    }
}
