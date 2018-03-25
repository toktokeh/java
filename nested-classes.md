## What is a nested class
- A class defined within another class
- They are useful for increasing encapsulation

## Benefits of using nested classes
- It is a way of logically grouping classes that are only used in one place
- It increases encapsulation
- It can lead to more readable and maintainable code

## What are the different types of nested classes
- static and non-static (also called inner classes)
- Static nested classes do not have access to the outer class' members (unless that is also static)
- Inner classes on the other hand have full access to the members of the outer class (including private)

## Creating an object of a static nested class
```java
OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
```

## Creating an object of an inner class
```java
OuterClass outerObject = new OuterClass();
OuterClass.InnerClass innerObject = outerObject.new InnerClass();
```
- In other words, we first need to instantiate the outer class, then create the inner object within the outer object

## What are the two special kinds of inner classes
- local classes and anonymous classes
- local classes are declared within a method and can be instantiated only within that method.

```java
public class Outerclass {
   void my_Method() {
        class MethodInner_Demo {
            //...
        }
       
        MethodInner_Demo inner = new MethodInner_Demo();
        //...
   }
}
```

- anonymous classes don't have a class name so they are declared and instantiated at the same time
```java
public class OuterClass {
    public static void main(String args[]) {
        AnonymousInner inner = new AnonymousInner() {
            public void myMethod() {
                //...
            }
        }
    }
}
```
