class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        int pivot = arr[mid];
        int smallercount = 0;

        for (int i = lo; i <= hi; i++) {
            if (i == mid) continue;
            if (arr[i] <= pivot) {
                smallercount++;
            }
        }

        int pivotIndex = lo + smallercount;
        swap(arr, mid, pivotIndex);

        int i = lo, j = hi;
        while (i < pivotIndex && j > pivotIndex) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public int quickselect(int[] arr, int lo, int hi, int k) {
        if (lo <= hi) {
            int ind = partition(arr, lo, hi);
            if (ind == k) {
                return arr[ind];
            } else if (ind > k) {
                return quickselect(arr, lo, ind - 1, k);
            } else {
                return quickselect(arr, ind + 1, hi, k);
            }
        }
        return -1;
    }

    public int findKthLargest(int[] arr, int k) {
        int indexToFind = arr.length - k; // Kth largest = (N - K)th smallest
        return quickselect(arr, 0, arr.length - 1, indexToFind);
    }
}
