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
//Test constructor for hashTable/////////////////////////////////////////////////////////////////////

	@Test
	public void testConstructorInitializes() {
		
		assertEquals("cake", groceries.get(3));
		assertEquals(4, groceries.size());
//		assertEquals(101,  groceries.getTableCapacity());

	}
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
	
	@Test
	public void testAddThenPeekRoot() {

	}
	
	@Test
	public void testBinaryHeapConstructor(){
		
	}
}
