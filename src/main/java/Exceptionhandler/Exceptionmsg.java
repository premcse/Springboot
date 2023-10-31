package Exceptionhandler;


public class Exceptionmsg extends RuntimeException{
	
	 private  String message;

	    public Exceptionmsg(String message){
	    	super(message);
	    }

	    public Exceptionmsg(int id,String message){
	    	super(id + message);
	    }
}
