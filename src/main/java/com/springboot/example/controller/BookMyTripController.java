package com.springboot.example.controller;

import com.springboot.example.model.TripData;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class BookMyTripController {

    private static final String TOPIC = "com.trip.book";

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @PostMapping("/book-ticket")
    public String bookTicket(@RequestBody TripData tripData) {
        kafkaTemplate.send(TOPIC,tripData.toString());

        return "Ticket-Booked";
    }

    @KafkaListener(topics=TOPIC,groupId = "group_id")
    public void consumeRecord(ConsumerRecord<?, ?> consumerRecord) {
        System.out.println("Receiver on topic1: "+consumerRecord.toString());

    }

}
