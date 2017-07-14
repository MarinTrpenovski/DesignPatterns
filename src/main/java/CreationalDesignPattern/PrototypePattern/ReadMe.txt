This design pattern is used when creating Object is cost operation, meaning require lot of time and resource to create one, while
user already have one. This pattern provide a mechanism to copy the original object to new object and then modify it according to
out needs. Prototype design uses java cloning to copy the object.

Implementation of this design pattern is as follow. If we load object from database, in this example that is Employee, and we
 need to modify this object multiple times its not good idea to create the object using new keyword and load all the data again
 from database. The better approach is to clone existing object in new object and then do manipulation on that object.
 Prototype design pattern require the Object that we are copying to provide copying feature. This we can achieve by implementing
 the Cloneable interface which require to override the clone method. In this method we return new Object (Employee) and in contructor
 we pass cloned list. So after this method execution we can modify this temp Object and keep the original object unmodified.