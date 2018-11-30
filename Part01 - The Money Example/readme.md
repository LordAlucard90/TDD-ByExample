# Part 01 - The Money Example

In this part will be implemented a multi-currency money.

## Step 01: $5 * 2 = $10

At first it starts from the definition of the base test with no implementations, goes on with the implementation of the structures needed to make the test compile and finishes with a dummy implementation to make the test pass.

Then the duplication introduced by the dummy implementation is removed without breaking the test.

## Step 02: money side effect?

When `times` is called the internal state of Dollar (ie `amount`) change so the test could be extended to avoid this state mutation.

In this step the first thing is the test refactoring and then the code refactoring.

## Step 03: equals()

Since Dollar create always a new Dollar is a *Value Object*. This kind of objects need the `equals()` method and, if are related with a database, a `hashCode()` method too.

In this step first was tested the equality, then the disequality to make a triangularization that helps to find the code duplication.

## Step 04: make amount private

The `equals()` implementation allows to refactor the first test and make it more readable and to make `amount` private.

However the use of `equals()` introduces a risk: if `equals()` fails then two tests could fail at once.


