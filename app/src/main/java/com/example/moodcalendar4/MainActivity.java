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
        // создали адаптер.Адаптер это то что контролирует отображение списка на ресайклере
        MoodAdapter adapter = new MoodAdapter();
        // превязали адаптер к ресайклеру
        moodList.setAdapter(adapter);
        //временная мера получаем список потом будет заменено
        MoodRecordRepository repository = new MockMoodRecordRepository();
        List<MoodRecord> records = repository.getAll();
        //передаём в адаптер список записей
        adapter.submitList(records);


        MainController mainController = new MainController(tvDisplayDate);
        mainController.start();
    }
}

