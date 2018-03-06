* [What is an array](#what-is-an-array)
* [Can you have elements of different types in the same array?](#can-you-have-elements-of-different-types-in-the-same-array)
* [How to create and initialize an array](#how-to-create-and-initialize-an-array)
* [Does array have to be initialized](#does-array-have-to-be-initialized)
* [How to iterate an array](#how-to-iterate-an-array)
* [How does passing an array to a method differ from passing primitive data types](#how-does-passing-an-array-to-a-method-differ-from-passing-primitive-data-types)
* [How to copy an array](#how-to-copy-an-array)
* [How to check if two arrays are equal](#how-to-check-if-two-arrays-are-equal)
* [How to get the size of an array](#how-to-get-the-size-of-an-array)
* [How to convert an array to a list](#how-to-convert-an-array-to-a-list)
* [How to convert a list to an array](#how-to-convert-a-list-to-an-array)
* [How to convert an array to a string](#how-to-convert-an-array-to-a-string)
* [How to sort an array](#how-to-sort-an-array)
* [How to search an array](#how-to-search-an-array)
* [Other utility methods](#other-utility-methods)

## What is an array
- An array is a container object that holds a fixed number of values of a single type.
- The length of an array cannot be changed after the array is created.

## Can you have elements of different types in the same array?
- No, all elements of the array must of the same type.

## How to create and initialize an array
```java
anArray = new int[10];
int[] numbers1 = new int[3];
int[] numbers2 = {42, 55, 99};
int[][] vars1;  // 2D array`
```
- You are required to specify a length whenever you create an array

## Does array have to be initialized
- When an array is created, its elements are assigned the default value of 0 or 0.0 for the numeric primitive data types, \u0000 for char types, false for boolean types, and null for elements of reference types.

## How to iterate an array
- `for (int p : primes) sumOfPrimes += p;`

## How does passing an array to a method differ from passing primitive data types
- While Java uses pass-by-value to pass arguments to a method, for an argument of an array type, it uses pass-by-sharing where the array in the method is the same as the array being passes. Thus if you change the array in the method, you will see the change outside the method.

## How to copy an array
- There are four methods for copying an array:
1. `System.arraycopy(Object original, int srcPos, Object copy, int destPos, int length);`
  - The arraycopy method does not allocate memory space for the target array. The target array must have already been created with its memory place allocated.
```java
char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd' };
char[] copyTo = new char[7];
System.arraycopy(copyFrom, 2, copyTo, 0, 7);
```
2. `Arrays.copyOf` does type-checking.
```java
String[] stringsCopy = Arrays.copyOf(str, str.length);
```
3. `Object.clone()` is used for shallow copy. clone() doesn't have to do the type-checking before copying a source array to the destination one.
   - When using clone(), a cast is required to convert the return value to the appropriate array type.
```java
int[] data = {1, 2, 3}
int[] copy = (int[]) data.clone();
```
4. Use a loop to copy individual elements one by one.

## How to check if two arrays are equal
- `Arrays.equals​(type[] a, type[] b)`
- `boolean deepEquals​(Object[] a, Object[] b)`
- `equals()` checks equality only for one-dimensional arrays, whereas `deepEquals()` works for arrays of two or more dimensions.

## How to get the size of an array
- `.length`
`System.out.println(anArray.length);`

## How to convert an array to a list
- `asList(arr)`

## How to convert a list to an array
- `toArray(arr)`
```java
String[] array = new String[list.size()];
list.toArray(array);
```

## How to convert an array to a string
- `String toString​(type[] a)` or `String deepToString(type[] a)`
```java
System.out.println(Arrays.toString(myArray));
```

## How to sort an array
- `void sort(type[] arr)`
- Uses quicksort: O(n log(n))

## How to search an array
- `int binarySearch​(type[] a, type key)` that searches for key in a sorted array a. Returns a negative value if it does not find it. If the array contains multiple elements with the specified value, there is no guarantee which one will be found.
- Linear search can be used if they array is not sorted.

## Other utility methods
- `void fill​(type[] a, type val)`
- `void fill​(type[] a, type fromIndex, type toIndex, type val)`
- `int mismatch​(type[] a, type[] b) // returns the index of the first mismatch between two arrays, otherwise return -1 if no mismatch is found`
