# Showcasing the visitor pattern 

This sample project shows how to use the visitor pattern.

Given an interface IShape, and concrete IShapes Rectangle, Circle,
and Triangle, we show how to calculate the area's of each shape without
modifying the interface to add an area() function. This is possible
because the the designer of the IShape interface defined an accept 
function that takes a IShapeVisitor, which can be thought of as 
encapsulating a generic computation of an IShape property.

The AreaVisitor is a concrete implementation of a IShapeVisitor, that
takes as input an IShape and returns its area. 

## Running the code

Clone this repository, and do

```
mvn compile && mvn exec:java -Dexec.mainClass="com.schitti.projects.Main"
```

Note: You must have maven installed on your system.
