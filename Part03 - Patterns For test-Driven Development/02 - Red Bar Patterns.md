# 02 - Red Bar Patterns

These patterns are about when you write tests, where you write tests and when you stop writing tests.

## One Step Test

When there is a list of possible tests, the first to implement is the one that can be implemented with one step.

If there is no test that can be implemented with a single step then new tests must be created to make little steps towards the elements of the list.

---

## Starter Test

The first test must be really easy and short to implement, the target is to obtain short red/green/refactor cycles.

Realistic tests can increase the time of a cycle, for this reason it is convenient to use trivial inputs and outputs.

For the first test the output should be the same as the input, and the input should be as small as possible.

---

## Explanation Test

Is is convenient to talk of the code using test cases language such as:
- If I have A and B then I get C.
- What happens if I have B and C? Can I obtain A?

The test cases created from a high level abstractions such as sequence diagrams.

---

## Learning Test

When is API or a Framework is used a good practice is create a test before use the code.

Creating a test allows to check how the external code works and to find changes when a new version is released.

---

## Another Test

To write down a new idea and add a test helps to remain focused on current work.

---

## Regression Test

Regression tests are tests missing from the original test cases, so in order to write a Regression test is helpful think about the knowledge necessary for that test to be written earlier.

---

## Break (Dave Ungar  Shower Methodology)

If you know what to type then type it.

If you don't know what to type then "take a shower" and sytay in the shower until you know what to type.

So if the design is not clear it is possible to fake it, then try to triangulate and finally try to take a shower.

---

## Do Over

Being tired and force something in order to finish a task can lead to do it again.

---

## Cheap Desk, Nice Chair

It is not possible coding well if the chair is uncomfortable, so it is better spend for a good chair rather than a beautiful desk.

In a pair programming scenario it is important that both the programmers are comfortable in their chairs and to use the keyboard on the desk.
