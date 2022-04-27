package com.bootcamp.solid;


/**
*
* @author Sigrid
*/

  public class Calculator {
	 
	  public static void main(String[] args) {
	        
	        double a = 10;
	        double b = 5;
	        
	        //Suma
	        Addition sum = new Addition(a,b);
	        sum.mostrarResultado();
	        
			//Substraccion
	        Substraction res = new Substraction(a,b);
	        res.mostrarResultado();
	        
	        //Multiplicacion
	        Multiplication mul = new Multiplication(a,b);
	        mul.mostrarResultado();
	        
	        //Division
	        Dividir div = new Dividir(a,b);
	        div.mostrarResultado();
	    }
	}
	