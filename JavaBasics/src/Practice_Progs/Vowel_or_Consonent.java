package Practice_Progs;

public class Vowel_or_Consonent {

	
	static void VowelorNot(char ch) {
	if(ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u'|| ch == 'A') {
		System.out.println("Character is Vowel");
	}
	else {
		System.out.println("Character is not vowel");
	}
	}
	public static void main(String[] args) {
		Vowel_or_Consonent.VowelorNot('A');
	}
}
