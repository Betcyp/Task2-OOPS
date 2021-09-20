package com.prgm2;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		System.out.println("default constructors are;");
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}

	public void setX(int x) {
		this.x=x;
		//System.out.println("setX: "+x);
	}
	public void setY(int y) {
		this.y=y;
		//System.out.println("setY: "+y);
	}
	public void setXY(int x,int y) { 
		this.x=x;
		this.y=y;
		//System.out.println("setXY: " +x+ " and " +y);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getXY() {
		return x*y;
	}
}

