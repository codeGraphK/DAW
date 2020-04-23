package pruebaExcepcionesMultiples;

import java.util.ArrayList;

/**
 * ExcepcionMultiple
 */
public class ExcepcionMultiple extends Exception {

    ArrayList <Exception> exceptions;

    public ExcepcionMultiple(ArrayList <Exception> arrayListIn){
        super();
        this.exceptions = arrayListIn;
    }

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		for (Exception exception : exceptions) {
            exception.printStackTrace();
        }
	}

    
}