The Problem

We have been asked to efficiently solve the problem of finding the k largest items in a list.  For example, if given the list 1, 23, 12, 9, 30, 2, 50 and asked to find the three largest integers, the solution is 50, 30 and 23.

Of course, since we expect to be solving this problem for very large lists, it is important to consider the running time of our solution.  We recognize that Java's sort routine is a fast way to order the items in a list, and with the items ordered, it is straightforward to extract the k largest.

However, having recently learned about binary heaps, we are optimistic that there is an even more efficient solution.  Therefore, we will build a binary max heap data structure.  Then, we will use it to solve the problem of finding the k largest items in a list, comparing its running time to that of using Java's sort routine to solve the same problem.

Requirements

PriorityQueue interface

The PriorityQueue interface has been provided for you.  It contains all of the operations that your BinaryMaxHeap class must implement.  In the method comments, the expected Big-O behavior is given.  (WARNING: Do not use Java's PriorityQueue class anywhere in your solution.)

BinaryMaxHeap class

To the assign10 package add a BinaryMaxHeap<E> class that implements the PriorityQueue<E> interface.  The class must represent a binary max heap and be backed by a basic array.

Provide the following four constructors:

public BinaryMaxHeap()
If this constructor is used to create an empty binary heap, it is assumed that the elements are ordered using their natural ordering (i.e., E implements Comparable<? super E>).

public BinaryMaxHeap(Comparator<? super E> cmp)
If this constructor is used to create an empty binary heap, it is assumed that the elements are ordered using the provided Comparator object.

public BinaryMaxHeap(List<? extends E> list)
If this constructor is used, then the binary heap is constructed from the given list.  Also, it is assumed that the elements are ordered using their natural ordering (i.e., E implements Comparable<? super E>).  RECALL: Using the buildHeap operation, we can construct a binary heap from these N items in O(N) time, which is more efficient than adding them to the binary heap one at a time.  This constructor must use such an operation.

public BinaryMaxHeap(List<? extends E> list, Comparator<? super E> cmp)
If this constructor is used, then the binary heap is constructed from the given list (see RECALL note above).  Also, it is assumed that the elements are ordered using the provided Comparator object.

NOTE: You are strongly encouraged to make liberal use of private helper methods to organize your implementation and avoid writing the same or similar code multiple places in your BinaryMaxHeap class.  Consider using at least these helper methods: buildHeap, percolateUp, percolateDown, innerCompare.  An innerCompare method is intended to isolate your decision of whether to invoke a Comparable or Comparator method to just one place in your program.  Also, you should refer again to the "Tips for handling generics" section of Assignment 3, as it also applies to this assignment.

FindKLargest class

The FindKLargest class has been started for you.  Fill in the generic static methods, as indicated by their comments, to solve the problem of finding the k largest items in a list.  Notice that for two of the methods, you are to solve the problem using your binary max heap (one version with Comparable and the other version with Comparator).  For the other two methods, you are to solve the problem using Java's sort routine (Comparable and Comparator versions).

Create your own JUnit 5 test class(es).  Ensure that your tests are organized and cover a broad range of possible inputs for all BinaryMaxHeap and FindKLargest methods you write.

See Assignment 1 for style and design requirements, as well as the late policy for assignments.  At a minimum, every class and method must be commented using Javadoc.

Submission

Submit your BinaryMaxHeap.java and FindKLargest.java files, as well as your testing files. All files should be in the assign10 package.

See Assignment 2 for instructions on how to designate a group in Gradescope.

The auto-grader is set to run a minimal set of "pre-tests" to ensure you have included all required classes and methods specified above. Note that passing the "pre-tests" is worth 8 / 65 points for the Assignment 10 program.  The remaining points will be assessed after the assignment deadline and based on whether your code passes "post-tests", as well as how good your style / design is.  Note that Assignment 10 is 65 points for programming and 35 points for analysis.

Analysis 

The Analysis Document must be written and submitted by each programming partner individually.
