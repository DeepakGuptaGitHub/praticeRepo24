package Seminar;

public class Program2 {

	String processData(String str) {
		String rev_str = "";
		String rev_str2 = "";
		for(int index =0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(!Character.isDigit(ch)) {
				rev_str = ch + rev_str;
				if(Character.isWhitespace(ch)) {
					rev_str2 = rev_str2 + rev_str;
					rev_str = "";
				}
			}
		}
		rev_str2 = rev_str2 + " " + rev_str;
		return rev_str2.trim();
	}

	public static void main(String[] args) {
		Program2 Program2 = new Program2();
		System.out.println("Rev String: " + Program2.processData("te14chno credi4ts pu3ne in5dia"));
	}
}
