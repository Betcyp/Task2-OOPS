package com.prgm5;

public class MainOuter {
		public static void main(String[] args) {
			OuterOne ob=new OuterOne();
			ob.display();
			
			OuterOne.InnerOne ob1=ob.new InnerOne();
			ob1.display();
		}
}
