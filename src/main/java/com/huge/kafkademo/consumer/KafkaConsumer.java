package com.huge.kafkademo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import java.util.Optional;

/**
 * 消息消费者
 *
 * @author Sean
 * @date 2019/10/11
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?,?> record){
        Optional<?> value = Optional.ofNullable(record.value());
        if(value.isPresent()){
            Object message = value.get();
            System.out.println("record------>" + record);
            System.out.println("message-------->" + message);
        }
    }
}
