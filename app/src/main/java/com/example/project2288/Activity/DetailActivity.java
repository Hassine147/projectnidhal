package com.example.project2288.Activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.project2288.Domain.ItemDomain;
import com.example.project2288.R;
import com.example.project2288.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    private ItemDomain object;
    private int weight=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        
        getBundles();
        setVariable();

    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(v -> finish());
        Glide.with(DetailActivity.this)
                .load(object.getImagePath())
                .load(binding.img);
        binding.pricekgTxt.setText(object.getPrice()+ " $/kg");
    }

    private void getBundles() {
        object= (ItemDomain) getIntent().getSerializableExtra("object");
    }

}