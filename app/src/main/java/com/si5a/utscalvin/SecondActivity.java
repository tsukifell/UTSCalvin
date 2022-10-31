package com.si5a.utscalvin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Declaring the variables from activity_second
        TextView tvNama, tvNoDaftar, tvJalurs;

        super.onCreate(savedInstanceState);

        //Setting the title for layout
        getSupportActionBar().setTitle("UTS_CalvinSaputra");
        setContentView(R.layout.activity_second);

        //Catching the name, etc
        tvNama = findViewById(R.id.tv_nama);
        tvNoDaftar = findViewById(R.id.tv_nomor_pendaftaran);
        tvJalurs = findViewById(R.id.tv_jalur);

        //GetString
        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNoDaftar = terima.getStringExtra("xNoDaftar");
        String ySpJalur = terima.getStringExtra("xJalur");

        //SetText
        tvNama.setText(yNama);
        tvNoDaftar.setText(yNoDaftar);
        tvJalurs.setText(ySpJalur);







    }
}