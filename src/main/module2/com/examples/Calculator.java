package com.examples;

public class Calculator{
    private static int result;

    public void add(int n){
	result = result + n;
	}

	public void substract(int n){
	result = result - n;
	}

	public void multiply(int n){
     	result = result * n;
	}

	public void divide(int n){
	result = result / n;
	}

	public void square(int n){
	result = n * n;
	}

	public void clear() { // ���������
	result = 0;
	}

	public int getResult(){
	return result;
	}
}