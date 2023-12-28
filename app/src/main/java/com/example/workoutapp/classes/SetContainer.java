package com.example.workoutapp.classes;

import java.util.LinkedList;

/**
 * Contains sets for a certain exercise
 *
 * @author gtrentz
 * Created 12-28-2023
 */
public class SetContainer {
    private String exercise;
    private LinkedList<LiftSet> allSets;

    /**
     * Standard constructor, initializes LinkedList
     * containing LiftSets
     * @param exercise Exercise type
     */
    public SetContainer(String exercise) {
        this.exercise = exercise;
        this.allSets = new LinkedList<LiftSet>();
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public LinkedList<LiftSet> getAllSets() {
        return allSets;
    }

    public void setAllSets(LinkedList<LiftSet> allSets) {
        this.allSets = allSets;
    }

    /**
     * @return Current set
     */
    public LiftSet current() {
        if (!allSets.isEmpty()) {
            return allSets.getLast();
        } else {
            return null;
        }
    }

    /**
     * @return Previous set
     */
    public LiftSet previous() {
        if (allSets.size() >= 2) {
            return allSets.get(allSets.size() - 2);
        } else {
            return null;
        }
    }
}

