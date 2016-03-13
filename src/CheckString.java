import java.util.HashMap;
import java.util.stream.Collector;

/**
 * Created by Александр on 07.03.2016.
 */
public class CheckString {
    public static void main(String... args){
        String s = "string foe";
        System.out.println(isRefused("ooe","noe"));

        System.out.println(compress("aabbbdd"));
    }

    private static boolean checkString(String str){
        for (int i=0; i<str.length()-1; i++) {
            char c = str.charAt(i);
            for (int j = i+1; j<str.length()-1; j++){
                if (c == str.charAt(j)) return false;
            }
        }
        return true;
    }

    private static boolean isRefused(String str1, String str2){
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str1.length(); i++) {
            Character ch = str1.charAt(i);
            if (map.containsKey(ch)) map.replace(ch, map.get(ch) + 1);
            else map.put(str1.charAt(i), 1);
        }

        for (int i=0; i<str2.length();i++){
            Character ch = str2.charAt(i);
            if (map.containsKey(ch))
                if (map.get(ch) == 1) map.remove(ch);
                else map.replace(ch, map.get(ch)-1);
            else return false;
        }

        if (!map.isEmpty()) return false;
        return true;
    }

    private static String compress(String str){
        int count = 1;
        char ch = str.charAt(0);
        String out = "";
        for (int i=1; i<str.length(); i++){
            char curChar = str.charAt(i);
            if (curChar == ch) count++;
            else {
                out = out+ ch + Integer.toString(count);
                count = 1;
                ch = curChar;
            }
        }
        out = out + ch + Integer.toString(count);
        if (out.length()<str.length()) return out;
        else return str;
    }
}
