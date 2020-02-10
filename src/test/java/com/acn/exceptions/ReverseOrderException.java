package com.acn.exceptions;

public class ReverseOrderException extends NullPointerException {

	public ReverseOrderException() {
		throw new ReverseOrderException();
	}

}
