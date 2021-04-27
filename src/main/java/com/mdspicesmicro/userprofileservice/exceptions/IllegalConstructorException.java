package com.mdspicesmicro.userprofileservice.exceptions;

public class IllegalConstructorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalConstructorException() {
		super("This class does not allow use of a no-arguments constructor");
	}

	public IllegalConstructorException(String message) {
		super(message);
	}

	public IllegalConstructorException(Throwable cause) {
		super(cause);
	}

	public IllegalConstructorException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalConstructorException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);		
	}

}
