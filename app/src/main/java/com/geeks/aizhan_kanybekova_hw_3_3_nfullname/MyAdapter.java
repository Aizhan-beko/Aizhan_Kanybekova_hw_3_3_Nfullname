package com.geeks.aizhan_kanybekova_hw_3_3_nfullname;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private List<String> numbers;
    private List<String> fullnames;

    public MyAdapter(Context context, List<String> numbers, List<String> names) {
        this.context = context;
        this.numbers = numbers;
        this.fullnames = names;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_fullname, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.numberTextView.setText(numbers.get(position));
        holder.fnameTextView.setText(fullnames.get(position));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView numberTextView;
        TextView fnameTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            numberTextView = itemView.findViewById(R.id.number_text_view);
            fnameTextView = itemView.findViewById(R.id.fname_text_view);
        }
    }
}