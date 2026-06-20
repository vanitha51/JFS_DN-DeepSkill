# E-Commerce Platform Search Function

## Objective

To implement and analyze Linear Search and Binary Search algorithms for an e-commerce platform's product search functionality.

## Big O Notation

Big O Notation is used to measure the efficiency of an algorithm by describing how its execution time grows with increasing input size.

Common complexities:

* O(1) – Constant Time
* O(log n) – Logarithmic Time
* O(n) – Linear Time
* O(n log n) – Linearithmic Time
* O(n²) – Quadratic Time

## Search Scenarios

### Best Case

The target product is found immediately.

* Linear Search: O(1)
* Binary Search: O(1)

### Average Case

The target product is found after checking several elements.

* Linear Search: O(n)
* Binary Search: O(log n)

### Worst Case

The target product is at the end of the collection or does not exist.

* Linear Search: O(n)
* Binary Search: O(log n)

## Implementation

### Linear Search

Linear Search checks each product sequentially until the required product is found.

### Binary Search

Binary Search repeatedly divides a sorted collection into halves until the target product is found.

## Time Complexity Comparison

| Algorithm     | Best Case | Average Case | Worst Case |
| ------------- | --------- | ------------ | ---------- |
| Linear Search | O(1)      | O(n)         | O(n)       |
| Binary Search | O(1)      | O(log n)     | O(log n)   |

## Conclusion

Binary Search is more suitable for large-scale e-commerce platforms because it significantly reduces search time compared to Linear Search. However, Binary Search requires the data to be sorted before searching.

Therefore, Binary Search provides better performance and scalability for large product catalogs.
