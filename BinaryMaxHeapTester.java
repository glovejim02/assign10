package assign10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryMaxHeapTester {
	List<String> groceries;

	List<Integer> numbers;
//	private priorityQueue<Integer> intHeap;

	@BeforeEach
	public void setup() {
		numbers = new ArrayList<>(Arrays.asList(new Integer[] { 45, -6, 78, 23, 0, -8, 80 }));
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(36);
		pq.add(17);
		pq.add(3);
		pq.add(100);
		pq.add(19);
		pq.add(2);
		pq.add(70);
		this.groceries = new ArrayList<>(Arrays.asList(new String[] { "apples","Bananna","bananna","cake"}));
//		this.groceries=groceries;
//		Arrays.asList(new String[] { "apples","Bananna","bananna","cake"}
	}
//////////////////////Test Constructors for BinaryHeap/////////////////////////////////////////////////////////////////////

	@Test
	public void testConstructorInitializesEmtpyBinaryHeapUsingNaturalOrdered() {
		
		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());

	}
	@Test
	public void testConstructorInitializesEmtpyBinaryHeapUsingProvidedComparator() {
		
		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());

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
// test add correct updates size
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
		assertEquals(12,heap.peek(),"");
	}
	
//////////////////////Test peek() for BinaryHeap/////////////////////////////////////////////////////////////////////

	//throw no such element exception if empty
	
		@Test
	public void testBuildHeapRootAlwaysMax(){
		BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<>(Arrays.asList(124,75,100000,122222222,2343424,12,12));
		assertEquals(122222222,heap.peek(),"");
	}
	
	
	
//////////////////////Test size()) for BinaryHeap/////////////////////////////////////////////////////////////////////
	@Test
	public void testS() {
		
		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());
//		assertEquals(101,  groceries.getTableCapacity());

	}
	
	
	@Test
	public void testSize() {
		//List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(new Integer[] {45, -6, 78, 23, 0, -8, 80}));
		BinaryMaxHeap<Integer> actual = new BinaryMaxHeap<Integer>(numbers);
		assertEquals(7, actual.size());
	}
	
	
//////////////////////Test extract() for BinaryHeap/////////////////////////////////////////////////////////////////////

	
	
	
	
	//throw no such element exception if empty
	
	
	
//////////////////////Test isEmpty() for BinaryHeap/////////////////////////////////////////////////////////////////////
///
///
///
///
///
///
///
///
///
///
///
///
///
//////////////////////Test clear() for BinaryHeap/////////////////////////////////////////////////////////////////////
///
///
///
///
///
///
///
///
///
///
///
///
///
///
///
///
//////////////////////Test toArray() for BinaryHeap/////////////////////////////////////////////////////////////////////
///
///
///
///
///
///
///
///
///
///
///
///
///

//////////////////////Test buildHeap() for BinaryHeap/////////////////////////////////////////////////////////////////////

	
	
	
	

	

	

	
}
