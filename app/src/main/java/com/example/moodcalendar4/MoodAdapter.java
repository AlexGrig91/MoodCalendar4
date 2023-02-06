package com.example.moodcalendar4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moodcalendar4.model.MoodRecord;

import java.util.Objects;

class MoodAdapter extends ListAdapter<MoodRecord, MoodAdapter.MoodViewHolder> {

    protected MoodAdapter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<MoodRecord> DIFF_CALLBACK = new DiffUtil.ItemCallback<MoodRecord>() {
        @Override
        // Нужно ли передвинуть строчку в списке
        public boolean areItemsTheSame(@NonNull MoodRecord oldItem, @NonNull MoodRecord newItem) {
            return Objects.equals(oldItem.getDate(), newItem.getDate());
        }

        @Override
        //Нужно ли перерисовать строчку в списке
        public boolean areContentsTheSame(@NonNull MoodRecord oldItem, @NonNull MoodRecord newItem) {
            return oldItem.getDescription().equals(newItem.getDescription()) &&
                    Objects.equals(oldItem.getRate(), newItem.getRate());
        }
    };

    @NonNull
    @Override

    public MoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // получаем раздуватель или инфлэйтер
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // преобразуем икс эм эль описание элеиента во вьюху
        View moodView = inflater.inflate(R.layout.item_mood, parent, false);
        return new MoodViewHolder(moodView);
    }

    @Override
    public void onBindViewHolder(@NonNull MoodViewHolder holder, int position) {
        MoodRecord record = getItem(position);
        holder.bind(record);
    }

    // создаём новый класс вьюхолдера это представление одной строчки это шаблон одной строчки
    class MoodViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView description;
        ImageView moodLevel;

        // это просто конструктор
        public MoodViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.item_date);
            description = itemView.findViewById(R.id.item_description);
            moodLevel = itemView.findViewById(R.id.mood_level);
        }

        public void bind(MoodRecord record) {
            date.setText("15");
            description.setText(record.getDescription());
        }
    }
}
