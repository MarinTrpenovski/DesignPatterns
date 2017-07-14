In Abstract factory design pattern, if/else block for creating new object is avoid. This pattern provide a encapsulation
of individual factories that have common theme without specifying their concrete classes.
In this pattern user create abstract super class (Employee) and interface (EmployeeAbstractFactory) for that class with one method
which return (create) new object from abstract class. For each sub-class(Developer, Tester) that extend super class(Employee) we create factory class which implement the interface for creating
class(TesterFactory, DeveloperFactory) that create new object . In different sub-classes, method from interface return (create)
different object from sub-classes. Finally we create factory (EmployeeFactory) class for abstract class (Employee) that have one method
for creating new object, this method as input parameter take instance of interface(EmployeeAbstractFactory) and return
object from super class (Employee).

Abstract factory design pattern benefits :
    1. Provide approach to code interface rather than implementation
    2. This approach is factory of factories and can easily be extended to accommodate more products, for example can be
    added sub-class Manager and ManagerFactory
    3. This pattern is robust and avoid conditional logic from factory pattern is avoid.

