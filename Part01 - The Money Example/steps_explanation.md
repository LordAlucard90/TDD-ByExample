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

## Step 08: Dollar/Franc duplication

To gradually remove `times` is necessary move it up to Money, to do that was created a static method `dollar` who returns a Money.

Even if there is a redundant test for the moment it'll remains. 

## Step 09: currency?

First was crated a test to introduce the concept of `currency` and it was implemented in the subclasses.

Then initialization of `currency` was moved to the subclasses constructors and finally to the superclass.

## Step 10: common times

To make the `times` methods equal is necessary make a step back from the factory method.

Since the `equals` tests the class type equality, is not possible return a Money instance from `times`.

To change the `equals` is necessary step back to the green bar, add a new specific test and implement the new `equals` logic-

When finally the two `times` are equal is possible push them into Money and remove the redundancy.

## Step 11: Dollar/Franc duplication

Since Dollar and Franc are not used anymore they can be deleted.

The `TestDifferentClassEquality` is a test for the old logic, now the subclasses are no longer used so the test is a obstacle and must be deleted.

Since there is only money some tests become redundant and can be deleted.

## Step 12: $5 + $5 = $10

Since `$ 5 + 10 CHF = $ 10` is still too difficult, the addition will be implemented first.

This step introduces operations between different currencies, so the design must be evaluated.

The implementation chosen uses a `Bank` actor who manages the exchanges rates. It also uses a `Expression` metaphor to manage the operations between instances of `Money`.

## Step 13: Bank.reduce(Money)

Since many implementations are faked, new test must be created to remove duplication and force implementation.

First `plus` must return a `Sum` expression, then triangularization is used to force Bank `reduce` implementation. At the end Bank `reduce` must parse correctly  `Money` too.

