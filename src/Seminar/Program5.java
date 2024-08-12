package Seminar;

public class Program5 {
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
			if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') && index == str.indexOf(ch)) {
				int count = getCount(str, ch);
				if(count == 1) {
					outStr = outStr + ch;
				}
			}
		}
		return outStr;
	}
	
	String printUniqueVowelChars(String str) {
		String vowel="aeiou";
		String outStr ="";
		int length=str.length();
		char ch;
		int newLength=0,diff=0;
		while(length>0) {
			ch=str.charAt(0);
			if (vowel.contains(String.valueOf(ch))) {
				str=str.replace(String.valueOf(ch),"");
				newLength= str.length();
				diff=length-newLength;
				if(diff == 1) {
					outStr = outStr + ch;
				}
			}
			str=str.replace(String.valueOf(ch),"");
			length=str.length();
		}
		return outStr;
	}

	public static void main(String[] args) {
		Program5 Program5 = new Program5();
		System.out.println("Unique Vowels: " + Program5.processData("technocredits"));
		System.out.println("Unique Vowels: " + Program5.printUniqueVowelChars("technocredits"));
	}
}
