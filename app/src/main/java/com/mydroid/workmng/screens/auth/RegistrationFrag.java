package com.mydroid.workmng.screens.auth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.mydroid.workmng.R;

import java.util.concurrent.TimeUnit;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFrag extends Fragment {

    public RegistrationFrag() {
    }

    EditText editTextNumber;
    Button proceedButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_registration, container, false);

        editTextNumber = v.findViewById(R.id.enter_mobile_num_et);
        proceedButton = v.findViewById(R.id.proceed_btn);

        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editTextNumber.getText().length() != 10){
                    editTextNumber.setError("Please Enter a valid number");
                }else {
                    Bundle bundle = new Bundle();
                    bundle.putString("number", editTextNumber.getText().toString());
                    OtpVerificationFrag nextFrag = new OtpVerificationFrag();
                    nextFrag.setArguments(bundle);
                    getFragmentManager().beginTransaction().replace(R.id.container, nextFrag).commit();
                }
                }
        });


        return v;
    }

}
