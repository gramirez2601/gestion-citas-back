package com.gestion.citas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author guill
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CitaNotFoundException extends RuntimeException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public CitaNotFoundException(String msg) {
		
		super(msg);
		
	}
	
}
