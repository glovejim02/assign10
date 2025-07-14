package assign10;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class to create a binary max heap.
 * 
 * @authors - Aaron Carlson and James glover
 * @version - 7/14/25
 * @param <E>
 */
public class BinaryMaxHeap<E> implements PriorityQueue<E> {

	private final int DEFAULT_CAPACITY = 10;
	private E[] backingArray;
	private int size;
	private Comparator<? super E> comparator;

	/**
	 * If this constructor is used to create an empty binary heap, it is assumed
	 * that the elements are ordered using their natural ordering (i.e., E
	 * implements Comparable<? super E>).
	 */
	@SuppressWarnings("unchecked")
	public BinaryMaxHeap() {
		this.backingArray = (E[]) new Object[DEFAULT_CAPACITY];
		this.comparator = null;
		this.size = 0;
	}

	/**
	 * If this constructor is used to create an empty binary heap, it is assumed
	 * that the elements are ordered using the provided Comparator object.
	 * 
	 * @param cmp
	 */
	@SuppressWarnings("unchecked")
	public BinaryMaxHeap(Comparator<? super E> cmp) {
		this.backingArray = (E[]) new Object[DEFAULT_CAPACITY];
		this.comparator = cmp;
		this.size = 0;
	}

	/**
	 * If this constructor is used, then the binary heap is constructed from the
	 * given list. Also, it is assumed that the elements are ordered using their
	 * natural ordering (i.e., E implements Comparable<? super E>). RECALL: Using
	 * the buildHeap operation, we can construct a binary heap from these N items in
	 * O(N) time, which is more efficient than adding them to the binary heap one at
	 * a time. This constructor must use such an operation.
	 * 
	 * @param list
	 */
	@SuppressWarnings("unchecked")
	public BinaryMaxHeap(List<? extends E> list) {
		this.size = list.size();
		//use Math.max to ensure that the size is set with enough room for more if the size of the list is less than 10
		this.backingArray = (E[]) new Object[Math.max(DEFAULT_CAPACITY, size)];
		this.comparator = null;
		for (int i = 0; i < size; i++) {
			backingArray[i] = list.get(i);
		}
		buildHeap();
	}

	/**
	 * If this constructor is used, then the binary heap is constructed from the
	 * given list (see RECALL note above). Also, it is assumed that the elements are
	 * ordered using the provided Comparator object.
	 * 
	 * @param list
	 * @param cmp
	 */
	@SuppressWarnings("unchecked")
	public BinaryMaxHeap(List<? extends E> list, Comparator<? super E> cmp) {
		this.size = list.size();
		//use Math.max to ensure that the size is set with enough room for more if the size of the list is less than 10
		this.backingArray = (E[]) new Object[Math.max(DEFAULT_CAPACITY, size)];
		this.comparator = cmp;
		for (int i = 0; i < size; i++) {
			backingArray[i] = list.get(i);
		}
		buildHeap();
	}

	/**
	 * Adds the given item to this priority queue. O(1) in the average case, O(log
	 * N) in the worst case
	 * 
	 * @param item - to be added to this priority queue
	 */
	@Override
	public void add(E item) {
		if (size == backingArray.length) {
			resize();
		}
		backingArray[size] = item;
		percolateUp(size);
		size++;
	}

	/**
	 * Returns, but does not remove, the highest priority item this priority queue.
	 * O(1)
	 * 
	 * @return the highest priority item
	 * @throws NoSuchElementException if this priority queue is empty
	 */
	@Override
	public E peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return backingArray[0];
	}

	/**
	 * Determines the number of items in this priority queue. O(1)
	 * 
	 * @return the number of items in this priority queue
	 */
	@Override
	public int size() {
		
		return size;
	}

	/**
	 * Extracts (removes) the highest priority item this priority queue. O(log N)
	 * 
	 * @return the highest priority item
	 * @throws NoSuchElementException if this priority queue is empty
	 */
	@Override
	public E extract() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Determines if this priority queue is empty. O(1)
	 * 
	 * @return true if this priority queue is empty, false otherwise
	 */
	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	/**
	 * Empties this priority queue of items. O(1)
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	/**
	 * Generates an array of the items in this priority queue, in the same order
	 * they appear in the backing array. O(N)
	 * 
	 * (NOTE: This method is needed for grading purposes. The root item must be
	 * stored at index 0 in the returned array, regardless of whether it is in
	 * stored there in the backing array.)
	 * 
	 * @return array of items in this priority queue
	 */
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	// Helper methods
	private void buildHeap() {
		// TODO Auto-generated method stub

	}

	private void percolateUp(int index) {

	}

	private void percolateDown(int index) {

	}

	private int innerCompare(E a, E b) {
		if (comparator != null)
			return comparator.compare(a, b);
		return ((Comparable<? super E>) a).compareTo(b);
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		E[] newArray = (E[]) new Object[backingArray.length * 2];
		System.arraycopy(backingArray, 0, newArray, 0, size);
		backingArray = newArray;
	}
}
