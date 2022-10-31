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
        TextView tvNama, tvNoDaftar;
        Spinner spJalurs;

        super.onCreate(savedInstanceState);

        //Setting the title for layout
        getSupportActionBar().setTitle("UTS_CalvinSaputra");
        setContentView(R.layout.activity_second);

        //Catching the name, etc
        tvNama = findViewById(R.id.tv_nama);
        tvNoDaftar = findViewById(R.id.tv_nomor_pendaftaran);
        spJalurs = findViewById(R.id.tv_jalur);
        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNoDaftar = terima.getStringExtra("xNoDaftar");
        String ySpJalur = terima.getStringExtra("xJalur");
        tvNama.setText(yNama);
        tvNoDaftar.setText(yNoDaftar);
        spJalurs.setText(ySpJalur);





    }
}