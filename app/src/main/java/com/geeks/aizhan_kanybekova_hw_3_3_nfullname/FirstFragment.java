package com.geeks.aizhan_kanybekova_hw_3_3_nfullname;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<String> numbers;
    private List<String> fullnames;
    private LayoutInflater inflater;
    private ViewGroup container;
    private Bundle savedInstanceState;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        numbers = new ArrayList<>();
        fullnames = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            numbers.add("№ " + i);
            fullnames.add("Kanybekova " );
            fullnames.add("Temirov " );
            fullnames.add("Jusueva ");
            fullnames.add("Azizov " );
            fullnames.add("Alimbekova " );
            fullnames.add("Rakiev" );
            fullnames.add("Rahmanova" );
            fullnames.add("Akylbekov" );
            fullnames.add("Akimova" );
            fullnames.add("Sabirova" );
            fullnames.add("Muhtarova" );
            fullnames.add("Rahimova" );
            fullnames.add("Nurlanova" );
            fullnames.add("Taalaybekova" );
            fullnames.add("Aliev" );
        }

        adapter = new MyAdapter(requireContext(), numbers, fullnames);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}



