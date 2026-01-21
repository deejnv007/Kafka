package com.techwithdeep.kafka.service;

import com.techwithdeep.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    private String message;

    @KafkaListener(topics= "techwithdeep", groupId= "dee-group" )
    public void consume(Course course){
        message = course + "Got the data from kafka";
        System.out.println(message);
    }

    public String getMessage(){
        return message;
    }
}
