package com.example.moodcalendar4.model;

import java.util.List;

public interface MoodRecordRepository {
    List<MoodRecord> getAll();

    void addRecord(MoodRecord record);

    void onListUpdate(OnListUpdateListener listener);

    interface OnListUpdateListener{

        void onUpdate();
    }
}
