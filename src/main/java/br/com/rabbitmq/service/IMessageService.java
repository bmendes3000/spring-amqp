package br.com.rabbitmq.service;

public interface IMessageService {
	/**
	 * Method responsible to send message
	 * @param message {@link String}
	 */
	void send(final String queue, final String message);
}
