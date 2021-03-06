package news.broker.producer.ampq.implementation;

import news.broker.producer.ampq.AmqpProducer;
import news.broker.producer.dto.Message;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ProducerRabbitMQ implements AmqpProducer<Message> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.request.routing-key.producer}")
    private String queue;

    @Value("${spring.rabbitmq.request.exchenge.producer}")
    private String exchenge;

    @Override
    public void producer(Message message){

        try{
            rabbitTemplate.convertAndSend(exchenge,queue,message);
        }catch (Exception ex){
            throw  new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
