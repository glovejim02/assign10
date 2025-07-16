package assign10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class contains generic static methods for finding the k largest items in
 * a list.
 * 
 * @author Prof. Parker and ??
 * @version ??
 */
public class FindKLargest {

	/**
	 * Determines the k largest items in the given list, using a binary max heap and
	 * the natural ordering of the items.
	 * 
	 * @param items - the given list
	 * @param k     - the number of largest items
	 * @return a list of the k largest items, in descending order
	 * @throws IllegalArgumentException if k is negative or larger than the size of
	 *                                  the given list
	 */
	public static <E extends Comparable<? super E>> List<E> findKLargestHeap(List<E> items, int k)
			throws IllegalArgumentException {
		// k cannot be negative or greater than the list size
		argumentCheck(items, k);
		if (k == 0)
			return new ArrayList<>(0);
		BinaryMaxHeap<E> heap = new BinaryMaxHeap<>(items);
		// extract the k largest
		List<E> heapList = new ArrayList<>(k);
		for (int i = 0; i < k; i++)
			heapList.add(heap.extract());
		return heapList;
	}

	/**
	 * Determines the k largest items in the given list, using a binary max heap.
	 * 
	 * @param items - the given list
	 * @param k     - the number of largest items
	 * @param cmp   - the comparator defining how to compare items
	 * @return a list of the k largest items, in descending order
	 * @throws IllegalArgumentException if k is negative or larger than the size of
	 *                                  the given list
	 */
	public static <E> List<E> findKLargestHeap(List<E> items, int k, Comparator<? super E> cmp)
			throws IllegalArgumentException {
		argumentCheck(items, k);
		if (k == 0)
			return new ArrayList<>(0);
		BinaryMaxHeap<E> heap = new BinaryMaxHeap<>(items, cmp);
		// extract the k largest
		List<E> heapList = new ArrayList<>(k);
		for (int i = 0; i < k; i++)
			heapList.add(heap.extract());
		return heapList;
	}

	/**
	 * Determines the k largest items in the given list, using Java's sort routine
	 * and the natural ordering of the items.
	 * 
	 * @param items - the given list
	 * @param k     - the number of largest items
	 * @return a list of the k largest items, in descending order
	 * @throws IllegalArgumentException if k is negative or larger than the size of
	 *                                  the given list
	 */
	public static <E extends Comparable<? super E>> List<E> findKLargestSort(List<E> items, int k)
			throws IllegalArgumentException {
		argumentCheck(items, k);
		if (k == 0)
			return new ArrayList<>(0);
		List<E> heapList = new ArrayList<>(items);
		heapList.sort(Collections.reverseOrder());

		// TODO: Fill in (do not return null).
		return new ArrayList<>(heapList.subList(0, k));
	}

	/**
	 * Determines the k largest items in the given list, using Java's sort routine.
	 * 
	 * @param items - the given list
	 * @param k     - the number of largest items
	 * @param cmp   - the comparator defining how to compare items
	 * @return a list of the k largest items, in descending order
	 * @throws IllegalArgumentException if k is negative or larger than the size of
	 *                                  the given list
	 */
	public static <E> List<E> findKLargestSort(List<E> items, int k, Comparator<? super E> cmp)
			throws IllegalArgumentException {
		argumentCheck(items, k);
		if (k == 0)
			return new ArrayList<>(0);
		List<E> heapList = new ArrayList<>(items);
		heapList.sort(cmp.reversed());

		return new ArrayList<>(heapList.subList(0, k));
	}
/**
 * 
 * @param items
 * @param k
 */
	private static void argumentCheck(List<?> items, int k) {
		if (k < 0 || k > items.size()) {
			throw new IllegalArgumentException("Invalid value of k");
		}
	}
}