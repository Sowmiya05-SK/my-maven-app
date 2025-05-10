package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void testFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(arr, 3));
    }

    @Test
    public void testNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(arr, 6));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 1));
    }
}
