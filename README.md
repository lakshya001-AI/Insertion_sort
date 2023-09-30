# Insertion Sort in Java

This is a simple Java implementation of the Insertion Sort algorithm. Insertion Sort is an elementary sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, it provides several advantages:

- Simple implementation.
- Efficient for small datasets or partially sorted datasets.
- Adaptive - performs well when the data is already partially sorted.

## How Insertion Sort Works

Insertion Sort works by repeatedly moving elements from the unsorted part of the array to the sorted part. In each iteration, it takes one element from the unsorted part and compares it with the elements in the sorted part, moving larger elements to the right. This process continues until the entire array is sorted.

## Java Implementation

```java
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
```

## How to Use

1. Clone the repository or download the `InsertionSort.java` file.

2. Compile the Java file using the following command:

   ```
   javac InsertionSort.java
   ```

3. Run the compiled program:

   ```
   java InsertionSort
   ```

   This will execute the `main` method, demonstrating the insertion sort algorithm on a sample array.

## Contributing

If you'd like to contribute to this project, feel free to fork this repository, make your changes, and create a pull request. We welcome any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Introduction to Algorithms, Third Edition, by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein - for providing a clear explanation of the Insertion Sort algorithm.
- The open-source community for valuable contributions and feedback.

Happy Sorting!
