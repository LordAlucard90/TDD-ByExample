# Part 01 - The Money Example

In this file I will note down all the principles introduced in each step.

## Introduction

Test Driven Development workflow:

1. Quickly add a test.
2. Run all tests and see the new one fail.
3. Make a little change.
4. Run all tests and see them all succeed.
5. Refactor to remove duplication.

## Step 01: $5 * 2 = $10

First write the big test you want to achieve.

Imagine small tests to arrive to the first one.

Do not care immediately about ugliness, make the test pass and write down on the todo_list the ugly things to remove.

When the bar is green do the refactoring to remove duplication.

## Step 02: money side effect?

**Write a test**:
use the interface you wish you had and all the element you think you need.

**Make it run**:
The bar must become green in a moment. If you think to a solution that takes a minute or more in this step then make a note of it and return to the main problem, the green bar.

**make it right**:
Now you can clean the code and remove the redundancy introduced.

Strategies to get quickly green bar:
- **Fake it** - return a constant and gradually replace contains with variables to get the real implementation.
- **Use Obvious Implementation** - type the real implementation.

## Step 03: equals()

**Triangularization** is a method that help generalizing code: first write a test and make it pass, then add another case that force the code to be more general.

This method helps to think to the problem from a different view.

## Step 04: make amount private

When a new functionality is added could be used it to refactor other tests and to make them more readable. This type of refactoring could lead to improve other parts of the code under production too.

## Step 05: 5 CHF * 2 = 10 CHF

During the development process could be not possible to imagine the new test because is too big.

It is allowed to create a small test and make the green bar with code redundancy if and only if in the refactoring phase, or in the subsequent steps, this redundancy is removed.

## Step 06: common equals

Before refactoring a method (or more precisely, before writing it) there must be at least one test covering it.

## Step 07: compare Dollar and Franc

When a method, like `equals`, is moved up to a superclass must be tested the interaction between the subclasses.

Is important to wait to introduce new design to the code until is not necessary id est forced by the tests.

## Step 08: Dollar/Franc duplication

Wait to remove a test until you are absolutely sure that it is not necessary.

## Step 09: currency?

During a refactoring, no breaks should be made to change anything else that does not belong to the current code. An exception could be made if the change is very fast.

## Step 10: common times

Sometimes is necessary to go backward to go forward.

It Is allowed implement a new method without a related tests during the red bar if and only if it is used for debug proposes like `toString`.

Is it not allowed to write a new test during red bar.

## Step 11: Dollar/Franc duplication

Tests that are related to an old logic, are redundant or are an obstacle to the new logic that is evolving can be deleted after a careful control.

## Step 12: $5 + $5 = $10

When the new test puts the basis of an important design feature that will influence the next steps is important to examine all the possible implementations and their consequences.

## Step 13: Bank.reduce(Money)

When it is not obvious how to implement fake code it is possible go forward working on small related issue to solve the main problem.

## Step 14: reduce Money with conversion

Each new class added must have its own tests on a multi-developer project.

If there is only one developer, the new class is simple and its use is clear the tests could be omitted.

## Step 15: $5 + 10 CHF = $10 if rate is 2:1

If a test needs too many steps to become green, the current interfaces must be used and, when the bar is green, they can gradually be replaced with the desired ones.

## Step 16: Sum.plus, Expression.times

The test code must communicate what is under testing, event if there is another way to write the test, it must be used the specific code under testing, not a superstructure who will use that part of code.

