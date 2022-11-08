package practiceJava;
public class UnCommonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String StringA = "geeks"; 
		String Stringb = "geeks";
		String ans = "";
		
		boolean freq1[] = new boolean[26];
		boolean freq2[] = new boolean[26];
		
		for(int x = 0; x < StringA.length(); x++) {
			freq1[StringA.charAt(x) - 'a'] = true;
		}
		
		for(int y = 0; y < Stringb.length(); y++) {
			freq2[Stringb.charAt(y) - 'a'] = true;
		}
		
		for(int i = 0; i<26; i++) {
			if((freq1[i] ^ freq2[i]) == true) {
				ans += (char)(i + 'a');
				System.out.println((char)(i + 'a'));
			}
		}
		if(ans.length() > 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
