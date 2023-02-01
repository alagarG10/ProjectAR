package org.sample;

public class BasicClass {
	public static void main(String[] args) {
		
		String day = "monday";
		
		switch (day) {
		case "sunday":
			System.out.println("Holiday");	
			break;
			
		case "monday":
			System.out.println("Working Day");
			break;
			
		case "tuesday":
			System.out.println("Half Working Day");
	
		default:
			System.out.println("Invalid Day");
			break;
		
	}
		
	}
}


