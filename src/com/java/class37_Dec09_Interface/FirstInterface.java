package com.java.class37_Dec09_Interface;
/*

vocabulary:
implicitly - automatically, happens in the background
explicitly - when we have to do something manually
implements - either inheriting Interfaces OR writing a logic to a method

INTERFACE:
- cannot be instantiated
- cannot be marked final
- must be IMPLEMENTED
- cannot be private or protected

- WHY do we have Interfaces?
- Class can implement different Interfaces;
- Interfaces are needed to tell the subclasses WHAT they must do, but not HOW to do it!
- Interfaces are very similar to Abstract Classes
- Abstract Classes however can have characteristics(instance variables), BUT
  Interfaces - you only have behavior
- Abstract Class can have non-abstract methods - Interface - cannot
- when Interfaces inherit each other - they use the extends
- Interface - Interface relation - extends
- Interface - Class - implements
- Interface can not be a child of another class
 */
public interface FirstInterface {

 //static is the keyword that


    /*
    * we have to declare the method abstract explicitly
    * access modifier "public abstract" happen implicitly
     */

    void play();
}
