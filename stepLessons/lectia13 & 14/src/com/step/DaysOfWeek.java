package com.step;

//constantele deobicei se scriu cu uppercase
public enum DaysOfWeek {
    MONDAY (1),
    TUESDAY (2),
    WEDNESDAY (3),
    THURSDAY (4),
    FRIDAY (5),
    SATURDAY (6),
    SUNDAY (7);

    private int abbreviation;

    private DaysOfWeek(int abbreviation) {
        this.abbreviation = abbreviation;
    }

    private DaysOfWeek() {}
}
