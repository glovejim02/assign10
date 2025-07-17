package assign10;

import timing.TimingExperiment;

import java.util.Random;


/**
 * Timing experiment to measure BinaryMaxHeap.add() in both average and worst cases.
 */
public class AddOperationTimingExperiment extends TimingExperiment {

    private BinaryMaxHeap<Integer> heap;
    private int[] data;
    private final boolean testWorstCase;

    public AddOperationTimingExperiment(boolean testWorstCase) {
        super(testWorstCase ? "Worst-Case Add - Heap Size" : "Average-Case Add - Heap Size",
              1000,  // Min size
              20,    // Number of sizes
              1000,  // Step size
              20);   // Iterations per size
        this.testWorstCase = testWorstCase;
    }

    @Override
    protected void setupExperiment(int problemSize) {
        heap = new BinaryMaxHeap<>();
        data = new int[problemSize];

        if (testWorstCase) {
            // Fill with increasing numbers: worst-case for add()
            for (int i = 0; i < problemSize; i++) {
                data[i] = i;
            }
        } else {
            // Fill with random numbers: average-case
            Random rand = new Random(42);
            for (int i = 0; i < problemSize; i++) {
                data[i] = rand.nextInt();
            }
        }
    }

    @Override
    protected void runComputation() {
        for (int num : data) {
            heap.add(num);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Average Case Add() Timing ===");
        new AddOperationTimingExperiment(false).printResults();

        System.out.println("\n=== Worst Case Add() Timing ===");
        new AddOperationTimingExperiment(true).printResults();
    }
}