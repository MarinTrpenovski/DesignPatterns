Builder design pattern was introduce to solve some of the problems with Factory and Abstract Factory design pattern
when object contain lot of attributes.

There are three major issues with Factory pattern when object contain lot of attributes :
    1. Too many arguments to pass from client program to Factory class that can be error phone because most of the time
    the type of arguments are same and from client side it's hard to maintain.
    2. Some of the parameters might be optional but in Factory we are focused to send all the parameters and optional
    parameters are send as null.
    3. If the object is heavy and its creation is complex, then all the complexity will be part of Factory classes.

This issue can be solve if we create constructor with large number of required parameters and setter methods for optional
parameters. The problem with this approach is that state of Object will be inconsistent unless all attributes are set
explicitly. Builder pattern solve the issue with large number of optional parameters and inconsistent state by providing a way
to build the object step-by-step and provide a method that will return final Object.

Implementation of Builder pattern :
    1. We create a static nested class (PersonBuilder) and copy all the argument from outer class (Person) to the Builder class. In our example Person
    is the class and PersonBuilder is static nested class.
    2. Java Builder(PersonBuilder) static nested class should have public constructor with all required attributes as parameters.
    So when user instantiate object (Person) he can't access to contructor in outer class, he access to public constructor in
    inner class where he set all the required parameters and additionally can set other optional parameters according to the
    need of user.
    3. Java Builder (PersonBuilder ) should have methods to set the optional parameters and should return the same Builder object
    after setting the optional attribute.
    4. In static inner class(PersonBuilder) should create build method which will return the Object needed by client Program. For this
    we need private constructor in Person class that will be access only from inner class, prevent this class to be instantiate from
    outer classes.