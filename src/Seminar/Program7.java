package Seminar;

public class Program7 {

	int processData(String str) {
		String temp = "0";
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch) && (str.charAt(index-1) == '-' )) {
				temp = temp + ch;
				while(Character.isDigit(str.charAt(index+1))) {
					temp = temp + str.charAt(index+1);
					index++;
				}
			}else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);
		return sum*-1; 
	}

	public static void main(String[] args) {
		Program7 Program7 = new Program7();
		System.out.println("Output: " + Program7.processData("techn-38ocr14edit-8s"));
	}
}
