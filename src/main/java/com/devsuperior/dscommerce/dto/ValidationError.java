package com.devsuperior.dscommerce.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{

	private List<FieldMessage> erros = new ArrayList<>();
	
	public ValidationError(Instant timeStamp, Integer status, String error, String path) {
		super(timeStamp, status, error, path);
	}

	public List<FieldMessage> getErros() {
		return erros;
	}
	
	public void addError(String fieldName, String message) {
		erros.add(new FieldMessage(fieldName, message));
	}
}
