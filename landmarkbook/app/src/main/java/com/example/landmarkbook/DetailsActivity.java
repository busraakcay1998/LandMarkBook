package com.example.landmarkbook;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



import org.w3c.dom.Text;

import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Intent intent = getIntent();
        //Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");


        //Landmark selectedLandmark = singleton.getSelectedLandmark();


        Singleton singleton= Singleton.getInstance();
        Landmark selectedLandmark=singleton.getSentLandmark();


        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);

    }

}