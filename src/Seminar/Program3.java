//Print only characters occurring exactly twice:
//input: teecccchhhnno;
//output: en

package Seminar;

public class Program3 {

	int getCount(String str, char ch) {
		int count =0;
		for(int index =0; index < str.length(); index++) {
			char ch2 = str.charAt(index);
			if(ch == ch2) {
				count++;
			}
		}
		return count;
	}

	String processData(String str) {
		String outStr = "";
		for(int index =0; index < str.length(); index++) {	
			char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				int count = getCount(str, ch);
				if(count == 2) {
					outStr = outStr + ch;
				}
			}
		}
		return outStr;
	}

	public static void main(String[] args) {
		Program3 Program3 = new Program3();
		System.out.println("Character occuring twice: " + Program3.processData("teecccchhhnno"));
	}
}
