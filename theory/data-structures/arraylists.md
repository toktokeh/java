* [What is an ArrayList?](#what-is-an-arraylist)
* [Difference between ArrayList and vector](#difference-between-arraylist-and-vector)
* [Difference between ArrayList and array](#difference-between-arraylist-and-array)
* [Difference between ArrayList and LinkedList](#difference-between-arraylist-and-linkedlist)
* [Is it possible to have elements of different types in the same ArrayList](#is-it-possible-to-have-elements-of-different-types-in-the-same-arraylist)
* [What are some ways of creating an ArrayList](#what-are-some-ways-of-creating-an-arraylist)
* [How to convert an ArrayList to an array and vice versa](#how-to-convert-an-arraylist-to-an-array-and-vice-versa)
* [How to check if an ArrayList is empty](#how-to-check-if-an-arraylist-is-empty)
* [How to find the size and capacity of an ArrayList](#how-to-find-the-size-and-capacity-of-an-arraylist)
* [How to replace an element at a particular index in ArrayList](#how-to-replace-an-element-at-a-particular-index-in-arraylist)
* [How to append an element at the end of an ArrayList](#how-to-append-an-element-at-the-end-of-an-arraylist)
* [How to insert an element at a particular position of an ArrayList](#how-to-insert-an-element-at-a-particular-position-of-an-arraylist)
* [How to insert more than one element at a particular position of an ArrayList](#how-to-insert-more-than-one-element-at-a-particular-position-of-an-arraylist)
* [What happens if adding an element exceeds the ArrayList's capacity](#what-happens-if-adding-an-element-exceeds-the-arraylists-capacity)
* [How to get the position of a particular element in an ArrayList](#how-to-get-the-position-of-a-particular-element-in-an-arraylist)
* [How to remove a given element from an ArrayList](#how-to-remove-a-given-element-from-an-arraylist)
* [How to remove all elements from an ArrayList](#how-to-remove-all-elements-from-an-arraylist)
* [How to find an element in an ArrayList](#how-to-find-an-element-in-an-arraylist)
* [How to retrieve an element from the ArrayList when its position is known](#how-to-retrieve-an-element-from-the-arraylist-when-its-position-is-known)
* [How to retrieve a portion of an ArrayList](#how-to-retrieve-a-portion-of-an-arraylist)
* [How to increase the current capacity of an ArrayList](#how-to-increase-the-current-capacity-of-an-arraylist)
* [How to decrease the current capacity of an ArrayList to the current size](#how-to-decrease-the-current-capacity-of-an-arraylist-to-the-current-size)
* [How to join two ArrayLists](#how-to-join-two-arraylists)
* [How to iterate an ArrayList](#how-to-iterate-an-arraylist)
* [How to copy an ArrayList](#how-to-copy-an-arraylist)

## What is an ArrayList?
- Resizable-array implementation of the List interface. 
- ArrayList class extends AbstractList class which implements List interface. The List interface extends Collection and Iterable interfaces.
- Permits all elements, including null.
- Unlike arrays, ArrayLists can change size at runtime if needed.
- Initial capacity is 10 if capacity is not specified when ArrayList is created.

## Difference between ArrayList and vector
- Vectors are synchronized (thread-safe) whereas ArrayLists are not.
- Vectors do not allow null keys or values, but ArrayLists do.

## Difference between ArrayList and array
- Arrays are fixed size but ArrayLists are dynamic in size.
- Array members can be accessed using [], whereas ArrayList has a set of methods to access and modify elements.
- Arrays can contain either primitive data types and objects of a class, but ArrayList only supports objects. For example, ArrayList.add(1) converts the primitive int data type into an Integer object before adding it to the list.

## Difference between ArrayList and LinkedList
- LinkedLists and ArrayLists are two different implementations of the List interface. LinkedList implements it with a doubly linkedlist and ArrayList implements it with a dynamically resizing array.
- LinkedLists allow sequential access to the elements whereas ArrayLists allow for random access. One would want to use ArrayList in the cases where there is greater need to access the element rather than insertion or deletion. On the other hand, one would want to use LinkedList when there is a greater need for insertion and deletion and not much use of accessing the element at a particular index.
- LinkedLists are specially useful for adding/removing elements to the head of a list since this is done in O(1) time whereas with an ArrayList, all other elements in the list need to be shifted. 
- Worst-case scenarios:

| Operation | ArrayList | LinkedList|
|:---|:---:|:---:|
|get(index)|O(1)|O(n)|
|add(element)|O(n)|O(1)|
|remove(index)|O(n)|O(n)|


## Is it possible to have elements of different types in the same ArrayList
- Yes, as long as we don't declare the list to be of a particular type. 
- For example the following is valid:
```java
List myList = new ArrayList<>();
myList.add(5);      // autoboxed to an Integer object
myList.add("5");    // autoboxed to a String object
```

## What are some ways of creating an ArrayList
- By using one of the three overloaded constructors:
* `ArrayList()`
* `ArrayList(int initialCapaity)`
* `ArrayList(Collection c)`    

```java
ArrayList<String> obj1 = new ArrayList<>();       // first method
ArrayList<String> obj2 = new ArrayList<>(20);     // second method
ArrayList<String> obj3 = new ArrayList<>(obj1);   // third method
```

## How to convert an ArrayList to an array and vice versa
- We can convert an ArrayList to an array using the `toArray()` method
```java
List<Integer> numbers = new ArrayList<>();
Integer[] arr = new Integer[numbers.size()];
arr = numbers.toArray();
```

- To convert an array to an ArrayList we can use the `Arrays.asList()` method
```java
List myArrayList = Arrays.asList(arr);
```
- The asList() method also provides a convenient way to create a fixed-size list initialized to contain several elements:
```java
List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
```

## How to check if an ArrayList is empty
- `isEmpty()`
```java
obj.isEmpty();
```

## How to find the size and capacity of an ArrayList
- `size()`
```java
int num = obj.size();
```
- ArrayList API does not provide any built-in methods to return the ArrayList's capacity.

## How to replace an element at a particular index in ArrayList
- `set(index, elem)`
- It returns the element previously at that specified position

## How to append an element at the end of an ArrayList
- `add(elem)`
```java
a.add(“Hello”);
```

## How to insert an element at a particular position of an ArrayList
- `add(index, elem)`

## How to insert more than one element at a particular position of an ArrayList
- `addAll(Collection c)`
- `addAll(index, Collection c)`

## What happens if adding an element exceeds the ArrayList's capacity
- Once the capacity is reached, it is automatically increased using this formula:
```java
int newCapacity = (oldCapacity * 3) / 2 + 1;
```

## How to get the position of a particular element in an ArrayList
- `indexOf()` or `lastIndexOf()`
- returns index of first (or last) occurrence or -1 if element is not found.
```java
int pos = obj.indexOf(“Steve”);
```

## How to remove a given element from an ArrayList
- By using one of the overloaded `remove` method: 
- `remove(object elem)` // returns boolean
- `remove(int index)`   // returns the object

```java
a.remove(“Hello”);    // only removes the first occurrence of the element
a.remove(2);
```

## How to remove all elements from an ArrayList
- By using the `clear()` method or `removeAll​(Collection c)`

## How to find an element in an ArrayList
- `contains(elem)`
```java
obj.contains(“Steve”);
```

## How to retrieve an element from the ArrayList when its position is known
- `get(index)`
```java
String str = obj.get(2);
```

## How to retrieve a portion of an ArrayList
- `subList(int fromIndex, int toIndex)`
- Any changes made to the sublist will be reflected in the original array and vice versa.

## How to increase the current capacity of an ArrayList
- Capacity of an ArrayList is automatically increased when needed, but we can use `ensureCapacity()` to increase it manually.
```java
list.ensureCapacity(20); // list can now hold 20 items
```

## How to decrease the current capacity of an ArrayList to the current size
- `trimToSize()` can be used to trim the capacity of an ArrayList instance to be the list's current size. 
```java
list.trimToSize();
```

## How to join two ArrayLists
- `addAll(E)`
```java
list1.addAll(list2);
```

## How to iterate an ArrayList
- Using for-each loop
```java
for (String elem : obj) {
    System.out.println(obj);
}
```
- Using iterator or listIterator
```java
Iterator iter1 = countries.iterator();
while(iter1.hasNext()) {
    System.out.println(iter1.next());
}

Iterator iter2 = countries.listIterator();
while(iter2.hasNext()) {
    System.out.println(iter2.next());
}
```
- Can also use the usual for loop or while loop using the ArrayLists' size() method

## How to copy an ArrayList
- Shallow copy through built-in ArrayList constructor or `clone()` or `Collection.copy`
```java
List<Integer> newList = new ArrayList<>(oldList);
ArrayList<String> list2 = (ArrayList<String>)list1.clone();
Collections.copy(destlst, srclst);
```
- Deep copy using a for loop
