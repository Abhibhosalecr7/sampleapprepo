package org.cap.demo;

public class BootClass {

	public static void main(String[] args) 
	{
		System.out.println("Hello! from Eclipse!");
		show(); 
		}
	public static void show() {
		int[] arr= {25,9,21,1};
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Show method here!");
	}

}