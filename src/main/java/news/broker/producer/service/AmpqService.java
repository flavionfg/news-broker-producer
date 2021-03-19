package news.broker.producer.service;

import news.broker.producer.dto.Message;

public interface AmpqService {
    void sentToConsumer(Message message);
}
