package com.example.moodcalendar4.addRecord;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.moodcalendar4.MainController;
import com.example.moodcalendar4.R;
import com.example.moodcalendar4.model.MockMoodRecordRepository;

public class AddRecordFragment extends DialogFragment {

    @Nullable
    @Override
    // Аналог метода onCreateViewHolder()
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View dialogView = inflater.inflate(R.layout.dialog_create_record, null);
        dialogView.findViewById(R.id.button_cancel).setOnClickListener(
                button -> dismiss()
        );
        dialogView.findViewById(R.id.button_save).setOnClickListener(
                button -> dismiss()
        );
        return dialogView;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//
//        LayoutInflater inflater = requireActivity().getLayoutInflater();
//        View dialogView = inflater.inflate(R.layout.dialog_create_record, null);
//
//        builder.setView(dialogView);
        return super.onCreateDialog(savedInstanceState);
    }

    public static String TAG = "AddRecordFragment";
}
