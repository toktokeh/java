* [What is an important property of strings in java](#what-is-an-important-property-of-strings-in-java)
* [How to get the length of a string](#how-to-get-the-length-of-a-string)
* [How to join strings](#how-to-join-strings)
* [How to compare strings](#how-to-compare-strings)
* [Null vs. empty string and how to test for them](#null-vs-empty-string-and-how-to-test-for-them)
* [How to create format strings](#how-to-create-format-strings)
* [How to convert strings to numbers](#how-to-convert-strings-to-numbers)
* [How to convert numbers to strings](#how-to-convert-numbers-to-strings)
* [How to get characters and substrings by index](#how-to-get-characters-and-substrings-by-index)
* [What are some other methods for manipulating strings](#what-are-some-other-methods-for-manipulating-strings)
* [How to search for characters and substrings in a string](#how-to-search-for-characters-and-substrings-in-a-string)
* [How to replace characters and substrings into a string](#how-to-replace-characters-and-substrings-into-a-string)
* [How to compare strings or portions of strings](#how-to-compare-strings-or-portions-of-strings)

## What is an important property of strings in java
- String objects are immutable. So operations on a String object that modify the characters return a new String object.

## How to get the length of a string
- `length()`

## How to join strings
- `String concat(string)` or by using the + sign as such `str1 + str2`

## How to compare strings
- `equals​(String str)` or `equalsIgnoreCase​(String str)`
```java
str1.equals(str2)
```
- Do not use `str1 == str2` since this returns true only if `str1` and `str2` reference the same object in memory.

## Null vs. empty string and how to test for them
- Null is not the same as an empty string “ ”. The empty string is a string of length zero whereas null isn't anything at all.
- To test if a string is null we can use == as such: `if (str1 == null)` 
- `isEmpty​()` returns true if, and only if, length() is 0.

## How to create format strings
- Using String's static format() method allows you to create a formatted string that you can reuse
```java
String fs;
fs = String.format("The value of the float " +
                   "variable is %f, while " +
                   "the value of the " + 
                   "integer variable is %d, " +
                   " and the string is %s",
                   floatVar, intVar, stringVar);
System.out.println(fs);
```

## How to convert strings to numbers
- The Number subclasses that wrap primitive numeric types (Byte, Integer, Double, Float, Long, and Short) each provide a class method named valueOf that converts a string to an object of that type.
`float a = (Float.valueOf(args[0])).floatValue();`
- Each of the Number subclasses that wrap primitive numeric types also provides a parseXXXX() method (for example, parseFloat()) that can be used to convert strings to primitive numbers. Since a primitive type is returned instead of an object, the parseFloat() method is more direct than the valueOf() method.
`float a = Float.parseFloat(args[0]);`
`double pi = Double.parseDouble(str);`

## How to convert numbers to strings
- Each of the Number subclasses includes a class method, toString(), that will convert its primitive type to a string.
`String str = Double.toString(3.14);`

- Alternatively we can concatenate the number with an empty string
```java
int i = 3;
String s1 = "" + i;
```

## How to get characters and substrings by index
- You can get the character at a particular index within a string by invoking the charAt() accessor method. 
- `char charAt(int index)`
```java
char myChar = myString.charAt(9);
```
- To get more than one consecutive character from a string, we can use one of the two substring method:
- `String substring(int beginIndex, int endIndex)`  Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1.
- `String substring(int beginIndex)`    Returns a new string that is a substring of this string. The integer argument specifies the index of the first character. Here, the returned substring extends to the end of the original string.
```java
String anotherPalindrome = "Niagara. O roar again!"; 
String roar = anotherPalindrome.substring(11, 15)
```

## What are some other methods for manipulating strings
- `String[] split(String regex)` or `String[] split(String regex, int limit)` Searches for a match as specified by the string argument (which contains a regular expression) and splits this string into an array of strings accordingly. The optional integer argument specifies the maximum size of the returned array. Regular expressions are covered in the lesson titled "Regular Expressions."
- `CharSequence subSequence(int beginIndex, int endIndex)`  Returns a new character sequence constructed from beginIndex index up until endIndex - 1.
- `String trim()`   Returns a copy of this string with leading and trailing white space removed.
- `String toLowerCase()` or `String toUpperCase()`    Returns a copy of this string converted to lowercase or uppercase. If no conversions are necessary, these methods return the original string.


## How to search for characters and substrings in a string
- The String class provides accessor methods that return the position within the string of a specific character or substring: `indexOf()` and `lastIndexOf()`
- The String class also provides a search method, contains, that returns true if the string contains a particular character sequence. Use this method when you only need to know that the string contains a character sequence, but the precise location isn't important.

## How to replace characters and substrings into a string
- The String class has very few methods for inserting characters or substrings into a string. In general, they are not needed: You can create a new string by concatenation of substrings you have removed from a string with the substring that you want to insert.
- The String class does have four methods for replacing found characters or substrings, however. They are:
- `String replace(char oldChar, char newChar)`  Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
- `String replace(CharSequence target, CharSequence replacement)`   Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
- `String replaceAll(String regex, String replacement)` Replaces each substring of this string that matches the given regular expression with the given replacement.
- `String replaceFirst(String regex, String replacement)`   Replaces the first substring of this string that matches the given regular expression with the given replacement.

## How to compare strings or portions of strings
- `boolean endsWith(String suffix)` or `boolean startsWith(String prefix)`   Returns true if this string ends with or begins with the substring specified as an argument to the method.
- `boolean startsWith(String prefix, int offset)`   Considers the string beginning at the index offset, and returns true if it begins with the substring specified as an argument.
- `int compareTo(String anotherString)` Compares two strings lexicographically. Returns an integer indicating whether this string is greater than (result is > 0), equal to (result is = 0), or less than (result is < 0) the argument.
- `int compareToIgnoreCase(String str)` Compares two strings lexicographically, ignoring differences in case. Returns an integer indicating whether this string is greater than (result is > 0), equal to (result is = 0), or less than (result is < 0) the argument.
- `boolean equals(Object anObject)` Returns true if and only if the argument is a String object that represents the same sequence of characters as this object.
- `boolean equalsIgnoreCase(String anotherString)`  Returns true if and only if the argument is a String object that represents the same sequence of characters as this object, ignoring differences in case.
- `boolean regionMatches(int toffset, String other, int ooffset, int len)`  Tests whether the specified region of this string matches the specified region of the String argument.
Region is of length len and begins at the index toffset for this string and ooffset for the other string.
- `boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)`  Tests whether the specified region of this string matches the specified region of the String argument.
Region is of length len and begins at the index toffset for this string and ooffset for the other string.
The boolean argument indicates whether case should be ignored; if true, case is ignored when comparing characters.
- `boolean matches(String regex)`   Tests whether this string matches the specified regular expression. Regular expressions are discussed in the lesson titled "Regular Expressions."
