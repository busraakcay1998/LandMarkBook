package com.example.landmarkbook;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        setContentView(view);

        landmarkArrayList=new ArrayList<>();
        //data

        Landmark pisa =new Landmark("Pisa", "İtaly", R.drawable.pisa);
        Landmark eiffel =new Landmark ("Eiffel", "France", R.drawable.eiffel);
        Landmark colosseum =new Landmark( "Colosseum", "Italy", R.drawable.colosseum);
        Landmark londonbridge =new Landmark( "London Bridge", "UK", R.drawable.towerbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonbridge);

       //RecyclerView
        binding.rcyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.rcyclerView.setAdapter(landmarkAdapter);
    }
}