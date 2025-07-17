package assign10;

import timing.TimingExperiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Timing experiment to measure the performance of findKLargestSort.
 */
public class FindKLargestSortTimingExperiment extends TimingExperiment {

    private List<Integer> inputList;
    private static final int K = 1000; // Number of largest elements to extract

    public FindKLargestSortTimingExperiment() {
        super("Input Size (N)",
              10_000,   // Min size
              10,       // Number of sizes
              10_000,   // Step size
              5);       // Iteration count per size
    }

    @Override
    protected void setupExperiment(int problemSize) {
        inputList = new ArrayList<>();
        Random rand = new Random(42);
        for (int i = 0; i < problemSize; i++) {
            inputList.add(rand.nextInt());
        }
    }

    @Override
    protected void runComputation() {
        FindKLargest.findKLargestSort(inputList, K);
    }

    public static void main(String[] args) {
        new FindKLargestSortTimingExperiment().printResults();
    }
}