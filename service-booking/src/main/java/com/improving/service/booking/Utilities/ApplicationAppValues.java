package com.improving.service.booking.Utilities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
@PropertySource({"classpath:/ApplicationAppValues.properties"})
public class ApplicationAppValues {
	
	@Value("${booking.services.get.all.success}")
	private String allSuccessMessage;

}
