package com.example.moodcalendar4.addRecord;


import com.example.moodcalendar4.model.MoodRate;
import com.example.moodcalendar4.model.MoodRecord;
import com.example.moodcalendar4.model.MoodRecordRepository;

public class AddRecordController {

    MoodRecordRepository repository = null;

    //эти три следующие строчки это конструктор.
    public AddRecordController(MoodRecordRepository repository) {
        this.repository = repository;
    }

    public void addRecord(String recordText) {
        long date = System.currentTimeMillis();
        MoodRecord record = new MoodRecord(recordText, date, MoodRate.POSITIVE);
        repository.addRecord(record);
    }
}
