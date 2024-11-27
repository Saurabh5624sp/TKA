package com.tka.op;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// All Operators
		
		Operator op = new Operator();
		
		op.ArithemeticOperator(50, 10);
		op.logicalOperator(18);
		op.bitwiseOperator(5, 7);
		op.relationalOperator(10, 20);
		op.compositeAssigmentOperator();
        
		op.inc_dec();
		
		//Test Increment Decrement operators(Given TASK 2)
		IncreDecrement i1 = new IncreDecrement();
		i1.prePost();
		
		//Test Student (Task 1 Check Reference addresses)
		Student s1 = new Student();
		s1.addressOfobj();
		
	}

}
