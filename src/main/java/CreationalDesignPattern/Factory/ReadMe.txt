Factory method is one of creational design pattern. It's used to construct object such that they
can be decoupled from implementing system.
The idea of factory pattern is that client doesn't know what concrete classes it will be required to create
at runtime, client only want to get the class which will do the job. Factory method is builds on the concept of
simple Factory, but lets the subclasses decide which implementation of concrete class to use. Factory design pattern
is used when we have a super class with multiple sub-classes. This pattern is also responsible for instantiation of a class
from client program to factory class.

Some important notes about factory design pattern :
    1. Factory class (in this case Vehicle factory) is singleton with static method that return on of the sub-classes
    2. getVehicle method in Vehicle factory class is static which create and return on of the sub-classes so client isn't
    aware about the implementation he only requested vehicle and get it.
    3. Vehicle is the abstract super class, each vehicle(BMW, Mercedes) will inherit this class.

Advantage of this pattern are :
    1. Factory design pattern provides approach to code for interface rather than implementation.
    2. In factory design pattern removes instantiation of actual implementation classes from client code. This pattern makes
     code robust, less coupled and easy to extend. In this example, we can change BMW or Mercedes class implementation without to
     make some errors in code because client program isn't aware of this.
    3. Factory pattern provides abstraction between implementation and client classes through inheritance.


