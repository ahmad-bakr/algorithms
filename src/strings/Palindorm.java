package strings;

/**
 * Check if a string is palindrom
 * @author ahmad.bakr
 *
 */
public class Palindorm {

    /**
     * An iterative solution for aalindrom check
     * @param str string
     * @return true if the string is aalindrom, otherwise false
     * @throws Exception
     */
    public static boolean checkPlain(String str) throws Exception{
        if(str == null) throw new Exception("String can not be null");
        
        for(int i=0; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length() -i -1)) return false;
        }
        return true;
    }
    
    /**
     * A recursive way to checo if a string is palindrom
     * @param str string
     * @param start start of the string
     * @param end end of the string
     * @return true if the string is aalindrom, otherwise false
     */
    public static boolean checkPalinRec(String str, int start, int end){
        if(start >= end ) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        
        return checkPalinRec(str, start+1, end-1);
    }
    
    public static void main(String[] args) throws Exception {
        String a = "xyyyx";
        System.out.println(checkPlain(a));
        System.out.println(checkPalinRec(a, 0, a.length()-1));
    }
}
