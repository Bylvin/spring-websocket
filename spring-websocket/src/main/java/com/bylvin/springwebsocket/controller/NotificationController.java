package com.bylvin.springwebsocket.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {
	private final Log log = LogFactory.getLog(NotificationController.class);

	/*
	 * Server application
	 */
	@MessageMapping("/sendMessage")
	@SendTo("/topic/notifications")
	public String sendMessage(String message) {
		log.debug("Send message: " + message);
		return message;
	}
}
