package com.huge.kafkademo.controller;

import com.huge.kafkademo.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试消息发送
 *
 * @author Sean
 * @date 2019/10/11
 */
@RestController
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/sendMsg")
    public String send(int num){
        kafkaProducer.send(num);
        return "success";
    }
}
