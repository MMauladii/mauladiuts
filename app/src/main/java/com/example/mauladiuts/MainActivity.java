package com.example.mauladiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;
    Button btnDaftar;

    String NomorPendaftaran, NamaLengkap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_Nomor_Pendaftaran);
        etNamaLengkap = findViewById(R.id.et_Nama_Lengkap);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NamaLengkap = etNamaLengkap.getText().toString();
                NomorPendaftaran = etNomorPendaftaran.getText().toString();

                if (NamaLengkap.trim().equals("")) {
                    etNamaLengkap.setError("Nama Harus Diisi");
                }

                else if (NomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                }
                else{
                    Toast.makeText(MainActivity.this, "Selamat " + NamaLengkap + ", Anda Terdaftar!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}