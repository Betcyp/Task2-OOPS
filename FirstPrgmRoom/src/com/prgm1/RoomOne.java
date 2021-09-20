package com.prgm1;

public class RoomOne {
	
		private int roomNo;
		private String roomType;
		private int roomArea;
		private String acMachine;
		
		public void setData(int room, String roomTy, int roomAr, String acMach) {
			roomNo = room;
			roomType = roomTy;
			roomArea = roomAr;
			acMachine = acMach;
			}
		
		public int getRoomNo() {
			return roomNo;
		}
		public String getRoomType() {
			return roomType;
		}
		public int getRoomArea() {
			return roomArea;
		}
		public String getAcMachine() {
			return acMachine;
		}
		
		public void displayData() {
			System.out.println(getRoomNo()+  " " +getRoomType()+ " "+getRoomArea()+ " "+getAcMachine());
			
		}
		
}

