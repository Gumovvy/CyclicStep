package com.gmv.cyclicstep;

import java.util.Scanner;

public class allRequiredFunction {


    public static float getLengthOfStep(float lenght) {

        return lenght;
    }

    public int getDistanceOfRunning(int distance) {
        return distance;
    }

    public float getTimeToBeat(float timeTobeat) {
        return timeTobeat;
    }

    public float readLengthOfStep() {
        Scanner lenghtOfStep = new Scanner(System.in);
        System.out.println("Enter length of step: ");
        return lenghtOfStep.nextFloat();
    }

    public int readDistance() {
        Scanner distanceToBeat = new Scanner(System.in);
        System.out.println("Enter distance to beat: ");
        int distance = distanceToBeat.nextInt();
        return distance;
    }

    public float readTimetoBeat() {
        Scanner timeToBeat = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int timeInMinutes = timeToBeat.nextInt();
        System.out.println("Enter seconds: ");
        int timeInSeconds = timeToBeat.nextInt();
        while (timeInSeconds > 59) {
            System.out.println("Time of second cannot be more than 59");
            timeInSeconds = timeToBeat.nextInt();
        }
        float finalTime = (timeInMinutes * 60) + timeInSeconds;

        System.out.println("You want to beat time: " + timeInMinutes + ":" + timeInSeconds);
        System.out.println("Final time in second: " + finalTime);
        return finalTime;
    }

    public int finalTime(int timeInMinutes, int timeInSeconds) {
        int finalTime = (timeInMinutes * 60) + timeInSeconds;

        //System.out.println("You want to beat time: " + timeInMinutes + ":" + timeInSeconds);
        // System.out.println("Final time in second: " + finalTime);
        return finalTime;
    }


    public float countOfStep(int distance, float step) {
        //System.out.println("You have to make " + distance / step + " steps.");
        return distance / step;
    }

    public float stepsPerSeconds(float timeToBeat, float steps) {
        double stepsDivedeTime = steps / timeToBeat;
        return steps / timeToBeat;

    }

    public double amountStepsPerSeconds(double timeToBeat, float steps) {
        double stepsPerTime = steps / timeToBeat;
        double stepsPerSeconds = 1000 / stepsPerTime;
        //System.out.println("On every seceond you have to make " + stepsPerTime + " steps. This means that you have to make a step every " + stepsPerSeconds + " miliseconds.");
        return stepsPerSeconds;
    }


    public void funkcjaGlowna() throws InterruptedException {
        float lenghtOfStep = getLengthOfStep(readLengthOfStep());
        int distanceToBeat = getDistanceOfRunning(readDistance());
        double timeToBeat = this.getTimeToBeat(readTimetoBeat());
        float steps = countOfStep(distanceToBeat, lenghtOfStep);
        long stepsPerSecond = (long) amountStepsPerSeconds(timeToBeat, steps);

        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < steps; i++) {

            Thread.sleep((int) stepsPerSecond);
            System.out.println("Step");


        }
        long currentTimeAfterThreads = System.currentTimeMillis();

        long finnalyTime = (currentTimeAfterThreads - currentTime);

        System.out.println("Czas to " + finnalyTime);

    }

    public void funkcjaGlowna(float steps, long stepsPerSecond) throws InterruptedException {

        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < steps; i++) {
            Thread.sleep((int) stepsPerSecond);
            System.out.println("Step");


        }
        long currentTimeAfterThreads = System.currentTimeMillis();

        long finnalyTime = (currentTimeAfterThreads - currentTime);

        System.out.println("Czas to " + finnalyTime);

    }

}
