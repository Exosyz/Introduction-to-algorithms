# Content of the chapter

This chapter will cover some basis around complexity and sorting algorithms.

___
## INSERTION-SORT algorithms

This algorithm is usefully for low quantities of values
![](resources/C2-Insertion_sorting_algorithm.png)

#### Initialisation
We get the first element of the original array, and we place it in the sorted one.

#### Running
For each element *n* of the unsorted array we check if he is smaller than the *n-1* value, if not we continue to the next value. Else, we are trying to find the right place before the n-1. And insert the value of *n* at this place

At the end of each iteration the sub-array *A[1-i]* need to be always sorted to keep the final output valid.

#### Termination
The algorithm end when you have go throw all the value of the original array.

___
### Exercise 2.1-1
#### Illustrate the operation of INSERTION-SORTof an array initially containing the sequence (31, 41, 59, 26, 41, 58)
![](resources/C2-1.1.png)

### Exercise 2.1-2
#### Consider the procedure SUM-ARRAY on the facing page. It computes the sum of the n numbers in array *A[1:n]*. State a loop invariant for this procedure, and use its initialization, and termination properties to show that the SUM-ARRAY produces returns the sums of the number in *A[1:n]*

```
SUM-ARRAY(A, n)
    sum = 0
    for i = 1 to n
        sum = sum + A[i]
    return sum
```

Loop invariant : 
- <u>Initialization :</u> The sum equals 0.
- <u>Maintenance :</u> The sum is equal to the previous sum plus current value of the array.
- <u>Termination :</u> The sum is equal to all the value contain in A.

### Exercise 2.1-3
#### Rewrite the INSERTION-SORT procedure to sort into monotonically decreasing instead of monotonically increasing order.

```
INSERTION-SORT(A,n)
    for i = 2 to n
        key = A[i]
        // Insert A[i] into the sorted subarray A[i: i-1]
        j = i-1
        while j> 0 and A[j] > key
            A[j+1] = A[j]
            j = j-1
        A[j+1] = key
```

```
REVERSED-INSERTION-SORT(A,n)
    for i = 2 to n
        key = 1[i]
        // Insert A[i] into the sorted subarray A[i: i-1]
        j = i-1
        while j> 0 and A[j] < key
            A[j+1] = A[j]
            j = j-1
        A[j+1] = key
```
See solution in [java](resources/java/src/InsertionSort.java) or [rust](resources/rust/src/insertion_sort.rs)

### Exercise 2.1-4
#### Consider the searching problem : 
- **Input** : A sequence of number *n* (a<sub>1</sub>, a<sub>2</sub>,...,a<sub>n</sub>) stored in array *A[1:n]* and a value *x*
- **Output** : An index i such that x  equals *A[i]* or the special value *NIL* if x does not appear in *A*.

```
FIND(A,n,x)
    for i = 1 to n
        if A[i] == x
            return i
    return NIL
```

See solution in [java](resources/java/src/LinearSearch.java) or [rust](resources/rust/src/linear_search.rs)

### Exercise 2.1-5
#### Consider the problem of adding tow *n-bit* binary integers *a* and *b*.
- **Input** : Tow *n-bit* binary integers *a* and *b*, stored in tow *n-element* arrays *A[0: n-1]* and *B[0: n-1]*, where each element is either *0* or *1*
- **Output** : An array *C[0: n]* who represent the binary addition of *a* and *b*

```
ADD-BINARY-INTEGER(A,B,n) -> C
    C = Array[n]
    remainder = 0
    for i = n to 1 by -1
        C[i] = (A[i-1] + B[i-1] + remainder) % 2
        remainder = (A[i-1] + B[i-1] + remainder) / 2
    C[0] = remainder
```

See solution in [java](resources/java/src/AddBinaryInteger.java) or [rust](resources/rust/src/linear_search.rs)