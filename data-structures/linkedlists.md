* [What is a LinkedList?](#what-is-a-linkedlist)
* [Comparison of methods in ArrayList and LinkedList](#comparison-of-methods-in-arraylist-and-linkedlist)
* [Is it possible to have elements of different types in the same LinkedList](#is-it-possible-to-have-elements-of-different-types-in-the-same-linkedlist)
* [What are some ways of creating a LinkedList](#what-are-some-ways-of-creating-a-linkedlist)
* [How to convert a LinkedList to an array and vice versa](#how-to-convert-a-linkedlist-to-an-array-and-vice-versa)
* [How to check if a LinkedList is empty](#how-to-check-if-a-linkedlist-is-empty)
* [How to find the size of a LinkedList](#how-to-find-the-size-of-a-linkedlist)
* [How to replace an element at a particular index in LinkedList](#how-to-replace-an-element-at-a-particular-index-in-linkedlist)
* [How to append an element at the end of a LinkedList](#how-to-append-an-element-at-the-end-of-a-linkedlist)
* [How to insert an element at a particular position of a LinkedList](#how-to-insert-an-element-at-a-particular-position-of-a-linkedlist)
* [How to insert more than one element at a particular position of a LinkedList](#how-to-insert-more-than-one-element-at-a-particular-position-of-a-linkedlist)
* [How to get the position of a particular element in a LinkedList](#how-to-get-the-position-of-a-particular-element-in-a-linkedlist)
* [How to remove a given element from a LinkedList](#how-to-remove-a-given-element-from-a-linkedlist)
* [How to remove all elements from a LinkedList](#how-to-remove-all-elements-from-a-linkedlist)
* [How to find an element in a LinkedList](#how-to-find-an-element-in-a-linkedlist)
* [How to retrieve an element from the LinkedList when its position is known](#how-to-retrieve-an-element-from-the-linkedlist-when-its-position-is-known)
* [How to retrieve a portion of a LinkedList](#how-to-retrieve-a-portion-of-a-linkedlist)
* [How to join two LinkedLists](#how-to-join-two-linkedlists)
* [How to iterate a LinkedList](#how-to-iterate-a-linkedlist)
* [How to copy a LinkedList](#how-to-copy-a-linkedlist)

## What is a LinkedList?
- Doubly-linked list implementation of the List and Deque interfaces. 
- LinkedList class extends AbstractList class which implements List interface. The List interface extends Collection and Iterable interfaces.
- Permits all elements, including null.
- Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index.

## Comparison of methods in ArrayList and LinkedList

| Method | ArrayList | LinkedList | Description |
|:---|:---:|:---:|:---|
|**add**​(int index, E element)| ✔ | ✔ | Inserts the specified element at the specified position in this list. |
|**add​**(E e) | ✔ | ✔ | Appends the specified element to the end of this list.
|**addAll​**(int index, Collection c) | ✔ | ✔ | Inserts all of the elements in the specified collection into this list, starting at the specified position.
|**addAll​**(Collection c) | ✔ | ✔ | Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
|**clear**() | ✔ | ✔ | Removes all of the elements from this list.
|**clone**() | ✔ | ✔ | Returns a shallow copy of this list.
|**contains**​(Object o) | ✔ | ✔ | Returns true if this list contains the specified element.
|**forEach​**(Consumer action) | ✔ | ✔ | Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
|**get​**(int index) | ✔ | ✔ | Returns the element at the specified position in this list.
|**isEmpty**() | ✔ | ✔ | Returns true if this list contains no elements.
|**indexOf​**(Object o) | ✔ | ✔ | Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
|**lastIndexOf​**(Object o) | ✔ | ✔ | Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
|**listIterator​**(int index) | ✔ | ✔ | Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.
|**remove​**(int index) | ✔ | ✔ | Removes the element at the specified position in this list.
|**remove​**(Object o) | ✔ | ✔ | Removes the first occurrence of the specified element from this list, if it is present.
|**removeAll​**(Collection c) | ✔ | ✔ | Removes from this list all of its elements that are contained in the specified collection.
|**removeIf​**(Predicate filter) | ✔ | ✔ | Removes all of the elements of this collection that satisfy the given predicate.
|**removeRange​**(int fromIndex, int toIndex) | ✔ | ✔ | Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
|**retainAll​**(Collection c) | ✔ | ✔ | Retains only the elements in this list that are contained in the specified collection.
|**set​**(int index, E element) | ✔ | ✔ | Replaces the element at the specified position in this list with the specified element.
|**size**() | ✔ | ✔ | Returns the number of elements in this list.
|**spliterator**() | ✔ | ✔ | Creates a late-binding and fail-fast Spliterator over the elements in this list.
|**toArray**() | ✔ | ✔ | Returns an array containing all of the elements in this list in proper sequence (from first to last element).
|**toArray​**(T[] a) | ✔ | ✔ | Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
|**addFirst​**(E e) |  | ✔ | Inserts the specified element at the beginning of this list.
|**addLast​**(E e) |  | ✔ | Appends the specified element to the end of this list.
|**descendingIterator**() |  | ✔ | Returns an iterator over the elements in this deque in reverse sequential order.
|**element**() |  | ✔ | Retrieves, but does not remove, the head (first element) of this list.
|**getFirst**() |  | ✔ | Returns the first element in this list.
|**getLast**() |  | ✔ | Returns the last element in this list.
|**offer​**(E e) |  | ✔ | Adds the specified element as the tail (last element) of this list.
|**offerFirst​**(E e) |  | ✔ | Inserts the specified element at the front of this list.
|**offerLast​**(E e) |  | ✔ | Inserts the specified element at the end of this list.
|**peek**() |  | ✔ | Retrieves, but does not remove, the head (first element) of this list.
|**peekFirst**() |  | ✔ | Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
|**peekLast**() |  | ✔ | Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
|**poll**() |  | ✔ | Retrieves and removes the head (first element) of this list.
|**pollFirst**() |  | ✔ | Retrieves and removes the first element of this list, or returns null if this list is empty.
|**pollLast**() |  | ✔ | Retrieves and removes the last element of this list, or returns null if this list is empty.
|**pop**() |  | ✔ | Pops an element from the stack represented by this list.
|**push​**(E e) |  | ✔ | Pushes an element onto the stack represented by this list.
|**remove**() |  | ✔ | Retrieves and removes the head (first element) of this list.
|**removeFirst**() |  | ✔ | Removes and returns the first element from this list.
|**removeFirstOccurrence​**(Object o) |  | ✔ | Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
|**removeLast**() |  | ✔ | Removes and returns the last element from this list.
|**removeLastOccurrence​**(Object o) |  | ✔ | Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
|**ensureCapacity​**(int minCapacity) | ✔ |  | Increases the capacity of the ArrayList instance
|**trimToSize**() | ✔ |  | Trims the capacity of this ArrayList instance to be the list's current size.

## Is it possible to have elements of different types in the same LinkedList
- Yes, as long as we don't declare the list to be of a particular type. 
- For example the following is valid:
```java
List myList = new LinkedList<>();
myList.add(5);      // autoboxed to an Integer object
myList.add("5");    // autoboxed to a String object
```

## What are some ways of creating a LinkedList
- By using one of the two overloaded constructors:
* `LinkedList()`
* `LinkedList(Collection c)`    

```java
LinkedList<String> obj1 = new LinkedList<>();       // first method
LinkedList<String> obj2 = new LinkedList<>(obj1);   // second method
```

## How to convert a LinkedList to an array and vice versa
- We can convert a LinkedList to an array using the `toArray()` method
```java
List<Integer> numbers = new LinkedList<>();
Integer[] arr = new Integer[numbers.size()];
arr = numbers.toArray();
```

- To convert an array to a LinkedList we can use the `Arrays.asList()` method
```java
List myLinkedList = new LinkedList(Arrays.asList(arr));
```

## How to check if a LinkedList is empty
- `isEmpty()`
```java
obj.isEmpty();
```

## How to find the size of a LinkedList
- `size()`
```java
int num = obj.size();
```

## How to replace an element at a particular index in LinkedList
- `set(index, elem)`
- It returns the element previously at that specified position

## How to append an element at the end of a LinkedList
- `add(elem)`
```java
a.add(“Hello”);
```

## How to insert an element at a particular position of a LinkedList
- `add(index, elem)`

## How to insert more than one element at a particular position of a LinkedList
- `addAll(Collection c)`
- `addAll(index, Collection c)`

## How to get the position of a particular element in a LinkedList
- `indexOf()` or `lastIndexOf()`
- returns index of first (or last) occurrence or -1 if element is not found.
```java
int pos = obj.indexOf(“Steve”);
```

## How to remove a given element from a LinkedList
- By using one of the overloaded `remove` method: 
- `remove(object elem)` // returns boolean
- `remove(int index)`   // returns the object

```java
a.remove(“Hello”);    // only removes the first occurrence of the element
a.remove(2);
```

## How to remove all elements from a LinkedList
- By using the `clear()` method or `removeAll​(Collection c)`

## How to find an element in a LinkedList
- `contains(elem)`
```java
obj.contains(“Steve”);
```

## How to retrieve an element from the LinkedList when its position is known
- `get(index)`
```java
String str = obj.get(2);
```

## How to retrieve a portion of a LinkedList
- `subList(int fromIndex, int toIndex)`
- Any changes made to the sublist will be reflected in the original array and vice versa.

## How to join two LinkedLists
- `addAll(E)`
```java
list1.addAll(list2);
```

## How to iterate a LinkedList
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
- Can also use the usual for loop or while loop using the LinkedLists' size() method

## How to copy a LinkedList
- Shallow copy through built-in LinkedList constructor or `clone()` or `Collection.copy`
```java
List<Integer> newList = new LinkedList<>(oldList);
LinkedList<String> list2 = (LinkedList<String>)list1.clone();
Collections.copy(destlst, srclst);
```
- Deep copy using a for loop
