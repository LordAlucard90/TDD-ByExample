# Green Bar Patterns

These patterns are used to get green bar as soon as possible.

## Fake It ('Til You Made It)

Sometimes the implementation is not obvious, it can take log to be realized so it is important to fake it with stub data.
After the fake implementation it is possible to gradually get the real implementation deleting the code duplication generated with the fake implementation.

Reasons why the fake implementation helps:

- Psychological - the green bar make feel completely different from the red bar.

- Scope Control - it is very easy to imagine future generalizations starting from the current code, the fake implementation helps to stay focused on the current problem.

---

## Triangulate

Triangulation is very powerful when can be used two o more examples. In this case it is possible to write the first example returning a constant and then create a new example that obligates to implement the method.

---

## Obvious Implementation

When the implementation is really easy t is possible to write it.

Writing the obvious implementation could be not so obvious as it could appear. The implementation that make the bar green could not be the fully correct and clean implementation and make the bar red afterwards.

---

## One To Many

When must be tested an operation upon a collection can be performed a test on a only one method and then after some generalizations on a collection.

A simple process could start creating the stub implementation that receive and returns a constant, then add the collection parameter without using it, now it is possible to use to collection to perform the operation (the result must be the same of the constant) and in the end it is possible to remove the initial constant parameter.
