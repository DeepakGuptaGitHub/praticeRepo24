package Seminar;

public class Program9 {

	String processData(String str) {
		String str2 ="";
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				str2 = str2 + ch;
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		Program9 Program9 = new Program9();
		System.out.println("Unique String in word : parallel => " + Program9.processData("parallel"));
		System.out.println("Unique String in word : aashvi => " + Program9.processData("aashvi"));
	}
}
