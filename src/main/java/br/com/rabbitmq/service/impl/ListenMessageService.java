package br.com.rabbitmq.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.service.IListenMessageService;

@Service("listenService")
public class ListenMessageService implements IListenMessageService {
	
	

	@RabbitListener(queues = "teste")
	public void listenMessage(@Payload String data) {
        System.out.println(" [x] Consumed  '" + data + "'");
	}

}
