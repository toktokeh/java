import java.util.*;

public class Main {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for(char c : str.toCharArray()) {
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("test"));      
        System.out.println(getCount("middle"));    
        System.out.println(getCount("testing"));   
        System.out.println(getCount("A"));         
    }
}
        // String s1 = "Hello";
        // String s2 = "Howdy";
        // String s3 = "howdy";
        // System.out.println(s1.equalsIgnoreCase(s2));
        // System.out.println(s2.equalsIgnoreCase(s3));
        // String s3 = "howdy";
        // System.out.println(s2.compareToIgnoreCase(s1));
        // System.out.println(s2.compareToIgnoreCase(s3));