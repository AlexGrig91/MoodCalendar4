package com.example.moodcalendar4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moodcalendar4.model.MockMoodRecordRepository;
import com.example.moodcalendar4.model.MoodRecord;
import com.example.moodcalendar4.model.MoodRecordRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvDisplayDate = findViewById(R.id.current_date);
        RecyclerView moodList = findViewById(R.id.mood_list);
        //установили лайаут менеджер для указания способа отображения элементов в списке
        // (Вертикальный список. есть ещё горизонтальный список и галерея)
        moodList.setLayoutManager(new LinearLayoutManager(this));

        MainController mainController = new MainController(tvDisplayDate, moodList);
        mainController.start();
    }
}

