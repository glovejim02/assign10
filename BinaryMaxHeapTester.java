package assign10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryMaxHeapTester {
	private List<String> groceries;

	private List<Integer> numbers;
	private List<String> strList;
	private List<Integer> intList;

	private BinaryMaxHeap<Integer> emptyHeap;

	private BinaryMaxHeap<Integer> intHeap;
	private BinaryMaxHeap<String> strHeapCaseSensitive;

	@BeforeEach
	public void setup() {
		emptyHeap = new BinaryMaxHeap<Integer>();
		groceries = new ArrayList<>(Arrays.asList(new String[] { "apples", "Bananna", "bananna", "cake" }));
		numbers = new ArrayList<>(Arrays.asList(new Integer[] { 45, -6, 78, 23, 0, -8, 80 }));
		intList = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		strList = Arrays.asList(new String[] { "apples", "Bananna", "bananna", "cake" });
		Comparator<String> caseInsensitive = String.CASE_INSENSITIVE_ORDER;
		strHeapCaseSensitive = new BinaryMaxHeap<>(caseInsensitive);
		intHeap = new BinaryMaxHeap<>(intList);

//		strHeap =  new BinaryMaxHeap<>(strList);

		strHeapCaseSensitive = new BinaryMaxHeap<>(strList, caseInsensitive);

//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		pq.add(36);
//		pq.add(17);
//		pq.add(3);
//		pq.add(100);
//		pq.add(19);
//		pq.add(2);
//		pq.add(70);

//		this.groceries=groceries;
//		Arrays.asList(new String[] { "apples","Bananna","bananna","cake"}
	}

	//////////////////////Test Constructors for BinaryHeap/////////////////////////////////////////////////////////////////////
	@Test
	public void testEmptyConstructor() {
		assertTrue(emptyHeap.isEmpty());
		assertThrows(NoSuchElementException.class, () -> emptyHeap.peek());
		assertEquals(0, emptyHeap.size());

	}

	@Test
	public void testConstructorNoListUsingCaseInsensitiveComparator() {
		List<Integer> unsortedList = Arrays.asList(4, 19, 17, 12, 1, 30, 15, 155);
		BinaryMaxHeap<Integer> maxHeap = new BinaryMaxHeap<Integer>(unsortedList);

		assertEquals(155, maxHeap.peek());
		assertEquals(unsortedList.size(), maxHeap.size());

	}

	@Test
	public void BinaryHeapUsingProvidedComparatorReturnsTopKInDescendingOrder() {

		List<Integer> current= Arrays.asList(4, 19, 17, 12, 1, 30, 15, 155);
		List<Integer> expected= Arrays.asList(155, 30,19);

		assertEquals(expected,FindKLargest.findKLargestHeap(current,3));
	}

	@Test
	public void testConstructorFromListsBinaryHeapUsingNaturalOrdered() {

		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());

	}

	@Test
	public void testConstructorFromListInitializesBinaryHeapUsingGivenComparator() {

		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());

	}

	//////////////////////Test add(E item) for BinaryHeap/////////////////////////////////////////////////////////////////////

// test add resizes backing array correctly 
	@Test
	public void testAddResizesBackingArray() {
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<Integer>();
		for (int i = 0; i < 100; i++)
			heap.add(i);
		assertEquals(100, heap.size());

		assertEquals(99, heap.peek());
	}

// test add correct updates size
	@Test
	public void testAddUpdateSize() {
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<Integer>();
		for (int i = 0; i < 100; i++) {
			heap.add(i);
			assertEquals(i + 1, heap.size());
		}

	}
// test add correctly update the max heap 

	@Test
	public void testAddThenPeekRoot() {
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<Integer>();
		heap.add(3);
		heap.add(9);
		heap.add(12);
		heap.add(7);
		heap.add(6);
		heap.add(1);
		assertEquals(12, heap.peek(), "");
	}

	//////////////////////Test peek() for BinaryHeap/////////////////////////////////////////////////////////////////////

	// throw no such element exception if empty

	@Test
	public void testBuildHeapRootAlwaysMax() {
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<>(Arrays.asList(124, 75, 100000, 122222222, 2343424, 12, 12));
		assertEquals(122222222, heap.peek(), "");
	}

	@Test
	public void testPeakThrowsEceptionOnEmptyList() {
		assertThrows(NoSuchElementException.class, () -> emptyHeap.peek());
	}

	//////////////////////Test size()) for BinaryHeap/////////////////////////////////////////////////////////////////////
	@Test
	public void testS() {

		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());

	}

	@Test
	public void testSize() {
		// List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(new Integer[]
		// {45, -6, 78, 23, 0, -8, 80}));
		BinaryMaxHeap<Integer> actual = new BinaryMaxHeap<Integer>(numbers);
		assertEquals(7, actual.size());
	}

	//////////////////////Test extract() for BinaryHeap/////////////////////////////////////////////////////////////////////
	@Test
	public void testExtractsDescendingOrderAndRemovesItem() {
		// List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(new Integer[]
		// {45, -6, 78, 23, 0, -8, 80}));
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<Integer>(numbers);
		int previous = heap.extract();// extract first item
		while (!heap.isEmpty()) {
			int current = heap.extract();// extract second item and compare until not more left

			assertTrue(previous >= current);
			previous = current;

		}
		assertEquals(0, heap.size());
		assertTrue(heap.isEmpty());

	}

	// throw no such element exception if empty
	@Test
	public void testExtractThrowsIfHeapEmpty() {
		assertThrows(NoSuchElementException.class, () -> emptyHeap.extract());

	}

	//////////////////////Test isEmpty() for BinaryHeap/////////////////////////////////////////////////////////////////////

	@Test
	public void testEmptyTrue() {

		assertTrue(emptyHeap.isEmpty());
	}
	@Test
	public void testEmptyFalse() {

		assertTrue(emptyHeap.isEmpty());
	}

	//////////////////////Test clear() for BinaryHeap/////////////////////////////////////////////////////////////////////
	@Test
	public void testAddThenClear() {
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<Integer>();
		heap.add(3);
		heap.add(9);
		heap.add(12);
		heap.add(7);
		heap.add(6);
		heap.add(1);
		heap.clear();
		assertEquals(0, heap.size());
	}

	//////////////////////Test toArray() for BinaryHeap/////////////////////////////////////////////////////////////////////
	@Test
	public void testToArrayAfterAdding() {
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<Integer>();
		heap.add(3);

		heap.add(9);

		heap.add(12);

		heap.add(7);

		heap.add(6);

		heap.add(1);

		Object[] expected = { 12, 7, 9, 3, 6, 1 };
		assertArrayEquals(expected, heap.toArray());
		assertEquals(6, heap.size());

	}

	//////////////////////Test buildHeap() for BinaryHeap/////////////////////////////////////////////////////////////////////

}
