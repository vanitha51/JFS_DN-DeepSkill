package com.dsalgo;

public class SearchTest {

public static void main(String[] args) {

    Product[] products = {
        new Product(1, "Maggie", "Food"),
        new Product(2, "Book", "Stationery"),
        new Product(3, "Study Table", "HomeDecor"),
        new Product(4, "Car", "Vehicle"),
        new Product(5, "Bag", "Accessories")
    };

    System.out.println("Linear Search:");
    Product result1 = SearchOperations.linearSearch(products, 3);

    if (result1 != null) {
        System.out.println(result1);
    } else {
        System.out.println("Product Not Found");
    }

    System.out.println();

    System.out.println("Binary Search:");
    Product result2 = SearchOperations.binarySearch(products, 4);

    if (result2 != null) {
        System.out.println(result2);
    } else {
        System.out.println("Product Not Found");
    }
}

}