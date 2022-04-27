package com.bootcamp.solid;

public class Multiplication extends Operation{
    public double a;
    public double b;
    double mul
 ;

    public Multiplication(double a , double b) {
    	super(a, b, '*');
        this.mul = b * b;
        this.setRes(this.mul);
    }

	public void setRes(double mul2) {
	
		
	}

	
		
}
