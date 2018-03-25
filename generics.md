## What are generics
- Generic programming means writing code that can be reused for objects of many types.
- Generics enable you to detect errors at compile time rather than at runtime. A generic class or method permits you to specify allowable types of objects that the class or method can work with. If you attempt to use an incompatible object, the compiler will detect that error.
- Generics only work with reference types, not primitive types.

## Generic instantiation
- In javadocs, a single letter <E> or <T> called a type parameter, is used to denote a formal generic type which can be replaced later with an actual concrete type. This process is called generic instantiation.
```java
public interface Comparable<T> {
    public int compareTo(T o)
}
```

Usage:
```java
Comparable<Date> c = new Date();
System.out.println(c.compareTo("red"));     // this generates error at compile time since the argument passed to compareTo must be of the Date type
```

## Difference between generics in Java and templates in C++


