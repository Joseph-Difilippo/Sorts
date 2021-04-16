package lab9;

public class SortingExercises
{

	/*
	 * 
	 * Please implement quickSort algorithm
	 * 
	 * to sort any given integer array in non-increasing order
	 * 
	 * Example:
	 * 
	 * input: arr = [5, 0, 3, 10, 0, 3]
	 * 
	 * return [10, 5, 3, 3, 0, 0]
	 *
	 * 
	 * 
	 */

	/**
	 * 
	 * @param arr
	 *            - input array (unsorted)
	 * 
	 * @return array in non-increasing order
	 * 
	 */

	public static int[] quickSort(int[] arr)

	{
		int left = 0;
		int right = arr.length - 1;
		helper(arr, left, right);
		return arr;
	}

	private static void helper(int[] arr, int left, int right)
	{
		if (left >= right)
			return;
		else
		{
			int pivotIndex = partition(arr, left, right);
			helper(arr, left, pivotIndex - 1);
			helper(arr, pivotIndex + 1, right);
		}
	}

	private static int partition(int[] arr, int low, int high)
	{
		int l = low;
		int pivot = arr[high];
		int r = high - 1;
		while (l <= r)
		{
			while (l <= r && arr[l] > pivot)
				l++;
			while (l <= r && arr[r] <= pivot)
				r--;
			if (l < r)
			{
				swap(arr, l, r);
				l++;
				r--;
			}
		}
		swap(arr, l, high);
		return l;
	}

	private static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/*
	 * 
	 * Please implement improved Bubble Sort algorithm (NOT the regular bubble sort)
	 * to sort any given integer array
	 * 
	 * Note: improved Bubble Sort is the one using a flag to detect if array has
	 * been already sorted and hence can stop earlier.
	 * 
	 * (If you can't recall this algorithm, please check the lecture note posted on
	 * blackboard.)
	 * 
	 * 
	 * 
	 * Example:
	 * 
	 * input: arr = [5, 0, 3, 10, 0, 3]
	 * 
	 * return [0, 0, 3, 3, 5, 10]
	 * 
	 */

	/**
	 * 
	 * @param arr
	 *            - input array (unsorted)
	 * 
	 * @return array sorted in non-decreasing order
	 * 
	 */

	public static int[] improvedBubbleSort(int[] arr)

	{

		boolean isSorted = false;
		boolean didSwap = false;

		while (!isSorted)
		{
			isSorted = true;
			for (int i = 0; i < arr.length - 1; i++)
			{
				if (arr[i] > arr[i + 1])
				{
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					isSorted = false;
					didSwap = true;
				}
			}
			if (!didSwap)
				break;

		}

		return arr;

	}

	/*
	 * Given an array containing only 0's, 1's and/or 2's, please implement an
	 * in-place [without using extra memory] 98 algorithm to sort the array in O(N)
	 * time.
	 * 
	 * Example: input: arr = [0, 1, 2, 2, 1, 0, 1, 0] return [0, 0, 0, 1, 1, 1, 2,
	 * 2]
	 */

	/**
	 * 
	 * 
	 * @param arr
	 *            - input array
	 * @return array sorted in non-decreasing order
	 */

	public static int[] threeNumsSort(int[] arr)
	{
		partition2(arr, 0, arr.length - 1, 1);
		partition2(arr, 0, arr.length - 1, 0);

		return arr;
	}

	public static void partition2(int[] arr, int low, int high, int pivot)
	{

		while (low <= high)
		{
			// find bigger item on the left
			while (low <= high && arr[low] <= pivot)
				low++;
			// find smaller item on the right
			while (low <= high && arr[high] > pivot)
				high--;
			if (low < high)
			{
				swap(arr, low, high);
				low++;
				high--;
			}
		}

	}

	/* ====== Extra Credit (10% question) ============================== */

	/*
	 * Please implement bubble sort algorithm using recursion. Feel free to add any
	 * helper function if needed.
	 * 
	 * 
	 */
	/**
	 * 
	 * 
	 * 
	 * 
	 * @param arr
	 *            - a generic array 128
	 * @return array sorted in non-decreasing order 129
	 */

	public static <E extends Comparable<E>> E[] recursiveBubbleSort(E[] arr)

	{

		// To-do: you code here

		return null; // please remove this line after coding

	}

}