package com.zandor300.zsirc.exception;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 18:20
 * PC: ZANDOR-PC
 */
public class InvalidPortException extends Exception {

	public InvalidPortException() {
		super();
	}

	public InvalidPortException(String message) {
		super(message);
	}

	public InvalidPortException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPortException(Throwable cause) {
		super(cause);
	}

}
