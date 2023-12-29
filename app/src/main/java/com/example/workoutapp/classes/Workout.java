package com.example.workoutapp.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Creates new workout
 *
 * @author gtrentz
 * Created 12-26-2023
 */

public class Workout {
    private String title;
    private String sport;
    private LocalDate day;

    /**
     * Workout constructor
     *
     * @param t Workout title
     * @param s Sport (lift, run, bike, etc)
     */

    public Workout(String t, String s) {
        title = t; sport = s;
        day = LocalDate.now();
    }

    public String getTitle() {return title;}

    public String getSport() {return sport;}

    public LocalDate getDay() {return day;}

    /**
     * LocalDate default (yyyy-mm-dd) -> (Month dd, yyyy)
     * @return The date formatted more nicely
     */

    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return title + "\nSport: " + sport + "\n" + day.format(f);
    }
}
