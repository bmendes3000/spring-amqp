package br.com.rabbitmq.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.rabbitmq.service.IMessageService;


@ContextConfiguration(locations = {
			"file:src/main/webapp/WEB-INF/applicationContext-rabbit.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class MessageTest {
	
	@Autowired
	private IMessageService service;
	
	@Test
    public void senderConsumer() {
		service.send("teste", "Test Message");
    }

}
