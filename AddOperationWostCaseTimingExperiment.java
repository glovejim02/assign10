package assign10;

import java.util.ArrayList;
import java.util.Random;

import timing.ArrayListGenerator;
import timing.TimingExperiment;

public class AddOperationWostCaseTimingExperiment extends TimingExperiment{

	

	   private BinaryMaxHeap<Integer> heap;
	    private int[] data;

	    public AddOperationWostCaseTimingExperiment() {
	        super("Heap Size",       // Description of problem size
	              1000,              // Min size
	              20,                 // Number of different sizes
	              1000,              // Step size
	              20);                // Iterations per size (for median)
	    }


//	    @Override
//	    protected void setupExperiment(int problemSize) {
//	        heap = new BinaryMaxHeap<>();
//	        data = new int[problemSize];
//	        Random rand = new Random(42); // Fixed seed for reproducibility
//	        for (int i = 0; i < problemSize; i++) {
//	            data[i] = rand.nextInt();
//	        }
//	    }
	//
//	    @Override
//	    protected void runComputation() {
//	        for (int num : data) {
//	            heap.add(num);
//	        }
//	    }
	    @Override
	    protected void setupExperiment(int problemSize) {
	    	ArrayList<Integer> list= ArrayListGenerator.generateNearlyAscendingArrayListWithoutDuplicates(problemSize);
	        heap = new BinaryMaxHeap<>();
	        data = new int[problemSize];
//	        Random rand = new Random(42); // Fixed seed for reproducibility
	        for (int i = 0; i < problemSize; i++) {
	            data[i] = i;
	        }
	    }

	    @Override
	    protected void runComputation() {
	        for (int num : data) {
	            heap.add(num);
	        }
	    }

	    public static void main(String[] args) {
	        new AddOperationWostCaseTimingExperiment().printResults();
	    }
}
