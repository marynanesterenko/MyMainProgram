package com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava;
/*
Q: Will this code compile? If yes, what would be the output?
A: No, the code won't compile. ERROR.
   (java: method sum(int,int) is already defined in class com.java.class45_Dec23_REVISION_CORE_JAVA.TrickyQuestionsCoreJava.Question19_MethodOverloading)
 */
public class Question19_MethodOverloading {
    /*
    Our program has duplicate methods, and the only way to fix that is to either change the number of the parameters or their type
     */

//    public void sum(int a, int b) {
//        System.out.println(a + b);
//    }

//    public int sum(int a, int b) {
//        return a + b;
//    }

    public static void main(String[] args){
        /*
        we are missing the "new" keyword here, so the Object won't get created
         */
        //Question19_MethodOverloading obj = Question19_MethodOverloading();

        /*
        here Java will get confused, which method to call, we cannot have two methods with the same name, unless their signature is different
         */
        //obj.sum(10, 20);

        //System.out.println(obj.sum(10, 20));
    }
}
