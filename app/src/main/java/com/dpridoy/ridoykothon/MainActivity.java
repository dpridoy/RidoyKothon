package com.dpridoy.ridoykothon;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.dpridoy.ridoykothon.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Uri uri = Uri.parse("https://www.noviscore.fr/uploads/rest/demo.title_1.product.fr.pdf");
        binding.pdfView.fromUri(uri);
    }
}