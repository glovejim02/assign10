package assign10;

import assign10.BinaryMaxHeap;
import timing.TimingExperiment;

import java.util.Random;

/**
 * Timing experiment to measure the performance of BinaryMaxHeap.peek()
 */
public class PeekOperationTimingExperiment extends TimingExperiment {

    private BinaryMaxHeap<Integer> heap;

    // Number of times to call peek() per experiment run
    private static final int PEEK_REPEAT_COUNT = 10_000;

    public PeekOperationTimingExperiment() {
        super("Heap Size",
              1000,      // Min size
              10,         // Number of sizes
              500,      // Step size
              5);        // Iteration count per size
    }

    @Override
    protected void setupExperiment(int problemSize) {
        heap = new BinaryMaxHeap<>();
        Random rand = new Random(42);
        for (int i = 0; i < problemSize; i++) {
            heap.add(rand.nextInt());
        }
    }

    @Override
    protected void runComputation() {
        for (int i = 0; i < PEEK_REPEAT_COUNT; i++) {
            heap.peek();
        }
    }

    public static void main(String[] args) {
        new PeekOperationTimingExperiment().printResults();
    }
}