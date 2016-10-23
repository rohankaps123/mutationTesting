# mutationTesting
homework project


1. Did your approach to test generation differ between developing a coverage-adequate test suite and developing a mutation-adequate test suite? Briefly explain why or why not.

Yes, while developing coverage-adequate tests, we just had to look at the Triangle.java file and look for possible triangles that would fail in being triangles.
When we were developing mutation-adequate tests, we had to compare the mutation with the original code and look for potential triangles that would fail for mutation but not the original code.


2. Do your coverage-adequate test suites detect (i.e, kill) all mutants, do they even cover all mutants? If not, briefly explain why?



3. Are all generated mutants detectable (i.e., killable)? If not, how many are equivalent? Briefly explain why.

There are some mutants that our tests are unable to detect:
Mutation 11: *****NEEDS EXPLANATION**********
Mutation 59: trian is a private variable, it is not possible for a test to decrement the value of trian. And thus we can not test if the value goes below zero.
Mutation 76: ******* NEEDS EXPLANATION************
Mutation 101: There is another if statement before the mutation that ensures that the triangle is not 0. and therefore we are unable to pass invalid values to the mutation.
Mutation 145: *****NEEDS EXPLANATION**********



4. What changes in the coverage ratios and mutation analysis results did you observe after deleting all assertions?




5. Are some of the tests in your test suites redundant? How can you generally measure redundancy in a test suite?
