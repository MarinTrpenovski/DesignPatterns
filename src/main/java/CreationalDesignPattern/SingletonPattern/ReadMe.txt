
- It's creational design pattern.
- Singleton pattern restrict instantiation of a class and allow only one instance of class to exist on JVM.
- Singleton class provide global access point to get instance of the class
- Common concepts of Singleton design pattern :
    1. Private constructor to restrict instantiation of the class from other classes.
    2. Private static variable of same class that is only instance of the class.
    3. Public static method that returns the instance of the class which is private variable(step 2) and is used by outer
       world to access to get access to singleton class.


Some of the approaches of Singleton pattern are :
    1. Eager Initialization
        - instance of singleton class is created at the time when class is loaded. Disadvantage of this approache is that
         instance will be created even client might not use it.
    2. Static block initialization
        - This implementation is similar to Eager initialization except that instance of the class is created in static block
         so there is opportunity for exception handling.
    3. Lazy initialization
        - create implementation in global access method which if instance is null, not created, create new one and return it.
          This implementation works ok but has some problem in multithreaded systems. For example if multliple threads are inside
          the if loop at the same time, it will destroy the singleton pattern and both threads will get diffrent instance of the class.
    4. Thread safe singleton
        - To avoid disadvantage about thread safety from Lazy intialization there si other pattern Thread Safe singleton . In this pattern
        method which is global access to the Singleton is synchronized. Using "synchronized" keyword lead to reducing the performance of the system
        because of the cost associated with the synchronized method. To avoid this issue with performance double check locking principle is used,
        synchronization is done inside the if condition.
    5. Bill Pugh Singleton
        - This approach resolve issues in multithreaded systems where many thread try to get instance of Singleton class simultaneously.
         In this approach for creating Singleton class is used inner private static helper class which contain the instance of Singleton class.
         This class is not loaded in memory on start up, when someone calls getInstance method then is created instance of Singleton class.

    6. Enum Singleton
        - Reflection can be used to destroy Singleton design pattern. To avoid this issue Enum design pattern can be used. Enum value is
          is instantiate only once in Java program. Java Enum values are globally accessible so its singleton. Disadvantage in this
          approach is that doesn't provide flexibility, for example can't use lazy instantiation.

    7. Serialization and Singleton
        - This combination is used in distributed system, where Serilization interface is implemented in Singleton class
        so state of the singleton can be stored in file system and later can be retrieve.

