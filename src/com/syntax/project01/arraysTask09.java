package com.syntax.project01;

public class arraysTask09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n[] = {10, -30, 45, 900, 98, 0};
	     
			int min = n[0];
			 int max = n[0];
			 for(int i = 0; i < n.length; i++) {
			 if(max < n[i]) {
			 max = n[i];
			 }
			 if(min > n[i]) {
			 min = n[i];
			 }
			 }
			 System.out.println("Maximum and minimum value in the array is:"+max+ " and " + min);
			 
	}

}
