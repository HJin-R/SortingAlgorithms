# Sorting Algorithms

Simple sorting algorithms implemented in Java. Some codes are translated and modified based on the psudocode examples
in 'Introduction to Algorithm' - 4th edition 2022, Cormen, Lieserson, Rivest, Stein. MIT Press.

Keep in mind psudocode uses 1 as first index on array but in Java first index is 0.

main methods on some files includes an unsorted array to test if the methods are working properly.


### 1. Binary Search
Binary Search is a search algorithm used to find the position of a target element in a sorted array. It works by repeatedly dividing the search interval in half.

Steps:
Check the middle element of the array.
If it matches the target, return its index.
If the target is smaller, search the left half; otherwise, search the right half.<br/>

Time Complexity:
Best case: 𝑂(1) (when the middle element is the target).<br/>
Worst case: 𝑂(log 𝑛)<br/>
Space Complexity:
 Iterative: 𝑂(1)
 Recursive: 𝑂(log𝑛)


### 2. Bubble Sort
Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly compares adjacent elements and swaps them if they are in the wrong order.

Steps:
Iterate through the array multiple times.
For each pass, compare adjacent elements and swap if needed.
Repeat until the array is sorted.<br/>
Time Complexity:

Best case: 𝑂(𝑛)(when the array is already sorted).<br/>
Worst and average case: 𝑂(𝑛<sup>2</sup>)<br/>
Space Complexity: 𝑂(1)


### 3. Heap Sort
Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure to build a max-heap or min-heap, then repeatedly extracts the root to sort the array.

Steps:
Build a max-heap from the input array.
Swap the root with the last element and reduce the heap size.
Reheapify the reduced heap.
Repeat until the heap is empty.<br/>

Time Complexity:
Best, worst, and average case: 𝑂(𝑛log𝑛)<br/>
Space Complexity: 𝑂(1)


### 4. Insertion Sort
Insertion Sort builds a sorted array one element at a time by picking the next element and inserting it into its correct position.

Steps:
Start with the second element as the "key."
Compare the key with the elements before it and shift larger elements to the right.
Insert the key in its correct position.
Repeat for all elements.

Time Complexity:
Best case: 𝑂(𝑛) (when the array is already sorted)<br/>
Worst and average case: 𝑂(𝑛<sup>2</sup>)<br/>
Space Complexity: 𝑂(1)

### 5. Merge Sort
Merge Sort is a divide-and-conquer algorithm that divides the array into halves, recursively sorts them, and then merges the sorted halves.

Steps:
Divide the array into two halves.
Recursively sort each half.
Merge the two sorted halves into one sorted array.<br/>

Time Complexity:<br/>
Best, worst, and average case: 𝑂(𝑛log𝑛)<br/>
Space Complexity: 𝑂(n) (need temporary arrays for merging).

### 6. Quick Sort
Quick Sort is a divide-and-conquer algorithm that selects a "pivot" element and partitions the array into elements less than and greater than the pivot. It then recursively sorts the partitions.

Steps:
Choose a pivot (the first, last, or random element).
Partition the array around the pivot.
Recursively apply Quick Sort to the partitions.<br/>

Time Complexity:
Best and average case: 𝑂(𝑛log𝑛) <br/>
Worst case:  𝑂(𝑛<sup>2</sup>)<br/>
Space Complexity: 𝑂(log𝑛)


### 7. Selection Sort
Selection Sort repeatedly selects the smallest (or largest) element from the unsorted portion of the array and places it in the sorted portion.

Steps:
Find the smallest element in the unsorted portion.
Swap it with the first unsorted element.
Repeat for all elements.<br/>

Time Complexity:
Best, worst, and average case:  𝑂(𝑛<sup>2</sup>)<br/>
Space Complexity: Space Complexity: 𝑂(1)


