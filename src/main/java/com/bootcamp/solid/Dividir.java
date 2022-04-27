package com.bootcamp.solid;

public class Dividir extends Operation{
    
    double div = 0;
       
    public Dividir(double a, double b) {
             
        super(a, b, '/');
        
        if(b==0) 
        	System.out.println("No se puede dividir entre cero");
        
        else this.div = a / b;
        this.setRes(this.div);
    }

	public void setRes(double div2) {
		
		
	}    
}