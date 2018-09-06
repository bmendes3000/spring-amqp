package br.com.rabbitmq.forms;

public class DataForm {
	/**
	 * variable with the queue
	 */
	private String queue;
	
	/**
	 * variable with the message
	 */
	private String message;

	public String getQueue() {
		return queue;
	}

	public void setQueue(final String value) {
		this.queue = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String value) {
		this.message = value;
	}
	
	

}
