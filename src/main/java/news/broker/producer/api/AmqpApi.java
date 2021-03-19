package news.broker.producer.api;

import news.broker.producer.dto.Message;
import news.broker.producer.service.AmpqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpApi {

    @Autowired
    private AmpqService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void SentToConsumer(@RequestBody Message message){
        service.sentToConsumer(message);
    }
}
