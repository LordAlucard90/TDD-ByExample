# Part 01 - The Money Example

In this part will be implemented a multi-currency money.

## Step 01: $5 * 2 = $10

At first it starts from the definition of the base test with no implementations, goes on with the implementation of the structures needed to make the test compile and finishes with a dummy implementation to make the test pass.

Then the duplication introduced by the dummy implementation is removed without breaking the test.

## Step 02: money side effect?

When `times` is called the internal state of Dollar (ie `amount`) change so the test could be extended to avoid this state mutation.

In this step the first thing is the test refactoring and then the code refactoring.
