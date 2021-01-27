package com.improving.service.booking.model.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse implements Serializable{

	private static final long serialVersionUID = 8755759294010097522L;

	private Integer code;
	
	private String message;
	
	private Object data;
	
	private Object details;

}
