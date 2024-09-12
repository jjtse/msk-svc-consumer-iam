package msk.svc.consumer.iam.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic}", containerFactory = "consumerFactory")
    public void processEvent(String message) {
        log.info("Received message in topic : {}", message);
    }

}