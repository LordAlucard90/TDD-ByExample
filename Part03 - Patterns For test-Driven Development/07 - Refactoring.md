# Refactoring

Change a system radically with small steps.

In TDD tests help to ensure that the system's behavior is not changing.

---

## Reconcile Differences

When there are two part of code similar, for example:

  - loop structure
  - branches in a conditional
  - methods
  - classes

it is possible to slowly make them equal in order to eliminate one of them
completely removing in this way duplication.

---

## Isolate Change

When there is some change to do in the code the best way is to focus on it hiding
all the other code that is not relevant. Some example of this isolation are:
  - Extract Method
  - Extract Object
  - Method Object

---

## Migrate Data

In order to migrate from a data representation to another, like when a object
need to become a collection of objects, it is possible follow there steps:
  - add an interface variable in the new format
  - set the new format variable everywhere the old one is set
  - use the new format variable everywhere the old one is used  
  - delete old format
  - change he external interface to to reflect the old format

If the APIs needs to change first it is possible to:
  - add a parameter in the new format
  - change internal re[representation from the new format to the old one
  - delete the old format parameter
  - replaces the use of the old format with the new one
  - delete the old format

---

## Extract Method

In order to make a big method more readable it is possible to move small pieces of code
into a new method and call it in the old one. The steps to achieve this are:
  - find a part that make sense as its own method, like loops and branches of conditionals
  - ensure that there are not variable assigned outside
  - copy the code of the old method to a new one
  - add each temporary variable as parameter of the new method
  - call the new method from the original one

---

## Inline Method

This type of refactoring is used to simplify control flow when become too complicated.
The main steps are:
  - copy the method
  - paste the method over the method invocation
  - replace formal parameters with actual parameters

---

## Extract Interface

In order to introduce a new implementation for an operation the easiest way is
introduce an interface that shares the operation.
The steps are:
  - declare an interface
  - the existing class has to implement the interface
  - add the needed methods to the interface, expanding the visibility of the methods if necessary
  - change the declaration type from class to interface where is possible

---

## Move Method

To move a method from a class to a class where it belongs the operations are:
  - copy the method
  - paste the method in the new class
  - if are used functions or variables of the original objects a reference must be added as function parameter
  - replace the body of the original method with the invocation of the new method

This type of refactoring can be used every time there is more then one message sent
to another object in a method.

The advantages are:
  - it is easy to see without understanding the meaning of the code
  - the mechanisms are quick and safe
  - the results can be surprising

---

## Method Object

In order to reduce the number of parameters in a method signature and removing
local variables it is possible to introduce an object that encapsulate all these
information. The steps are:
  - create an object with the same parameters as the method
  - add local variables as instance variables of the new object
  - create one method called `run()` and move the body of the current method there
  - in the original method create a new object and invoke `run()`

This kind of objects are useful for preparation to add new logic to the system
or when Extract Method has too many parameters that do not simplify the code.

---

## Add Parameter

When new data is needed or a data migration is going on it is necessary to add
a parameter. To achieve this goal is needed:
  - if the method is an interface add it there first
  - add the parameter at the method
  - use compilation error to find where it needs to be added

---

## Method Parameter To Constructor Parameter

When the same object is used in several methods it is possible move it in the
constructor or, if it is used only in one method, it is possible remove it from
the constructor doing the steps in the revers order:
  - add the parameter to the constructor
  - add and instance variable with the same name as the parameter
  - set the variable in the constructor
  - convert one by one reference `parameter` to  `this.parameter`
  - when every reference has been converted delete the parameter from the method and all its callers
  - remove the not necessary `this`
  - rename the variable correctly
