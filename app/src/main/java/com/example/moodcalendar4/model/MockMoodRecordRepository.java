package com.example.moodcalendar4.model;

import java.util.Arrays;
import java.util.List;

public class MockMoodRecordRepository implements MoodRecordRepository{
    @Override
    public List<MoodRecord> getAll() {
        return Arrays.asList(
                new MoodRecord("description of day1",0l, MoodRate.POSITIVE),
                new MoodRecord("description of day2",100l, MoodRate.NEGATIVE),
                new MoodRecord("description of day3",200l, MoodRate.NORMAL),
                new MoodRecord("description of day3",300l, MoodRate.NORMAL),
                new MoodRecord("description of day3",400l, MoodRate.NORMAL),
                new MoodRecord("description of day3",500l, MoodRate.NORMAL),
                new MoodRecord("description of day3",600l, MoodRate.NORMAL),
                new MoodRecord("description of day3",700l, MoodRate.NORMAL),
                new MoodRecord("description of day8",800l, MoodRate.NORMAL),
                new MoodRecord("description of day8",800l, MoodRate.NORMAL)
        );
    }
}
