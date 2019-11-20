# Testing Patterns

There patterns are more detailed techniques to write tests

## Child Test

When a test is too big and requires a lot of changes and too much time with a red bar the better thing to do is delete it (or comment it).

Then it is necessary to write small tests that lead to cover the big one.

---

## Mock Object


When an object is too complicated to be used in a test, like a database, it is convenient use a Mock that simulate the behavior.

Mock objects introduce more readability on the test and reduce the duration of tests.

Furthermore Mocks helps to consider the visibility of the different objects and reduce the coupling.

---

## Self Shunt

It is possible to test that an object communicates correctly with another making the object under test communicate with the test case instead of the object it expects.

It is possible to extract the interface of the other object and implements the methods that will be used in the test.

...

## Log String

When there is a sequence of actions that have to take place in some defined order it is possible to add a string log to the methods and check the expected string with the actual one.

Otherwise if the order is not important, a set can be used,

---

## Crash Test Dummy

When is needed to test some special conditions not easy to create, like the disk full or something like that, it is possible to simulate the situation through the override of some method that throw the desired exception.

It is like a Mock object but it is not needed to mock the whole object.

---

## Broken Test

When you code alone a good method that can be used to quickly start to work from the day before is to leave a test broken.

Leaving the red bar force, with the test written, help to have e bookmark on the current status of the program and know exactly where to start.

In this case the red bar does not indicate the code broken but not finished.

---

## Clean Check-in

When you work in a team all the tests must pass.

It is necessary to check frequently all the test suite in order to identify as soon as possible integration fails and correct them before there is too much code to change.
