package com.example.workoutapp.classes;

/**
 * Set of a certain exercise
 *
 * @author gtrentz
 * Created 12-28-2023
 */
public class LiftSet {
    private String exercise;
    private int weight;
    private int reps;
    private int rpe;

    /**
     * Standard constructor
     * @param e Exercise
     * @param w Weight (in pounds)
     * @param r # of reps
     */
    public LiftSet(String e, int w, int r) {
        this.exercise = e;
        this.weight = w;
        this.reps = r;
        this.rpe = 0;
    }

    /**
     * Constructor for free weight exercises
     * @param e Exercise
     * @param r # of reps
     */
    public LiftSet(String e, int r) {
        this.exercise = e;
        this.weight = 0;
        this.reps = r;
        this.rpe = 0;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getRpe() {
        return rpe;
    }

    public void setRpe(int rpe) {
        this.rpe = rpe;
    }
}

