package com.mydroid.workmng.screens.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Handler;

import com.mydroid.workmng.R;

public class Authentication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);
                RegistrationFrag frag = new RegistrationFrag();
                getSupportFragmentManager().beginTransaction().add(R.id.container, frag).addToBackStack(null).commit();



    }
}
