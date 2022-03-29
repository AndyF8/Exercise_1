package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Button tbllogin;
    EditText opnama, oppass;
    String nama;
    TextView Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opnama = findViewById(R.id.mail);
        oppass = findViewById(R.id.passwords);
        tbllogin = findViewById(R.id.signin);
        Register = (TextView) findViewById(R.id.daftar);




        tbllogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = opnama.getText().toString();

                if (opnama.getText().toString().equals("Justice") && oppass.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    Bundle a = new Bundle ();
                    a.putString("p",nama.trim());
                    Intent y = new Intent(getApplicationContext(), activityex1.class);
                    y.putExtras(a);
                    startActivity(y);


                } else if (opnama.getText().toString().equals("Justice") && oppass.getText().toString().equals(" ")) {
                    Toast.makeText(MainActivity.this, "Password salah", Toast.LENGTH_SHORT).show();

                } else if (opnama.getText().toString().equals(" ") && oppass.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this, "Nama salah", Toast.LENGTH_SHORT).show();

                }
                else if (opnama.getText().toString().length()==0) {
                    opnama.setError("nama diperlukan");

                }
                else if (oppass.getText().toString().length()==0) {
                    oppass.setError("Password diperlukan");

                } else
                    Toast.makeText(MainActivity.this, "Nama dan password salah", Toast.LENGTH_SHORT).show();
            }


        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View as) {

                Intent regis = new Intent(getApplicationContext(),Activityregis.class);
                startActivity(regis);


            }
        });


    }
}