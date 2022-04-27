package com.bootcamp.solid;

public class Addition extends Operation{
    
    double suma;
       
    public Addition(double a, double b) {
             
        super(a, b, '+');
        this.suma = a + b;
        this.setRes(this.suma);
    }

	public void setRes(double suma2) {
		
		
	}
}