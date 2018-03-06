* [String vs. StringBuilder vs. StringBuffer](#string-vs-stringbuilder-vs-stringbuffer)
* [How to modify StringBuilder's length and capacity](#how-to-modify-stringbuilders-length-and-capacity)
* [How to create a StringBuilder object](#how-to-create-a-stringbuilder-object)
* [How to compare StringBuilder objects](#how-to-compare-stringbuilder-objects)
* [How to convert between String an StringBuilder](#how-to-convert-between-string-an-stringbuilder)
* [Comparison of methods in Strings and StringBuilder classes](#comparison-of-methods-in-strings-and-stringbuilder-classes)

## String vs. StringBuilder vs. StringBuffer
- **StringBuilder** objects are like String objects, except that they can be modified.
- **StringBuffer** is the thread-safe version of the StringBuilder class. It uses all the methods available in StringBuilder.

## How to modify StringBuilder's length and capacity
- The StringBuilder class, like the String class, has a length() method that returns the length of the character sequence in the builder.
- Unlike strings, every string builder also has a capacity, the number of character spaces that have been allocated. The capacity, which is returned by the capacity() method, is always greater than or equal to the length (usually greater than) and will automatically expand as necessary to accommodate additions to the string builder.
- `void setLength(int newLength)`   Sets the length of the character sequence. If newLength is less than length(), the last characters in the character sequence are truncated. If newLength is greater than length(), null characters are added at the end of the character sequence.
- `void ensureCapacity(int minCapacity)`    Ensures that the capacity is at least equal to the specified minimum.

## How to create a StringBuilder object
- StringBuilder class has 4 constructors
- `StringBuilder()` Creates an empty string builder with a capacity of 16 (16 empty elements).
- `StringBuilder(CharSequence cs)`  Constructs a string builder containing the same characters as the specified CharSequence, plus an extra 16 empty elements trailing the CharSequence.
- `StringBuilder(int initCapacity)` Creates an empty string builder with the specified initial capacity.
- `StringBuilder(String s)` Creates a string builder whose value is initialized by the specified string, plus an extra 16 empty elements trailing the string.

## How to compare StringBuilder objects
- StringBuilder has not method for string comparison so it needs to be converted to a String object using the toString() method.

## How to convert between String an StringBuilder
- You can use any String method on a StringBuilder object by first converting the string builder to a string with the toString() method of the StringBuilder class. 
- Then convert the string back into a string builder using the StringBuilder(String str) constructor.

## Comparison of methods in Strings and StringBuilder classes
| Method | String | StringBuilder | Description |
|:---|:---:|:---:|:---|
|**add**​(int index, E element)| ✔ | ✔ | Inserts the specified element at the specified position in this list. |
|**charAt​**​(int index)| ✔ | ✔ | Returns the char value at the specified index.
|**chars**​()| ✔ | ✔ | Returns a stream of int zero-extending the char values from this sequence.
|**codePointAt​**​(int index)| ✔ | ✔ | Returns the character (Unicode code point) at the specified index.
|**codePointBefore​**​(int index)| ✔ | ✔ | Returns the character (Unicode code point) before the specified index.
|**codePointCount​**​(int beginIndex, int endIndex)| ✔ | ✔ | Returns the number of Unicode code points in the specified text range of this String.
|**codePoints**​()| ✔ | ✔ | Returns a stream of code point values from this sequence.
|**compareTo​**​(String anotherString)| ✔ |  | Compares two strings lexicographically.
|**compareToIgnoreCase​**​(String str)| ✔ |  | Compares two strings lexicographically, ignoring case differences.
|**concat​**​(String str)| ✔ |  | Concatenates the specified string to the end of this string.
|**contains​**​(CharSequence s)| ✔ |  | Returns true if and only if this string contains the specified sequence of char values.
|**contentEquals​**​(CharSequence cs)| ✔ |  | Compares this string to the specified CharSequence.
|**contentEquals​**​(StringBuffer sb)| ✔ |  | Compares this string to the specified StringBuffer.
|**copyValueOf​**​(char[] data)| ✔ |  | Equivalent to valueOf(char[]).
|**copyValueOf​**​(char[] data, int offset, int count)| ✔ |  | Equivalent to valueOf(char[], int, int).
|**endsWith​**​(String suffix)| ✔ |  | Tests if this string ends with the specified suffix.
|**equals​**​(Object anObject)| ✔ |  | Compares this string to the specified object.
|**equalsIgnoreCase​**​(String anotherString)| ✔ |  | Compares this String to another String, ignoring case considerations.
|**format​**​(String format, Object... args)| ✔ |  | Returns a formatted string using the specified format string and arguments.
|**format​**​(Locale l, String format, Object... args)| ✔ |  | Returns a formatted string using the specified locale, format string, and arguments.
|**getBytes**​()| ✔ |  | Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
|**getBytes​**​(String charsetName)| ✔ |  | Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
|**getBytes​**​(Charset charset)| ✔ |  | Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.
|**getChars​**​(int srcBegin, int srcEnd, char[] dst, int dstBegin)| ✔ | ✔ | Copies characters from this sequence into the destination character array.
|**hashCode**​()| ✔ |  | Returns a hash code for this string.
|**indexOf​**​(int ch)| ✔ |  | Returns the index within this string of the first occurrence of the specified character.
|**indexOf​**​(int ch, int fromIndex)| ✔ |  | Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
|**indexOf​**​(String str)| ✔ | ✔ | Returns the index within this string of the first occurrence of the specified substring.
|**indexOf​**​(String str, int fromIndex)| ✔ | ✔ | Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
|**intern**​()| ✔ |  | Returns a canonical representation for the string object.
|**isEmpty**​()| ✔ |  | Returns true if, and only if, length() is 0.
|**join​**​(CharSequence delimiter, CharSequence... elements)| ✔ |  | Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
|**join​**​(CharSequence delimiter, Iterable<? extends CharSequence> elements)| ✔ |  | Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
|**lastIndexOf​**​(int ch)| ✔ |  | Returns the index within this string of the last occurrence of the specified character.
|**lastIndexOf​**​(int ch, int fromIndex)| ✔ |  | Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
|**lastIndexOf​**​(String str)| ✔ | ✔ | Returns the index within this string of the last occurrence of the specified substring.
|**lastIndexOf​**​(String str, int fromIndex)| ✔ | ✔ | Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
|**length**​()| ✔ | ✔ | Returns the length.
|**matches​**​(String regex)| ✔ |  | Tells whether or not this string matches the given regular expression.
|**offsetByCodePoints​**​(int index, int codePointOffset)| ✔ | ✔ | Returns the index within this String that is offset from the given index by codePointOffset code points.
|**regionMatches​**​(boolean ignoreCase, int toffset, String other, int ooffset, int len)| ✔ |  | Tests if two string regions are equal.
|**regionMatches​**​(int toffset, String other, int ooffset, int len)| ✔ |  | Tests if two string regions are equal.
|**replace​**​(char oldChar, char newChar)| ✔ |  | Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
|**replace​**​(CharSequence target, CharSequence replacement)| ✔ |  | Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
|**replace​**​(int start, int end, String str)|  | ✔ |Replaces the characters in a substring of this sequence with characters in the specified String.
|**replaceAll​**​(String regex, String replacement)| ✔ |  | Replaces each substring of this string that matches the given regular expression with the given replacement.
|**replaceFirst​**​(String regex, String replacement)| ✔ |  | Replaces the first substring of this string that matches the given regular expression with the given replacement.
|**split​**​(String regex)| ✔ |  | Splits this string around matches of the given regular expression.
|**split​**​(String regex, int limit)| ✔ |  | Splits this string around matches of the given regular expression.
|**startsWith​**​(String prefix)| ✔ |  | Tests if this string starts with the specified prefix.
|**startsWith​**​(String prefix, int toffset)| ✔ |  | Tests if the substring of this string beginning at the specified index starts with the specified prefix.
|**subSequence​**​(int beginIndex, int endIndex)| ✔ | ✔ | Returns a character sequence that is a subsequence of this sequence.
|**substring​**​(int beginIndex)| ✔ | ✔ | Returns a string that is a substring of this string.
|**substring​**​(int beginIndex, int endIndex)| ✔ | ✔ | Returns a string that is a substring of this string.
|**toCharArray**​()| ✔ |  | Converts this string to a new character array.
|**toLowerCase**​()| ✔ |  | Converts all of the characters in this String to lower case using the rules of the default locale.
|**toLowerCase​**​(Locale locale)| ✔ |  | Converts all of the characters in this String to lower case using the rules of the given Locale.
|**toString**​()| ✔ | ✔ | Returns a string representing the data in this sequence.
|**toUpperCase**​()| ✔ |  | Converts all of the characters in this String to upper case using the rules of the default locale.
|**toUpperCase​**​(Locale locale)| ✔ |  | Converts all of the characters in this String to upper case using the rules of the given Locale.
|**trim**​()| ✔ |  | Returns a string whose value is this string, with any leading and trailing whitespace removed.
|**valueOf​**​(boolean b)| ✔ |  | Returns the string representation of the boolean argument.
|**valueOf​**​(char c)| ✔ |  | Returns the string representation of the char argument.
|**valueOf​**​(char[] data)| ✔ |  | Returns the string representation of the char array argument.
|**valueOf​**​(char[] data, int offset, int count)| ✔ |  | Returns the string representation of a specific subarray of the char array argument.
|**valueOf​**​(double d)| ✔ |  | Returns the string representation of the double argument.
|**valueOf​**​(float f)| ✔ |  | Returns the string representation of the float argument.
|**valueOf​**​(int i)| ✔ |  | Returns the string representation of the int argument.
|**valueOf​**​(long l)| ✔ |  | Returns the string representation of the long argument.
|**valueOf​**​(Object obj)| ✔ |  | Returns the string representation of the Object argument.
|**append​**​(Object obj)|  | ✔ | Appends the string representation of the Object argument.
|**capacity**​()|  | ✔ | Returns the current capacity.
|**delete​**​(int start, int end)|  | ✔ | Removes the characters in a substring of this sequence.
|**deleteCharAt​**​(int index)|  | ✔ | Removes the char at the specified position in this sequence.
|**ensureCapacity​**​(int minimumCapacity)|  | ✔ | Ensures that the capacity is at least equal to the specified minimum.
|**insert​**​(int offset, Object obj)|  | ✔ | Inserts the string representation of the Object argument into this character sequence.
|**reverse**​()|  | ✔ | Causes this character sequence to be replaced by the reverse of the sequence.
|**setCharAt​**​(int index, char ch)|  | ✔ | The character at the specified index is set to ch.
|**setLength​**​(int newLength)|  | ✔ | Sets the length of the character sequence.
|**trimToSize**​()|  | ✔ | Attempts to reduce storage used for the character sequence.