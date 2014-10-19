import java.util.*;

public class CodingSamples {

	public static void main(String[] args){
		
		System.out.println(" Welcome to sample programs ");
		
		String str1 = new String("Debit card");
		String str2 = new String("Bad credit");
		
		CodingSamples codingObj = new CodingSamples();
		if(codingObj.isAnagram(str1, str2)) {
			System.out.println("The Strings are Anagrams");
		}else{
			System.out.println("The Strings are !! NOT Anagrams");
		}
		
	}
	
	public boolean isAnagram(String str1, String str2){
		
		int[] charsStr = new int[255];
		int strlen1 = str1.length();
		int strlen2 = str2.length();
		
		if(strlen1 != strlen2) return false;
		
		for(int i=0; i<strlen1; i++){
			int index = (int)str1.charAt(i);
			++charsStr[index];
			System.out.println("1 CharsString value - " + str1.charAt(i) + "- " + charsStr[index] + "-" + index);
			index = (int)str2.charAt(i);
			--charsStr[index];
			System.out.println("2 CharsString value - " + str2.charAt(i) + "- " + charsStr[index] + "-" + index);
		}
		
		for(int j=0; j<255; j++){
			
			if(charsStr[j] != 0) return false;
		}
		
		return true;
	}
}


