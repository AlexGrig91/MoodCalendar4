package com.example.moodcalendar4.addRecord;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.moodcalendar4.MainActivity;
import com.example.moodcalendar4.R;
import com.example.moodcalendar4.model.MoodRecordRepository;

public class AddRecordFragment extends DialogFragment {

    @Nullable
    @Override
    // Аналог метода onCreateViewHolder()
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View dialogView = inflater.inflate(R.layout.dialog_create_record, null);

        dialogView.findViewById(R.id.button_cancel).setOnClickListener(
                button ->
                        dismiss()
        );
        EditText input = dialogView.findViewById(R.id.edit_text_description);

        MainActivity mainActivity = (MainActivity) getActivity();
        MoodRecordRepository repository = mainActivity.getRepository();
        AddRecordController controller = new AddRecordController(repository);

        dialogView.findViewById(R.id.button_save).setOnClickListener(
                button -> {
                    controller.addRecord(input.getText().toString());
                    dismiss();
                }
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
