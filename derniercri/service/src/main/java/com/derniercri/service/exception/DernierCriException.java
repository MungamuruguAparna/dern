package com.derniercri.service.exception;

public class DernierCriException extends RuntimeException{

	public DernierCriException() {
		super();
	}

	public DernierCriException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DernierCriException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DernierCriException(String arg0) {
		super(arg0);
	}

	public DernierCriException(Throwable arg0) {
		super(arg0);
	}
	

}
