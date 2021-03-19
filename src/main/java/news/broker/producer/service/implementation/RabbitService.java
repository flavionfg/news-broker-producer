package news.broker.producer.service.implementation;

import news.broker.producer.ampq.AmqpProducer;
import news.broker.producer.dto.Message;
import news.broker.producer.service.AmpqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService implements AmpqService {

    @Autowired
    private AmqpProducer<Message> ampq;


    @Override
    public void sentToConsumer(Message message) {
        ampq.producer(message);
    }
}
