package br.com.ian.math;

public class SimpleMath {

	public Double sum(Double num1, Double num2) {
		return num1 + num2;
	}
	
	public Double subtraction(Double num1, Double num2) {
		return num1 - num2;
	}
	
	public Double multiplication(Double num1, Double num2) {
		return num2 * num1;
	}
	
	public Double division(Double num1, Double num2) {
		return num1/num2;
	}

	public Double average(Double num1,Double num2) {
		return (num1+num2)/2;
	}
	
	public Double squareroot(Double num1){
		return Math.sqrt(num1);
	}
}

