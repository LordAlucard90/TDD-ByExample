# Part 01 - The Money Example

In this file I will note down the explanation of each step.

## Step 01: $5 * 2 = $10

At first it starts from the definition of the base test with no implementations, goes on with the implementation of the structures needed to make the test compile and finishes with a dummy implementation to make the test pass.

Then the duplication introduced by the dummy implementation is removed without breaking the test.

## Step 02: money side effect?

When `times` is called the internal state of Dollar (id est `amount`) change so the test could be extended to avoid this state mutation.

In this step the first thing is the test refactoring and then the code refactoring.

## Step 03: equals()

Since Dollar create always a new Dollar is a *Value Object*. This kind of objects need the `equals()` method and, if are related with a database, a `hashCode()` method too.

In this step first was tested the equality, then the disequality to make a triangularization that helps to find the code duplication.

## Step 04: make amount private

The `equals()` implementation allows to refactor the first test and make it more readable and to make `amount` private.

However the use of `equals()` introduces a risk: if `equals()` fails then two tests could fail at once.

## Step 05: 5 CHF * 2 = 10 CHF

Since the step to write the *$5 + 10 CHF = $10 if rate is 2:1* test is  too still too big, has been introduced Franc by copying dollar.

Copy and past is a bad but necessary choice, the next steps will remove this duplication before to write a new test.

## Step 06: common equals

To remove the redundant `equals` a Money super class is needed.

First `protected amount` is created in Money and removed from Dollar, then equals is moved up to Money.

To refactor Franc is necessary test his `equals` first, then are made the same passages of Dollar on Franc.

## Step 07: compare Dollar and Franc

Moving `equals` to money introduce the needing to test the equality of Dollar And Franc.

