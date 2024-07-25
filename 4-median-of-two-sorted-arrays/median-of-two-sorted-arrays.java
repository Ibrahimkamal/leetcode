class Solution {
    public double findMedianSortedArrays(int[] arrayA, int[] arrayB) {
        int lengthA = arrayA.length, lengthB = arrayB.length;
        int totalLength = lengthA + lengthB;
        if (totalLength % 2 == 1) {
            return findKthElement(arrayA, arrayB, totalLength / 2, 0, lengthA - 1, 0, lengthB - 1);
        } else {
            return ((double) (findKthElement(arrayA, arrayB, totalLength / 2, 0, lengthA - 1, 0, lengthB - 1) +
                    findKthElement(arrayA, arrayB, totalLength / 2 - 1, 0, lengthA - 1, 0, lengthB - 1)) /
                    2);
        }
    }

    public int findKthElement(
            int[] arrayA,
            int[] arrayB,
            int k,
            int startA,
            int endA,
            int startB,
            int endB) {
        // If the segment of one array is empty, it means we have passed all
        // its elements, just return the corresponding element in the other array.
        if (endA < startA) {
            return arrayB[k - startA];
        }
        if (endB < startB) {
            return arrayA[k - startB];
        }

        // Get the middle indexes and middle values of arrayA and arrayB.
        int midIndexA = (startA + endA) / 2, midIndexB = (startB + endB) / 2;
        int midValueA = arrayA[midIndexA], midValueB = arrayB[midIndexB];

        // If k is in the right half of arrayA + arrayB, remove the smaller left half.
        if (midIndexA + midIndexB < k) {
            if (midValueA > midValueB) {
                return findKthElement(arrayA, arrayB, k, startA, endA, midIndexB + 1, endB);
            } else {
                return findKthElement(arrayA, arrayB, k, midIndexA + 1, endA, startB, endB);
            }
        }
        // Otherwise, remove the larger right half.
        else {
            if (midValueA > midValueB) {
                return findKthElement(arrayA, arrayB, k, startA, midIndexA - 1, startB, endB);
            } else {
                return findKthElement(arrayA, arrayB, k, startA, endA, startB, midIndexB - 1);
            }
        }
    }
}