package com.enterprise.dto;

//Classe para as mensagens de reposta da requisição com erro de validação
public class FieldMessage {

	private String fieldName;
	private String message;
	
	public FieldMessage(String fieldName, String message) {
		this.fieldName = fieldName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getMessage() {
		return message;
	}
	
	
}
