### 1. Get the character at the given index within the String. 
```java
public class Main {
    public static char getChar(String str, int index) {
        return str.charAt(index);
    }

    public static void main(String[] args) {
        System.out.println(getChar("Hello", 2));
    }
}
```

### 2. Compare two strings lexicographically. 
```java
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Howdy";
    String s3 = "Howdy";
    System.out.println(s1.compareTo(s2));
    System.out.println(s2.compareTo(s1));
    System.out.println(s2.compareTo(s3));
}
```

### 3. Compare two strings lexicographically, ignoring case differences. 
```java
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Howdy";
    String s3 = "howdy";
    System.out.println(s1.compareToIgnoreCase(s2));
    System.out.println(s2.compareToIgnoreCase(s1));
    System.out.println(s2.compareToIgnoreCase(s3));
}
```

### 4. Concatenate a given string to the end of another string. 
```java
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Howdy";
    String s3 = "howdy";
    System.out.println(s1.concat(s2));
    System.out.println(s1 + s2);
}
```

### 5. Test if a given string contains the specified sequence of char values. 
```java
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello world!";
    System.out.println(s1.contains(s2));
    System.out.println(s2.contains(s1));
}
```

### 6. Create a new String object with the contents of a character array. 
```java
public static void main(String[] args) {
    char[] chars = {'h', 'e', 'l', 'l', 'o'};
    System.out.println(String.valueOf(chars));
}
```

### 7. Check whether a given string ends with the contents of another string.
```java
public static void main(String[] args) {
    String s1 = "world";
    String s2 = "world!";
    String s3 = "Hello world!";
    System.out.println(s3.endsWith(s1));
    System.out.println(s3.endsWith(s2));
}
``` 

### 8. Compare if two strings are equal, ignoring case considerations. 
```java
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Howdy";
    String s3 = "howdy";
    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s2.equalsIgnoreCase(s3));
}
```

### 9. Print current date and time in the specified format. 
```
Current Date and Time:
June 19, 2017
3:13 pm 
```

```java
public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    System.out.println("Current Date and Time:");     
    System.out.format("%tB %te, %tY%n", c, c, c);
    System.out.format("%tl:%tM %tp%n", c, c, c);
}
```

### 10. Get the contents of a given string as a byte array.
```java
public static void main(String[] args) {
    String s1 = "Hello";
    System.out.println(s1.getBytes());
}
``` 

### 11. Get the contents of a given string as a character array. 
```java
public static void main(String[] args) {
    String s1 = "Hello";
    char[] c1 = s1.toCharArray();
    System.out.println(c1[0]);
}
```

### 12. Return the middle character of the word. If the word's length is even, return the middle 2 characters.

```java
public static String getMiddle(String word) {
    int length = word.length();
    return (length % 2 != 0) 
        ?  String.valueOf(word.charAt(length / 2)) 
        : word.substring(length / 2 - 1, length / 2 + 1);
}
```
### 13. Count the vowels in a given string.
```java
public static int getCount(String str) {
    int vowelsCount = 0;
    for(char c : str.toCharArray()) {
        vowelsCount += 
            (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
    }
    return vowelsCount;
}
```

    - Alternative solution:

```java
public static int getCount(String str) {
    return str.replaceAll("(?i)[^aeiou]", "").length();
}
```



21. Get the last index of a string within a string.

Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

22. Get the length of a given string. 

23. Find whether a region in the current string matches a region in another string. 

24. Replace all the 'd' characters with 'f' characters. 

25. Replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

26. Check whether a given string starts with the contents of another string. 

27. Get a substring of a given string between two specified positions. 

28. Create a character array containing the contents of a string. 

29. Convert all the characters in a string to lowercase. 

30. Convert all the characters in a string to uppercase. 

31. Trim any leading or trailing whitespace from a given string. 

