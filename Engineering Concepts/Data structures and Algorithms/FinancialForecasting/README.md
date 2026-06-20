# Financial Forecasting using Recursion

## Objective

Develop a financial forecasting tool that predicts future values based on historical growth rates using recursion.

## What is Recursion?

Recursion is a programming technique in which a method calls itself to solve smaller instances of the same problem until a base condition is reached.

A recursive solution generally contains:

1. Base Case
2. Recursive Case

## Recursive Forecasting Logic

Future Value Formula:

Future Value = Current Value × (1 + Growth Rate)^Years

Instead of using loops, recursion repeatedly applies the growth rate until the forecast period becomes zero.

## Algorithm

1. If years = 0, return current value.
2. Multiply current value by (1 + growth rate).
3. Recursively forecast for remaining years.
4. Return the final predicted value.

## Time Complexity

### Recursive Solution

Time Complexity: O(n)

where n = number of forecast years.

The recursive function performs one calculation per recursive call.

### Space Complexity

O(n)

because each recursive call occupies stack memory.

## Optimization

For very large forecast periods, recursion may create excessive stack usage.

Possible optimizations:

* Use Dynamic Programming (Memoization)
* Use Iterative Approach
* Use Mathematical Formula:

  Future Value = Current Value × (1 + Growth Rate)^Years

This reduces computation and avoids deep recursion.

## Conclusion

Recursion provides a simple and elegant way to model financial forecasting problems. While suitable for smaller forecasting periods, iterative or mathematical approaches are preferred for large-scale financial systems due to better memory efficiency.
