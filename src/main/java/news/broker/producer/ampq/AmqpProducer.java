package news.broker.producer.ampq;

public interface AmqpProducer<T> {

    void producer(T t);
}


