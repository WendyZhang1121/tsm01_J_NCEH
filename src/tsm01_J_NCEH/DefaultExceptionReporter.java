package tsm01_J_NCEH;

//Class DefaultExceptionReporter

public class DefaultExceptionReporter implements ExceptionReporter {

	public DefaultExceptionReporter(ExceptionReporter er) { 
		// Carry out initialization
		//Incorrectly publishes the "this" reference 
		er.setExceptionReporter(this);
	}
//Implementation of setExceptionReporter() and report() 

	@Override
	public void setExceptionReporter(ExceptionReporter er) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void report(Throwable exception) {
		// TODO Auto-generated method stub
		
	}
}
