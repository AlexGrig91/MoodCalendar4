package com.example.moodcalendar4;

import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainController {
    TextView tvDisplayDate;

    public MainController(TextView tvDisplayDate) {
        this.tvDisplayDate = tvDisplayDate;
    }

    public void start() {
        setDate();
    }

    private void setDate() {
        long date = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM");
        String dateString = sdf.format(date);

        tvDisplayDate.setText(dateString);
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