## Guides:
### - [Java 101](./README.md) (You are here)
### - [Data structures](./data-structures/README.md)

# Java 101

## Java is statically-typed. What does this mean?
- It means that all variables must first be declared before they can be used. This involves stating the variable's type and name.


## Primitive data types
- A primitive type is predefined by the language and is named by a reserved keyword. Java supports eight primitive data types: boolean, char, byte, short, int, long, float, double

### boolean:
- true or false

### char:      
- 16-bit Unicode character set which includes 7-bit ASCII
- Quoted in single quotes (‘)
- A Unicode character can always be specified as a four-digit hexadecimal number with the prefix \u (e.g. `\u0041` for `A`)

### byte / short / int / long:        
- Integer data type can comprise one of the following primitive data types: int (default), byte, short, and long
- **Byte** is 8 bits (range from - 2<sup>7</sup> to 2<sup>7</sup>-1). There is no direct way to specify a byte literal.
- **Short** is 16 bits (range from -2<sup>15</sup> to 2<sup>15</sup>-1). There is no direct way to specify a short literal.
- **Int** is 32 bits (range from -2<sup>31</sup> to 2<sup>31</sup>-1).
- **Long** is 64 bits (range from -2<sup>63</sup> to 2<sup>63</sup>-1). An integer value can be specified as long by appending the suffix L or l to the integer value.
- In additional to decimal, can also be represented in ***binary***, ***octal***, or ***hexadecimal*** by prefixing 0b (or 0B), 0, and 0x (or 0X): e.g. 0b11011, 0132, 0x4a

### float / double:
- A floating point data type comes in two flavors: float (32 bits) and double (64 bits).
- Double is default but can also be explicitly specified by appending a D (or d) to the value.
- Similarly float can be specified by appending F (or f). If we want a float, this is mandatory.
- Precision of float is 6-7 significant decimal digits and for double 15.


## Variables
- There are three types of variables: instance, static, and local.

### 1. Instance variables:
- Members of a class which are created for each object of that class, i.e. every object of the class will have its own copies of these variables.

### 2. Static variables:
- Members of a class but are not created for any objects and therefore belong only to the class.

### 3. Local variables:
- Declared in methods, constructors, and blocks.

### Default values:
- Instance and static variables are given default values when declared but not initialized. Defaults are: boolean: false, char: ‘\u0000’ or Null character, integer: 0 or 0L, and float: 0.0F or 0.0D.
- Local variables are not automatically initialized


## Comments
Single line:        `// ...`

Multiple line:      `/*  … */`

Javadoc:            `/** … */`


## Literals
- Literals are representations of fixed values that can be assigned to a primitive data type without the need for the "new" keyword.
```java
boolean result = true;
char capitalC = 'C';
byte b = 100;
int i = 100000;
```


## Operators
### Bitwise and Bit Shift Operators
```
~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive O
```
- `^` is exclusive or. `a ^ b` returns true when a and b have different value.


## BigDecimal for currency
- Float and double should not be used for financial calculations because some fractions such as 1/10 or 1/3 have no accurate binary representation. For example System.out.println(2.0 - 1.1) prints 0.8999999.


## Data type wrapper classes

### Autoboxing and unboxing

### Character:
static methods:
- getNumericValue(char ch)
- isLowerCase(char ch)
- isUpperCase(char ch)
- isDigit(char ch)
- isLetter(char ch)
- isLetterOrDigit(char ch)
- toUpperCase(char ch)
- toLowerCase(char ch)
```java
char ch = 'a';
if (Character.isLowerCase(ch)) {
    ch = Character.toUpperCase(ch);
}
```

## [Arrays](./arrays.md)

## [String](./strings.md) - [***Exercises***](./exercises/strings.md)

## [StringBuilder and StringBuffer](./stringbuilder.md)


## Methods
### Naming
By convention, method names should be a verb in lowercase or a multi-word name that begins with a verb in lowercase, followed by adjectives, nouns, etc. In multi-word names, the first letter of each of the second and following words should be capitalized. Here are some examples:

run
runFast
getBackground
getFinalData
compareTo
setX
isEmpty

### Arbitrary Number of Arguments (varargs)
- You can use a construct called varargs to pass an arbitrary number of values to a method. You use varargs when you don't know how many of a particular type of argument will be passed to the method
- To use varargs, you follow the type of the last parameter by an ellipsis (three dots, ...), then a space, and the parameter name


## Classes
- A class is an encapsulation of data and methods that operate on that data

### Declaration
class declarations can include these components, in order:

1. Modifiers such as ***public***, ***private***, and a number of others that you will encounter later.
2. The class name, with the initial letter capitalized by convention.
3. The name of the class's parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
4. A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
5. The class body, surrounded by braces, {}.

```java
class MyClass extends MySuperClass implements YourInterface {
    // field, constructor, and
    // method declarations
}
```


## Scope and access modifiers
- Static
- final


## Constructors

## Object-oriented programming
- Three pillars of OOP: Encapsulation, Inheritance, and Polymorphism

## Encapsulation


## Inheritance (IS - A)
When one class inherits from another, the subclass inherits from the superclass. An inheritance relationship means that the subclass inherits the members (the instance variables and methods) of the superclass.

### Multiple inheritance


### Composition vs. inheritance


## Polymorphism
- From Greek, meaning many forms
- In Java, the type of an object that is referenced by a superclass variable is determined at runtime instead of at compile time.
```java
Animal myDog = new Dog();

Animal[] animals = new Animal[5];
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();
for (int i = 0; i < animals.length; i++) {
    animals[i].eat();
    animals[i].roam();
}
```

### Late binding (dynamic binding) ***vs.*** early binding (static binding)
- The process of matching a method call with the correct method definition is known as binding. 
- Connecting a method call to a method body is called binding. 
- When binding is performed before the program is run (by the compiler and linker, if there is one), it’s called early binding. You might not have heard the term before because it has never been an option with procedural languages. C compilers have only one kind of method call, and that’s early binding.
- Java performs dynamic binding or late binding when a variable contains a polymorphic reference. This means that the Java Virtual Machine determines at runtime which method to call, depending on the type of object that the variable references. So, it is the object’s type that determines which method is called, not the variable’s type.
- All method binding in Java uses late binding unless the method is static or final (private methods are implicitly final).

### Upcasting vs. Downcasting
- Taking an object reference and treating it as a reference to its base type is called upcasting because of the way inheritance trees are drawn with the base class at the top. 
- Upcasting is always safe because you’re going from a more specific type to a more general type.
- For example, if the BaseBall class extends the Ball class, for example, a BaseBall object
can be treated as though it were a Ball object. `Ball b = new BaseBall();`
- When casting an instance of a superclass to a variable of its subclass (known as downcasting), explicit. casting must be used to confirm your intention to the compiler with the (SubclassName)
cast notation.
```java
Shape myShape = new Circle();       // upcasting
(Circle)myShape.getDiameter();      // downcasting, because the Shape class does not have the getDiameter method but circle does.
```
- You can use the instanceof operator to test whether or not downcasting is sensible.


## Method Overriding
Means that a subclass redefines one of its inherited methods when it needs to change or extend the behavior of that method.


## Method overloading
- Methods within a class can have the same name if they have different parameter lists.
- The compiler does not consider return type when differentiating methods, so you cannot declare two methods with the same signature even if they have a different return type.

```java
public class DataArtist {
    ...
    public void draw(String s) {
        ...
    }
    public void draw(int i) {
        ...
    }
    public void draw(double f) {
        ...
    }
    public void draw(int i, double f) {
        ...
    }
}
```


## Interfaces


## [Nested classes](./nested-classes.md)


## Abstract classes
### Abstract classes vs. interfaces


## [Generics](./generics.md)


## Exceptions


## Lambda expressions


## Stream interface
- A stream is not a data structure. It is a sequence of elements of any data type that can be processes sequentially or in parallel.
- Streams rely on the use of lambda expressions to pass the operations that are performed on stream elements.
- Streams don't change the original data structure, they only provide the result as per pipelined methods.
- There are two types of stream operations: intermediate operations (map, filter, distinct, sorted) that can be chained and terminal operations (collect, forEach, reduce, count, sum, max) that return the result:

### map
- To map the items in the collection to other objects
```java
List number = Arrays.asList(2,3,4,5);
List square = number.stream()
    .map(x -> x * x)
    .collect(Collectors.toList());
```

### filter
- To select elements
- Its argument, called a ***predicate***, is a function that returns a boolean value. The function is called once for every element in the stream.
```java
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream()
    .filter(s -> s.startsWith("S"))
    .collect(Collectors.toList());
```

### distinct
- Removes duplicates

### sorted
- To sort elements
```java
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream()
    .sorted()
    .collect(Collectors.toList());
```

### collect
- To return the result of operations performed on the stream
```java
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream()
    .map(x -> x * x)
    .collect(Collectors.toSet());
```

### forEach
- To iterate over every element
```java
List number = Arrays.asList(2,3,4,5);
number.stream()
    .map(x -> x * x)
    .forEach(y -> System.out.println(y));
```
```java
list.forEach(System.out::print);
```

### reduce
- To reduce the elements to a single value

```java
List number = Arrays.asList(2,3,4,5);
int even = number.stream()
    .filter(x -> x % 2 == 0)
    .reduce(0, (ans, i) -> ans + i);
```

```java
    int sum = numbers.stream().reduce(0, (x,y) -> x+y);
```
or:
```java
    int sum = numbers.stream().reduce(0, Integer::sum);
```

### count
- Counts number of elements in the stream

### average / sum
- Returns average or sum. Result type id double for DoubleStream, int for IntStream, and long for LongStream

## IntStream
```java
IntStream.of(1, 2).filter(x -> x % 2 == 0).sum();
IntStream a = IntStream.empty(); // []
IntStream b = IntStream.range(1, 5); // [1, 2, 3, 4]
IntStream c = IntStream.rangeClosed(5, 10); // [1, 2, 3, 4, 5]
IntStream d = IntStream.of(1); // [1]
IntStream e = IntStream.of(1, 2, 3, 4, 5); // [1, 2, 3, 4, 5]
IntStream f = IntStream.concat(b, c); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
IntStream g = IntStream.generate(() -> new Random().nextInt(100)).limit(5);
IntStream i = IntStream.iterate(0, x -> x + 1).limit(5); // [0, 1, 2, 3, 4]
IntStream j = IntStream.builder().add(1).add(2).add(3).build(); // [1, 2, 3]
IntStream intStream= IntStream.of(1,2,3,4,5,6,7);
System.out.println(intStream.min().getAsInt());
intStream= IntStream.of(1,2,3,4,5,6,7);
System.out.println(intStream.max().getAsInt());
intStream= IntStream.of(1,2,3,4,5,6,7);
System.out.println(intStream.average().getAsDouble());
intStream= IntStream.of(1,2,3,4,5,6,7);
System.out.println(intStream.sum());
IntStream intStream = IntStream.rangeClosed(1, 10);
IntStream.range(1, 5).map(x -> x * x - 1).forEach(x -> System.out.println(x));
```


## Packages
- A package is a namespace that organizes a set of related classes and interfaces. 


## Input/output


## File I/O


## Annotations
- Annotations, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate.

### Usage of annotations
- Information for the compiler — Annotations can be used by the compiler to detect errors or suppress warnings.
- Compile-time and deployment-time processing — Software tools can process annotation information to generate code, XML files, and so forth.
- Runtime processing — Some annotations are available to be examined at runtime.


## Reflections


## Concurrency and threads


## RegEx


## Debugging and unit testing
- JUnit and IntelliJ: put cursor on the line containing our public class. press Alt + enter then Create Test


## Databases


## Networking


## UML


## JVM


## Codepoint

## Java versions
### Features introduced in Java 8
### Features introduced in Java 9
### Features introduced in Java 10








