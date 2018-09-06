package br.com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.rabbitmq.forms.DataForm;
import br.com.rabbitmq.service.IMessageService;

@Controller
public class IndexController {
	
	
	@Autowired
	private IMessageService service;
	
	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public @ResponseBody String send(@RequestBody DataForm form) {
		//call the service layer to send message
		service.send(form.getQueue(), form.getMessage());
		
		return "message sent";
	}
}
