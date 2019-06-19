
public class junk_2{
	
	
	public static void main(String[] args) throws Exception {
		//TestCases
			String s1 = "The cow jumped over the moon."; // Has period in it
			String s2 = "THE COW JUMPED OVER THE MOON";  // NO PUNCUATION & all caps
			String s3 = "The       cow jumped over the moon.";  // Multi Spaces between words
			String s4 = "The cow jumped? over........ the??? moon. ";  // Multi Periods & ? between words
			
		for (int x=1; x<5; x++){
			switch(x){
				case 1:
					System.out.println("Lenght and Longest Word => " + flw(s1));
					break;
				case 2:
					System.out.println("Lenght and Longest Word => " + flw(s2));
					break;
				case 3:
					System.out.println("Lenght and Longest Word => " + flw(s3));
					break;
				case 4:
					System.out.println("Lenght and Longest Word => " + flw(s4));
					break;
			}
		}
    }
	
	public static String flw(String str1){
		int lCnt=0;  // Letter Count
		int hCnt=0;  // Highest Letter Count
		String wordFound="";
		String hWord="";
		str1= str1.trim().toLowerCase(); // Want to eliminate leading and trailing zeros and
									 // set every letter to lowercase, so not to worry about uppercase
		for (int x=0; x<str1.length(); x++){
			if (!str1.substring(x, x+1).equals(" ")){
				if(str1.substring(x, x+1).equals(".") ||
						str1.substring(x, x+1).equals("?")){
					continue;  //  Don not count punctuation  !!!
				}else{
					lCnt++;
					wordFound=wordFound+str1.substring(x, x+1);
				}
			}else{
				if(lCnt>hCnt){   //looking for the highest letter cnt, when found, get the word
					hCnt=lCnt;
					hWord=wordFound;
					//Re-INITALIZE VARIABLES
						wordFound="";
						lCnt=0;
				}else{
					//Re-INITALIZE VARIABLES
						wordFound="";
						lCnt=0;
				}
			}
		}
		return hCnt+"  "+hWord; 
	}
}	
