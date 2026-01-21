package com.techwithdeep.kafka.service;

import com.techwithdeep.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, Course> kafkaTemplate;

    public String sendMessage(Course course){
        kafkaTemplate.send("techwithdeep","course@", course);
        return "message sent to Kafka server";
    }


}
