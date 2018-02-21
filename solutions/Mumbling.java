/* 
  accum("abcd");    // "A-Bb-Ccc-Dddd"
  accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
  accum("cwAt");    // "C-Ww-Aaa-Tttt"
*/

public class Mumbling {
  public static String accum(String s) {
    StringBuilder str = new StringBuilder(s); 
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if (i > 0) {
        result.append('-');
      }
      result.append(Character.toUpperCase(str.charAt(i)));
      
      for (int j = 0; j < i; j++) {
        result.append(Character.toLowerCase(str.charAt(i)));
      }
    }
    
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(accum("abcd"));    
    System.out.println(accum("RqaEzty")); 
    System.out.println(accum("cwAt"));
    System.out.println(accum("ZpglnRxqenU"));
  }
}                   