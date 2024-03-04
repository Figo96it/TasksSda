package org.example.runner;

import java.util.Arrays;

public enum Runner {

    BEGINNER(300,360),
    INTERMEDIATE(180,300),
    ADVANCED(0,180);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime){
        return Arrays.stream(Runner.values()).filter(runner -> marathonTime >= runner.getMinTime() && marathonTime <= runner.getMaxTime()).findFirst().orElseThrow(() -> new IllegalArgumentException("Invalid marathon time"));
    }
}
