package com.example.moodcalendar4;

import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.moodcalendar4.model.MoodRecord;
import com.example.moodcalendar4.model.MoodRecordRepository;

import java.text.SimpleDateFormat;
import java.util.List;

public class MainController {
    //
    TextView tvDisplayDate = null;
    RecyclerView moodList = null;
    MoodRecordRepository repository = null;

    // создали адаптер.Адаптер это то что контролирует отображение списка на ресайклере
    MoodAdapter adapter = new MoodAdapter();

    //в строчке 17 и 18 были нуллы а стали теперь теми кем были в маин активити мы их закинули как
    //аргумент конструктора
    public MainController(TextView tvDisplayDate, RecyclerView moodList, MoodRecordRepository repository) {
        this.tvDisplayDate = tvDisplayDate;
        this.moodList = moodList;
        this.repository = repository;

        // превязали адаптер к ресайклеру
        moodList.setAdapter(adapter);
    }


    //public MoodAdapter adapter = new MoodAdapter();

    public void start() {
        setDate();
        setRecycler();
    }

    private void setDate() {
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM");
        String dateString = sdf.format(date);
        tvDisplayDate.setText(dateString);
    }

    private void setRecycler() {
        //временная мера получаем список потом будет заменено
        List<MoodRecord> records = repository.getAll();
        //передаём в адаптер список записей
        adapter.submitList(records);
    }


}


//class Date{
//    String date;
//
//    public Date(String dateString) {
//        this.date = dateString;
//    }
//}
//
//class DataProvider {
//
//    public Date getCurrentDate(){
//        long date = System.currentTimeMillis();
//        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM");
//        String dateString = sdf.format(date);
//        return new Date(dateString);
//    }
//}