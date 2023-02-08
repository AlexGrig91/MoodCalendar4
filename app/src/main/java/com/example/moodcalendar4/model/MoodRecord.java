package com.example.moodcalendar4.model;

public class MoodRecord {
    private final String description;
    private final Long date;
    private final MoodRate rate;

    public MoodRecord(String description, Long date, MoodRate rate) {
        this.description = description;
        this.date = date;
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public Long getDate() {
        return date;
    }

    public MoodRate getRate() {
        return rate;
    }
}