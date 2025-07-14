package assign10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryMaxHeapTester {

	public List<Integer> numbers;
	
	@BeforeEach
	public void setup(){
		numbers = new ArrayList<Integer>(Arrays.asList(new Integer[] {45, -6, 78, 23, 0, -8, 80}));
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
