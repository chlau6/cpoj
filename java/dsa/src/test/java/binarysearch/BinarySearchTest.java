package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    public void binarySearchTest() {
        assertEquals(new BinarySearch().binarySearch(new int[]{1}, 1), 0);
        assertEquals(new BinarySearch().binarySearch(new int[]{0}, 1), -1);
        assertEquals(new BinarySearch().binarySearch(new int[]{2}, 1), -1);
        assertEquals(new BinarySearch().binarySearch(new int[]{1, 2, 4, 7, 9, 11, 12, 13}, 2), 1);
        assertEquals(new BinarySearch().binarySearch(new int[]{1, 2, 4, 7, 9, 11, 12, 13}, 13), 7);
        assertEquals(new BinarySearch().binarySearch(new int[]{1, 2, 4, 7, 9, 11, 12, 13}, 3), -1);
    }
}