# Java learning notes

Contents

[Keywords](keywords)
[Variables](variables)
[Primitive types](primitives)
[Namespace](namespace)
[Strings](strings)
[Operators](operators)
[Classes](classes)
    - [Fields](classes-fields)
    - [Constructors](classes-constructors)
    - [Overloading](classes-overloading)
    - [Overriding](classes-overriding)
    - [Methods](classes-staticmethods)
    - [Variables](classes-staticvariables)
[Arrays](arrays)
[Interfaces](interfaces)


## Java keywords<a name="keywords"></a>

They are highlighted / bold
are case sensitive

There are [50+ keywords in Java](https://en.wikipedia.org/wiki/List_of_Java_keywords).

**public** - access modifier - optional for class
**class** - defines classes 

```
public class Hello {
    // class body
}
```


**static** - keyword for methods or fields that are tied to the class itself

**void** - method won't return any output

parameters in in defining a method are optional

## Variables<a name="variables"></a>

**int** - integer - whole number data type

initialization is optional, you can define a variable without adding a value for it

string literals cannot be changed... (dah.)

Java operators perform operations on values or variables


## Primitive types<a name="primitives"></a>

Java has 8 primitive types

boolean

**byte** - range is -128 to 127 - takes small memory space but not really used. it takes 8 bits - it has a width of 8

**short** - Range is -32768 to 32767 - takes 16 bits and has a width of 16

**int** - range of integer is -2million to + 2million - and occupies 32 bits -> int is a wrapper class for Integer

**long** - width of 64 (64 bits)

*Conclusion* Always user an int unless you have to use something else, as Java defaults for ints anyway and you'd have to use casting if you didn't want to.

**float** - has fractional and decimal points. it's a single precision number. format and size: single precision 32 bits, 

**double** - has double precision - occupies 64 bits

It's a good practice to declare floats like this:
```
float myVar = 5f;
``` 

Use double instead of float when possible. It's default anyway.
Actually double types are faster on most computers, as processors have been tweaked to calculate it more efficiently.

**char** - takes 16bit space as it allows for unicode characters. approx 65,000 characters

**boolean** - can only be set to true or false


## Namespace<a name="namespace"></a>

import Test from com.expedia.booking
```
com
    expedia
        booking
            Test.java


        namespace com.expedia.booking {

            class Test {

            }
        }

```
```
booking
    expedia
        com

```

## Strings<a name="strings"></a>

String is a class, not a data type
is a sequence of characters - that is technically max 2.14Billion character length.


Strings are immutable 

## Operators<a name="operators"></a>

`int myVar = 12 * 15` <--- this line is an expression

12 and 15 are operands.

[Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

[Operator presedence](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)


## Classes<a name="classes"></a>

**public** - unrestricted access to the class

**protected** - access within the package

**private** - no access


### Fields<a name="classes-fields"></a>

- class or member variables > fields
- usually private
- capsulation means that we hide the fields or methods from public access

### Constructors<a name="classes-constructors"></a>

You can set up a constructor by creating a public method on the class: 

```
public class MyClass {
    private String prop;

    public MyClass(String prop) {
        this.prop = prop;
    }
}
```

The fun thing is that you can also create multiple constructors. So a constructor can be set up if the object created does not recieve any props at instatiation, eg. you can use defaults:
```
public class MyClass {
    private String prop;

    public MyClass() {
        this.prop = "default";
    }
}
```

### Overloading<a name="classes-overloading"></a>

The 2 methods above is an example for **method overloading** - when you define multiple methods with the same name, but different parameters.

Developers usually refer to overloading as _Compile time polymorphism_. - even though it has nothing to do with it (?).
The compiler decides during runtime which method will be run.


Overloading usually happens in a single class, but can happen in the subclass as well.

Overloaded methods do:
    - have the same name
    - have different params
Overloaded methods may or may not:
    - have different return types
    - have different access modifiers
    - throw different exceptions

### Overriding<a name="classes-overriding"></a>

Redefining a method in a child-class. It is also known as **runtime polymorphsism** or **dynamic method dispatch** as the decision is made at runtime. 

`@Override` is an annotation that helps the IDE to highlight issues with the override.

Rules for overrides:
    - same name and same arguments as parent
    - return type can be subclass of parent's return type
    - can't have a lower access modifier than the parent's method
    - private methods can't be overridden
    - methods that are final or static cannot be overridden

### Static vs Instance methods<a name="classes-staticmethods"></a>

Methods defined with the `static` keyword are supposed to be used on the class as they are class-specific. In a static method, you don't have access to this. It can't use any fields directly (eg. this.field). Use it like this: `Math.random()`

Instance methods belong to an instance of the class. To enable the usage, you have to instantiate the object first in order to use an instance method. Use it like this: `myDog.bark()`


### Static vs Instance variables<a name="classes-staticvariables"></a>

Static fields of a class are shared within instances, based on the last instantiation. On contrary, instance variables have their own copy on each instance.


## Arrays and Array Lists<a name="arrays"></a>

Arrays store reference, so if you make a copy, it'll actually just store the reference to the original object.

List is an interface, array list inherits from list.

**ArrayList** is a resizable array.

Some methods for ArrayList
    - arrayList.get(index);
    - arrayList.set(index, value);
    - arrayList.indexOf(value);
    - arrayList.contains(value); // boolean
    - arrayList.remove(index);
    - arrayList.size() // -> instead of length


## Interfaces, abstracts and inner classes<a name="interfaces"></a>

Static nested class
NonStatic nested class or inner class

**Abstract classes** - define methods but don't implement methods. They can be used to share code between classes.

You can setup non static and non final fields, methods and getters/setters.

**Interface** - declaration of methods on a Class that have to be defined.

Interfaces can use default methods since Java 8. Since Java 9, you can also use private methods in interfaces (for example to share code between 2 default mehtods).

