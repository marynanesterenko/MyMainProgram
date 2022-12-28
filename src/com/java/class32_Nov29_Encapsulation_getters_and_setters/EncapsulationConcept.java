package com.java.class32_Nov29_encapsulation_getters_setters;

public class EncapsulationConcept {
    /*
    1. One of the basic goals of OOP is to hide the implementation details of the Class inside the Class,
       while carefully controlling what aspects of the class are exposed to the outside world -
       - this is referred to as "encapsulation".

        Per Roma-mentor: when it comes to "encapsulation", remember two words - "hide Data".

    2. As a general rule - we want to hide as many details about the Class implementation from the outside world,
       as we possibly can.

    3. One way to hide those details is to NOT to create public variables (often referred to as "fields"), and instead -
       make them private. Then we can selectively grant access to the Data, contained in those variables,
       by adding special methods to our Class - called accessors.

    4. There are two types of accessors: get accessor and set accessor. What does each of then do?
       - get accessor(aka getter): is a method that retrieves the variable value (i.e. .getTestId(); .getIPhoneModel(); .getColor();)
       - set accessor(aka setter): is a method that sets the variable value (i.e. setTestId(); .setIPhoneModel(); set.Color();)

        Per Roma-mentor: try to avoid saying "setters and getters" at the interview, as it doesn't sound professional.

    5. In other words, lets imagine we test the Web-App for Patient First Urgent Care. We have a Class "Patient". And each
       Patient's record/ Account is an Object. Their diagnosis and prescription are the classified as Protected Health Information(PHI) Data.
       Therefore, consider the following example:
     */
}

class Patient {
    /*
    1. diagnosis and prescription are "private" Class variables and cannot be accessed by anyone directly
    2. The values that diagnosis and prescription variables hold are sensitive information, and cannot be "public"
     */

    private String diagnosis;
    private String prescription;

    // so the safe way to access this Data - is by using the accessors - get and set, they are public
    public String getDiagnosis() {
        return diagnosis;
    }

    public String setDiagnosis(String d) {
        return d;
    }

    public String getPrescription() {
        return prescription;
    }

    public String setPrescription(String p) {
        return p;
    }
}

    /*
    What are the BENEFITS of creating Classes with accessors rather than simple public variables?

     >> we can create a read-only properties by providing a get accessor, but not a set accessor,
        which will allow other Classes to retrieve the property value, but not change it;

     >> what we also can do, is instead of actually storing the Class property value in the private variable,
        we can put it in return statement in the accessor method block of code, abd calculate it,
        when the get accessor method is called.

    */


























