package assign10;

import assign10.BinaryMaxHeap;
import timing.TimingExperiment;

import java.util.Random;

/**
 * Timing experiment to measure the performance of BinaryMaxHeap.extract()
 */
public class ExtractOperationTimingExperiment extends TimingExperiment {

    private int[] data;

    public ExtractOperationTimingExperiment() {
        super("Heap Size",
              1000,      // Start with 1,000 items
              8,         // Run 8 increasing sizes
              1000,      // Increase by 1,000 each step
              5);        // Median over 5 runs
    }

    @Override
    protected void setupExperiment(int problemSize) {
        data = new int[problemSize];
        Random rand = new Random(42); // Fixed seed for repeatability
        for (int i = 0; i < problemSize; i++) {
            data[i] = rand.nextInt();
        }
    }

    @Override
    protected void runComputation() {
        BinaryMaxHeap<Integer> heap = new BinaryMaxHeap<>();
        for (int value : data) {
            heap.add(value);
        }

        while (!heap.isEmpty()) {
            heap.extract();
        }
    }

    public static void main(String[] args) {
        new ExtractOperationTimingExperiment().printResults();
    }
}