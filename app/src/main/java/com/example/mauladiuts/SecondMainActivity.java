package com.example.mauladiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity {
    TextView tvnama;
    TextView tvNomorPendaftaran;
    TextView tvpendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        tvnama = findViewById(R.id.tv_namalengkap);
        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("xnama");
        tvnama.setText(terimanama);

        tvNomorPendaftaran = findViewById(R.id.tv_Pendaftaran);
        Intent baru = getIntent();
        String terimaNomor = baru.getStringExtra("xnomor");
        tvNomorPendaftaran.setText(terimaNomor);

        tvpendaftaran = findViewById(R.id.tv_tv);
        Intent lagi = getIntent();
        String terimaKode = lagi.getStringExtra("xpendaftaran");
        tvpendaftaran.setText(terimaKode);
    }
}