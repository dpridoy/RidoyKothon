package com.dpridoy.ridoykothon.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.dpridoy.ridoykothon.R;
import com.dpridoy.ridoykothon.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.textCreateAccount.setOnClickListener(v->
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class)));
    }
}