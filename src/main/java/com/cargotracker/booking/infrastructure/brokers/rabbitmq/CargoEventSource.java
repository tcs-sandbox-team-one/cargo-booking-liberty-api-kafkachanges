package com.cargotracker.booking.infrastructure.brokers.rabbitmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Interface depicting all output channels
 */
public interface CargoEventSource {    
	String cargoHandlingChannel2 = "cargoHandlingChannel2";

	@Input(cargoHandlingChannel2) 
	SubscribableChannel cargoHandlingChannel2();    
}