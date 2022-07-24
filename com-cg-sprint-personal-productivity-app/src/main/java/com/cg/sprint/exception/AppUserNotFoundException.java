package com.cg.sprint.exception;

	public class AppUserNotFoundException extends RuntimeException {

		
		private static final long serialVersionUID = 1L;

		public AppUserNotFoundException() {
			super();
		}

		public AppUserNotFoundException(String exceptionMessage) {
			super(exceptionMessage);
		}

	}



