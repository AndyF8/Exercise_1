package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Activityregis extends AppCompatActivity {

    Button bure;

    EditText ranama, ramail, rapass, rarepass;

    String Nama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ranama = findViewById(R.id.nama0);
        ramail = findViewById(R.id.mail0);
        rapass = findViewById(R.id.Pass0);
        rarepass = findViewById(R.id.repass0);
        bure = findViewById(R.id.register);

        bure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View z) {

                Nama = ranama.getText().toString();

                    if (ranama.getText().toString().length() == 0) {
                        ranama.setError("Masukkan nama");


                    }

                    if (ramail.getText().toString().length() == 0) {
                        ramail.setError("Masukkan Email");
                    }

                    else if(rapass.getText().toString().length()==0) {
                        rapass.setError("Masukkan password");


                    }
                    else if (rarepass.getText().toString().length()==0) {
                        rarepass.setError("Masukkan kembali password");
                    }

                    else {
                        if (rapass.getText().toString().equals(rarepass.getText().toString())) {
                            Toast.makeText(getApplicationContext(), "Register berhasil",
                                    Toast.LENGTH_LONG).show();

                            Bundle n = new Bundle();
                            n.putString("p", Nama.trim());
                            Intent m = new Intent(getApplicationContext(), activityex1.class);
                            m.putExtras(n);
                            startActivity(m);

                        } else {
                            Snackbar.make(z, "Password harus sama",
                                    Snackbar.LENGTH_LONG).show();

                        }


                    }


            }
        });
    }
}
