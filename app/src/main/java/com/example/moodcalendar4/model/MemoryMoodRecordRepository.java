package com.example.moodcalendar4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemoryMoodRecordRepository implements MoodRecordRepository{

    List<MoodRecord> records =  new ArrayList<MoodRecord>(Arrays.asList(
            new MoodRecord("description of day1",0l, MoodRate.POSITIVE),
            new MoodRecord("description of day2",100l, MoodRate.NEGATIVE),
            new MoodRecord("description of day3",200l, MoodRate.NORMAL)
    ));

    @Override
    public List<MoodRecord> getAll() {
        return records;
    }

    @Override
    public void addRecord(MoodRecord record) {
        records.add(record);
        listener.onUpdate();
    }

    OnListUpdateListener listener;

    @Override
    public void onListUpdate(OnListUpdateListener listener) {
        this.listener = listener;
    }
}
