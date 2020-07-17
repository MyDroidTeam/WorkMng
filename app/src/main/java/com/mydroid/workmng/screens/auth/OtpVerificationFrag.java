package com.mydroid.workmng.screens.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mydroid.workmng.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OtpVerificationFrag extends Fragment {

    public OtpVerificationFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp_verification, container, false);
    }
}
