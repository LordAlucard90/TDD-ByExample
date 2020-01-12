# Mastering TDD

Some question and answer about TDD.

## How large should your step be?

This question is composed by two sub questions:
  - How much ground should each test cover?
  - How many intermediate stages should you go through as you refactor?
Is better write tests that encourage to write a line of code or tests that encourage
writing 100 line of code with one hour of refactoring?

The answer is both: at the beginning is better use small steps and, when there is
confidence with these steps, it is possible to exclude some of them.

However now all these steps are provided by the IDEs using only one item menu,
this change leads to the possibility to use a more aggressive refactoring and more
experimentation with confidence.

---

## What don't you have to test?

The idea is write tests until you are confidential with the code.

Some code that must be tested is:
  - Conditionals
  - Loops
  - Operations
  - Polymorphism

But only of your code, not code from others.

---

## How do you know if you have good tests?

These are factors that indicates troubles:
  - Long setup code: if thee is too much code for a single assertion the object
    under testing is too complex
  - Setup duplication: if thee is not a common setup code then there are too many objects intertwined
  - Long running test: tests that need too much time to be run will be not run
  - Fragile tests: tests that break unexpectedly suggest the two different parts of the application
    are too much correlated and is needed a refactoring.

---

## How does TDD leads to frameworks?

TDD manages only one feature at time, this allows to gradually put common code
in some place and all the logic that is different in another.

When some other feature comes up it is easy to find the spots that need to be
changed and previous tests allow to be confident that the existing codebase is still
working.

---

## How much feedback do you need?

The number of tests needed to ensure that the system works is connected to the
MTBE (Mean Time Between Failures).

If the system needs a MTBF of 10 or 100 years so it is necessary to test all
the possible edge cases with extremely unlike cases, otherwise it is enough to
have only the tests that really add confidence/

---

## When should you delete a tests?

  - Never delete a test if it reduces the confidence on the system
  - Never delete a test that insist on the same part of another but communicate different
    scenarios for a reader

---

## How do the program language and environment influence TDD?

In environment where the TDD cycle is harder usually are taken bigger steps,
where TDD is well integrated it is possible to take smaller steps and more experiments.

---

## Can you test drive enormous systems?

TDD produces small easy-to-test objects that can be tested in isolation in
enormous systems.

---

## Can you drive development with application-level tests?

The problems with application test-driven development (ATDD) are:
  - from a business prospective there is new element in the team that has to
    write tests for the application.
  - from a TDD prospective the tests is written now and will be green after ten days
    and this is not in the canonical red/green bar pattern.

---

## How do you switch to TDD midstream?

In this case form one hand side the code is not designed for test so you need to
refactor, but from the other hand side if you do refactor you can not see errors.

First it is not possible to write all the test for the system, because this takes time
and does not produce new features, there will be a lot of code ugly but it is
necessary to choose with parte improve and leave the other code when a new feature
involves it.

Second it is necessary break the refactoring/tests deadlock with system tests, ugly but
give some confidence, or refactoring carefolly with par programming.

---

## Who is TDD intended for?

TDD is good for who like to refine code over time and do not want see it die.

---

## Is TDD sensitive to initial conditions?

Maybe some path are faster in the beginning and slower later, some other are slower
initially and faster after a while, in the average there are not paths easier/faster
than others.

---

## How does TDD relate to patterns?

Following some role make code automatic and allows to have more time to think to design.

For what concerns patterns for a pattern sometime is not the best practice, but
leave it evolve by itself can lead to discover the best one for that case later.

---

## Why does TDD work?

TDD is effective for two main reasons:

  - helps to identify errors earlier decreasing the costs of correcting them
  - it reduces the time of design decisions with red/green/refactor loops

---

## What's with the name?

**Development** This kind of development is composed by analysis, logical design,
implementation, testing, review, integration and deployment.

**Driven**  It means not only that test must be written before the code but that
the tests driven the development of the code itself.

**Test** They are automated and and run often, however TDD is not a testing
technique but an analysis technique, a design technique and, in general,
a technique used to structure and lead the development.

---

## How does TDD relate to the practices of Extreme Programming?

This is how Extreme Programming (XP) and TDD work together:

- Pairing
  Test are a very good conversation topic in pair programming, especially when
  opinions disagree.
- Work Fresh
  Work when you are fresh and stop when you are tired is a best practice in TDD too.
- Continuous Integration
  Tests allow to integrate more often.
- Simple Design
  Coding only what is neede and removing duplication helps to be prepared to the
  next story, keeping in mind only the current problem help to keep the design
  easier for the tests.
- Refactoring
  Remove duplication means refactoring, tests give the confidence to do it without
  loosing functionalities.
- Continuous Delivery
  If tests really decrease errors then ti is possible to put code more often
  on production with less risks.

---

## Derach's Challenge

He says:

- It is not possible to test GUIs automatically
- It is not possible to unit testing distributed objects
- It is not possible to test first the DB schema
- There is no need to test third party or automatically generated code
