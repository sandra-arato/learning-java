# Java learning notes

## Java keywords

They are highlighted / bold
are case sensitive

**public** - access modifier - optional for class
**class** - defines classes 

```
public class Hello {
    // class body
}
```


**static** - keyword for... ?

**void** - method won't return any output

parameters in in defining a method are optional

## Variables

**int** - integer - whole number data type

initialization is optional, you can define a variable without adding a value for it

string literals cannot be changed... (dah.)

Java operators perform operations on values or variables


## Primitive types

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


## Namespace

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

## Strings

String is a class, not a data type
is a sequence of characters - that is technically max 2.14Billion character length.


Strings are immutable 

## Operators

`int myVar = 12 * 15` <--- this line is an expression

12 and 15 are operands.

[Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

[Operator presedence](http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)