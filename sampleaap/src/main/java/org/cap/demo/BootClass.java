package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From STS to Git");
		show();
		
	}
	public static void show() {
		int arr[]= {11,21,31,41,51};
		int sum=0;
		for (int n: arr) {
			sum+=n;
			System.out.println("n");
		}
		System.out.println("Method displayed");
	}

}
