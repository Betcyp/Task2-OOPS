package com.prgm1;

public class MainRoom {
		public static void main(String[] args) {
			RoomOne r1 = new RoomOne();
			r1.setData(1, "Single", 10*2, "Whirlpool 2");
			r1.getRoomNo();
			r1.getRoomType();
			r1.getRoomArea();
			r1.getAcMachine();
			r1.displayData();
			
			RoomOne r2 = new RoomOne();
			r2.setData(2, "Double", 25*25, "Voltas 1.2");
			r2.getRoomNo();
			r2.getRoomType();
			r2.getRoomArea();
			r2.getAcMachine();
			r2.displayData();
			
			
		}
}
