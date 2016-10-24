In Class Exercise

Rohan Kapoor
Pranjal Singhal
Ka Fong
Sandeep Jala


1. Did your approach to test generation differ between developing a coverage-adequate test suite and developing a mutation-adequate test suite? Briefly explain why or why not.

Yes, while developing coverage-adequate tests, we looked at the Triangle.java file and looked for different combinations of triangle edges that will cover every branch of the source code.
When we were developing mutation-adequate tests, we had to compare the mutation with the original code and look for potential triangles that would fail for mutation but not the original code (or pass the mutation and fail the original code).


2. Do your coverage-adequate test suites detect (i.e, kill) all mutants, do they even cover all mutants? If not, briefly explain why?
Our coverage-adequate test suites covered all mutants because we have 100% statement coverage. However, they only kill about 75% of all mutants. Covering the mutants doesn’t imply killing them. The test suite might have cover the mutants but it may be insensitive to the actual mutation to produce different outcome than original code.

3. Are all generated mutants detectable (i.e., killable)? If not, how many are equivalent? Briefly explain why.

There are some mutants that our tests are unable to detect/kill. Those have more to do with the fact that some mutations lead to changes that are impossible to reach with input combinations that would actually lead to a bug. Also some mutations are within internal implementations that cannot be tested with inputs and there is no access outside the functions.

Some of such mutations we found were:
Mutation 11: Both conditions will need to be false and that is not possible
Mutation 59: trian is a private variable, it is not possible for a test to decrement the value of trian. And thus we can not test if the value goes below zero.
Mutation 76: Unable to differentiate with original code
Mutation 101: There is another if statement before the mutation that ensures that the triangle is not 0. and therefore we are unable to pass invalid values to the mutation.
Mutation 128: Both conditions will need to be false and that is not possible
Mutation 136: trian >3 would anyways result in a invalid triangle
Mutation 145: was unable to get anything different from original code

4. What changes in the coverage ratios and mutation analysis results did you observe after deleting all assertions?
After deleting all the assertions, the coverage ratios remains the same because we are still reaching all branches of the code regardless of the assertion statements. However, the mutation score decreases drastically because our test cases cannot differentiate the mutated and original code without assertion statements.

5. Are some of the tests in your test suites redundant? How can you generally measure redundancy in a test suite?

Some of the tests in our test suite are redundant because our developing technique involved detecting one statement/condition/mutation at a time and writing a test case for that. We wrote tests for coverage first and then for mutations and realized some tests for mutation specific testing are also able to test for coverage. Our mutation specific test suite was able to give 88% coverage meaning redundancy exists.

Another redundant test we included was to test the constructor of the Triangle class. To achieve 100% coverage we wrote a test that checks if initializing a new triangle doesn’t throw an error. It’s redundant because it doesn’t actually test the implementation of the class and would not tell us anything about the code quality.

One of the ways to minimize redundancy in our test suite is by writing intelligent tests that cover coverage and mutations at the same time. We can try removing tests and seeing if the coverage/mutation ratios change at all. If not they are mostly redundant.
