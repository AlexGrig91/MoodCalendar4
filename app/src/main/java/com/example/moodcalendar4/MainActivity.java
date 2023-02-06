package com.example.moodcalendar4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moodcalendar4.model.MockMoodRecordRepository;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvDisplayDate = findViewById(R.id.current_date);
        RecyclerView rvMoodList = findViewById(R.id.mood_list);
        FloatingActionButton btnAddRecord = findViewById(R.id.fab_add_record);
        btnAddRecord.setOnClickListener(
                view -> new AddRecordFragment().show(getSupportFragmentManager(), AddRecordFragment.TAG)
        );
        //установили лайаут менеджер для указания способа отображения элементов в списке
        // (Вертикальный список. есть ещё горизонтальный список и галерея)
        rvMoodList.setLayoutManager(new LinearLayoutManager(this));

        MainController mainController = new MainController(tvDisplayDate, rvMoodList, new MockMoodRecordRepository());
        mainController.start();
    }
}

