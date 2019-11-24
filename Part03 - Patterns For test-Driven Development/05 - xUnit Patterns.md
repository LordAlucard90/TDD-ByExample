# xUnit Patterns

## Assertion

Each test should be designed to work only if the value is exactly the one expected.

Testing something not null does not make the test robust,
 otherwise test an equals assertion could be more secure.

When a test fails could be not so easy find the reason, in test suits like JUnit
it is possible to add comment to assertions in order to easily debug it.

---

## Fixture

Often more test case has a same starting configuration for the test,
in this case all the common code can be moved to a `setUp` class in order to avoid duplication of code.

On the other hand removing the duplication the code is less readable and would be
necessary more time to write a new test or understand the current one.

---

## External Fixture

When a resource like a file is part of a test it is possible to open the file in the `setUp`
and close it in a function called `tearDown`.

---

## Test Method

The test method that belongs to a single fixture must be method of a singe test class.

In the test class can be placed comment lines used as placeholder for future test
and also as documentation for that tests.

--

## Exception Test

In order to catch an exception is it possible to insert the tested method into
a try-catch and put a `fail` after the method. In this way if the method does not
throws an exception a fail will be reported. The catch statement must only catch
the expected exception.

--

## All Tests

A way to run all test together is to create a suit for each package and another one
for all the application.
