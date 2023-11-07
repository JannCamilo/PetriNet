package petrinet.exceptions;

public class NegativeTokenInsertedException extends Exception{
    
    private static final long serialVersionUID = -9081947660117426080L;

	public NegativeTokenInsertedException(String message){
        super(message);
    }
}
