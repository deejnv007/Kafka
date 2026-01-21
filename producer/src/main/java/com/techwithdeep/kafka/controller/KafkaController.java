package com.techwithdeep.kafka.controller;

import com.techwithdeep.kafka.model.Course;
import com.techwithdeep.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/addCourse")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
       String response = kafkaService.sendMessage(course);
       return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
