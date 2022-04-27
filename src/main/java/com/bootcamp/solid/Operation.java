package com.bootcamp.solid;

public class Operation {
	double a;
	double b;
	double res;
	char operation;
	
	
public Operation (double a, double b, char operation) {
	
	this.a = a;
	this.b = b;
	this.operation = operation;
 }

public void mostrarResultado() {
	
	System.out.println(this.a+" "+this.operation+" "+this.b+" = "+this.res);
 }



public double getA() {
	return a;
  }

public void setA(double a) {
	this.a = a;
  }

public double getB() {
	return b;
  }

public void setB(double b) {
	this.b = b;
  }

public double getRes() {
	return res;
  }

public void setRes(double res) {
	this.res = res;
  }

public char getOperation() {
	return operation;
  }

public void setOperation(char operation) {
	this.operation = operation;
  }

}
