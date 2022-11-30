/*
Class notes:
- one Class can inherit properties(variables) and behaviors (methods) from another class
- the Class being inherited called the Parent Class or Base Class or Super Class
- the Class that is inheriting called the Child Class
- oldest to youngest, Parent -> Child
- we can call methods of the Class using Object,
  but it makes sense if our Class variables are initialized
- there are three types of inheritance: multilevel, single, multiple inheritance (not allowed in Java)
 */

/*
My notes:
- Inheritance is an object-oriented programming technique, which allows you to use one class as a basis for another;
- the existing class is called the base class, super class or parent class;
- the new class that is derived from it, is called the derived class, subclass or child class;
- when we create the subclass, it is automatically given all the visible (public or protected)methods and fields of its superclass;


Important things about inheritance:
1. A derived class automatically takes on all the behavior and attributes of it's base class.
2. A derived class can add features to the base class by defining it's own methods and fields,
   in this way derived class distinguishes itself from the base class.
3. A derived class can change the behavior, provided by the base class.
4. Constructors are not considered to be members of the Class, and therefore subclass cannot inherit constructors
   from the base class.
5. Subclass cannot inherit members that are not visible - private.
6. We can override the method by declaring a new member with the same signature in the subclass.
7. A special type of visibility called "protected" hides fields and methods from classes outside the current package,
   but makes them available to the subclasses and other classes within the same package.
8. Method overriding - technique that lets you modify the behavior of the behavior of the base class,
   to suit the needs of the subclass.
9. The overridden method cannot reduce the visibility of the method it overrides
10.When we create an instance of the subclass, java automatically calls the default constructor of the base class,
   before it executes the subclass constructor





 */
