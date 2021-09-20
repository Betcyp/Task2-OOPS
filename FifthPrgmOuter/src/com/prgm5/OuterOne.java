package com.prgm5;

public class OuterOne {
	
	public void display() {
		System.out.println("there is an outer class");
	}
	class InnerOne{
		public void display() {
			System.out.println("there is an inner class");
		}
	}
}
