package Seminar;

public class Program6 {

	int processData(String str) {
		String temp = "0";
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp + ch;
			}else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);
		return sum; 
	}


	public static void main(String[] args) {
		Program6 Program6 = new Program6();
		System.out.println("Output: " + Program6.processData("techn12ocr13edit14s"));
		System.out.println("Output: " + Program6.processData("ten12ocr13edit15"));
	}
}
