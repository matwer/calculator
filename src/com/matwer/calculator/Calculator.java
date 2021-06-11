/**
 * 
 */
package com.matwer.calculator;

import java.io.Serializable;

/**
 * @author Matthew Werner
 * Calculator (playing with Java Beans)
 */
@SuppressWarnings("serial")
public class Calculator implements Serializable {
	/**
	 * declare private member variables
	 */
	private double operandOne;
	private double operandTwo;
	private String operator;
	private double results;
	
	/**
	 * zero parameter constructor
	 */
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public double performOperation() {
		if (this.operator == "+") {
			this.results = this.operandOne + this.operandTwo;
		} else if (this.operator == "-") {
			this.results = this.operandOne - this.operandTwo;
		} else if (this.operator == "*") {
			this.results = this.operandOne * this.operandTwo;
		} else if (this.operator == "/") {
			this.results = this.operandOne / this.operandTwo;
		}
		return this.results;
	}
	
	public double getResults() {
		return this.results;
	}

}
