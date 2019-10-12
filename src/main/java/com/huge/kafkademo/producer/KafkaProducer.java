package com.huge.kafkademo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * 消息发送者
 *
 * @author Sean
 * @date 2019/10/11
 */
@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(int n){
        for(int i=0; i < n; i++){
            String message = "这是第"+(i+1)+"条信息";
            kafkaTemplate.send("test", message);
        }
    }
}
