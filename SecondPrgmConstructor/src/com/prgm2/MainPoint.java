package com.prgm2;


public class MainPoint {
		public static void main(String[] args) {
			Point p=new Point();
			p.setX(1);
			p.setY(2);
			p.setXY(1,2);
			p.getX();
			p.getY();
			p.getXY();
			
			System.out.println("Get x: "+p.getX()+ " Get y: "+p.getY()+ " Get xy: "+p.getXY());
		}
}
