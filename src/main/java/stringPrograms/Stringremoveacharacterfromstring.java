package stringPrograms;

public class Stringremoveacharacterfromstring {

	public static void main(String args[]) {
		String str = "this is Java";
		//System.out.println(removeCharAt(str, 3));
		System.out.println(removeCharAt(str, 'i'));
		
	}

	/* method1 using string method substring

	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	 */

	/* method2 stringbuilder deleteCharAt method
	 public static String removeCharAt(String s, int pos) {
	      StringBuilder sb = new StringBuilder(s);
	      sb.deleteCharAt(pos);
	      return sb.toString();
	   }
	 */
	
	//method 3 to remove the character from mulitple locations in the string
	public static String removeCharAt(String string, char charToBeRemoved) {

        if (string == null)
             return "";

       
    	    StringBuilder strBuild = new StringBuilder ();

        for (int i = 0; i < string.length (); i++) {
            char chr = string.charAt (i);
            if (chr == charToBeRemoved)
                continue;
            System.out.println(strBuild.append (chr));
        }
        return strBuild.toString ();
	}



}
