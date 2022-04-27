package com.bootcamp.solid;

public class Substraction extends Operation {

    public double a;
    public double b;
    double resta;

    public Substraction(double a, double b) {
    	super(a, b, '-');
        this.resta = a - b;
        this.setRes(this.resta);
    }

	public void setRes(double resta2) {
	
	}

	
		
}

