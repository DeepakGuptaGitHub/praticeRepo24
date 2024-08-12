/*Program : 1
String str = "techno credits pune india";
output : "onhcet stiderc enup aidni"
 */
package Seminar;

public class program1 {

	String processData(String str) {
		String rev_str = "";
		String rev_str2 = "";
		for(int index =0; index < str.length(); index++) {
			char ch = str.charAt(index);
			rev_str = ch + rev_str;
			if(Character.isWhitespace(ch)) {
				rev_str2 = rev_str2 + rev_str;
				rev_str = "";
			}
		}
		rev_str2 = rev_str2 + " " + rev_str;
		return rev_str2.trim();
	}

	public static void main(String[] args) {
		program1 program1 = new program1();
		System.out.println("Rev String: " + program1.processData("techno credits pune india"));
	}
}
