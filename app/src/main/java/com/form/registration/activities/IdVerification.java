package com.form.registration.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.form.registration.R;

/**
 * Created by Creative IT Works on 16-Apr-18.
 */

public class IdVerification extends AppCompatActivity {
    Button next;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proof);
        intializeViews();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IdVerification.this, DocumentVerification.class);
                startActivity(i);
            }
        });
    }

    void intializeViews() {
        next = (Button) findViewById(R.id.next);

    }
}
