# Exploring-Java-Design-Patterns
Implementing Design Patterns in Java

Typically, a factory is used to abstract out a new command.

The problem that new gives you is in unit testing. As soon as a piece of code uses new and creates some instance of a class, your unit test has just lost the ability to mock that class. So your test has to cover both the code actually under test, and the thing that has been newed up.

If you instead inject a factory, you can mock that factory. You can write a simpler collaboration test, that verifies that the factory was called, and returns a mock or stub with some simple, known and fixed method returns, so that the actual test can proceed.


Abstract Factory:
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
When to use:
System should be independent of how its products should be created, composed and represented.
System should be configured with one of multiple families of products.

Consequences of using Abstract Factory:

Isolates concrete classes.
Makes exchanging products families easily.
Promotes consistency among products.
Supporting new kind of products is difficult.

Factory Method:
Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses. This is also called as virtual constructor because it gives an illusion that construction of the object is polymorphic.

Singleton:
Ensure a class has single instance and provide a global point of access to it.
When the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code.
Why Enums are the best way to implement Singleton Design Pattern:
They prevent construction based attack i.e. You cannot create an object for an enum.
They will ensure thread safety and remove serialization problems.

Builder Pattern:
Helps to streamline or standardize object creation while allowing each step of creation to vary.

Prototype Pattern:
Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype.

Why Prototypal Pattern:
In languages like Java and C# , "new" is not polymorphic. This can be addressed by Prototypal inheritance.

