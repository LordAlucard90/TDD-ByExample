# 01 - Test-Driven Development Patterns

This is an initial introduction on what, when and how to test.

## Test

Every change in a software should be verified by a test.

Automatic tests allow you to check the code by reducing the number of errors and giving a good feeling.

---

## Isolated Test

If there is a chain of tests that depends on the success of the previous one, if one breaks every test after him, it will break.

Each test must be isolated from the other, so that if a test breaks it means a problem, if two tests break up it means two problems and so on.

Isolated tests allow you to run them in different number and order every time.

Isolated tests encourage you to build highly cohesive and loosely coupled objects.

---

## Test List

The test list allows you to focus on the current problem and forget others because they are written on the list.

On the list goes, first of all, the known needed operations, then all the refactoring needed to have a clean code.

The list also allows to divide the task between more and less important and choose which one to resolve first.

---

## Test First

The tests must be written before the code being tested.

Testing before is less stressing than testing after.

---

## Assert First

Writing a test solves several problems at once:

- Where does the functionalities belong?
- What should the names be called?
- What is the right answer?
- What does other tests does this test suggest?

These are too many problems at the same time, assert first allows to focus only on:

- What is the right answer?
- How am I going to check?

The method starts from the condition that must be verified and goes backward to find the actions that create the tested condition.

During the process it is easier to answer all the previous questions.

---

## Test Data

The tests are written for an audience, each test tells something, if two tests tell the same story one of them can be deleted.

Test Data must be long enough to lead the implementation decision but not too long.

It is important to diversify the Test Data between the test to cover more cases.

The alternative is to use the Realistic data, in which data from the real world is used. This kind of data is useful when:

- A real time system is tested.
- The output of the current system is tested respect to a previous system.
- A simulation is refactored and the response must be precise like with floating point data.

---

## Evident Data

A test must be as comprehensible as possible.

The expected data on an assertion could communicate the executed operation. A naive example is a sum where the value 3 can be replaced by the expression 1+2.
