package com.arzds.exception;

public class ValidationError extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidationError(String s) {
		super(s);
	}
}
