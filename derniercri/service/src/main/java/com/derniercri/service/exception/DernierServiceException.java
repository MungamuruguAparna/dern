package com.derniercri.service.exception;

public class DernierServiceException extends DernierCriException{

	public DernierServiceException() {
		super();
	}

	public DernierServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DernierServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DernierServiceException(String arg0) {
		super(arg0);
	}

	public DernierServiceException(Throwable arg0) {
		super(arg0);
	}
	

}
