package Seminar;

import java.util.Arrays;

public class Program8 {
	
	void processData(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for(int index =0; index < arr.length; index++) {
			if(arr[index] != arr[index+1]) {
				count++;
				System.out.println(count + " Smallest No: " + arr[index]);
				if(count == 2) {
					break;
				}
			}

		}
	}
	
	
	void processData2(int[] arr) {
	    int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++ ) {
				if(arr[i]> arr[j]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;		 
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest No: " + arr[0]);
		for(int index =1; index < arr.length-1; index++) {
			if(arr[index] != arr[index+1]) {
				System.out.println("Second Smallest No: " + arr[index]);
					break;
			}

		}
	}

	public static void main(String[] args) {
		int[] input ={-9, 3, 36, -25,-25, -9, 71, 0};
		Program8 Program8 = new Program8();
		Program8.processData2(input);
	}
}
