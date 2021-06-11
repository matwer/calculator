/**
 * 
 */
package com.matwer.calculator;

/**
 * @author Matthew Werner
 *
 */
public class CalculatorTest {
	public static void main(String[] args) {
		// instantiate a Calculator 
		Calculator c = new Calculator();
		
		c.setOperandOne(10.5);
		c.setOperator("+");
		c.setOperandTwo(5.2);
		c.performOperation();
		System.out.println(c.getResults());
	}
}
