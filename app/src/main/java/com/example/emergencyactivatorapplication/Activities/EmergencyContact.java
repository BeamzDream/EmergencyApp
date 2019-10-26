package com.example.emergencyactivatorapplication.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.emergencyactivatorapplication.R;

public class EmergencyContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        Button btnContinueEmergencyContact = findViewById(R.id.btnContinueEmergencyContact);
        btnContinueEmergencyContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EmergencyContact.this, SecurityWords.class);
                startActivity(i);
            }
        });
    }
}
