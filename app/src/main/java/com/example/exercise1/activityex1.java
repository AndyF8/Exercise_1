package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class activityex1 extends AppCompatActivity{

    TextView Nama;

    EditText task, jt, timetask;

    String namat, jtt, timetaskt;

    FloatingActionButton add;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex);

        Nama = findViewById(R.id.namaa);
        task = findViewById(R.id.task0);
        jt = findViewById(R.id.jt0);
        timetask = findViewById(R.id.timet0);
        add = findViewById(R.id.add0);

        Bundle bundle = getIntent().getExtras();
        String nama12 = bundle.getString("p");
        Nama.setText(nama12);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View i) {

                namat = task.getText().toString();
                jtt = jt.getText().toString();
                timetaskt = timetask.getText().toString();


                if (task.getText().toString().length() == 0 && jt.getText().toString().length() == 0 && timetask.getText().toString().length() == 0)  {
                    Toast.makeText(getApplicationContext(), "Isi seluruh data !", Toast.LENGTH_LONG).show();

                }else if (task.getText().toString().length() == 0) {
                    task.setError("Task!");

                }else if (jt.getText().toString().length() == 0) {
                    jt.setError("Jenis Task!");

                }else if (timetask.getText().toString().length() == 0) {
                    timetask.setError("Waktu Task!");






                }
                else {
                    Bundle b = new Bundle();
                    b.putString("c", namat.trim());
                    b.putString("d", jtt.trim());
                    b.putString("e", timetaskt.trim());
                    Intent o = new Intent(getApplicationContext(), activityhasil1.class);
                    o.putExtras(b);
                    startActivity(o);

                    Toast.makeText(getApplicationContext(), "Berhasil",
                            Toast.LENGTH_LONG).show();


                }


            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.mnlogout)
        {
            Intent r = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(r);
            finish();
        }
        if (item.getItemId() == R.id.mnsubmit)
        {
            namat = task.getText().toString();
            jtt = jt.getText().toString();
            timetaskt = timetask.getText().toString();


            if (task.getText().toString().length() == 0 && jt.getText().toString().length() == 0 && timetask.getText().toString().length() == 0)  {
                Toast.makeText(getApplicationContext(), "Isi seluruh data !", Toast.LENGTH_LONG).show();

            }else if (task.getText().toString().length() == 0) {
                task.setError("Task!");

            }else if (jt.getText().toString().length() == 0) {
                jt.setError("Jenis Task!");

            }else if (timetask.getText().toString().length() == 0) {
                timetask.setError("Waktu Task!");


                }else{
                Bundle b = new Bundle ();
                b.putString("c",namat.trim());
                b.putString("d",jtt.trim());
                b.putString("e",timetaskt.trim());
                Intent o = new Intent(getApplicationContext(), activityhasil1.class);
                o.putExtras(b);
                startActivity(o);

                Toast.makeText(getApplicationContext(), "Berhasil",
                        Toast.LENGTH_LONG).show();

            }

        }
        return super.onOptionsItemSelected(item);
    }
}
